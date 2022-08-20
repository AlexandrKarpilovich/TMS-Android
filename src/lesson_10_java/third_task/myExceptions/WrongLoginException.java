package lesson_10_java.third_task.myExceptions;

/**
 * Class with an exception if the login is incorrect
 */
public class WrongLoginException extends Exception{

    /*
        Default constructor
     */
    public WrongLoginException() {
    }

    /*
        Constructor with message
     */
    public WrongLoginException(String message) {
        super(message);
    }
}
