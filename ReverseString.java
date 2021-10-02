import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String str1;
        String rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string that you want to reverse");
        str1= sc.nextLine();
        for (int i =str1.length()-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        }

        System.out.println(" The Reversed String is "+rev);


    }
}
