package lesson_11_Java.my_array_list;

/**
 * Interface containing methods for working with ArrayList
 */
public interface Example<E> {
    // Add element
    boolean add(E e);

    // Delete element
    boolean remove(int index);

    // Get element by index
    E get(int index);

    // Contains element
    boolean contains(E e);

    // Clear all collection
    void clear();

    // Get size
    int size();
}
