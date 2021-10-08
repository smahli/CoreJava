import java.lang.Thread;
public class InterruptedVSisInterrupted extends Thread {

    @Override
    public void run() {
        //System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        try{

        for (int i=0;i<=5;i++){
            System.out.println(i);
            Thread.sleep(1000);
            System.out.println(Thread.interrupted());

        }
        }

        catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        InterruptedVSisInterrupted t = new InterruptedVSisInterrupted();
        t.start();

        t.interrupt();
    }
}
