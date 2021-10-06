import java.lang.Thread;
public class YieldMethod extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() +" : "+i);
        }
    }

    public static void main(String[] args) {
        YieldMethod y1 = new YieldMethod();
        y1.start();
        Thread.yield();
        for (int i=1;i<=5;i++){

            System.out.println("Main Thread"+i);
        }



    }
}
