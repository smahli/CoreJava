import java.util.Scanner;

public class CompTwoStr {
    public static void main(String[] args) {
        System.out.println(" Enter First String");
        Scanner sc = new Scanner(System.in);
        String  str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String str2 = sc.nextLine();

        //System.out.println(str1.equals(str2)); // shiw and shiw same here but shiw and Shiw is different
       // System.out.println(str1.equalsIgnoreCase(str2));  // Shiw and shiw is same here It will print true

        //System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

    }
}
