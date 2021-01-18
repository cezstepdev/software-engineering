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


