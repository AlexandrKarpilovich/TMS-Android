package lesson_14_Java.FirstDecision;

/**
 * Create three streams T1, T2 and T3
 * Implement the execution of threads in the sequence T3 -> T2 -> T1. Execute 20 times (USING the join method)
 * T3 prints "Hi"
 * T2 displays "How are you?"
 * T1 displays "What are you doing?"
 */
public class ThreadFirstHomeworkMain {
    public static void main(String[] args) throws InterruptedException {
        // Create the class object
        Thread t1 = new MyThread("What are you doing?\n");
        Thread t2 = new MyThread("How are you?");
        Thread t3 = new MyThread("Hi");

        // Start threads
        t3.start();
        t2.start();
        t1.start();

        t3.join();
        t2.join();
        t1.join();
    }
}
