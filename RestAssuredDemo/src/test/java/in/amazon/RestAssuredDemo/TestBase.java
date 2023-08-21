package in.amazon.RestAssuredDemo;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.event.Level;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//import org.apache.log4j.Level;
//import org.apache.log4j.Logger;
public class TestBase {
	public static RequestSpecification httpRequest;
	public static Response response;
	
	public Logger logger;
	
	@BeforeClass
	public void setUp() {
		logger = Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
	
	}
}