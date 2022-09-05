package lesson_14_Java.FirstDecision;

/**
 * Class containing information in methods with messages
 */
public class MyThread extends Thread {

    private final String phrase;

    public MyThread(String phrase) {
        this.phrase = phrase;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.phrase);
            }
        }
    }
}
