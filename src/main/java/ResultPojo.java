import java.util.List;

public class ResultPojo {

    public int update_id;
    public List<MessagePojo> message;

    public int getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(int update_id) {
        this.update_id = update_id;
    }

    public List<MessagePojo> getMessage() {
        return message;
    }

    public void setMessage(List<MessagePojo> message) {
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
