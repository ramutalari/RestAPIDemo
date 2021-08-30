package RestAssured_Demo;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostExample_Practice01 {

    @Test
    public void postEx()
    {
        final String URI = "https://reqresp/api/users";
        RestAssured.baseURI = URI;

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject hmap = new JSONObject();
        hmap.put("name","Ajay");
        hmap.put("loc","Hyd");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(hmap.toJSONString());

        Response res = httpRequest.post(URI);
        int responseCode = res.getStatusCode();
        System.out.println(responseCode);

        Assert.assertEquals(responseCode,201);


    }

}
