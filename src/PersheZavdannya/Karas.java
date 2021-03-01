package PersheZavdannya;

public class Karas extends Ryby {
    private String name;

    public Karas() {
    }

    public Karas(String name) {
        this.name = name;
    }

    public Karas(int speed, String liveIn, String name) {
        super(speed, liveIn);
        this.name = name;
    }

    public Karas(String vyd, String areal, int speed, String liveIn, String name) {
        super(vyd, areal, speed, liveIn);
        this.name = name;
    }

    public String isName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Karas{" +
                "name=" + name +
                "} " + super.toString();
    }
}


