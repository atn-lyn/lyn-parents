package com.lyn.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.net.URL;

/**
* <p>ClassName: FileUtils.java </p>
* <p>文件处理工具类</p>
* 
* @author lft  
* @date 2019年1月26日
* @since jdk1.8
* @version 1.0
 */

@Component
public class FileUtils {

	private static Logger logger = LoggerFactory.getLogger(FileUtils.class);
	private static final String[] STATIC_IMAGE_ARR = {"image/jpeg","image/png","image/jpg"};

	private static String FILE_SERVER_DOMAIN;
	private static String QINIU_SERVER_DOMAIN;
	private static String LINUX_SERVER_DOMAIN;

	public static String getImgServerDomain() {
		return FILE_SERVER_DOMAIN;
	}

	public static String getLinuxServerDomain() {
		return LINUX_SERVER_DOMAIN;
	}
	@Value("${file.server.url}")
	public void setImgServerDomain(String imgServerDomain) {
		this.FILE_SERVER_DOMAIN = imgServerDomain;
	}
	@Value("${file.server.qiniu}")
	public void setQiniuServerDomain(String qiniuServerDomain) { QINIU_SERVER_DOMAIN = qiniuServerDomain; }
	@Value("${linux.server.url}")
	public void setLinuxServerDomain(String linuxServerDomain) {
		this.LINUX_SERVER_DOMAIN = linuxServerDomain;
	}

	/**
	 * <p>判断文件是否为静态图片</p>
	 *
	 * @param contentType
	 * @return
	 */
	public static boolean isImageFile(String contentType){
		if(contentType != null && !"".equals(contentType)
				&& contentType.indexOf("image/") != -1){
			return true;
		}
		return false;
	}

	/**
	 * <p>判断文件是否为视频</p>
	 *
	 * @param contentType
	 * @return
	 */
	public static boolean isVideoFile(String contentType){
		if(contentType != null && !"".equals(contentType)
				&& contentType.indexOf("video/") != -1){
			return true;
		}
		return false;
	}

	/**
	 * <p>判断文件是否为文本文件</p>
	 *
	 * @param contentType
	 * @return
	 */
	public static boolean isTextFile(String contentType){
		if(contentType != null && !"".equals(contentType)
				&& contentType.indexOf("text/") != -1){
			return true;
		}
		return false;
	}

	/**
	 * <p>判断文件是否为静态图片</p>
	 *
	 * @param contentType
	 * @return
	 */
	public static boolean isStaticImage(String contentType){
		if(contentType != null && !"".equals(contentType)){
			for(String arr:STATIC_IMAGE_ARR){
				if(contentType.equals(arr)){
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 移除文件域名地址
	 * 
	 * @param urlAddr
	 * @return
	 */
	public static String toShortUrl(String urlAddr) {
		// 非空验证
		if (urlAddr != null && !"".equals(urlAddr) && urlAddr.length() > 5) {
			return filterUrl(urlAddr);
		}
		return urlAddr;
	}

	/**
	 * 添加域名地址
	 * 
	 * @param urlAddr
	 * @return
	 */
	public static String toFullUrl(String urlAddr) {
		// 非空验证
		if (urlAddr != null && !"".equals(urlAddr) && urlAddr.length() > 3) {
			if(urlAddr.startsWith("http") && verifyUrl(urlAddr)){
				return urlAddr;
			} else {
				String newAdr = filterUrl(urlAddr);
				//校验是否为FastDFS存储文件
				if (newAdr.indexOf("group1/M") != -1) {
					newAdr = newAdr.startsWith("group1") ? newAdr : newAdr.substring(newAdr.indexOf("group1"), newAdr.length());
					return FILE_SERVER_DOMAIN.endsWith("/") ? FILE_SERVER_DOMAIN : FILE_SERVER_DOMAIN + "/" + newAdr;
				} else {
					String domain = QINIU_SERVER_DOMAIN.endsWith("/") ? QINIU_SERVER_DOMAIN : QINIU_SERVER_DOMAIN + "/";
					newAdr = newAdr.startsWith("/") ?newAdr.substring(1, newAdr.length()):newAdr;
					return domain + newAdr;
				}
			}
		}
		return urlAddr;
	}

	/**
	 * 过滤URL，去除域名及多余内容
	 *
	 * @param url
	 * @return
	 */
	private static String filterUrl(String url){
		if(null != url && !"".equals(url)){
			String newUrl = url;
			if(url.indexOf(".com/") != -1){
				newUrl = url.substring(url.indexOf(".com/")+5,url.length());
			}else if(url.indexOf(".cn/") != -1){
				newUrl = url.substring(url.indexOf(".cn/")+4,url.length());
			}
			//
			while (newUrl.startsWith("/")){
				newUrl = newUrl.substring(1,newUrl.length());
			}
			return newUrl;
		}
		return url;
	}

	/**
	 * 验证URL有效性
	 *
	 * @param urlAddr
	 * @return
	 */
	public static boolean verifyUrl(String urlAddr) {
		if (urlAddr != null && !"".equals(urlAddr)) {
			try {
				URL url = new URL(urlAddr);
				InputStream in = url.openStream();
				in.close();
				return Boolean.TRUE;
			} catch (Exception e) {
				return Boolean.FALSE;
			}
		}
		return Boolean.FALSE;
	}
}
