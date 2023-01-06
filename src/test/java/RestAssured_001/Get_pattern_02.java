package RestAssured_001;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_pattern_02 {

    @Test
    public void pattern02(){

        baseURI = "https://reqres.in/api";

        given().
                get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].id",equalTo(8)).
                log().
                all();


    }

}
