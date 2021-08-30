package RestAssured_Demo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GETPractice001 {

    @Test
    public void practice()
    {
        final String endpointURI = "http://restapi.demoqa.com/utilities/weather/city/London";
       // final String endpointURI2 ="https://samples.openweathermap.org/data/2.5/forecast?q=London,us&appid=439d4b804bc8187953eb36d2a8c26a02";
        RestAssured.baseURI = endpointURI;
        RequestSpecification reqest = RestAssured.given();
        Response response = reqest.get(endpointURI);
        int getStatusCode = response.getStatusCode();
        System.out.println("Status Code:"+getStatusCode);
        String responseBody = response.getBody().asString();
        System.out.println("Response body is:"+responseBody);
        //response.getHeaders("server").toString();
    }
}
