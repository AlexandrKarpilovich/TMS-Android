package lesson_10_java.second_task.myExceptions;

/**
 * Class with exception to check string length
 */
public class LengthStringException extends Exception{
    private int lengthString;

    /*
        Constructor
     */
    public LengthStringException(String message, int lengthString) {
        super(message);
        this.lengthString = lengthString;
    }

    @Override
    public String toString() {
        return "LengthStringException: " +
                (getMessage().isEmpty() ? "" : getMessage());
    }
}
