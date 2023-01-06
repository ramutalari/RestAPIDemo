package RestAssuredTutorial_Aug2021;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC008_Delete_Example {

    @Test
    public void testDelete()
    {
        baseURI = "http://dummy.restapiexample.com/api/v1";
        basePath = "/delete/20";

        given().
        when().
                delete().

        then().
                statusCode(200).
                body("message",equalTo("Successfully! Record has been deleted")).
                log().
                all();
    }
}
