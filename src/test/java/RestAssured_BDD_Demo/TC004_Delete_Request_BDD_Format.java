package RestAssured_BDD_Demo;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TC004_Delete_Request_BDD_Format {

    @Test
    public void deleteRequest()
    {
        //baseURI = "https://reqres.in";

        baseURI = "http://dummy.restapiexample.com/api/v1";
        basePath = "/delete/24";

        given()
        .when()
                .delete()
                //.delete("/delete/24")
                //.delete("/api/users/page/2")

        .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .body( "status",equalTo("success"))
                .body("data",equalTo("24"))
                .body("message",equalTo("Successfully! Record has been deleted"))
                .log().all();
    }
}
