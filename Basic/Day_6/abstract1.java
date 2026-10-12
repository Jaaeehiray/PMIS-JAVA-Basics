package Basic.Day_6;

abstract class shape {

    private String color;

    void setcolor(String color) {
        this.color = color;
    }

    String getcolor() {
        return color;
    }

    abstract double calculateArea();
}


class Circle extends shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}


class Rectangle extends shape {

    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}