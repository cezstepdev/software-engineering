package Functions.Props;

/*public Functions.Props getType(String type) {
        if(type.equals("lightning"))
        return new Lightning();
        if(type.equals("chair"))
        return new Chair();
        if(type.equals("wood"))
        return new Wood();
        else
        return null;
    }*/

abstract public class Props {
    abstract Props showInfo();
    abstract void updateInfo(String description);
}

class Lightning extends Props {

    String description;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(String description) {
        this.description = description;
    }
}

class Chair extends Props {

    String description;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(String description) {
        this.description = description;
    }
}

class Wood extends Props {

    String description;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(String description) {
        this.description = description;
    }

    public Props getType(String type) {
        if(type.equals("lightning"))
            return new Lightning();
        if(type.equals("chair"))
            return new Chair();
        if(type.equals("wood"))
            return new Wood();
        else
            return null;
    }

    public void updateProps(String type) {
        getType(type).updateInfo("in the background");
    }
}