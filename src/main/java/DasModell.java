import java.util.List;

public class DasModell{

    public class From{
        public int id;
        public boolean is_bot;
        public String first_name;
        public String username;
        public String language_code;
        public String last_name;
    }

    public class Chat{
        public int id;
        public String first_name;
        public String username;
        public String type;
        public String last_name;
    }

    public class Entity{
        public int offset;
        public int length;
        public String type;
    }

    public class Message{
        public int message_id;
        public From from;
        public Chat chat;
        public int date;
        public String text;
        public List<Entity> entities;
    }

    public class Result{
        public int update_id;
        public Message message;
    }

    public class Root{
        public boolean ok;
        public List<Result> result;
    }
}