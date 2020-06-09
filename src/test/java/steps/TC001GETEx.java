package steps;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class TC001GETEx
{
    @Test
    void getWeatherDetails()
    {
        //Specify baseURI
       final String URI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";

// final String endpointURI2 ="https://samples.openweathermap.org/data/2.5/forecast?q=London,us&appid=439d4b804bc8187953eb36d2a8c26a02";

        //RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/";
        RestAssured.baseURI = URI;
        //Request object - to send the request to server
        RequestSpecification httpRequest = RestAssured.given();
        //Response object - to store response
        //1- by using Response
        //Response response = httpRequest.request(Method.GET,"/Hyderabad");
        Response response = httpRequest.get(URI);
        //To print response
        String responseBody = response.getBody().asString();
        System.out.println("By using Response: ");
        System.out.println("--------------------");
        System.out.println("Response body is: "+responseBody);

        int responseCode = response.getStatusCode();
        System.out.println("Response code is:"+responseCode);
        System.out.println();

        //2-By using ValidatableResponse
        ValidatableResponse validatableResp = httpRequest.get(URI).then();
        int statusCode = validatableResp.extract().statusCode();
        String body = validatableResp.extract().body().asString();
        System.out.println("By using ValidatableResponse");
        System.out.println("-----------------------------");
        System.out.println("Status code is:"+statusCode);
        System.out.println("Response body is:"+body);

        //ValidatableResponse res2 = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header();
        
    }

//    public ValidatableResponse servicePost(String endpoint, Map<String,String> header, String body){
//        ValidatableResponse res2 = (ValidatableResponse) RestAssured.
//                given().relaxedHTTPSValidation().
//                contentType(ContentType.JSON).headers(header).log().all()
//                .when().body(body).post(endpoint).
//                        then().log().all();
//        return res2;
//    }
}
