package lesson_11_Java.my_array_list;

/**
 * Imagine that Java does not have a collection of type ArrayList.
 * Create your own class that simulates the work of a dynamic collection class - i.e. create your custom collection.
 * The collection will be based on an array.
 * A custom collection must store elements of different classes (i.e. it is generic).
 * Provide operations for adding an element, removing an element, getting an element by index,
 *checking whether an element is in the collection, a method for clearing the entire collection.
 * Provide constructor with no parameters - creates an array with a default size.
 * Provide a constructor with a given size of the internal array.
 * Provide the ability to automatically expand the collection when adding an element in the case when
 *the collection is already full.
 */
public class MyArrayList {
    public static void main(String[] args) {
        // Create a class object
        ExampleArrayList<String> strings = new ExampleArrayList<>();

        // Checking if elements are added to the list
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        System.out.print("Source list: ");
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }

        // Checking the list size
        System.out.println("\nSize: " + strings.size());

        // Checking if an element is taken by index
        System.out.println("Get 0 element: " + strings.get(0));

        // Checking if elements are removed by index to the list
        System.out.println("Remove element by index 1: " + strings.remove(1));

        // Checking if elements are in a list
        System.out.println("Contains 'One': " + strings.contains("One"));

        // Checking if the entire list is being cleared
        strings.clear();
        System.out.println("Size after clear: " + strings.size());
    }
}
