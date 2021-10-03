public class ThreadStart implements Runnable {  // step 1: This is first step to implement the Runnable Interface


    @Override
    public void run() {   // step 2: override the run method

        // Thread task has to be executed
        System.out.println("Thread task 2");

    }

    public static void main(String[] args) {

        ThreadStart t1 = new ThreadStart();   // step 3 : is creating object of the class
        Thread th = new Thread(t1);     // step 4: create an object of thread class and pass the parameter in constructor of thread class
        th.start();//  Step 5:  invoke the thread



    }
}
