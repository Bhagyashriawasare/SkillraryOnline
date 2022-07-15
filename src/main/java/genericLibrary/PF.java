package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PF {
	public String getpropertyfile(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AC.propertyfile);
		p.load(fis);
		return p.getProperty(key);
	}

}
