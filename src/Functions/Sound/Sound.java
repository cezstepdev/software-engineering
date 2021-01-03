package Functions.Sound;

abstract public class Sound {

    abstract Sound showInfo();
    abstract void updateInfo(String notes);
}

class Guitar extends Sound {

    private static int id = 0;
    private int idSound;
    String notes;

    public Guitar(String notes) {
        id++;
        idSound = id;
        this.notes = notes;
    }

    public Sound showInfo() {
        return this;
    }

    void updateInfo(String notes) {
        this.notes = notes;
    }
}

class Drums extends Sound {

    private static int id = 0;
    private int idSound;
    String notes;

    public Drums(String notes) {
        id++;
        idSound = id;
        this.notes = notes;
    }

    public Sound showInfo() {
        return this;
    }

    void updateInfo(String notes) {
        this.notes = notes;
    }

    public Sound getType(String type) {
        if(type.equals("guitar"))
            return new Guitar("description");
        if(type.equals("drums"))
            return new Drums("description");
        else
        return null;
    }

    /*void UpdateSoundInfo() {
        Sound sound = getType("drum");
        sound.updateInfo("drum");
    }*/
}

