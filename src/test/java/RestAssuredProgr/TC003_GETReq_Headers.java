package RestAssuredProgr;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC003_GETReq_Headers {
    @Test
    public void getHeaders()
    {
        //final String URI = "https://reqres.in/api/users?delay=3";
        final String baseURI2 = "https://reqres.in";

        RestAssured.baseURI = baseURI2;
        RequestSpecification requestSpecification = RestAssured.given();

        //To send query parameter
        Response response = requestSpecification.request(Method.GET,"/api/users?delay=3");

        String respnseBody = response.getBody().asString();
        System.out.println("Response body is:"+respnseBody);

        //To get the headers

        String accesscontrolalloworigin= response.getHeader("access-control-allow-origin");
        String cfcachestatus = response.getHeader("cf-cache-status");
        String cfray = response.getHeader("cf-ray");
        String cfrequestid = response.getHeader("cf-request-id");

        SoftAssert sassert = new SoftAssert();
        sassert.assertEquals(accesscontrolalloworigin,"*");
        System.out.println("accesscontrolalloworigin header value is:"+accesscontrolalloworigin);

        sassert.assertEquals(cfcachestatus,"DYNAMIC");
        System.out.println("cfcachestatus header value is:"+cfcachestatus);

        System.out.println("cfray header value is:"+cfray);
        System.out.println("cfrequestid header value is:"+cfrequestid);

//        sassert.assertEquals(cfray,"5a19d9a9cf7fe58f-MAN");
//        System.out.println("cfray header value is:"+cfray);
//
//        sassert.assertEquals(cfrequestid,"0344065e1e0000e58fd42cd200000001");
//        System.out.println("cfrequestid header value is:"+cfrequestid);

        sassert.assertAll();
    }
}
