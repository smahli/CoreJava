import java.util.Scanner;

public class ReplacingString {




        public static void main(String[] args) {
            String  st1;

            String st2;
            String st3;
            System.out.println(" Enter the  Sentence ");
            Scanner sc = new Scanner(System.in);
            st1 = sc.nextLine();
            System.out.println("Enter which word you want to replace");
            st2= sc.nextLine();
            System.out.println("Enter which word you want to put in place of "+st2);
            st3 = sc.nextLine();


            System.out.println( st1.replace(st2,st3));


        }
        /*
        * replace(char oldChar, newChar) method returns  String replacing all
        * the old characters or CharSequence to new characters or CharSequence.
        * This method was introduced in JDK 1.5 version
        *
        *
        * */



}
