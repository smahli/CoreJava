import java.lang.Thread;
public class Thread1 extends Thread {
    public void run(){
        System.out.println("Thread Task");
        Thread.currentThread().setName("TestThread");
        System.out.println(Thread.currentThread().getName());// Thread 0 name changed to TestThread
    }


    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        t1.start();

        System.out.println("Hello");
        // main thread is created by JVM (Internal work)

        System.out.println(Thread.currentThread().getName());  // main Thread
        //Thread.currentThread().setName("shiw");  // can change the name of main thread
     //   System.out.println(Thread.currentThread().getName());  // we have changed the name of main thread to shiw
       // System.out.println(10/0);   // can check by this exception method


        System.out.println(Thread.currentThread().isAlive());

    }
}
