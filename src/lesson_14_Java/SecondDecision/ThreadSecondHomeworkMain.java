package lesson_14_Java.SecondDecision;

/**
 * Create three streams T1, T2 and T3
 * Implement the execution of threads in the sequence T3 -> T2 -> T1. Execute 20 times (NOT USING the join method)
 * T3 prints "Hi"
 * T2 displays "How are you?"
 * T1 displays "What are you doing?"
 */
public class ThreadSecondHomeworkMain {
    public static void main(String[] args) throws InterruptedException {
        // Create the class object
        Thread t1 = new MyThread("What are you doing?\n");
        Thread t2 = new MyThread("How are you?");
        Thread t3 = new MyThread("Hi");

        // Start threads
        t3.start();
        t2.start();
        t1.start();

        synchronized (t3) {
            t3.wait();
        }
        synchronized (t2) {
            t2.wait();
        }
        synchronized (t1) {
            t1.wait();
        }
    }
}
