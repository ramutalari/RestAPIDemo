package RestAssuredTutorial_Aug2021;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_GET_Example {

    @Test
    public void getExample()
    {
       Response response =  RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getHeaders());
        int StatusCode = response.getStatusCode();
        Assert.assertEquals(StatusCode, 200);
        System.out.println(response.getBody().asString());
    }
}
