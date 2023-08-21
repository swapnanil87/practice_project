package in.amazon.RestAssuredDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SOAPdemo {
	
	@Test
	public void getCapital() throws FileNotFoundException{
		FileInputStream fis = new FileInputStrem(new File("capitals.xml"));
		
		RestAssured.baseURI = "http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso?WSDL"
	
	    RestAssured
	        .given()
	             .header("Content-Type", "text/xml")
	             .body(IOUtils.toString(fis, "UFT-8"))
	        .when()
	            .post()
	        .then()
	            .statusCode(200)
	            .log().all();
	}
	
}
