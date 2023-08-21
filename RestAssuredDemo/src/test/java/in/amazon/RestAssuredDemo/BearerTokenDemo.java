package in.amazon.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {
	
	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	@BeforeMethod
	public void createPayLoad() {
		map.put("name","Swapnanil");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test
	public void createResource() {
		RestAssured
		     .given()
		          .contentType("application/json")
		          .body(map)
		          .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		     .when()
		          .post()
		     .then()
		          .statusCode(201)
		          .log().all();
	}
}
