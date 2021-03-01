package DrugeZavdannya;

public class User implements ManClouses, WomanClouses {
    private String stat;

    public User() {
    }

    public User(String stat) {
        this.stat = stat;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public void VdyagnutyCholovika() {
        System.out.println("Cholovik vdyagnutyy");
    }

    @Override
    public void VdyagnutyJinku() {
        System.out.println("Jinka vdyagnuta");
    }

    @Override
    public String toString() {
        return "User{" +
                "stat='" + stat + '\'' +
                '}';
    }
}
