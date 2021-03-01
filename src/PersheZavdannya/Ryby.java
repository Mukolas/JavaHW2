package PersheZavdannya;

public class Ryby extends Animal {
    private int speed;
    private String liveIn;

    public Ryby() {
    }

    public Ryby(int speed, String liveIn) {
        this.speed = speed;
        this.liveIn = liveIn;
    }

    public Ryby(String vyd, String areal, int speed, String liveIn) {
        super(vyd, areal);
        this.speed = speed;
        this.liveIn = liveIn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getLiveIn() {
        return liveIn;
    }

    public void setLiveIn(String liveIn) {
        this.liveIn = liveIn;
    }

    @Override
    public String toString() {
        return "Ryby{" +
                "speed=" + speed +
                ", liveIn='" + liveIn + '\'' +
                "} " + super.toString();
    }
}
