package RestAssuredTutorial_Aug2021;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class TC005_POST_Example {

    @Test
    public void testPost()
    {
        //Map<String, Object> map = new HashMap<String, Object>();

        JSONObject request = new JSONObject();

        request.put("name","Aadhya Ram");
        request.put("hobby","Badminton");

        baseURI = "https://reqres.in/api";

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                post("/users/2").
        then().
                statusCode(201).
                log().
                all();

    }
}
