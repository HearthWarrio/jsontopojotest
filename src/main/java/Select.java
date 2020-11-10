import java.sql.*;

public class Select {
    final String userlogin = "user";
    final String password = "password";
    final String url = "jdbc:postgresql://ec2-18-211-48-247.compute-1.amazonaws.com:5432/d4h4hpps2bnuvu";

    public void SelectFromDatabase() throws SQLException {
        final Connection connection = DriverManager.getConnection(url, userlogin, password);
        try (Statement statement = connection.createStatement()) {
            final ResultSet resultSet = statement.executeQuery("SELECT * FROM telegramapitest");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String user_id = resultSet.getString("user_id");
                System.out.println("ID: " + id);
                System.out.println("User ID:" + user_id);
            } try {
                resultSet.close();
                statement.close();
                connection.close();
            } finally {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }
}
