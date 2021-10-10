import java.lang.Thread;
public class BookTheatreSeat {
    int totalSeat =10;
     /*synchronized*/ void bookSeat(int seat){                // we can use synchronized method to synchronize threads
                                                        // It will consume a lot of time to execute if we have 1000 lines of codes
                                                        // So It will be better if we use Synchronize block used here
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());

        synchronized (this){                        // This is an example of Synchronize block  only this code has to executed by different thread separately

             if (totalSeat>=seat){
                 System.out.println(Thread.currentThread().getName()+ " Seats Booked Successfully");
                 totalSeat=totalSeat-seat;
                 System.out.println(totalSeat+" Seats left");
            }

             else{

                 System.out.println(Thread.currentThread().getName()+" Seat Cannot be booked");
                 System.out.println(totalSeat+" Seats Left");
             }
        }
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().getName());
    }
}
class MovieBookAPP extends Thread{
    static BookTheatreSeat b;
    int seats;
    @Override
    public void run() {

        b.bookSeat(seats);

    }

    public static void main(String[] args) {
        b= new BookTheatreSeat();
        MovieBookAPP obj = new MovieBookAPP();
        obj.seats=4;
        obj.start();

        MovieBookAPP amit = new MovieBookAPP();
        amit.seats=3;
        amit.start();

    }
}
