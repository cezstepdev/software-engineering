package Functions.Props;

public class Lightning extends AbstractProps {

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
    public void updateInfo(String description) {
        this.description = description;
    }
}
