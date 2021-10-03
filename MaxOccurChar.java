import java.util.Scanner;

public class MaxOccurChar {

    public static void main(String[] args) {
        String Str1;
        int[] array = new int[127];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check Occurrence of numbers of characters");
        Str1= sc.nextLine();
        Str1=Str1.replaceAll("\\s","");
        System.out.println(Str1);

        for (int i=0;i<Str1.length();i++){
            array[Str1.charAt(i)]= array[Str1.charAt(i)]+1;
        }
        int max =-1;
        char c=' ';
        for(int i=0;i<Str1.length();i++) {
            if (max<array[Str1.charAt(i)]){
                max = Str1.charAt(i);
                c = Str1.charAt(i);
            }
        }

        System.out.println("Maximum Repeated Character:  "+c);
    }


}

