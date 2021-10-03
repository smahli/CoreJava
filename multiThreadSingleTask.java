public class multiThreadSingleTask extends Thread{

    //    performing single task from multiple threads.

    public void run(){
        System.out.println(" thread example ");
    }

    public static void main(String[] args) {
        multiThreadSingleTask m = new multiThreadSingleTask();
        m.start();     // thread 1

        multiThreadSingleTask m2 = new multiThreadSingleTask();
        m2.start();    // thread 2    // so on



    }

}
