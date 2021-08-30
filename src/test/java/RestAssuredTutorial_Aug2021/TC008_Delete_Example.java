package RestAssuredTutorial_Aug2021;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class TC008_Delete_Example {

    @Test
    public void testDelete()
    {
        baseURI = "https://reqres.in";

        given().
        when().
                delete("/api/users/2").
        then().
                statusCode(204).
                log().
                all();
    }
}
