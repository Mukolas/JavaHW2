package PersheZavdannya;

public class Animal {
    private String vyd;
    private String Areal;

    public Animal() {
    }

    public Animal(String vyd, String areal) {
        this.vyd = vyd;
        Areal = areal;
    }

    public String getVyd() {
        return vyd;
    }

    public void setVyd(String vyd) {
        this.vyd = vyd;
    }

    public String getAreal() {
        return Areal;
    }

    public void setAreal(String areal) {
        Areal = areal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "vyd='" + vyd + '\'' +
                ", Areal='" + Areal + '\'' +
                '}';
    }
}


