package lesson_10_java.third_task.myExceptions;

/**
 * Class with an exception if the password is incorrect
 */
public class WrongPasswordException extends Exception {

    /*
        Default constructor
     */
    public WrongPasswordException() {
    }

    /*
        Constructor with message
     */
    public WrongPasswordException(String message) {
        super(message);
    }
}
