package Basic.Day_6;
public class staticq1main {

    public static void main(String[] args) {

        System.out.println("Initial user count: " + UserAccount.getTotalUsers());

        UserAccount u1 = new UserAccount("Jaaee");
        UserAccount u2 = new UserAccount("Juee");
        UserAccount u3 = new UserAccount("unnu");

        System.out.println("Username: " + u1.getUsername());
        System.out.println("Username: " + u2.getUsername());
        System.out.println("Username: " + u3.getUsername());

        System.out.println("Total users registered: " + UserAccount.getTotalUsers());
    }
}


    

