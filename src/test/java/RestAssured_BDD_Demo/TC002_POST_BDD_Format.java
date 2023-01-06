package RestAssured_BDD_Demo;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TC002_POST_BDD_Format {

    @Test
    public void post_bdd_ex()
    {
        baseURI = "https://reqres.in/api";
        //basePath = "/users?page=2";
        //basePath = "/users?page=2";
        HashMap<String, String> hmap = new HashMap<>();
        hmap.put("name", "Aadhya");
        hmap.put("hobby", "singer");

        given()
                .header("Content-Type","application/json")
                .body(hmap.toString())
        .when()
               // .post()
                .post("/users?page=2")
        .then()
                .statusCode(201)
                .statusLine("HTTP/1.1 201 Created")
                .log()
                .all();
    }
}
