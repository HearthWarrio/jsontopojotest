import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.RestAssured;

import java.sql.*;
import java.util.Calendar;

public class Insertion {
    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";
    final String userlogin = "user";
    final String password = "password";
    final String url = "jdbc:postgresql://ec2-18-211-48-247.compute-1.amazonaws.com:5432/d4h4hpps2bnuvu";
    public static Serialization serialize;

    Result result = (Result) serialize.serialization(Result.class);
    User user = (User) serialize.serialization(User.class);
    Message message = (Message) serialize.serialization(Message.class);
    int id = 0;

    public void InsertDataToDatabase() throws SQLException {
        String user_id = user.getUsername();
        int update_id = result.getUpdate_id();
        String user_message = message.getText();
        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO telegramapitest " + id + update_id + user_id + user_message, statement.RETURN_GENERATED_KEYS);
        }
    }

    public void InsertUpdateTimeToDatabase() throws SQLException {

        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        Calendar calendar = Calendar.getInstance();
        java.sql.Timestamp timestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
        String sql = "INSERT INTO telegramapitest (update_time) VALUES (?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setTimestamp(1, timestampObject);
            preparedStatement.executeUpdate();

        }
    }

    public void SelectFromDatabase() throws SQLException {
        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        try (Statement statement = connection.createStatement()) {
            final ResultSet resultSet = statement.executeQuery("SELECT * FROM telegramapitest");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String user_id = resultSet.getString("user_id");
                System.out.println("ID: " + id);
                System.out.println("User ID:" + user_id);
            }
        }
    }
}


