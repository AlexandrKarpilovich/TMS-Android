package lesson_14_Java;

/**
 * Class containing information in methods with messages
 */
public class HelloTreadClass {
    public HelloTreadClass() {
    }

    /*
        The method prints the message "What are you doing?"
     */
    public synchronized void outputWhatDoing() {
        System.out.println("What are you doing?");
    }

    /*
        The method prints the message "How are you?"
     */
    public synchronized void outputHowAreYou() {
        System.out.println("How are you?");
    }

    /*
        The method prints the message "Hi"
     */
    public synchronized void outputHi() {
        System.out.println("Hi");
    }
}
