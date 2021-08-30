package RestAssuredTutorial_Aug2021;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC003_GET_Example_practice {

    @Test
    public void getPractice()
    {
        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].email",equalTo("lindsay.ferguson@reqres.in"));
    }
}
