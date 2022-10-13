import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class PostTest {


    @Test
    void shouldCheckSomething() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(400)
                .body("data", equalTo("some data"))
            ;

    }
    
}



// http://localhost:9999/api/v1/demo/accounts
