package Functions.Props;

public class Lightning extends AbstractProps {
    static int id = 0;
    String description;
    int lightningLevel;
    int idLightning;

    public Lightning() {
        idLightning = id;
        id++;
    }


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
