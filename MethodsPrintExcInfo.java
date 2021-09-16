public class MethodsPrintExcInfo {

        public static void main(String[] args) {
            try {

                int a = 100;
                int b=0;
                int c;

                c=a/b;

                System.out.println(c);

            }
            catch (ArithmeticException e){

             // e.printStackTrace();  // It will print 1. Exception name 2. description 3.stacktrace
              //  System.out.println(e.toString()); or System.out.println(e) // it will print only 1. exception name and description
                System.out.println(e.getMessage());  // it will print only description


            }
            System.out.println("hello");

        }


}
