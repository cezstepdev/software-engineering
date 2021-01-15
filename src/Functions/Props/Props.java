package Functions.Props;

public class Props {

    public AbstractProps getType(String type) {
        if(type.equals("lightning"))
            return new Lightning();
        if(type.equals("chair"))
            return new Chair();
        if(type.equals("wood"))
            return new Wood();
        else
            return null;
    }
}

abstract class AbstractProps {
    abstract AbstractProps showInfo();
    abstract void updateInfo(String description);
}

class Lightning extends AbstractProps {

    String description;
    int lightningLevel;

    public int getLightningLevel() {
        return lightningLevel;
    }

    void setLightningLevel(int lightningLevel) {
        this.lightningLevel = lightningLevel;
    }

    @Override
    public AbstractProps showInfo() {
        return this;
    }

    @Override
    void updateInfo(String description) {
        this.description = description;
    }
}

class Chair extends AbstractProps {

    String description;
    int count;
    String position;

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
    void updateInfo(String description) {
        this.description = description;
    }
}

class Wood extends AbstractProps {

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
    void updateInfo(String description) {
        this.description = description;
    }
}