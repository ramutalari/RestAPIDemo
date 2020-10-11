package steps;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ExtentReportExample {
    @Test
    public void getExample() {
        final String GET_POST_INFORMATION = "https://jsonplaceholder.typicode.com/posts";
        RestAssured.baseURI = GET_POST_INFORMATION;
        RequestSpecification requestSpecification = RestAssured.given().
        relaxedHTTPSValidation().noFilters().header("Content-Type", "application/json").when().log().all();
        ValidatableResponse validatableResponse = requestSpecification.get(GET_POST_INFORMATION).then();
        validatableResponse.extract().statusCode();
        Response response1 = requestSpecification.get(GET_POST_INFORMATION);
        response1.getStatusCode();
        // start reporters
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target//ExtentReports//extent.html");
        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // creates a toggle for the given test, adds all log events under it
        ExtentTest logger = extent.createTest("MyFirstTest", "Sample description");
        logger.log(Status.PASS,"GETMETHOD PASSED");
        logger.log(Status.INFO,"GET Example");
        extent.flush();

        ExtentTest logger2 = extent.createTest("MyFirstTest", "Sample description");
        logger2.log(Status.FAIL,"GETMETHOD PASSED 2..");
        logger2.log(Status.INFO,"GET Example 2 ");
        extent.flush();
    }
}
