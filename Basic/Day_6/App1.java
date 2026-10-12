package Basic.Day_6;

// public class App1 {
//     public static void main(String[] args){
//         car c = new car();
//         c.drive();

//     }
// }

public class App1{
    public static void main(String[] args){
        Address home =  new Address("Nashik" , "MH" , 423203);
        student Jaee = new student("Jaee", 101 ,home);

        Jaee.displayprofile();

    }
}