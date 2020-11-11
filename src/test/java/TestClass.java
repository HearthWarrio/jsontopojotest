import Entity.Message;
import Entity.Result;
import Entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import java.sql.*;


public class TestClass {
    public final Logger log = LogManager.getLogger(TestClass.class);
    public static Serialization serialize;
    public static Insertion insert;

    @Test
    public void UserSerializationTest() {

        serialize.serialization(User.class);

        log.info("Serialization of User passed");

    }

    @Test
    public void MessageSerializationTest() {

        serialize.serialization(Message.class);

        log.info("Serialization of Message passed");

    }

    @Test
    public void ResultSerializationTest() {

        serialize.serialization(Result.class);

        log.info("Serialization of Result passed");

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

        insert.SelectFromDatabase();

    }
}
