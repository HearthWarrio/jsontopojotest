import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.common.mapper.TypeRef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import java.sql.*;


public class TestClass {
    public final Logger log = LogManager.getLogger(TestClass.class);
    public Serialization serialize = new Serialization();
    public Insertion insert = new Insertion();

    @Test
    public void ResultSerializationTest() {

        serialize.serialization(new TypeRef<Result>() {});
        int update_id = serialize.serialization(new TypeRef<Result>() {}).getUpdate_id();

        log.info("Serialization of Result passed");

    }


    @Test
    public void MessageSerializationTest() {

        serialize.serialization(new TypeRef<Message>() {});
        String user_message = serialize.serialization(new TypeRef<Message>() {}).getText();

        log.info("Serialization of Message passed");

    }

    @Test
    public void UserSerializationTest() {

        serialize.serialization(new TypeRef<User>() {});
        String user_id = serialize.serialization(new TypeRef<User>() {}).getUsername();

        log.info("Serialization of User passed");

    }

    @Test
    public void InsertDataToDatabaseTest(String user_id, String user_message, int update_id) throws SQLException {

        insert.InsertDataToDatabase(user_id, user_message, update_id);

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
