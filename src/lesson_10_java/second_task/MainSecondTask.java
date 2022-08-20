package lesson_10_java.second_task;

import lesson_10_java.second_task.myExceptions.LengthStringException;

import java.util.Scanner;

/**
 * 1. Given a string of arbitrary length with arbitrary words.
 * Find the shortest word in the string and display it on the screen.
 * Find the longest word in the string and display it on the screen.
 * If there are several such words, then output the last one.
 * 2. Given a string of arbitrary length with arbitrary words.
 * Find a word in which the number of different characters is minimal.
 * The word can contain letters and numbers. If there are several such words, find the first one.
 * For example, in the string "fffff ab f 1234 jkjk" the found word should be "fffff".
 * 3. Given a string of arbitrary length with arbitrary words.
 * Write a program to check if any given word in a string is a palindrome.
 * For example, there is a string, the number 3 is entered, so it is necessary to check whether the 3rd word in this
 * string is a palindrome.
 * Provide warning messages in case of erroneous situations: for example, there are 5 words in a line,
 * and the number 500 was passed to the input of the program, etc. situations.
 * 4. An arbitrary string is given. Output to the console a new line that duplicates each letter from the initial line.
 * For example, "Hello" -> "HHeellloo".
 */
public class MainSecondTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a new line
        String newLine = scanner.nextLine();

        // Create the object of the second homework
        SecondHomeworkTask secondTask  = new SecondHomeworkTask();

        // Displaying the shortest and the longest words
        secondTask.setFirstSourceString(newLine);
        secondTask.shortestWord();
        secondTask.longestWord();

        // Displaying the word in which the number of different characters is minimal
        secondTask.setSecondSourceString(newLine);
        secondTask.minimumDifferentCharacters();

        // Displaying whether the given word is a palindrome
        try {
            secondTask.setThirdSourceString(newLine);
            secondTask.palindromeWord(3);
        } catch (LengthStringException e) {
            System.err.println(e.getMessage());
        }

        // Displaying a line that duplicates each character
        secondTask.setFourthSourceString(newLine);
        secondTask.duplicationOfCharacters();
    }
}
