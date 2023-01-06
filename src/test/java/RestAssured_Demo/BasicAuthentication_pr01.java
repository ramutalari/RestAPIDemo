package RestAssured_Demo;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuthentication_pr01 {

    public static void main(String[] args) {

        final String URI = "http://restapi.demoqa.com/authentication/CheckforAuthentication";
        RestAssured.baseURI = URI;

        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("ToolsQA");
        authScheme.setPassword("abcpqr");
        RestAssured.authentication = authScheme;

        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get(URI);
    }
}
