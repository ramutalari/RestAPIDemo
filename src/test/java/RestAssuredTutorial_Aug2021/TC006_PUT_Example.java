package RestAssuredTutorial_Aug2021;

import io.cucumber.java.en.Given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC006_PUT_Example {

    @Test
    public void putEx()
    {
        JSONObject request = new JSONObject();

        request.put("name","Siddarth");
        request.put("hobby","Swimming");

        baseURI = "https://reqres.in/api";

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                put("/users/2").
        then().
                statusCode(200).
                log().
                all();
    }
}
