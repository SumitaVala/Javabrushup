package commonUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertyfileutils {

	public static propertyfileutils proputils;
	static Properties prop;
	public static void main(String[] args) throws IOException {
		
		String domainname = propertyfileutils.getinstance().getproperty("app.domain");
		String cucumberfeaturefile = propertyfileutils.getinstance().getproperty("cucumber.feature.file.list");

		String cucumberfeaturetags = propertyfileutils.getinstance().getproperty("cucumber.feature.tags.include");
		

	    System.out.println(domainname);  

	    propertyfileutils.getinstance().setproperty("app.domain","Alpesh Vala Domain");
	    
	    domainname = propertyfileutils.getinstance().getproperty("app.domain");
	    System.out.println(domainname);  

	}
	
	propertyfileutils() throws IOException{
		String currentProjPath= System.getProperty("user.dir");
		
		System.out.println("inside constructor for loading property");
		FileReader reader=new FileReader(currentProjPath + "/src/main/resources/tinybyte.properties");  
	    
		prop=new Properties();  
		prop.load(reader);  
	}
	
	public static propertyfileutils getinstance() throws IOException {
		if (proputils==null){
			proputils = new propertyfileutils();
		}
		return proputils;
	}
	
	public static String getproperty(String proname) {
		return prop.getProperty(proname);

	}
	
	public static void setproperty(String proname,String value) {

		prop.setProperty(proname,value);

	}	
}
