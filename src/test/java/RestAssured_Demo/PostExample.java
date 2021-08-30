package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostExample {

    @Test
    public void tc002Post()
    {
        final String URI = "https://reqres.in/api/users";
        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();

        JSONObject hmap = new JSONObject();

//        hmap.put("name","RamuTalari");
//        hmap.put("job","TestLead");

        hmap.put("id","100");
        hmap.put("FirstName","Ramu");
        hmap.put("LastName","Talari");
        hmap.put("email","ramu.talari@gmail.com");
        hmap.put("mobile","9985250214");

        httpRequest.header("Content-Type","application/json");
        httpRequest.body(hmap.toJSONString());

        Response response = httpRequest.post(URI);
        int responseStatusCodeCode = response.getStatusCode();
        System.out.println("Response Status Code is: "+responseStatusCodeCode);

        String responseBody = response.getBody().asString();
        System.out.println("Response body is:"+responseBody);

    }
}
