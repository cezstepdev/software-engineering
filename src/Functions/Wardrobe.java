package Functions;

public class Wardrobe {
    static int id = 0;
    String shirts;
    String shoes;
    String pants;
    int idWardrobe;

    public Wardrobe() {
        idWardrobe = id;
        id++;
    }

    public int getId() {
        return idWardrobe;
    }

    public Wardrobe getInfo() {
        return this;
    }

    public void updateInfo(String shirts, String shoes, String pants) {
        this.shirts = shirts;
        this.shoes = shoes;
        this.pants = pants;
    }
}


