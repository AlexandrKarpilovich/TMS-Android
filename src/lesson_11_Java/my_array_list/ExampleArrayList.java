package lesson_11_Java.my_array_list;

/**
 * A class that contains the created methods for working with the ArrayList based on an array
 */
public class ExampleArrayList<E> implements Example<E> {
    // An array containing some elements
    private E[] values;
    // Array size
    private int size;

    /*
        Constructor that initializes values.
        Objects are reduced to type E
     */
    public ExampleArrayList() {
        this.values = (E[]) new Object[0];
    }

    /*
        Overridden method that adds an element to the list
     */
    @Override
    public boolean add(E e) {
        // Checking for an error if it is not possible to pass the element to the class
        try {
            // Keeping the original list
            E[] temp = this.values;

            // Write the length of the array
            int valuesLength = this.values.length;

            // Increase the array size by one
            this.values = (E[]) new Object[valuesLength + 1];

            // Copy the elements of the original list to the new one
            System.arraycopy(temp, 0, this.values, 0, temp.length);

            // Assign the last element in the new list the value to be added
            this.values[valuesLength] = e;

            // Increase the size of the list
            size++;

            return true;

        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }

        return false;
    }

    /*
        Overridden method that removes an element to the list
     */
    @Override
    public boolean remove(int index) {
        // Checking for an error if it is not possible to pass the element to the class
        try {

            // Keeping the original list
            E[] temp = this.values;

            // Write the length of the array
            int valuesLength = this.values.length;

            // Decrease the array size by one
            this.values = (E[]) new Object[valuesLength - 1];

            // Copy the elements of the original list to the new one from 0 index to 'index'
            System.arraycopy(temp, 0, this.values, 0, index);

            // Remember the number of elements that will come after the removed
            int amountElementsAfterIndex = temp.length - index - 1;

            // Copy the rest of the elements to the list
            System.arraycopy(temp, index + 1, this.values, index, amountElementsAfterIndex);

            // Decrease the size of the list
            size--;

            return true;

        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }

        return false;
    }

    /*
        Overridden method that returns elements by index
     */
    @Override
    public E get(int index) {
        return this.values[index];
    }

    /*
        Overridden method that checks if the value is in the list
     */
    @Override
    public boolean contains(E e) {
        //  Loop through the elements of the list and if the element looking for is equal to the element from the list,
        //  then return true
        for (E value : this.values) {
            if (value == e) {
                return true;
            }
        }
        return false;
    }

    /*
        Overridden list clear size method that removes all elements from the list and returns a list whose size is 0
     */
    @Override
    public void clear() {
        // Loop through each element of the list and assign the value null
        for (int i = 0; i < this.values.length; i++) {
            this.values[i] = null;
        }

        // Reset the list size value to 0
        size = 0;
    }

    /*
        Overridden list size method that returns the current size of the list when the function is called
     */
    @Override
    public int size() {
        return size;
    }
}
