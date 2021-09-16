public class finally1 {

    public static void main(String[] args) {
        try {
            int i=100, b=0, c;
            c= i/b;
            System.out.println(c);

        }
        catch (Exception e){
            System.out.println("Exception  "+e);
        }
        finally {
            System.out.println("I am in finally block");

        }
    }
}
