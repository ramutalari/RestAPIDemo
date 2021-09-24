package RestAssuredTutorial_Aug2021;



import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class Post_practice01 {

    @Test
    public void postTest()
    {
        baseURI = "https://reqres.in/api";

        JSONObject request = new JSONObject();

        request.put("name","AbhiRam");
        request.put("hobby","swimming");

        given().
                header("Content-Type","application/json").
                body(request.toJSONString()).
        when().
                post("/users/api").
        then().
                statusCode(201).
                log().
                all();

    }
}
