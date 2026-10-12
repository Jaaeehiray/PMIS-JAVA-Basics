package Basic.Day_6;

public class abstractmain {

    public static void main(String[] args) {

        shape c = new Circle(0.5);
        shape r = new Rectangle(12.0, 8.8);

        c.setcolor("Orange");
        r.setcolor("Pink");

        System.out.printf("%s circle area is %.2f\n",
                c.getcolor(), c.calculateArea());

        System.out.printf("%s rectangle area is %.2f\n",
                r.getcolor(), r.calculateArea());
    }
}