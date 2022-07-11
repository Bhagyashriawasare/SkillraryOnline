package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import genericLibrary.autoconstant;

public class Property {
	public String getProperty(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(autoconstant.propertyfile);
		p.load(fis);
		return p.getProperty(key);
	}

}
