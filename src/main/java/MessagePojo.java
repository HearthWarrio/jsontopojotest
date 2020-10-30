import org.telegram.telegrambots.api.objects.Chat;

import java.util.List;

public class MessagePojo {
    public int message_id;
    public List<FromPojo> from;
    public Chat chat;
    public int date;
    public String text;
    public List<EntityPojo> entities;

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public List<FromPojo> getFrom() {
        return from;
    }

    public void setFrom(List<FromPojo> from) {
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

    public List<EntityPojo> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityPojo> entities) {
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
