package commonUtilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class temppropertyfileutils {
	
	static Properties prop;
	
	
	  public static void main(String[] args) throws IOException {
	  
	  temppropertyfileutils obj = new temppropertyfileutils();
	  
	   String domail =	  temppropertyfileutils.getInstance().getproperty("dev.app.domain");
	  
	  System.out.println(prop.getProperty("dev.app.domain")); }
	 

	temppropertyfileutils() throws IOException{

		String currentProjectpath = System.getProperty("user.dir");
		
		
		FileReader fr = new FileReader(new File(currentProjectpath+"/src/main/resources/tinybyte.Properties"));
		
		prop = new Properties();
		prop.load(fr);
	
	}
	
	
	  public static temppropertyfileutils getInstance() throws IOException {
	  temppropertyfileutils propobj = null; if(prop==null) { propobj = new
	  temppropertyfileutils(); }
	  
	  return propobj;
	  
	  }
	  
	  public static String getproperty(String prop1) throws IOException {
	  
	  
	  return prop.getProperty(prop1); }
	 
}
