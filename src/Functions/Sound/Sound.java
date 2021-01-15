package Functions.Sound;

public class Sound {

    public AbstractSound getType(String type) {
        if(type.equals("guitar"))
            return new Guitar();
        if(type.equals("drums"))
            return new Drums();
        else
            return null;
    }
}

abstract class AbstractSound {
    abstract AbstractSound showInfo();
    abstract void updateInfo(String notes);
}

class Guitar extends AbstractSound {

    private static int id = 0;
    private int idSound;
    String notes;

    public static int getId() {
        return id;
    }

    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Guitar() {
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

class Drums extends AbstractSound {

    private static int id = 0;
    private int idSound;
    String notes;

    public static int getId() {
        return id;
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


