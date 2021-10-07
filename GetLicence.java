import java.lang.Thread;
public class GetLicence extends Thread {

    public static class  MedicalTest extends Thread {
        public void run(){
            try{
                System.out.println("Medical Test Starts ");
                Thread.sleep(3000);
                System.out.println("Medical Test Finished");
            }
            catch (Exception e){
                System.out.println(e);
            }

        }

    }


    public static class DrivingTest extends Thread {
        @Override
        public void run() {
            try{
                System.out.println("Driving Test Starts ");
                Thread.sleep(3000);
                System.out.println("Driving Test Finished");

            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }


    public static class OfficerSign extends Thread {
        @Override
        public void run() {
            try{
                System.out.println("Officer Takes the file");
                Thread.sleep(3000);
                System.out.println("Officer sign Finished ");
            }
            catch (Exception e){
                System.out.println(e);

            }
        }
    }

    public static class Licence{
        public static void main(String[] args) throws InterruptedException{
            MedicalTest mt = new MedicalTest();
            mt.start();
            mt.join();

            DrivingTest dt = new DrivingTest();
            dt.start();
            dt.join();


            OfficerSign os = new OfficerSign();
            os.start();


        }
    }




}
