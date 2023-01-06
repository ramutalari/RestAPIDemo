package RestAssured_001;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get_ex_03 {
    @Test
    public void getEx()
    {
        //baseURI = "https://reqres.in/api";

        given()
                .when()
                //.get("/users?page=2")
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body("data[1].email",equalTo("lindsay.ferguson@reqres.in"))
                .body("data[2].first_name", equalTo("Tobias"))
                .log()
                .all();
    }
}
