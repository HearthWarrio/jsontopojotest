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

        log.info("Serialization of Result passed");

    }


    @Test
    public void MessageSerializationTest() {

        serialize.serialization(new TypeRef<Message>() {});

        log.info("Serialization of Message passed");

    }

    @Test
    public void UserSerializationTest() {

        serialize.serialization(new TypeRef<User>() {});

        log.info("Serialization of User passed");

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
