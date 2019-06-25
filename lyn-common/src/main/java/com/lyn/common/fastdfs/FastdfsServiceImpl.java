package com.lyn.common.fastdfs;

import com.alibaba.fastjson.util.Base64;
import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.exception.FdfsUnsupportStorePathException;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Iterator;


@Service("fastdfsService")
public class FastdfsServiceImpl implements FastdfsService {
    private static final Logger logger = LoggerFactory.getLogger(FastdfsServiceImpl.class);

    @Autowired
    private FastFileStorageClient storageClient;

    @Override
    public String uploadFile(MultipartFile file) throws Exception {
        long size = file.getSize();
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        StorePath storePath = storageClient.uploadFile(file.getInputStream(),size, extension,null);
        return getResAccessUrl(storePath);
    }

    @Override
    public String uploadFile(String content, String fileExtension) {
        ByteArrayInputStream stream = new ByteArrayInputStream(Base64.decodeFast(content));
        StorePath storePath = storageClient.uploadFile(stream,Base64.decodeFast(content).length, fileExtension,null);
        return storePath.getFullPath();
    }

    @Override
    public void deleteFile(String fileUrl) {
        if (!StringUtils.isEmpty(fileUrl)) {
            try {
                StorePath storePath = StorePath.praseFromUrl(fileUrl);
                storageClient.deleteFile(storePath.getGroup(), storePath.getPath());
            } catch (FdfsUnsupportStorePathException e) {
                logger.warn(e.getMessage());
            }
        }
    }

    @Override
    public String compressUpload(MultipartFile file, float quality) throws Exception {
        InputStream is = file.getInputStream();
        try {
            BufferedImage image = ImageIO.read(is);

            // 如果图片空，返回空
            if (image == null) {
                return null;
            }
            // 得到指定Format图片的writer
            Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName("jpeg");// 得到迭代器
            ImageWriter writer = (ImageWriter) iter.next(); // 得到writer
            // 得到指定writer的输出参数设置(ImageWriteParam )
            ImageWriteParam iwp = writer.getDefaultWriteParam();
            // 设置可否压缩
            iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            // 设置压缩质量参数
            iwp.setCompressionQuality(quality);
            iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);
            ColorModel colorModel = ColorModel.getRGBdefault();
            // 指定压缩时使用的色彩模式
            iwp.setDestinationType(new javax.imageio.ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(16, 16)));
            // 开始打包图片，写入byte[]
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 取得内存输出流
            IIOImage iIamge = new IIOImage(image, null, null);
            // 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput
            // 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput
            writer.setOutput(ImageIO.createImageOutputStream(byteArrayOutputStream));
            writer.write(null, iIamge, iwp);
            is = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());

            //上传文件
            StorePath storePath = storageClient.uploadFile(is, byteArrayOutputStream.size(), FilenameUtils.getExtension(file.getOriginalFilename()), null);
            return getResAccessUrl(storePath);
        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 封装图片完整URL地址
     * @param storePath
     * @return
     */
    private static String getResAccessUrl(StorePath storePath) {
        String fileUrl = storePath.getFullPath();
        return fileUrl;
    }
}
