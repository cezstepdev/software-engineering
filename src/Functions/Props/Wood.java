package Functions.Props;

public class Wood extends AbstractProps {

    String description;
    String position;
    int count;
    String type;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public AbstractProps showInfo() {
        return this;
    }

    @Override
    public void updateInfo(String description) {
        this.description = description;
    }
}
