package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC005_Verify_Response {
    @Test
    public void verifyResponse() {
        final String URI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);
        String responseBody=response.getBody().asString();
        System.out.println("Response body is: "+responseBody);
        Assert.assertTrue(responseBody.contains("Hyderabad"),"Response body not contains city as Hyderabad");
        //Assert.assertEquals(responseBody.contains("Hyderabad"),true);
    }
}
