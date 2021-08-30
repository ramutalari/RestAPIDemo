package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC007_BasicAuthentication {
    @Test
    public void authorizationTest()
    {
        final String URI = "http://restapi.demoqa.com/authentication/CheckforAuthentication";
        RestAssured.baseURI = URI;
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("ToolsQA");
        authScheme.setPassword("TestPassword");
        RestAssured.authentication = authScheme;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);

        String responseBody =response.getBody().asString();
        System.out.println("Response body is:"+responseBody);

       int statusCode=response.getStatusCode();
        System.out.println("Status Code is:"+statusCode);
    }
}
