package LIB;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ReadObjects {
	
	Properties p=new Properties();
	
	public Properties getRepository() throws IOException{
	
	InputStream stream=new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\Objects\\object.properties"));
	p.load(stream);
	System.out.println(p);
	return p;
	
	}

}
