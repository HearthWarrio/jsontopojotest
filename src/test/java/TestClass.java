import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static io.restassured.RestAssured.when;

public class TestClass{

    File basedir;
    TestClass testClass;

    @Before
    public void setUp() {
        basedir = new File("./src/test/resources/schema");
    }

    @SuppressWarnings("unchecked")
    @Test
    public void getTheJSON() {
        when().get("https://api.telegram.org/bot1030325998:AAERsCxzhfoUrBmj9wYZkDsO0G_Zi7XC7Dw/getUpdates")
                .then().extract().body().as(DasModell.class);
    }

}
