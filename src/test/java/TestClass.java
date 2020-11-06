iimport Entity.Message;
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

    @Test
    public void DoTest0() {
            User user = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", User.class);
            System.out.println(user);
            Assert.assertEquals("HearthWarrio", user.getFirst_name());
    }

    @Test
    public void DoTest1() {
            Message message = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", Message.class);
            System.out.println(message);

    }

    @Test
    public void DoTest2() {
            Result result = RestAssured.given()
                    .when()
                    .get("result")
                    .body()
                    .jsonPath()
                    .getObject("result", Result.class);
            System.out.println(result);
    }

    @Test
    public void DoTest5() throws SQLException {
        Result result = new Result();
        User user = new User();
        Message message = new Message();
        String user_id = user.getUsername();
        int update_id = result.getUpdate_id();
        String user_message = message.getText();

        final Connection connection = DriverManager.getConnection(url, userlogin, password);
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate("INSERT INTO telegramapitest " + id + update_id + user_id + user_message, statement.RETURN_GENERATED_KEYS);
            }  finally {
                    connection.close();
        }
    }

    @Test
    public void  DoTest6() throws SQLException {
        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        try (Statement statement = connection.createStatement()) {
            statement.execute("SELECT user_id FROM telegramapitest ORDER BY id ASC");
        } finally {
                connection.close();
        }
    }
}
