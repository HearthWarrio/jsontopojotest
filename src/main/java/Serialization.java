import Entity.Message;
import Entity.Result;
import Entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.restassured.RestAssured;

import java.util.Objects;

public class Serialization {
    String webPage = "https://api.telegram.org/botSomeToken/getUpdates";
    public final Logger log = LogManager.getLogger(Serialization.class);

    public void MessageSerialization() {
        Message message = RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", Message.class);
        int Message_id = message.getMessage_id();
        if(Objects.equals(Message_id, message.getMessage_id())) {

            log.info("ИД сообщения" + Message_id + " верен");

        } else {

            log.error("ИД сообщения " + Message_id + " не верен");

        }
    }

    public void UserSerialization() {
        User user = RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", User.class);
        String Uname = user.getUsername();
        if(Objects.equals(Uname, user.getUsername())) {

            log.info("Юзернейм " + Uname + " верен");

        } else {

            log.error("Юзернейм " + Uname + " не верен");

        }
    }

    public void ResultSerialization() {
        Result result = RestAssured.given()
                .when()
                .get(webPage)
                .body()
                .jsonPath()
                .getObject("result", Result.class);
        int UpdateId = result.getUpdate_id();
        if(Objects.equals(UpdateId, result.getUpdate_id())) {

            log.info("ИД апдейта " + UpdateId + " верен");

        } else {

            log.error("ИД апдейта " + UpdateId + " не верен");

        }
    }
}
