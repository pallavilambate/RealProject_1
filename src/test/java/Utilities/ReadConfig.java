package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	String path="D:\\RealProjectWork\\RealProject_11\\Configuration\\config.properties";
	public ReadConfig(){
		properties=new Properties();
	try{
		FileInputStream fs=new FileInputStream(path);
		properties.load(fs);
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	public String getBrowserUrl()
	{
		String value=properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("baseUrl is not specifies in file");
	}
	public String getBrowser()
	{
		String value=properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not specified in property file");
	}

}
