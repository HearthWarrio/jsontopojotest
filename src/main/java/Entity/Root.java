package Entity;

import java.util.List;

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
