package PersheZavdannya;

public class Savtsi extends Animal {
    private int speed;
    private boolean dvonogiy;

    public Savtsi() {
    }

    public Savtsi(int speed, boolean dvonogiy) {
        this.speed = speed;
        this.dvonogiy = dvonogiy;
    }

    public Savtsi(String vyd, String areal, int speed, boolean dvonogiy) {
        super(vyd, areal);
        this.speed = speed;
        this.dvonogiy = dvonogiy;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDvonogiy() {
        return dvonogiy;
    }

    public void setDvonogiy(boolean dvonogiy) {
        this.dvonogiy = dvonogiy;
    }

    @Override
    public String toString() {
        return "Savtsi{" +
                "speed=" + speed +
                ", dvonogiy=" + dvonogiy +
                "} " + super.toString();
    }
}
