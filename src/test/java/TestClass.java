import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.common.mapper.TypeRef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import java.sql.*;


public class TestClass {
    public final Logger log = LogManager.getLogger(TestClass.class);
    public Serialization serialize = new Serialization();
    public Insertion insert = new Insertion();




    @Test
    public void ResultSerializationTest() {
        Result result = serialize.serialization(new TypeRef<Result>() {});
        int update_id = result.getUpdate_id();
        Assert.assertEquals(update_id, "606267504");

        log.info("Serialization of Result passed");

    }


    @Test
    public void MessageSerializationTest() {
        Message message = serialize.serialization(new TypeRef<Message>() {});
        String user_message = message.getText();
        Assert.assertEquals(user_message, "sdghsdghgsfdh");

        log.info("Serialization of Message passed");

    }

    @Test
    public void UserSerializationTest() {
        User user = serialize.serialization(new TypeRef<User>() {});;
        String user_id = user.getUsername();
        Assert.assertEquals(user_id, "HearthWarrio");

        log.info("Serialization of User passed");

    }

    @Test
    public void InsertDataToDatabaseTest() throws SQLException {
        User user = serialize.serialization(new TypeRef<User>() {});;
        Message message = serialize.serialization(new TypeRef<Message>() {});
        Result result = serialize.serialization(new TypeRef<Result>() {});
        String user_id = user.getUsername();
        String user_message = message.getText();
        int update_id = result.getUpdate_id();

        insert.InsertDataToDatabase(user_id, user_message, update_id);

    }

    @Test
    public void InsertUpdateTimeToDataBaseTest () throws SQLException {

        insert.InsertUpdateTimeToDatabase();

    }

    @Test
    public void  SelectFromDatabaseTest() throws SQLException {
        User user = serialize.serialization(new TypeRef<User>() {});;
        insert.SelectFromDatabase();
        Assert.assertEquals(user.getUsername(), "HearthWarrio");

    }
}
