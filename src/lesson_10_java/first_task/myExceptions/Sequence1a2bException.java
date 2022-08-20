package lesson_10_java.first_task.myExceptions;

/**
 * Class for checking if the document number contains the sequence '1a2b'
 */
public class Sequence1a2bException extends Exception{

    /*
        Constructor
     */
    public Sequence1a2bException(String message) {
        super(message);
    }

    /*
        Overridden method toString()
     */
    @Override
    public String toString() {
        return "Sequence1a2bException { " +
                (getMessage().isEmpty() ? "" : getMessage()) +
                " }";
    }
}
