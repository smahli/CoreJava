import java.util.Scanner;
                                    // for creating thread we have to follow these 4 steps that are mentioned below
public class VLCMultiThread extends Thread {      // Step 1 extends the "Thread" class
    public void run(){         //Override  the run() method

        // task that performed by Thread

    }
    public static void main(String[] args) {
        VLCMultiThread t = new VLCMultiThread();  // Create an object of the class

        t.start();  //start the thread using thread method
    }
}
class video {
    void playVideo(){
        System.out.println("Video Playing ");

    }
}
class music {
    void playMusic(){
        System.out.println("Music Playing");
    }
}
