package RestAssured_BDD_Demo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TC006_OAuth {

    @Test
    public void OauthExample()
    {
        RestAssured
         .given()
                .auth()
                .oauth("","","","")

        .when()
                .get("URL")
        .then()
                .statusCode(200);
    }
}
