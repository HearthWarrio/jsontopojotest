package Entity;

import java.util.List;

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
