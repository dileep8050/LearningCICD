package com.demo.utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

import com.demo.constants.FrameworkConstants;

public class PropertyUtils {
	
	public static String get(String key) throws Exception {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(FrameworkConstants.getConfigFilePath());
		prop.load(fis);
		System.out.println(key+"====="+prop.getProperty(key.toLowerCase()));
		if(Objects.isNull(key)||Objects.isNull(prop.getProperty(key.toLowerCase()))) {
			
			throw new Exception("####### "+key +"key/Value what you are looking is not available");
		}	
		return prop.getProperty(key.toLowerCase());
	}
}
