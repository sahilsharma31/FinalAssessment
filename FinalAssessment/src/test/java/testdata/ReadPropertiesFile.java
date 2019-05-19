package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public String readProperty(String PropertyName) throws IOException
	{
	   Properties Pro = new Properties();
	   FileInputStream fis = new FileInputStream(new File("src\\Config.properties"));
	   Pro.load(fis);
	   PropertyName = Pro.getProperty(PropertyName);
	   return PropertyName;
	}
	
}
