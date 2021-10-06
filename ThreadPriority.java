import java.lang.Thread;
public class ThreadPriority extends Thread{

    @Override
    public void run() {
        System.out.println("Child Thread");
        System.out.println(Thread.currentThread().getPriority()); // same as main because parent thread
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());  // by default main thread priority 5
        ThreadPriority t1 = new ThreadPriority();
        t1.start();
       // t1.setPriority(10);  //if priority not between 0-10 throws an exception
        t1.setPriority(MAX_PRIORITY); // same as 10

    }
}
