package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileCaller {

	public String fetchdata(String value) throws IOException
	{
		String configval="";
		FileInputStream fis = new FileInputStream("C:\\Users\\aakas\\CucumberProject\\src\\main\\java\\com\\Properties\\testdata.properties");
		Properties pro = new Properties();
		pro.load(fis);
		configval = (String) pro.get(value);	
		System.out.println(configval);
		return configval;
	}
	
}
