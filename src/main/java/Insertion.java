import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.common.mapper.TypeRef;


import javax.xml.crypto.Data;
import java.sql.*;
import java.util.Calendar;

public class Insertion {
    final String userlogin = "user";
    final String password = "password";
    final String url = "jdbc:postgresql://ec2-18-211-48-247.compute-1.amazonaws.com:5432/d4h4hpps2bnuvu";
    public Serialization serialize = new Serialization();
    int id = 0;

    public void InsertDataToDatabase() throws SQLException {
        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("INSERT INTO telegramapitest " + id + DataForOperations.update_id +
                    DataForOperations.user_id + DataForOperations.user_message, statement.RETURN_GENERATED_KEYS);
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


