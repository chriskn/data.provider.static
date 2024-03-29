package de.codecentric.parking;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class ParkingFacilityResourceTest {

    @Test
    public void test() {
        given()
          .when().get("/facilities")
          .then()
             .statusCode(200);
    }

}