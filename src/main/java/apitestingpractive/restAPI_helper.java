package apitestingpractive;

import java.io.IOException;

import commonUtilities.propertyfileutils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAPI_helper {

	public static String get_responsemsg="";
	public static int get_responsecode=0;
	
	
	public static void main(String[] args) throws IOException {
		
		
		/*
		 * //GET REST API METHOD
		 * rest_getAPI("https://fakerestapi.azurewebsites.net/api/v1/Activities/2",false
		 * );
		 */
		
		
		
		  //POST REST API METHOD 
		 /* String dataInsert="{\"id\": 5,\"title\": \"string\"}";
		 * reset_postAPI_string(
		 * "https://fakerestapi.azurewebsites.net/api/v1/Activities",dataInsert,true);
		 */
		
		// PUT REST API Method
		/*
		 * String dataupdate="{\"id\": 5,\"title\": \"My updated title\"}";
		 * rest_putAPI_string(
		 * "https://fakerestapi.azurewebsites.net/api/v1/Activities/5",dataupdate,false)
		 * ;
		 */
		

String domain = propertyfileutils.getinstance().getproperty("app.domain");
String url = "https://$$DOMAIN_NAME$$/api/v1/Activities/4";

String finalurl= url.replace("$$DOMAIN_NAME$$", domain);


		// DELETE REST API Method
		rest_deleteAPI_string(finalurl, false);

}


public static void rest_deleteAPI_string(String url, boolean auth) {
	//PUT REST API METHOD
		
			RequestSpecification httprequest = RestAssured.given();
			if (auth) {
				System.out.println("Inside Auth");
//				httprequest.auth().basic("UserName", "Password");
			}
			httprequest.header("content-type","application/json" );
			Response res = httprequest.delete(url);
			get_responsemsg= res.asString();
			get_responsecode= res.getStatusCode();
			System.out.println("Inside delete common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

}

public static void rest_putAPI_string(String url,String updateddata,boolean auth) {
	//PUT REST API METHOD
		
			RequestSpecification httprequest = RestAssured.given();
			if (auth) {
				System.out.println("Inside Auth");
//				httprequest.auth().basic("UserName", "Password");
			}
			httprequest.header("content-type","application/json", new Object[0]);
			httprequest.body(updateddata);
			Response res = httprequest.put(url);
			get_responsemsg= res.asString();
			get_responsecode= res.getStatusCode();
			System.out.println("Inside put common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

}

public static void reset_postAPI_string(String url, String data, boolean auth) {
	RequestSpecification httprequest = RestAssured.given();
	
	if (auth) {
		System.out.println("Inside Auth");
//		httprequest.auth().basic("UserName", "Password");
	}
	
	httprequest.header("content-type","application/json", new Object[0]);
	httprequest.body(data);
	Response res = httprequest.post(url);
	get_responsemsg= res.asString();
	get_responsecode= res.getStatusCode();
	System.out.println("Inside post common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);
}
	public static void rest_getAPI(String url, boolean auth) {
		RequestSpecification httprequest = RestAssured.given();

		if (auth) {
			System.out.println("Inside Auth");
//			httprequest.auth().basic("UserName", "Password");
		}
		Response res = httprequest.get(url);

		get_responsemsg= res.asString();
		get_responsecode= res.getStatusCode();

		System.out.println("Inside get common method >> Response code =" + get_responsecode + ", response message= " + get_responsemsg);

	}
	
	/*
	 * public String getAPI(String baseurl,String urlpath) {
	 * 
	 * RestAssured.baseURI =baseurl;// "https://fakerestapi.azurewebsites.net";
	 * 
	 * String response = given() .contentType(ContentType.JSON) .when()
	 * .get(urlpath)//"/api/v1/Activities/2" .then() .extract().asPrettyString();
	 * 
	 * return response; }
	 */
	
}
