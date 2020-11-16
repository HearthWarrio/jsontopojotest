import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Serialization {

    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";

    public<T> T serialization(TypeRef<T> targetClass) {
        return RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", targetClass);
    }
}
