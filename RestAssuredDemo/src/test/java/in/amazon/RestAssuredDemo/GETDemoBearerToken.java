package in.amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemoBearerToken {
	@Test
	public void verifyResource() {
		RestAssured
		    .given()
		         .contentType("application/json")
		         .header("Authorization", "Bearer 2f1716ff823b21930092ee9ec589cea8bcecb22808d73099609b3152922e5796")
		    .when()
		         .get("https://gorest.co.in/public/v2/users/4494968")
		    .then()
		         .statusCode(200)
		         .log().all();
	}
}
