package lesson_10_java.first_task;

import lesson_10_java.first_task.myExceptions.Sequence1a2bException;
import lesson_10_java.first_task.myExceptions.Sequence555Exception;
import lesson_10_java.first_task.myExceptions.SequenceABCException;

/**
 * Solving tasks on the first homework
 */
public class FirstHomeworkTask {
    private String checkString;

    /*
        Constructor
     */
    public FirstHomeworkTask() {
    }

    /*
        Output the first two blocks of 4 digits in one line
     */
    static String theFirstTwoBlocksOf4Digit(String documentNumber) {
        return "The first two blocks of 4 digits: " +
                documentNumber.substring(0, 4) +
                documentNumber.substring(9, 13);
    }

    /*
        Output the document number on the screen, but replace blocks of three letters with ***
        (each letter will be replaced with *)
     */
    static String replacingBlocksOfThreeLetters(String documentNumber) {
        // Loop through the elements of the string from 5 to 17
        for (int i = 5; i < 17; i++) {
            char charFromString = documentNumber.charAt(i); // Assigning a symbol value
            char hyphen = '-'; // Assigning a symbol '-'

            // If the character from the string is not equal to a number and is not equal to a hyphen,
            // then replace this character with *
            if (Character.isLetter(charFromString) && (charFromString != hyphen)) {
                documentNumber = documentNumber.replace(charFromString, '*');
            }
        }

        return "Replace blocks of three letters: " + documentNumber;
    }

    /*
        Output only one letter from the document number in the format yyy/yyy/y/y in lowercase
     */
    static String lowercaseLettersOutput(String documentNumber) {
        // Convert string to lower case
        documentNumber = documentNumber.toLowerCase();

        // Create an array of strings from the main string
        String[] stringToArray = documentNumber.split("-");

        // Create an empty array of two elements
        String[] newArr = new String[2];

        // Going through the main array and add elements to the new newArr, where there are only letters
        for (int i = 1, j = 0; i < stringToArray.length; ) {
            newArr[j++] = stringToArray[i];
            i += 2;
        }

        // Let's convert the array obtained from the loop into a string
        String firstStringPart = String.join("/", newArr);

        // Create an array from the last element of the main array and split it character by character
        String[] lastElementArray = stringToArray[4].split("");

        // Going through the main array and add elements to the new newArr, where there are only letters
        for (int i = 1, j = 0; i < lastElementArray.length; ) {
            newArr[j++] = lastElementArray[i];
            i += 2;
        }

        // Let's convert the array obtained from the loop into a string
        String lastStringPart = String.join("/", newArr);

        // Connecting both parts of the lines into one
        String result = String.join("/", firstStringPart, lastStringPart);

        return "Only letters from the document number in the format yyy/yyy/y/y in lower case: " + result;
    }

    /*
        Output letters from the document number in the format "Letters:yyy/yyy/y/y" in uppercase
        (implemented using the StringBuilder class)
     */
    static StringBuilder uppercaseLettersOutput(String documentNumber) {
        // Creating a variable using the StringBuilder class, starting from the 5th element, converting to uppercase,
        StringBuilder strBuilderDocumentNumber = new StringBuilder(documentNumber
                .toUpperCase()
                .substring(5, documentNumber.length()));

        // Loop through the characters of the string and if the character is not a letter, then change to '/'
        for (int i = 0; i < strBuilderDocumentNumber.length(); i++) {
            char charFromString = strBuilderDocumentNumber.charAt(i); // Variable that stores characters

            if (!Character.isLetter(charFromString)) {
                strBuilderDocumentNumber.setCharAt(i, '/');
            }
        }

        // Loop through the line, starting from the third element, and if the next character is equal to the current one
        // then delete the current character and convert the counter two values back
        for (int i = 0; i < strBuilderDocumentNumber.length() - 1; i++) {
            char charFromString = strBuilderDocumentNumber.charAt(i); // Store the current character value
            char nextCharFromString = strBuilderDocumentNumber.charAt(++i); // Store the next character value

            if (charFromString == nextCharFromString &&
                    !Character.isLetter(charFromString)) {
                strBuilderDocumentNumber.deleteCharAt(i);
                i--;
            }
            i--;
        }

        return new StringBuilder("Only letters from the document number in the format yyy/yyy/y/y in upper case: " +
                strBuilderDocumentNumber);
    }

    /*
        Check if the document number contains the sequence abc and display a message whether it does or not
        (moreover, abc and ABC are considered the same sequence)
     */
    static String abcSequence(String documentNumber) {
        String stringToCheck = "abC"; // Create a variable containing the required substring to test
        String stringToCheckLowerCase = stringToCheck.toLowerCase(); // Convert the search string to lowercase

        abcSequenceException(stringToCheckLowerCase); // Passing the search string to the exception check method

        // Convert the source string and required substring to lower case
        // and check if the source string contains the searched substring
        if (documentNumber.toLowerCase().contains(stringToCheckLowerCase)) {
            return "Source string: '" + documentNumber +
                    "' contains the searched substring: '" + stringToCheck + "'";
        }
        return "Source string: '" + documentNumber +
                "' does not contain the searched substring: '" + stringToCheck + "'";
    }

    /*
        Method to check if the string entered is valid or not
     */
    static void abcSequenceException(String checkString) {
        try {
            if (!checkString.equals("abc")) {
                throw new SequenceABCException("Wrong string");
            }
        } catch (SequenceABCException e) {
            System.err.println("Exception: " + e);
        }
    }

    /*
        Check if the document number starts with the sequence 555
     */
    static String startAt555(String documentNumber) {
        int checkNumberInt = 555; // Create a variable containing the required substring to test
        startAt555Exception(checkNumberInt); // Passing the search number to the exception check method
        String checkNumberStr = Integer.toString(checkNumberInt); // Convert the desired sequence into a string

        // Get the first three characters of the original string
        String firstThreeSymbol = documentNumber.substring(0, 3);

        // Check if the first three characters of a string with a given sequence are equal
        if (checkNumberStr.equals(firstThreeSymbol)) {
            return "Source string: '" + documentNumber +
                    "' starts with sequence: '" + checkNumberStr + "'";
        }
        return "Source string: '" + documentNumber +
                "' does not start with sequence: '" + checkNumberStr + "'";
    }

    /*
        Method to check if the number entered is valid or not
     */
    static void startAt555Exception(int checkNumber) {
        try {
            if (checkNumber != 555) {
                throw new Sequence555Exception("Wrong number");
            }
        } catch (Sequence555Exception e) {
            System.err.println("Exception: " + e);
        }
    }

    /*
        Check if the document number ends with the sequence 1a2b
     */
    static String endWith1a2b(String documentNumber) {
        String checkSequence = "1a2b";// Create a variable containing the required substring to test
        endWith1a2bException(checkSequence); // Passing the search number to the exception check method
        int sourceLength = documentNumber.length(); // Get the length of the source string

        // Get the last four characters of the original string
        String lastFourCharacters = documentNumber.substring(sourceLength - 4, sourceLength);

        // Check if the last four characters of a string with a given sequence are equal
        if (checkSequence.equals(lastFourCharacters)) {
            return "Source string: '" + documentNumber +
                    "' ends with sequence: '" + checkSequence + "'";
        }
        return "Source string: '" + documentNumber +
                "' does not end with sequence: '" + checkSequence + "'";
    }

    /*
        Method to check if the string entered is valid or not
     */
    static void endWith1a2bException(String checkString) {
        try {
            if (!checkString.equals("1a2b")) {
                throw new Sequence1a2bException("Wrong string");
            }
        } catch (Sequence1a2bException e) {
            System.err.println("Exception: " + e);
        }
    }

    /*
        Getter and Setter
     */
    public String getDocumentNumber() {
        return checkString;
    }

    public void setDocumentNumber(String documentNumber) {
        this.checkString = documentNumber;
    }
}
