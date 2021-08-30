package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetAllHeaders {

    @Test
    public void toGetHeaders()
    {
        final String URI = "https://reqres.in/api/users?delay=3";

        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.get(URI);
        Headers allHeaders = response.headers();

        for (Header headr:allHeaders)
        {
            System.out.println(headr.getName() + " : "+headr.getValue());
        }

    }

}
