package in.amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {
	
	@Test
	public void getWeatherInfo() {
		RestAssured
		     .given()
		          .param("q", "kolkata")
		          .param("appid", "f9e9d9085fc9042c80a7e18b36a51b1f")
		     .when()
		          .get("https://api.openweathermap.org/data/2.5/weather")
		     .then()
		          .statusCode(200)
		          .log().all();
	}
}
