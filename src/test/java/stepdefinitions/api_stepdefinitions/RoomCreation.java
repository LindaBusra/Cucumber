package stepdefinitions.api_stepdefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Room;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

public class RoomCreation  {

    Response response;

    @Given("user sends post request for room data")
    public void user_sends_post_request_for_room_data() {

        //Set the url
        spec.pathParams("first", "api", "second", "rooms");


        //Set the expected data
        Room expectedData = new Room();

//        Faker faker = new Faker();

        expectedData.setRoomNumber(Faker.instance().number().numberBetween(1000,9500));
        expectedData.setRoomType("DELUXE");
        expectedData.setStatus(true);
        expectedData.setPrice(350);
        expectedData.setDescription("With terrace");

        //Send the request and get the response
        response = given().headers("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnRlYW0wMSIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjc3NDI1NjYwfQ.WVWX2JLjzeRDhUbAmbrk7ou81AraymjTPtRhtSApTy4twmrEyfOvjdrrrCaGFLYD28ETHGWVhYdXrzWNiMIhGQ",
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).spec(spec).contentType(ContentType.JSON).
                body(expectedData).post("/{first}/{second}");
        response.prettyPrint();

    }

    @Then("user gets the room data and validates")
    public void user_gets_the_room_data_and_validates() {

        assertEquals(201, response.getStatusCode());

    }
}
