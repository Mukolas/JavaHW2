package PersheZavdannya;

public class Kenguru extends Savtsi {
    private String name;

    public Kenguru() {
    }

    public Kenguru(String name) {
        this.name = name;
    }

    public Kenguru(int speed, boolean dvonogiy, String name) {
        super(speed, dvonogiy);
        this.name = name;
    }

    public Kenguru(String vyd, String areal, int speed, boolean dvonogiy, String name) {
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
        return "Kenguru{" +
                "name=" + name +
                "} " + super.toString();
    }
}
