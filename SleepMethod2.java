import java.lang.Thread;
public class SleepMethod2 extends Thread  {
    @Override
    public void run() {
        try{
            for (int i=1;i<=5;i++){
                System.out.println(i+" :"+Thread.currentThread().getName());
                //System.out.println(i);
                Thread.sleep(1000);

            }

        }
        catch (Exception e){
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        SleepMethod2 s1 = new SleepMethod2();
        s1.start();

        SleepMethod2 s2 = new SleepMethod2();
        s2.start();

    }

}
