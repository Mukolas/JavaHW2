package PersheZavdannya;

public class Akula extends Ryby {
    private String name;

    public Akula() {
    }

    public Akula(String name) {
        this.name = name;
    }

    public Akula(String vyd, String areal, int speed, String liveIn, String name) {
        super(vyd, areal, speed, liveIn);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Akula{" +
                "name=" + name +
                "} " + super.toString();
    }
}
