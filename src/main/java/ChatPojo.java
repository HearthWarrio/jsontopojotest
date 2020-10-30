public class ChatPojo {

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
