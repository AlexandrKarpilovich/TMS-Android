package lesson_13_Java;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Create a collection of the ArrayList class and fill it with random elements of the Integer type.
 * With Streams:
 * - Remove duplicates
 * - Display all even elements in the range from 7 to 17 (inclusive)
 * - Multiply each element by 2
 * - Sort and display the first 4 elements
 * - Display the number of elements in the stream
 * - Display the arithmetic mean of all numbers in the stream
 */
public class    StreamAPIFirstHomeworkMain {
    public static void main(String[] args) {
        // Create an empty array list
        List<Integer> numbers = new ArrayList<>();

        // Fill with random numbers from 0 to 49
        for (int i = 0; i < 10_000; i++) {
            numbers.add((int) (Math.random() * 50));
        }

        System.out.println("Source list: " + numbers);
        System.out.println("- - - - - - - - - -");

        // Removing duplicates
        List<Integer> distinct = numbers
                .stream()
                .distinct()
                .toList();

        System.out.println("List after removing duplicates: " + distinct);
        System.out.println("- - - - - - - - - -");

        // Get even numbers from 7 to 17
        List<Integer> evenNumbersFrom7To17 = numbers
                .stream()
                .filter(num -> num >= 7 && num <= 17 && num % 2 == 0)
                .toList();

        System.out.println("Only even numbers from 7 to 17: " + evenNumbersFrom7To17);
        System.out.println("- - - - - - - - - -");


        // Multiply each element by 2
        List<Integer> multiplyBy2 = numbers
                .stream()
                .map(num -> num * 2)
                .toList();

        System.out.println("List after multiplying each element by 2: " + multiplyBy2);
        System.out.println("- - - - - - - - - -");

        // Sort and display the first 4 elements
        List<Integer> first4SortedElements = numbers
                .stream()
                .limit(4)
                .sorted()
                .toList();

        System.out.println("Four first sorted elements: " + first4SortedElements);
        System.out.println("- - - - - - - - - -");

        // Display the number of elements in the stream
        long count = numbers
                .stream()
                .count();

        System.out.println("Number of elements in the list: " + count);
        System.out.println("- - - - - - - - - -");

        // Display the arithmetic mean of all numbers in the stream
        OptionalDouble average = numbers
                .stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("The arithmetic mean of all numbers in the stream: " + average.getAsDouble());

    }
}
