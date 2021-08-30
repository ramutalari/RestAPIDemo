package RestAssured_Demo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Day1_GetExample {
        // 1. Using the rest assured i can do the all the user assert operations for the request and response but the same
        // thing is not available with predefined methods in HTTP Clients
        // 2. Difference between path and Query param
        // Query param value: "http://localhost:8080/CBLogin?username="Ragul"&?password="xxxx"
        // Format : {http://localhost:8080/CBLogin?username=&?password="xxxx"}
        // Path param : http://localhost:8080/CBLogin/Ragul/xxxx (for path parameter you need to provide directly value)
        // Path Param Format : http://localhost:8080/CBLogin/{user_name}/{password}
        // API Checks in the CB
        // 1. Validate the URL (swagger documentation - Not original value it checks the format of the API)
        // 2. Verify the proper authentication (headers, for ex: Oauth or Oauth2)
        // 3. Validate the proper bank Id in the request (headers, for ex: x-bpi-client-context)
        // 4. Developer code will get called with RequestBody (if available) and query/path parameters
        // 5. Perform backend logic with user given values and return a success/failure response
        @Test
        public void getAllPostsInformation() {
            final String GET_POST_INFORMATION = "https://jsonplaceholder.typicode.com/posts";
            RestAssured.baseURI = GET_POST_INFORMATION;
            RequestSpecification requestSpecification = RestAssured.given().
                    relaxedHTTPSValidation().noFilters().header("Content-Type", "application/json").when().log().all();
            ValidatableResponse validatableResponse = requestSpecification.get(GET_POST_INFORMATION).then();
            validatableResponse.extract().statusCode();
            Response response1 = requestSpecification.get(GET_POST_INFORMATION);
            response1.getStatusCode();



        }
    }
         //Response is a class // ValidatableResponse }
         /** * Back end developer code logic for query parameter API */
         /* @GETMapping (value="http://localhost:8080/CBLogin") public JSONObject loginAPI
         (@QueryParam String username username @QueryParam String password password){ //logics }*/
         /** * Back end developer code logic for Path parameter API * * Response: {"Successful"} * Response : "Succesful"; */
         /* @GETMapping (value="http://localhost:8080/CBLogin", produces ="application/json")
         @GETMapping (value="http://localhost:8080/CBLogin", produces ="text/plain")
         public String loginAPI (@PathParam String username username @PathParam String password password){
         authentication String response = "Succesfull"; return response;*/



