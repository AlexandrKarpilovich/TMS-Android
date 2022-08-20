package lesson_10_java.third_task;

import lesson_10_java.third_task.myExceptions.WrongConfirmPasswordException;
import lesson_10_java.third_task.myExceptions.WrongLoginException;
import lesson_10_java.third_task.myExceptions.WrongPasswordException;

/**
 * Class for checking the correctness of the entered login and passwords
 */
public class LoginAndPassword {
    private String login;
    private String password;
    private String confirmPassword;

    /*
        Constructor
     */
    public LoginAndPassword() {
    }

    // Method for checking the correctness of the entered login and passwords
    static void loginAndPassword(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPasswordException {

        // Checking if the login contains at least one space character
        int loginSpaceIndex = login.indexOf(" ");

        // Checking if the password contains at least one space character
        int passwordSpaceIndex = password.indexOf(" ");

        // Create a regular expression to check for the presence of numbers in the password
        String regex = ".*\\d+.*";

        // Write to the variable whether there are matches of the regular expression in the string with the password
        boolean isMatch = password.matches(regex);

        // If the login is more than 20 characters or there is a space, then throw an exception
        if (login.length() > 20 || loginSpaceIndex > 0) {
            throw new WrongLoginException("Login is too large or contains spaces");
        }

        // If the password is more than 20 characters or there is a space and there is not a single digit,
        // then throw an exception
        if (password.length() > 20 || passwordSpaceIndex > 0 || !isMatch) {
            throw new WrongPasswordException("The password is too long or there are spaces or there is no number");
        }

        // Throws an exception if password and password confirmation do not match
        if (!password.equals(confirmPassword)) {
            throw new WrongConfirmPasswordException("Passwords do not match");
        }
    }

    /*
        Getters and Setters
     */
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
