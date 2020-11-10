import org.junit.Test;
import java.sql.*;


public class TestClass {
    public static Serialization serialize;
    public static Insertion insert;
    public static Select select;

    @Test
    public void UserSerializationTest() {

        serialize.UserSerialization();

    }

    @Test
    public void MessageSerializationTest() {

        serialize.MessageSerialization();

    }

    @Test
    public void ResultSerializationTest() {

        serialize.ResultSerialization();

    }

    @Test
    public void InsertDataToDatabaseTest() throws SQLException {

        insert.InsertDataToDatabase();

    }

    @Test
    public void InsertUpdateTimeToDataBaseTest () throws SQLException {

        insert.InsertUpdateTimeToDatabase();

    }

    @Test
    public void  SelectFromDatabaseTest() throws SQLException {

        select.SelectFromDatabase();

    }
}
