package Functions;

public class Wardrobe {
    String shirts;
    String shoes;
    String pants;

    public Wardrobe getInfo() {
        return this;
    }

    public void updateInfo(String shirts, String shoes, String pants) {
        this.shirts = shirts;
        this.shoes = shoes;
        this.pants = pants;
    }

    public void updateWardrobe(String shirts, String shoes, String pants) {
        new Wardrobe().updateInfo(shirts, shoes, pants);
    }
}


