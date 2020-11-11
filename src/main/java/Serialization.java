import io.restassured.RestAssured;

public class Serialization {

    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";

    public Serialization(Class<?> classType) {
        RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", classType);
    }

    public<T> Object serialization(Class<?> classType) {
        return RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", classType);
    }
}
