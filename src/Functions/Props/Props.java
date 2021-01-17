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