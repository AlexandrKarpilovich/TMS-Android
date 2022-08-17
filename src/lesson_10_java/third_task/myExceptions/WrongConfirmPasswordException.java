package lesson_10_java.third_task.myExceptions;

/**
 * Class with exception if passwords do not match
 */
public class WrongConfirmPasswordException extends Exception{

    /*
        Default constructor
     */
    public WrongConfirmPasswordException() {
    }

    /*
        Constructor with message
     */
    public WrongConfirmPasswordException(String message) {
        super(message);
    }
}
