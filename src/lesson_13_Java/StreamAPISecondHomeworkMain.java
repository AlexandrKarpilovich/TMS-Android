package lesson_13_Java;

import java.util.ArrayList;
import java.util.List;

/**
 * Create an ArrayList class collection with the name values of all the students in the group.
 * With Streams:
 * - Return the number of people with your name (regardless of upper/lower case letters)
 * - Select all names starting with "a" (regardless of upper/lower case letters)
 * - Sort and return the first element of the collection or "Empty" if the collection is empty
 * - Sort and return the first element of the collection or "Empty" if the collection is empty
 */
public class StreamAPISecondHomeworkMain {
    public static void main(String[] args) {
        String[] namesArray = {"Артем", "Денис", "Евгений", "Владислав",
                "Андрей", "Елизавета", "Надежда", "Денис", "Артем", "Екатерина", "Иван", "Александр"};
        List<String> namesList = new ArrayList<>(List.of(namesArray));

        // Return the number of people with your name (regardless of upper/lower case letters)
        long countSameNames = namesList
                .stream()
                .map(String::toLowerCase)
                .filter("Александр".toLowerCase()::equals)
                .count();

        System.out.println("Count of people with the name 'Александр': " + countSameNames);
        System.out.println("- - - - - - - - - -");

        // Select all namesList starting with "a" (regardless of upper/lower case letters)
        List<String> namesStartingWithA = namesList
                .stream()
                .map(name -> name.toUpperCase().charAt(0) + name.substring(1))
                .filter(name -> name.startsWith("А"))
                .toList();

        System.out.println("All namesList starting with 'A': " + namesStartingWithA);
        System.out.println("- - - - - - - - - -");

        //Sort and return the first element of the collection or "Empty" if the collection is empty
        String firstNameAfterSorting = namesList
                .stream()
                .sorted()
                .findFirst()
                .orElse("Empty");

        System.out.println("First name after sorting list: " + firstNameAfterSorting);
    }

}
