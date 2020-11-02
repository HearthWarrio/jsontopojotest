import Entity.User;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    String webPage = "https://api.telegram.org/bot1030325998:AAERsCxzhfoUrBmj9wYZkDsO0G_Zi7XC7Dw/getUpdates";

    @Test
    public void DoTest2() {
        try {
            User user = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", User.class);
            System.out.println(user);
            Assert.assertEquals("HearthWarrio", user.getFirst_name());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
