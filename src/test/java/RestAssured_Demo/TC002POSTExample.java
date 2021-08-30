package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002POSTExample {

    @Test
    public void postExample()
    {
       final String URI = "https://reqres.in/api/users";

        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();

       // Map<String, String> hmap = new HashMap<String, String>();

       JSONObject hmap = new JSONObject();

        hmap.put("name","Ajit");
        hmap.put("job","TestLead");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(hmap.toJSONString());

        Response response = httpRequest.post(URI);
        int responseCode = response.getStatusCode();

        Assert.assertEquals(responseCode,201);
        System.out.println("Response code is:" +responseCode);


        System.out.println("Status line is:"+response.getStatusLine());

        String responseBody =response.getBody().asString();
        System.out.println("Response Body is:"+responseBody);
    }
}
