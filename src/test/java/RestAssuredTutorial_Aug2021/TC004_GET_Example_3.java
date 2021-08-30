package RestAssuredTutorial_Aug2021;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC004_GET_Example_3 {

    @Test
    public void compareMoreItems()
    {
        baseURI = "https://reqres.in/api";https:
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data.last_name",hasItems("Howell","Lawson","Fields"));
    }
}
