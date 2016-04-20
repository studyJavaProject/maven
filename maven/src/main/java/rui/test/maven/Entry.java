package rui.test.maven;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import rui.test.maven.packaging.OutJarPackaging;

/**
 * 
 * <p>入口</p>
 *
 * @author 赵睿
 * @version 1.0 Created on 2016年4月20日 下午5:00:19
 */
public class Entry {
	public static void main(String[] args) {
		InputStream is=Entry.class.getResourceAsStream("/config.properties");
		Properties properties=new Properties();
		try {
			properties.load(is);
			String filePath=properties.getProperty("FilePath");
			OutJarPackaging packaging=new OutJarPackaging();
			String content=packaging.readResourceToString(filePath);
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
