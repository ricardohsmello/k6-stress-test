package br.com.ricas;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EndpointResourceTest {

    @Test
    public void testReadEndpoint() {
        given()
          .when().get("/read/5")
          .then()
             .statusCode(200)
             .body(is("{0=Value about 0, 1=Value about 1, 2=Value about 2, 3=Value about 3, 4=Value about 4}"));
    }

}