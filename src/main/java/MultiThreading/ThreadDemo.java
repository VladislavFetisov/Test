package MultiThreading;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("First Thread");
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException е) {
            System.out.println("Thread is interrupted");
        }
    }
}