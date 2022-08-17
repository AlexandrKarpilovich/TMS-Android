package lesson_10_java.first_task;

import lesson_10_java.first_task.myExceptions.SourceStringException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Write a program with the following functionality:
 * Pass a string to the input (we will assume that this is the document number).
 * The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is a number and y is a letter.
 * - Display the first two blocks of 4 digits on the screen in one line.
 * - Display the document number on the screen, but replace blocks of three letters with ***
 * (each letter will be replaced with *).
 * - Display only one letter from the document number in the format yyy/yyy/y/y in lower case.
 * - Display letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase
 * (implemented using the StringBuilder class).
 * - Check whether the document number contains the sequence abc and display a message whether it contains it or not
 * (moreover, abc and ABC are considered the same sequence).
 * - Check if the document number starts with the sequence 555.
 * - Check if the document number ends with the sequence 1a2b.
 * All these methods should be implemented in a separate class in static methods, which will take as input
 * (input parameter) a string entered as input to the program.
 * You also need to create your own exception classes for each situation:
 * - Check if the document number contains the sequence abc.
 * - Check if the document number starts with the sequence 555.
 * - Check if the document number ends with the sequence 1a2b.
 * If the document number does not satisfy the condition, then "throw" an exception.
 * In the class method in which these methods will be called to demonstrate operation,
 * catch the exception with the try-catch construct and display a message in the catch block for user
 * (message to the console).
 */
public class MainFirstTask {
    public static void main(String[] args) throws SourceStringException {

        Scanner scanner = new Scanner(System.in);

        // Source string
        String sourceString = scanner.nextLine();

        // String pattern to match the source string
        String stringPattern = "\\d{4}-[a-zA-Z]{3}-\\d{4}-[a-zA-Z]{3}-\\d[]a-zA-Z]\\d[a-zA-Z]";

        // Constitutes a regular expression representation
        Pattern pattern = Pattern.compile(stringPattern);

        // Interprets the pattern and performs matching operations on the input string
        Matcher matcher = pattern.matcher(sourceString);

        // A variable that indicates whether the source string matches the pattern
        boolean indicator = matcher.matches();

        // Checking if the entered string matches the pattern and if not, then throwing an exception
        if (!indicator) {
            throw new SourceStringException("Wrong string. String pattern is 'xxxx-yyy-xxxx-yyy-xyxy'", sourceString);
        }

        // Displaying the first two blocks of 4 digits in one line
        System.out.println(FirstHomeworkTask.theFirstTwoBlocksOf4Digit(sourceString));

        // Displaying the document number on the screen, but replace blocks of three letters with ***
        // (each letter will be replaced with *)
        System.out.println(FirstHomeworkTask.replacingBlocksOfThreeLetters(sourceString));

        // Displaying only one letter from the document number in the format yyy/yyy/y/y in lowercase
        System.out.println(FirstHomeworkTask.lowercaseLettersOutput(sourceString));

        // Displaying letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase
        // (implemented using the StringBuilder class)
        System.out.println(FirstHomeworkTask.uppercaseLettersOutput(sourceString));

        // Displaying a message whether the source string contains the substring abc, regardless of case
        System.out.println(FirstHomeworkTask.abcSequence(sourceString));

        // Displaying a message whether the source string starts with the sequence 555
        System.out.println(FirstHomeworkTask.startAt555(sourceString));

        // Displaying a message whether the source string ends with the sequence 1a2b
        System.out.println(FirstHomeworkTask.endWith1a2b(sourceString));
    }
}
