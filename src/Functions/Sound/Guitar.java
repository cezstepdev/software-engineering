package Functions.Sound;

public class Guitar extends AbstractSound {

    private static int id = 0;
    private int idSound;
    String notes;

    public Guitar() {
        id++;
        idSound = id;
    }
    public int getId() {
        return idSound;
    }

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AbstractSound showInfo() {
        return this;
    }

    void updateInfo(String notes) {
        this.notes = notes;
    }
}
