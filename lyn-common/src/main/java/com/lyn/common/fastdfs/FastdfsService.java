package com.lyn.common.fastdfs;

import org.springframework.web.multipart.MultipartFile;

/**
 * <p>Fastdfs文件服务</p>
 *
 * @author lft
 * @version 1.0
 * @date 2019/6/24 0024
 * @since jdk1.8
 */
public interface FastdfsService {

    /**
     * 上传文件
     * @param file
     * @return
     * @throws Exception
     */
    String uploadFile(MultipartFile file) throws Exception;

    /**
     * 将一段字符串生成一个文件上传
     * @param content 文件内容
     * @param fileExtension
     * @return
     */
    String uploadFile(String content, String fileExtension);

    /**
     * 删除文件
     * @param fileUrl 文件访问地址
     * @return
     */
    void deleteFile(String fileUrl);

    /**
     * 压缩图片上传
     * @param file 文件对象
     * @return 文件访问地址
     * @throws Exception
     **/
    String compressUpload(MultipartFile file, float quality) throws Exception;
}
