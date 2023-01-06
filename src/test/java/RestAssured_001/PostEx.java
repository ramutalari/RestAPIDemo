package RestAssured_001;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostEx {

    @Test
    public void postex01(){

        Map request = new HashMap();

        //JSONObject request = new JSONObject();

        request.put("name","AadhyaRam");
        request.put("hobby","singing");

        baseURI = "https://reqres.in/api";

        given().
                header("Content-Type","application/json").
                body(request).
        when().
                post("/users?2").
        then().
                statusCode(201).
                statusLine("HTTP/1.1 201 Created").
                log().
                all();
    }
}
