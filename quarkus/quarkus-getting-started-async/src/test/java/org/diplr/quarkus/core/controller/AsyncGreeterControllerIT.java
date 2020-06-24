package org.diplr.quarkus.core.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class AsyncGreeterControllerIT {

    @Test
    public void greetReturnsHelloWorld() {
        given()
                .when().get("/greeting")
                .then()
                .statusCode(is(200))
                .body(is("hello world"));
    }
}
