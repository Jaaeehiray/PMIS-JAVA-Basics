package Basic.Day_9;

class Locker<T> {
    private T item;

    // Store an item in the locker
    void put(T item) {
        this.item = item;
    }

    // Get the item from the locker
    T get() {
        return item;
    }
}

public class genq1 {
   
    public static void main(String[] args) {

        // Locker for a String
        Locker<String> bookLocker = new Locker<>();
        bookLocker.put("Java Book");
        System.out.println("Locker has: " + bookLocker.get());

        // Locker for an Integer
        Locker<Integer> intLocker = new Locker<>();
        intLocker.put(1234);
         intLocker.put(8910);
        System.out.println("Locker has: " + intLocker.get());
    }
}

