package RestAssured_BDD_Demo;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

public class TC001_GET_BDD_Format {
    @Test
    public void get_bdd_ex(){
        baseURI = "https://reqres.in/api";

        given()
        .when()
                .get("/users?page=2")
        .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .contentType("application/json")
                .body("page",equalTo(2))
                //.body("total_pages",equalTo(2))
                .body("data.first_name",hasItems("Michael","Lindsay","Tobias","Byron","George","Rachel"))
                .log()
                .all();
    }
}
