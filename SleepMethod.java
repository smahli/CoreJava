import java.lang.Thread;
public class SleepMethod  extends Thread {
    @Override
    public void run() {
        for (int i=1;i<=5;i++){

            try {
                Thread.sleep(1000);
                System.out.println(i);
            }
            catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    public static void main(String[] args) {

        SleepMethod s = new SleepMethod();
        s.start();

    }
}

