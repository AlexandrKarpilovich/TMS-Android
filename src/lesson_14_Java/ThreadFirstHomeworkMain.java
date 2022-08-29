package lesson_14_Java;

/**
 * Create three streams T1, T2 and T3
 * Implement the execution of threads in the sequence T3 -> T2 -> T1. Execute 20 times (using the join method)
 * T3 prints "Hi"
 * T2 displays "How are you?"
 * T1 displays "What are you doing?"
 */
public class ThreadFirstHomeworkMain {
    public static void main(String[] args) throws InterruptedException {
        // Create the class object
        HelloTreadClass hello = new HelloTreadClass();

        // Loop through from 0 to 20 and create threads
        for (int i = 0; i < 20; i++) {

            Thread firstThread = new Thread(hello::outputWhatDoing);
            Thread secondThread = new Thread(hello::outputHowAreYou);
            Thread thirdThread = new Thread(hello::outputHi);

            // First we call the third thread, then the second, then the first
            thirdThread.start();
            thirdThread.join();

            secondThread.start();
            secondThread.join();

            firstThread.start();
            firstThread.join();
        }
    }
}
