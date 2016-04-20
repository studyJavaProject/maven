package rui.test.maven.packaging;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * 
 * <p>外部buildPath的jar包，打包</p>
 *
 * @author 赵睿
 * @version 1.0 Created on 2016年4月20日 下午4:52:42
 */
public class OutJarPackaging {
	
	public String readResourceToString(String filePath){
		try {
			return FileUtils.readFileToString(new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
