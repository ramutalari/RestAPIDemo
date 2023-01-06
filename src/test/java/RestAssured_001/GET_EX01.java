package RestAssured_001;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GET_EX01 {

    @Test
    public void getEx()
    {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode,200);

        System.out.println(response.getBody().asString());
    }
}
