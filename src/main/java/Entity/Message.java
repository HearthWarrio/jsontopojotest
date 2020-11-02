package Entity;

import org.telegram.telegrambots.api.objects.Chat;

import java.util.List;

public class Message {
    public int message_id;
    public List<User> user;
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

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
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
                ", from=" + user +
                ", chat=" + chat +
                ", date=" + date +
                ", text='" + text + '\'' +
                ", entities=" + entities +
                '}';
    }
}
