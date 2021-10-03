public class MultitaskMultiThread extends Thread{
    @Override
    public void run(){
        System.out.println(" thread example 1");
    }

}
class Class2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread example 2");
    }

}
class  Class3 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread example 3");
    }
}
class  Main extends Thread{
    public static void main(String[] args) {
        MultitaskMultiThread t1 = new MultitaskMultiThread();
        t1.start();
        Class2 t2 = new Class2();
        t2.start();
        Class3 t3 = new Class3();
        t3.start();
    }
}
