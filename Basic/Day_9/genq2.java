package Basic.Day_9;

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class genq2 {
    public static void main(String[] args) {

        // Box to store a String
        Box<String> mobile = new Box<>();
        mobile.setItem("Samsung");

        // Box to store an Integer
        Box<Integer> price = new Box<>();
        price.setItem(25000);

        System.out.println("Mobile: " + mobile.getItem());
        System.out.println("Price: " + price.getItem());
    }
}

    
