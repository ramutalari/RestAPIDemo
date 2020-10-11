package RestAssuredProgr;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETExample {

    @Test
    public void getWhether()
    {
        final String URI = "https://jsonplaceholder.typicode.com/posts";
        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);
        int responsecode = response.getStatusCode();
        System.out.println("Response code is:"+responsecode);
        String body = response.getBody().asString();
        System.out.println("Response body is:"+body);

        String contenttype = response.contentType();
        System.out.println("Content Type is:"+contenttype);

    }

}
