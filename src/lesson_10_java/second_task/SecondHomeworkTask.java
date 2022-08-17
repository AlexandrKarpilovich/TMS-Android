package lesson_10_java.second_task;

import lesson_10_java.second_task.myExceptions.LengthStringException;

/**
 * Class with methods for solving problems
 */
public class SecondHomeworkTask {
    private String firstSourceString;
    private String secondSourceString;
    private String thirdSourceString;
    private String fourthSourceString;

    /*
        Constructor
     */
    public SecondHomeworkTask() {
    }

    /*
        Finding the shortest word in a string and displaying it on the screen
     */
    void shortestWord() {
        // Create an array from the words of the input string
        String[] array = getFirstSourceString().split(" ");

        // Suppose the shortest word will be the first in the array
        String shortestWord = array[0];


        // Loop through the words in the array
        for (int i = 1; i < array.length; i++) {
            // Assign each element of the array to a variable
            String nextWord = array[i];

            // Checking if the length of the word is less, then assigning the shorter word to the desired variable
            if (shortestWord.length() > nextWord.length()) {
                shortestWord = array[i];
            }
        }

        System.out.printf("The shortest word is '%s'\n", shortestWord);
    }

    /*
        Find the longest word in the string and display it on the screen.
        If there are several such words, then output the last one.
     */
    void longestWord() {
        // Create an array from the words of the input string
        String[] array = getFirstSourceString().split(" ");

        // Suppose the longest word will be the first in the array
        String longestWord = array[0];


        // Loop through the words in the array
        for (int i = 1; i < array.length; i++) {
            // Assign each element of the array to a variable
            String nextWord = array[i];

            // Checking if the length of the word is bigger, then assigning the longer word to the desired variable
            if (longestWord.length() <= nextWord.length()) {
                longestWord = array[i];
            }
        }

        System.out.printf("The longest word is '%s'\n", longestWord);
    }


    /*
        Find a word in which the number of different characters is minimal.
        The word can contain letters and numbers. If there are several such words, find the first one.
        For example, in the string "fffff ab f 1234 jkjk" the found word should be "fffff".
     */
    void minimumDifferentCharacters() {
        // Create an array from the words of the input string
        String[] arrayFromString = getSecondSourceString().split(" ");
        // Create a new array to store unique characters from each word in it
        String[] newArray = new String[arrayFromString.length];

        // Loop through each word from the original array
        for (int i = 0; i < arrayFromString.length; i++) {
            // Assigning a word to a variable
            String wordFromArray = arrayFromString[i];

            // Create an empty variable to store the resulting word with unique characters
            StringBuilder resultWord = new StringBuilder();

            // Loop through the characters of each word
            for (int j = 0; j < wordFromArray.length(); j++) {

                // If the empty resulting word does not contain a character, then add it to this variable
                if (!resultWord.toString().contains(String.valueOf(wordFromArray.charAt(j)))) {
                    resultWord.append(wordFromArray.charAt(j));
                }
            }

            // Add new received words with unique characters to a new array
            newArray[i] = String.valueOf(resultWord);
        }

        // Create a string variable that will contain the minimum number of different characters
        String minimunCharacters = newArray[0];

        // Create an integer variable equal to the length of a word from unique characters
        int minimunCharacterLength = newArray[0].length();

        // Loop through the array and if there is a word with fewer different letters,
        // then assign this word to a variable with a minimum letters number
        for (int i = 1; i < newArray.length; i++) {
            if (minimunCharacterLength > newArray[i].length()) {
                minimunCharacters = arrayFromString[i];
            }
        }

        System.out.printf("The word in which the number of different characters is minimal is '%s'\n", minimunCharacters);
    }

    /*
        Write a program to check if any given word in a string is a palindrome.
        For example, there is a string, the number 3 is entered, so it is necessary to check whether the 3rd word
        in this string is a palindrome.
        Provide warning messages in case of erroneous situations: for example, there are 5 words in a line,
        and the number 500 was passed to the input of the program, etc. situations.
     */
    void palindromeWord(int checkWordNumber) throws LengthStringException {
        // Create an array from the words of the input string
        String[] arrayFromString = getThirdSourceString().split(" ");

        // Check and if the number is greater than the given string, then throw exceptions
        if (checkWordNumber > arrayFromString.length) {
            throw new LengthStringException("The entered number is greater than the length of the string",
                    checkWordNumber);
        }

        // Check and if the number is less than the given string, then throw exceptions
        if (checkWordNumber < 1) {
            throw new LengthStringException("Entered number is less than 1", checkWordNumber);
        }

        // Create a variable with the word to be checked
        String word = arrayFromString[--checkWordNumber];

        // Reverse the search word
        String reverseWord = new StringBuilder(word).reverse().toString();

        // Check if the original search word is equal to reversed
        if (word.equals(reverseWord)) {
            System.out.printf("The word '%s' is a palindrome\n", word);
        } else {
            System.out.printf("The word '%s' is not a palindrome\n", word);
        }
    }

    /*
        Print to the console a new line that duplicates each letter from initial line.
        For example, "Hello" -> "HHeellloo"
     */
    void duplicationOfCharacters() {
        // Create source string
        String sourceString = getFourthSourceString();

        // Create an empty result string
        StringBuilder resultString = new StringBuilder();

        // Loop through the characters of the string,
        // assign them to a temporary variable and
        // add them to the resulting string twice
        for (int i = 0; i < sourceString.length(); i++) {
            char temp = sourceString.charAt(i);
            resultString.append(temp).append(temp);
        }

        System.out.println("Source string: " + sourceString);
        System.out.println("A string in which each character is repeated: " + resultString);
    }

    /*
        Getters and Setters
     */
    public String getFirstSourceString() {
        return firstSourceString;
    }

    public void setFirstSourceString(String firstSourceString) {
        this.firstSourceString = firstSourceString;
    }

    public String getSecondSourceString() {
        return secondSourceString;
    }

    public void setSecondSourceString(String secondSourceString) {
        this.secondSourceString = secondSourceString;
    }

    public String getThirdSourceString() {
        return thirdSourceString;
    }

    public void setThirdSourceString(String thirdSourceString) {
        this.thirdSourceString = thirdSourceString;
    }

    public String getFourthSourceString() {
        return fourthSourceString;
    }

    public void setFourthSourceString(String fourthSourceString) {
        this.fourthSourceString = fourthSourceString;
    }
}
