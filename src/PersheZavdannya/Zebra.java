package PersheZavdannya;

public class Zebra extends Savtsi {
    private String name;

    public Zebra() {
    }

    public Zebra(String name) {
        this.name = name;
    }

    public Zebra(String vyd, String areal, int speed, boolean dvonogiy, String name) {
        super(vyd, areal, speed, dvonogiy);
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
        return "Zebra{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
