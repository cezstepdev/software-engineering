package Functions.Props;

public class Chair extends AbstractProps {
    static int id = 0;
    String description;
    int count;
    String position;
    int idChair;

    public Chair() {
        idChair = id;
        id++;
    }

    public int getId() {
        return idChair;
    }

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

    @Override
    public AbstractProps showInfo() {
        return this;
    }

    @Override
    public void updateInfo(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
