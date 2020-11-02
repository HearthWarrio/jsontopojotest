import Entity.From;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;

public class TestClass {
    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";

    @Test
    public void DoTest2() throws IOException {
        try {
            From from = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", From.class);
            System.out.println(from);
            Assert.assertEquals("HearthWarrio", from.getFirst_name());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
