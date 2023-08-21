package in.amazon.RestAssuredDemo;

import java.util.HashMap;
import io.restassured.response.Response;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class PUTDemoBearerToken {
	
	HashMap<String, String> map = new HashMap<>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name","Swapnanil");
		map.put("email", "s.guchhaoiu7540@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test
	public void updateResource() {
		RestAssured
		    .given()
		         .contentType("applicatipon/json")
		         .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		         .body(map)
		    .when()
		         .put()
		    .then()
		          .extract().response();
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("name").toString().equals("Swapnanil"));
	}
}
