package RestAssuredTutorial_Aug2021;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class TC007_Patch_Example {

    @Test
    public void testPatch()
    {
        JSONObject request = new JSONObject();

        request.put("name","Abhi Ram");
        request.put("hobby","singing");

        baseURI = "https://reqres.in";

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                patch("/api/users/2").
        then().
                statusCode(200).
                log().
                all();
    }
}
