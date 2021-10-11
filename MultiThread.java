import java.lang.Thread;
class BookTheaterApp{
    static int total_seat =10;
    synchronized static void   bookSeat( int seats){


        if(total_seat>=seats){
            System.out.println(seats +" :Seats Booked Successfully");
            total_seat= total_seat-seats;
            System.out.println("seats left " +total_seat);

        }

        else{
            System.out.println("Seats cannot be booked ");
            System.out.println("seats left : "+ total_seat);
        }

    }
}

class MyThread1 extends Thread{
    BookTheaterApp b;
    int seats;
    MyThread1(BookTheaterApp b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

class MyThread2 extends Thread{
    BookTheaterApp b;
    int seats;
    MyThread2(BookTheaterApp b,int seats){
        this.b=b;
        this.seats=seats;
    }

    @Override
    public void run() {
        b.bookSeat(seats);
    }
}

public class MultiThread {
    public static void main(String[] args) {
        BookTheaterApp b1 = new BookTheaterApp();
        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1,4);
        t2.start();

        BookTheaterApp b2 = new BookTheaterApp();
        MyThread1 t3 = new MyThread1(b2,6);
        t3.start();
        MyThread2 t4= new MyThread2(b2,5);
        t4.start();



    }




}
