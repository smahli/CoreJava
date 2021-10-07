import java.lang.Thread;
public class JoinMethod extends Thread{

    static Thread mainThread;  // create the reference thread for thread 0
    @Override
    public void run() {
        try{
        mainThread.join();

         for (int i =1;i<=5;i++){

          System.out.println("child method"+i);
          Thread.sleep(1000);
          }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        mainThread = Thread.currentThread();   // creating reference to Thread zero

        JoinMethod j = new JoinMethod();
        j.start();

        try{
           // j.join(); // Now Main Thread will wait to execute Thread 0
            for(int i=1;i<=5;i++){
                System.out.println("Main Thread"+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
