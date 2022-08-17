package lesson_10_java.first_task.myExceptions;

/**
 * Class for checking if the document number contains the sequence '555'
 */
public class Sequence555Exception extends Exception {

    /*
        Constructor
     */
    public Sequence555Exception(String message) {
        super(message);
    }

    /*
        Overridden method toString()
     */
    @Override
    public String toString() {
        return "Sequence555Exception { " +
                (getMessage().isEmpty() ? "" : getMessage()) +
                " }";
    }
}
