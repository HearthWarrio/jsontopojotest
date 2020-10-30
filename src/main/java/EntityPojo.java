public class EntityPojo {

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
