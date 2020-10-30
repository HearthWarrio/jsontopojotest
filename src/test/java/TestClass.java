import Entity.From;
import io.restassured.RestAssured;
import org.junit.Test;

public class TestClass{

    @Test
    public void DoTest() {

        RestAssured.baseURI = "https://api.telegram.org/bot1030325998:AAERsCxzhfoUrBmj9wYZkDsO0G_Zi7XC7Dw/getUpdates";
        From pojo = new From();
        RestAssured.given().when().get().as(From.class);
        System.out.println(pojo.toString());

    }
}
