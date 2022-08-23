package lesson_11_Java.list_comparison;

import java.util.Date;
import java.util.List;

/**
 * The class contains methods for filling, searching, adding and removing elements in Lists
 */
public class WorkWithLists {
    /*
        Default constructor
     */
    public WorkWithLists() {
    }

    /*
        Method of filling Lists with 10,000,000 elements
        The element will be an empty string
     */
    public String fillingTheList(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Looping through and populating the List
        for (int i = 0; i <= 10_000_000; i++) {
            list.add("");
        }

        // Program end time
        long finish = timeInMillis();

        return "Time to fill the " + listName + " with 10,000,000 string elements: " + (finish - start) + " (ms)";
    }

    /*
        Take method by zero index
     */
    public String takeByFirstIndex(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Get value at index zero
        list.get(0);

        // Program end time
        long finish = timeInMillis();

        return "Time to get the element at index zero in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Take method by last index
     */
    public String takeByLastIndex(List<String> list, String listName) {
        //Program start time
        long start = timeInMillis();

        // Get the value at the last index
        list.get(list.size() - 1);

        // Program end time
        long finish = timeInMillis();

        return "Time to get the element at the last index in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Take method by middle index
     */
    public String takeByMiddleIndex(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Get the value at the middle index
        list.get((list.size() - 1) / 2);

        // Program end time
        long finish = timeInMillis();

        return "Time to get the element at the middle index in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Element search method
     */
    public String searchByElement(List<String> list, String element, String listName) {
        // Program start time
        long start = timeInMillis();

        // Get the result of finding an element in the list
        list.contains(element);

        // Program end time
        long finish = timeInMillis();

        return "Time to search the element '" + element + "' in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for adding an element to the beginning of a List
     */
    public String addingTheFirstElement(List<String> list, String element, String listName) {
        // Program start time
        long start = timeInMillis();

        // Adding an element to the beginning of the list
        list.add(0, element);

        // Program end time
        long finish = timeInMillis();

        return "Time to add the first element in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for adding an element to the end of a List
     */
    public String addingTheLastElement(List<String> list, String element, String listName) {
        // Program start time
        long start = timeInMillis();

        // Adding an element to the end of the list
        list.add(list.size() - 1, element);

        // Program end time
        long finish = timeInMillis();

        return "Time to add the last element the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for adding an element to the middle of a List
     */
    public String addingTheMiddleElement(List<String> list, String element, String listName) {
        // Program start time
        long start = timeInMillis();

        // Adding an element to the middle of the list
        list.add((list.size() - 1) / 2, element);

        // Program end time
        long finish = timeInMillis();

        return "Time to add the middle element in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for removing the first element from the List
     */
    public String removeTheFirstElement(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Removing the first element
        list.remove(0);

        // Program end time
        long finish = timeInMillis();

        return "Time to remove the first element in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for removing the last element from the List
     */
    public String removeTheLastElement(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Removing the last element
        list.remove(list.size() - 1);

        // Program end time
        long finish = timeInMillis();

        return "Time to remove the last element in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        Method for removing the middle element from the List
     */
    public String removeTheMiddleElement(List<String> list, String listName) {
        // Program start time
        long start = timeInMillis();

        // Removing the middle element
        list.remove((list.size() - 1) / 2);

        // Program end time
        long finish = timeInMillis();

        return "Time to remove the middle element in the " + listName + ": " + (finish - start) + " (ms)";
    }

    /*
        The method returns the time in (ms)
     */
    public long timeInMillis() {
        //Determine current time
        Date time = new Date();

        return time.getTime();
    }
}
