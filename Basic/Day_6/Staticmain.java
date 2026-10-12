package Basic.Day_6;

public class Staticmain {
    public static void main(String[] args) {
        student1 s1 = new student1("Jaae");
        student1 s2 = new student1("Unnu");
        System.out.println(student1.collegeName);
        s1.stucol();
        s2.stucol();

    }
}
