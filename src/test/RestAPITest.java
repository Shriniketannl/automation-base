package test;

import static io.restassured.RestAssured.*;

import io.restassured.internal.RestAssuredResponseOptionsImpl;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class RestAPITest {


    @Test
    public void testGetMyTwitterInfo() {
        // Replace with your actual bearer token
        String bearerToken = "YOUR_BEARER_TOKEN";

        Response response = given()
                .baseUri("https://api.twitter.com")
                .basePath("/2/users/me")
                .header("Authorization", "Bearer " + bearerToken)
                .when()
                .get()
                .then()
                .extract()
                .response();


        // Print the response body
        System.out.println("Response Body: " + response.getBody().asString());
        // Print the response status code
        System.out.println("Response Status Code: " + response.getStatusCode());
    }
}
