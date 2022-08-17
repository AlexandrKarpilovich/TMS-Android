package lesson_10_java.first_task.myExceptions;

/**
 * Class for checking if the document number contains the sequence 'abc'
 */
public class SequenceABCException extends Exception {

    /*
        Constructor
     */
    public SequenceABCException(String message) {
        super(message);
    }

    /*
        Overridden method toString()
     */
    @Override
    public String toString() {
        return "SequenceABCException { " +
                (getMessage().isEmpty() ? "" : getMessage()) +
                " }";
    }
}
