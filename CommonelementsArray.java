import java.util.Scanner;

public class CommonelementsArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter index of the first array");
        int m= sc.nextInt();
        int a[] =  new int[m];
        System.out.println("Enter Elements of First array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println(" Enter index of the second Array");
        int n =sc.nextInt();
        int b[]= new int[n];
        System.out.println(" Enter Elements of the second array");
        for(int j=0;j<b.length;j++){
            b[j]= sc.nextInt();
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println("Common Elements"+b[j]);
                }
            }
        }

    }
    
}