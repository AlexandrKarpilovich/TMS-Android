package lesson_10_java.third_task;

import lesson_10_java.third_task.myExceptions.WrongConfirmPasswordException;
import lesson_10_java.third_task.myExceptions.WrongLoginException;
import lesson_10_java.third_task.myExceptions.WrongPasswordException;

import java.util.Scanner;

/**
 * Create a class that will have a static method. This method takes three parameters as input: Login, Password, confirmPassword.
 * All fields are of data type String.
 * login must be less than 20 characters long and must not contain spaces.
 * If login does not meet these requirements, a WrongLoginException must be thrown.
 * password must be less than 20 characters long, must not contain spaces, and must contain at least one number.
 * Also, password and confirmPassword must be equal.
 * If password does not meet these requirements, a WrongPasswordException must be thrown.
 * WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one default,
 * the other accepts the exception message and passes it to the constructor of the Exception class.
 * The method returns true if the values are true or false otherwise.
 */
public class MainThirdTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for a login, password and password confirmation
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();

        // Check for correct operation and if not, then catch a notification with an error
        try {
            LoginAndPassword.loginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException | WrongConfirmPasswordException e) {
            System.err.println(e.getMessage());
        }
    }
}
