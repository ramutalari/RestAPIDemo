package RestAssuredProgr;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC006_Get_ExtractAllRespValuesJson
{
    @Test
    public void extractValuesResponseJson()
    {
        final String URI ="http://restapi.demoqa.com/utilities/weather/city/Glasgow";
        RestAssured.baseURI = URI;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);
       // String responseBody = response.getBody().asString();
        //System.out.println("Response body is:"+responseBody);
        JsonPath jsonpath = response.jsonPath();
        //System.out.println(jsonpath.get("City"));
        System.out.println("city details:"+jsonpath.get("City"));
        System.out.println("Temperature details are:"+jsonpath.get("Temperature"));
        System.out.println("Humidity details are:"+jsonpath.get("Humidity"));
        System.out.println("WeatherDescription is:"+jsonpath.get("WeatherDescription"));
        System.out.println("WindSpeed is:"+jsonpath.get("WindSpeed"));
        System.out.println("WindDirectionDegree is:"+jsonpath.get("WindDirectionDegree"));

        Assert.assertEquals(jsonpath.get("City"),"Glasgow");
        //Assert.assertEquals(jsonpath.get("Temperature"),"13.43 Degree celsius");
    }
}
