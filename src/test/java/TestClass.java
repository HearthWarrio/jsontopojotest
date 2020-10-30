import groovy.time.BaseDuration;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.when;

public class TestClass{

    @Test
    public void DoTest() {

        RestAssured.baseURI = "https://api.telegram.org/bot1030325998:AAERsCxzhfoUrBmj9wYZkDsO0G_Zi7XC7Dw/getUpdates";
        FromPojo pojo = new FromPojo();
        RestAssured.given().when().get().as(FromPojo.class);
        System.out.println(pojo.toString());

<<<<<<< HEAD
=======
    @SuppressWarnings("unchecked")
    @Test
    public void getTheJSON() {
        when().get("https://api.telegram.org/botSomeToken/getUpdates")
                .then().extract().body().as(DasModell.class);
>>>>>>> df5798d7d2e2e83c4c6fba86c6dafa57e9b8e46b
    }
}
