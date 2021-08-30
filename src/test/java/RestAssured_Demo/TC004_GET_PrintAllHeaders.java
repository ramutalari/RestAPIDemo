package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC004_GET_PrintAllHeaders {
    @Test
    public void getAllHeaders()
    {
       final String URI = "https://reqres.in/api/users?delay=3";
       RestAssured.baseURI = URI;
       RequestSpecification httpRequest = RestAssured.given();
       Response response = httpRequest.get(URI);
       String responseBody = response.getBody().asString();
       System.out.println("Response body is: "+responseBody);

       Headers allHeaders=response.headers();
       System.out.println("Headers Key and Values are:");
       for(Header header : allHeaders)
       {
           System.out.println(header.getName()+ " : "+header.getValue());
       }
    }
}
