//package steps;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
////Package org.apache.http.HttpStatus
//
//public class TC001GETEx
//{
//    @Test
//    void getWeatherDetails()
//    {
//        //Specify baseURI - It is path parameter
//       final String URI = "http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
//      //Query Parameter
//// final String endpointURI2 ="https://samples.openweathermap.org/data/2.5/forecast?q=London,us&appid=439d4b804bc8187953eb36d2a8c26a02";
//        //Query parameter
//        //  https://reqres.in/api/users?page=2
//
//        //RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city/{cityname}";
//        RestAssured.baseURI = URI;
//        //Request object - to send the request to server
//        RequestSpecification httpRequest = RestAssured.given();
//
//        //Response object - to store response
//        //1- by using Response
//        //Response response = httpRequest.request(Method.GET,"/Hyderabad");
//        Response response = httpRequest.get(URI);
//        //To print response
//        String responseBody = response.getBody().asString();
//        System.out.println("By using Response: ");
//        System.out.println("--------------------");
//        System.out.println("Response body is: "+responseBody);
//
//        int responseCode = response.getStatusCode();
//        System.out.println("Response code is:"+responseCode);
//        System.out.println();
//
//        SoftAssert sassert = new SoftAssert();
//
//        //2-By using ValidatableResponse
//        ValidatableResponse validatableResp = httpRequest.get(URI).then().log().all();
//        int statusCode = validatableResp.extract().statusCode();
//        String body = validatableResp.extract().body().asString();
//        System.out.println("By using ValidatableResponse");
//        System.out.println("-----------------------------");
//
//        System.out.println("Status code is:"+statusCode);
//        System.out.println("Response body is:"+body);
//
//     System.out.println("******************************************");
//     System.out.println(httpRequest.get(URI).then().log().all());
//     //httpRequest.get(URI).body().validatableResp.extract().body().
//
//        //To get the header
//        String contenttype = response.header("content-type");
//        System.out.println("content-type header is: "+contenttype);
//        sassert.assertEquals(contenttype,"application");
//
//        String statusLine = response.statusLine();
//        sassert.assertEquals(statusLine,"HTTP/1.1 200 OK");
//        System.out.println("Status line is:"+statusLine);
//
//        System.out.println("This is by using soft assert");
//
//        sassert.assertAll();
//
//
//     https://samples.openweathermap.org/data/2.5/weather?q="London,UK",appid="b6907d289e10d714a6e88b30761fae22"
//
//        //when we have to use given when then
//        //when we are using query parameter we can use like below
//        public void getUserDetails() {
//        Response response2 = RestAssured.given()
//               .baseUri("https://samples.openweathermap.org")
//                .basePath("data/2.5/weather")
//                .queryParam("q", "London,uk")
//                .queryParam("appid", "b6907d289e10d714a6e88b30761fae22")
//                .when()
//                .get();
//        System.out.println(response2.getBody().asString());
//
//        int statuscode = response2.getStatusCode();
//        System.out.println("status code is : "+statuscode);
//    }
//
//
//
//
//
//        ValidatableResponse res2 = RestAssured.given().relaxedHTTPSValidation().contentType(ContentType.JSON).header();
//    }
//    public ValidatableResponse servicePost(String endpoint, Map<String,String> header, String body){
//        ValidatableResponse res2 = (ValidatableResponse) RestAssured.
//                given().relaxedHTTPSValidation().
//                contentType(ContentType.JSON).headers(header).log().all()
//                .when().body(body).post(endpoint).
//                        then().log().all();
//        return res2;
//    }
//
//
//
