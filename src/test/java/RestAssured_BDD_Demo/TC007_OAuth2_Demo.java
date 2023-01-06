package RestAssured_BDD_Demo;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TC007_OAuth2_Demo {

    @Test
    public void Oauth2Demo_Ex()
    {
        RestAssured
        .given()
                .auth()
                .oauth2("access token")
        .when()
                .get("URL")
        .then()
                .statusCode(200);
    }
}
