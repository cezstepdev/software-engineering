package Functions.Sound;

public class Drums extends AbstractSound {

    private static int id = 0;
    private int idSound;
    String notes;

    public int getId() {
        return idSound;
    }

    public Drums() {
        id++;
        idSound = id;
    }

    public AbstractSound showInfo() {
        return this;
    }

    void updateInfo(String notes) {
        this.notes = notes;
    }
}
