import java.util.List;

public class Pojo {

    public class From {

        public int id;
        public boolean is_bot;
        public String first_name;
        public String username;
        public String language_code;
        public String last_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isIs_bot() {
            return is_bot;
        }

        public void setIs_bot(boolean is_bot) {
            this.is_bot = is_bot;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getLanguage_code() {
            return language_code;
        }

        public void setLanguage_code(String language_code) {
            this.language_code = language_code;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        @Override
        public String toString() {
            return "From{" +
                    "id=" + id +
                    ", is_bot=" + is_bot +
                    ", first_name='" + first_name + '\'' +
                    ", username='" + username + '\'' +
                    ", language_code='" + language_code + '\'' +
                    ", last_name='" + last_name + '\'' +
                    '}';
        }
    }

    public class Chat {

        public int id;
        public String first_name;
        public String username;
        public String type;
        public String last_name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        @Override
        public String toString() {
            return "Chat{" +
                    "id=" + id +
                    ", first_name='" + first_name + '\'' +
                    ", username='" + username + '\'' +
                    ", type='" + type + '\'' +
                    ", last_name='" + last_name + '\'' +
                    '}';
        }
    }

    public class Entity {

        public int offset;
        public int length;
        public String type;

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Entity{" +
                    "offset=" + offset +
                    ", length=" + length +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public class Message {

        public int message_id;
        public List<From> from;
        public Chat chat;
        public int date;
        public String text;
        public List<Entity> entities;

        public int getMessage_id() {
            return message_id;
        }

        public void setMessage_id(int message_id) {
            this.message_id = message_id;
        }

        public List<From> getFrom() {
            return from;
        }

        public void setFrom(List<From> from) {
            this.from = from;
        }

        public Chat getChat() {
            return chat;
        }

        public void setChat(Chat chat) {
            this.chat = chat;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<Entity> getEntities() {
            return entities;
        }

        public void setEntities(List<Entity> entities) {
            this.entities = entities;
        }

        @Override
        public String toString() {
            return "Message{" +
                    "message_id=" + message_id +
                    ", from=" + from +
                    ", chat=" + chat +
                    ", date=" + date +
                    ", text='" + text + '\'' +
                    ", entities=" + entities +
                    '}';
        }
    }

    public class Result {

        public int update_id;
        public List<Message> message;

        public int getUpdate_id() {
            return update_id;
        }

        public void setUpdate_id(int update_id) {
            this.update_id = update_id;
        }

        public List<Message> getMessage() {
            return message;
        }

        public void setMessage(List<Message> message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "update_id=" + update_id +
                    ", message=" + message +
                    '}';
        }
    }

    public class Root {

        public boolean ok;
        public List<Result> result;

        public boolean isOk() {
            return ok;
        }

        public void setOk(boolean ok) {
            this.ok = ok;
        }

        public List<Result> getResult() {
            return result;
        }

        public void setResult(List<Result> result) {
            this.result = result;
        }

        @Override
        public String toString() {
            return "Root{" +
                    "ok=" + ok +
                    ", result=" + result +
                    '}';
        }
    }
}
