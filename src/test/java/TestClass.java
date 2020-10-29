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
        when().get("https://api.telegram.org/botSomeToken/getUpdates")
                .then().extract().body().as(DasModell.class);
    }

}
