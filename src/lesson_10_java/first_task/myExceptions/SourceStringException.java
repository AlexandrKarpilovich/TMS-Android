package lesson_10_java.first_task.myExceptions;

/**
 * Class with exception whether input string matches pattern
 */
public class SourceStringException extends Exception {
    private String sourceString;

    /*
        Constructor
     */
    public SourceStringException(String message, String sourceString) {
        super(message);
        this.sourceString = sourceString;
    }
}
