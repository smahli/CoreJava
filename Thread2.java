import java.lang.Thread;
public class Thread2 extends Thread {
    public  void run(){
        System.out.println("child Thread");
    }

    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread2 t2 = new Thread2();
        t2.setDaemon(true); // make sure declare daemon before start()   opposite will throw exception
        t2.start();
    }

}
