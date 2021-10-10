import java.lang.Thread;
public class BookTheatreSeat {
    int totalSeat =10;
     synchronized void bookSeat(int seat){
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
