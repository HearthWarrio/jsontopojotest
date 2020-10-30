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

    }
}
