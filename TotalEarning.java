/*
import java.lang.Thread;

class Thread3 extends Thread{
    int total=0;
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            total = total+100;
        }
    }
}
public class TotalEarning extends Thread {
    public static void main(String[] args) {

    Thread3 t3 = new Thread3();
    t3.start();
        System.out.println(" Total earning : "+ t3.total+ " Rs");  // problems that we are are gettig
    }
}


*/


import java.lang.Thread;

class Thread3 extends Thread{
    int total=0;
    @Override
    public void run() {
        synchronized (this){

             for(int i=1;i<=10;i++){
                total = total+100;
            }
             notify();
        }
    }
}
public class TotalEarning extends Thread {
    public static void main(String[] args) {

        Thread3 t3 = new Thread3();
        t3.start();
        synchronized (t3){
            try{
                t3.wait(1000);
                System.out.println(" Total earning : "+ t3.total+ " Rs");

            }
            catch (Exception e){
                System.out.println(e);
            }



        }
    }
}





