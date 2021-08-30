package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_ExtractRespValues {

    @Test
    public void getExtractRespValues()
    {
        final String URI = "https://reqres.in/api/users?delay=3";

        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);

        String resBody =response.getBody().asString();
        System.out.println("resBody "+ resBody);

        JsonPath jsonPath = response.jsonPath();
        System.out.println("total :"+jsonPath.get("total"));
        System.out.println("page:"+jsonPath.get("page"));
    }
}
