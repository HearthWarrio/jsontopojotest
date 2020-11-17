import Entity.Message;
import Entity.Result;
import Entity.User;
import io.restassured.common.mapper.TypeRef;


public class DataForOperations {
    public static Serialization serialize = new Serialization();
    static String user_id = serialize.serialization(new TypeRef<User>() {}).getUsername();
    static int update_id = serialize.serialization(new TypeRef<Result>() {}).getUpdate_id();
    static String user_message = serialize.serialization(new TypeRef<Message>() {}).getText();
}
