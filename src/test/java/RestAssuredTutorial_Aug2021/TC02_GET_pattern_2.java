package RestAssuredTutorial_Aug2021;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import  static org.hamcrest.Matchers.*;

public class TC02_GET_pattern_2 {
    @Test
    public void verifyInSingleLine(){

        baseURI = "https://reqres.in/api";

        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].id",equalTo(8));

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
    }
}