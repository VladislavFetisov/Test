package MultiThreading;

import java.net.ServerSocket;
import java.sql.SQLOutput;

public class NewThread extends Thread {
    String name;
    NewThread(String name) {
        super(name);
        this.name=name;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
class ThreadDemo1 {
    public static void main(String[] args) {
        NewThread ob1=new NewThread("first");
        ob1.setPriority(9);
        NewThread ob2=new NewThread("second");
        ob2.setPriority(Thread.MAX_PRIORITY);
        NewThread ob3=new NewThread("third");
        ob3.setPriority(3);
    }
}