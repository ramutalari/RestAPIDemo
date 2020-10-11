package steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class POSTExample {

    @Test
    public void demoPost()
    {
        final String endpoint= "https://reqres.in/api/users";
        RestAssured.baseURI = endpoint;

        RequestSpecification httpRequest = RestAssured.given();

        JSONObject hmap = new JSONObject();
        hmap.put(10,"IND");
        hmap.put(20,"UK");
        hmap.put(30,"Australia");

        httpRequest.header("Content-Type", "applicaion/json");
        httpRequest.body(hmap.toJSONString());

        Response res = httpRequest.post(endpoint);
        int responseCode = res.getStatusCode();
        System.out.println("Response code is:+"+responseCode);
        
    }
}
