package RestAssured_BDD_Demo;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class TC003_PUT_BDD_Format {
    @Test
    public void putEx()
    {
        HashMap map = new HashMap();

        map.put("first_name", "Siddarth");
        map.put("email","badminton@official.com");

        baseURI = "https://reqres.in/api";

        given()
                .header("Content-Type","application/json")
                .body(map)
        .when()
                .put("/users/2")
        .then()
                .statusCode(200)
                .log()
                .all();
    }
}
