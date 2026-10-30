package com.java.collections;
import java.util.*;
public class CollectionsDemo {

    public static void main(String[] args) {

        // 1. Creating a Collection
        Collection<String> fruits = new ArrayList<>();

        // 2. add(E e)
        System.out.println("----- ADD METHOD -----");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits: " + fruits);

        // 3. size()
        System.out.println("\n----- SIZE METHOD -----");
        System.out.println("Total fruits: " + fruits.size());

        // 4. isEmpty()
        System.out.println("\n----- ISEMPTY METHOD -----");
        System.out.println("Is collection empty? " + fruits.isEmpty());

        // 5. contains(Object o)
        System.out.println("\n----- CONTAINS METHOD -----");
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Kiwi? " + fruits.contains("Kiwi"));

        // 6. remove(Object o)
        System.out.println("\n----- REMOVE METHOD -----");
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // 7. addAll(Collection<? extends E> c)
        System.out.println("\n----- ADDALL METHOD -----");

        Collection<String> moreFruits = new ArrayList<>();

        moreFruits.add("Kiwi");
        moreFruits.add("Papaya");
        moreFruits.add("Pineapple");

        fruits.addAll(moreFruits);

        System.out.println("After addAll: " + fruits);

        // 8. containsAll(Collection<?> c)
        System.out.println("\n----- CONTAINSALL METHOD -----");

        System.out.println("Contains all moreFruits? "
                + fruits.containsAll(moreFruits));

        // 9. removeAll(Collection<?> c)
        System.out.println("\n----- REMOVEALL METHOD -----");

        fruits.removeAll(moreFruits);

        System.out.println("After removeAll: " + fruits);

        // 10. retainAll(Collection<?> c)
        System.out.println("\n----- RETAINALL METHOD -----");

        Collection<String> selectedFruits = new ArrayList<>();

        selectedFruits.add("Apple");
        selectedFruits.add("Mango");

        fruits.retainAll(selectedFruits);

        System.out.println("After retainAll: " + fruits);

        // 11. toArray()
        System.out.println("\n----- TOARRAY METHOD -----");

        Object[] fruitArray = fruits.toArray();

        for (Object fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 12. iterator() - inherited from Iterable
        System.out.println("\n----- ITERATOR METHOD -----");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 13. clear()
        System.out.println("\n----- CLEAR METHOD -----");

        fruits.clear();

        System.out.println("After clear: " + fruits);

        // Checking isEmpty again
        System.out.println("Is collection empty? " + fruits.isEmpty());
    }
}
