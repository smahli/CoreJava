import java.lang.Thread;
public class BookTheatreSeat {
    int totalSeat =10;
    void bookSeat(int seat){
        if (totalSeat>=seat){
            System.out.println("Seats Booked Successfully");
            totalSeat=totalSeat-seat;
            System.out.println(totalSeat+" Seats left");

        }

        else{
            System.out.println(totalSeat+" Seats Left");
            System.out.println("Seat Cannot be booked");
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
        obj.seats=6;
        obj.start();

        MovieBookAPP amit = new MovieBookAPP();
        amit.seats=7;
        amit.start();

    }                   // Data Inconsistency is occurring in this program
}
