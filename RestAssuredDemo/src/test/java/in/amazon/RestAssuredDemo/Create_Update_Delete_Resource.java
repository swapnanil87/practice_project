package in.amazon.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Create_Update_Delete_Resource {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	
	@BeforeMethod
	public void createPayload() {
		map.put("name", "Swapnanil");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "Active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test(priority = 0)
	public void createResource() {
		response = RestAssured
				                .given()
				                    .contentType("application/json")
				                    .body(map)
				                    .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
				                .when()
				                    .post()
				                .then()
				                    .log().all()
				                    .extract().response();
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
	}
	
	@Test(priority=1)
	public void verifyResource() {
		System.out.println("Id = "+ id);
		RestAssured
		.given()
		    .contentType("application/json")
		    .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		.when()
		    .get("https://gorest.co.in/public/v2/users/"+id)
		.then()
		    .statusCode(200)
		    .log().all();
		
		Assert.assertTrue(jsonPath.get("name").equals("Swapnanil"));
	}
	
	@Test(priority=2)
	public void updateResource() {
		map.put("name", "Swapnanill");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "male");
		map.put("status", "Active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users" + id;
		
		RestAssured
		.given()
		    .contentType("application/json")
		    .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		    .body(map)
		.when()
		    .put()
		.then()
		    .statusCode(200)
		    .log().all()
		    .assertThat()
		    .body("name",  is("Swapnanill"));
		
	}
	
	@Test(priority= 3)
	public void deleteResource() {
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users" + id;
		
		RestAssured
		    .given()
		        .contentType("application/json")
		        .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		    .when()
		         .delete()
		    .then()
		         .statusCode(204);
	}


	} 
