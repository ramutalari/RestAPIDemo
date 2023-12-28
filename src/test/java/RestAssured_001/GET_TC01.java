package RestAssured_001;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GET_TC01 {

   @Test
    public void getEx(){

       baseURI = "https://reqres.in/api";

       given()
               .when()
               .get("/users?page=2")
       .then()
               .statusCode(200)
               .contentType("application/json")
               .body("page", equalTo(2))
               .log()
               .all();
   }
}
