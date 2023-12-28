package RestAssured_001;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Post_Ex2 {

    @Test
    public void m1(){

        baseURI = "https://reqres.in/api";
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("name", "abc");
        hmap.put("hobby", "pqr");

                given()
                    .header("Content-Type", "application/json")
                    .body(hmap.toString())
                        .when()
                        .post("/users?page=2")
                        .then()
                        .statusCode(201)
                        .log()
                        .all();
    }

}
