import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class TestClass {
    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";
    final String userlogin = "user";
    final String password = "password";
    final String url = "jdbc:postgresql://ec2-18-211-48-247.compute-1.amazonaws.com:5432/d4h4hpps2bnuvu";
    long id = 0;
    String SQLInput = "INSERT INTO telegramapitest (id, update_id, user_id, user_message ";

    @Test
    public void DoTest0() {
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

    @Test
    public void DoTest1() {
        try {
            Message message = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", Message.class);
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void DoTest2() {
        try {
            Result result = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", Result.class);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void DoTest5() throws SQLException {

        final Connection connection = DriverManager.getConnection(url, userlogin, password);

        try (PreparedStatement statement = connection.prepareStatement(SQLInput,Statement.RETURN_GENERATED_KEYS)) {
            prepareStatement.setString(1, Result.getUpdate_id, User.getUsername, Message.getText);

        }
        finally {
            connection.close();
        }
    }
}
