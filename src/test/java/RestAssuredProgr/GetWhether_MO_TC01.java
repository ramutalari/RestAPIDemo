package RestAssuredProgr;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetWhether_MO_TC01
{
    @Test
    public void getWhether()
    {
        //If you import Restassure as import io.restassured.RestAssured; then we have to use as below
       //Response response = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");

        //If you import as import static io.restassured.RestAssured.*; then directly can use get
        Response response = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=439d4b804bc8187953eb36d2a8c26a02");
       int statuscode = response.getStatusCode();

        Assert.assertEquals(statuscode,200);
        System.out.println("Status code is:"+statuscode);

        String body = response.getBody().asString();
        System.out.println("Response body is:"+body);

        System.out.println("Response time out is: "+response.getTime());

        String contenttypeHeader = response.header("content-type");
        System.out.println("contenttypeHeader is: "+contenttypeHeader);

        String xframeoptions = response.header("x-frame-options");
        System.out.println("xframeoptions is: "+xframeoptions);

    }
}
