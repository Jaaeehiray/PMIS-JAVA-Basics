package Basic.Day_9;

/*class Box<T>{
    private T item;
     void set(T items){
        this.item = item;
     }
     T get(){
        return item;
     }
}
public class gen {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("hello");
        String s = box.get();
        System.out.println(s);
    }
}*/

/*
1. Compile-time errors detected. Without generics, we can't detect
   compile-time errors, and the code will break while executing (runtime).

2. No manual casting.

3. Reusable code. (One Box class works for any type).

Rules:
1. Mention the wrapper class.
2. Java automatically performs autoboxing and unboxing.
*/


//multiple pairs
/*class pair<K, V>{

    private K key;

    private V value;

    pair(K key,V value){
        this.key = key;
        this.value = value;

    }

    K getKey(){
        return key;
    }
    V getValue(){
        return value;
    }
}

class gen{
    public static void main(String[] args) {
        pair<String, Integer> p = new pair<>("Age",25);
    
    String K =p.getKey();
    Integer V =p.getValue();
    System.out.println(K + " :" + V);
}
}*/


//without grnerics

class Pair {
    private Object key;
    private Object value;

    Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    Object getKey() {
        return key;
    }

    Object getValue() {
        return value;
    }
}

class multipairs {
    public static void main(String[] args) {

        Pair p = new Pair("age", 25);

        String K = (String) p.getKey();
        Integer V = (Integer) p.getValue();

        System.out.println(K+ ":" + V);
    }
}