import java.util.List;

public class RootPojo {
    public boolean ok;
    public List<ResultPojo> result;

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<ResultPojo> getResult() {
        return result;
    }

    public void setResult(List<ResultPojo> result) {
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
