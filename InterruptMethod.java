import java.lang.Thread;
public class InterruptMethod extends Thread {


    @Override
    public void run() {
        try{

            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);   // try to hide Thread.sleep(1000) then it will behave normal

            }
        }
        catch (Exception e){
            System.out.println(e);
        }



    }


    public static void main(String[] args) {
        InterruptMethod i = new InterruptMethod();
        i.start();
        i.interrupt();
    }
}
