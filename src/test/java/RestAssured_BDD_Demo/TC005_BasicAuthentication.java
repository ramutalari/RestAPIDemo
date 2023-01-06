package RestAssured_BDD_Demo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TC005_BasicAuthentication {
    @Test
    public void basicAuth()
    {
        RestAssured
        .given()
                .auth()
                .preemptive()
                .basic("ToolsQA","TestPassword")
        .when()
                .get("http://restapi.demoqa.com/authentication/CheckforAuthentication/")
        .then()
                .statusCode(200);
    }
}
