package DrugeZavdannya;

public class Main {
    public static void main(String[] args) {
     User user1 = new User("woman");
     User user2 = new User("man");
     if(user1.getStat()=="woman"){
         user1.VdyagnutyJinku();
     }else if (user1.getStat()=="man"){
         user1.VdyagnutyCholovika();
     }else {
         System.out.println("Ви вказали не вірну стать.");
     }
    }
}
