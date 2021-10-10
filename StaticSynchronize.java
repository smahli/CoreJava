import java.lang.Thread;
public class StaticSynchronize extends Thread {

    int Total_Seat =20;

       synchronized void bookSeat(int seat){
           if (Total_Seat>=seat){
               System.out.println("Seats booked successfully");
               Total_Seat = Total_Seat-seat;
               System.out.println("seats left : "+ Total_Seat);
           }
           else{
               System.out.println(" Seats cannot be booked ");
               System.out.println(" Seats Left: "+ Total_Seat);

           }




        }



}
class MyThread1 extends Thread{

StaticSynchronize b;
int seats;
    MyThread1(StaticSynchronize b, int seats){
        this.b = b;
        this.seats=seats;

    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    StaticSynchronize b;
    int seats;
    MyThread2(StaticSynchronize b, int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

class MovieBookApp{

    public static void main(String[] args) {
        StaticSynchronize s = new StaticSynchronize();
        MyThread1 t1 = new MyThread1(s,7);
        t1.start();


        MyThread2 t2 =  new MyThread2(s, 6);
        t2.start();


        //----------------------------------------------------//

        //

       StaticSynchronize s2 = new StaticSynchronize();
        MyThread1 t3 = new MyThread1(s2,5);

        MyThread2 t4 = new MyThread2(s2,9);

    }




}
