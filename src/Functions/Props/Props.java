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
}

class Lightning extends Props {

    int count;
    String lightningType;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(int count, String lightningType) {
        this.count = count;
        this.lightningType = lightningType;
    }
}

class Chair extends Props {

    String place;
    int count;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(String place, int count) {
        this.place = place;
        this.count = count;
    }
}

class Wood extends Props {

    String woodType;
    String place;
    int count;

    @Override
    public Props showInfo() {
        return this;
    }

    void updateInfo(String description, int count, String place) {
        this.woodType = description;
        this.count = count;
        this.place = place;
    }
}