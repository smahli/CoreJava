import java.util.Scanner;

public class InsertintoArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter index of the first array");
        int m= sc.nextInt();
        int a[] =  new int[m];
        System.out.println("Enter Elements of First array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Which position you want to insert an element");
        int pos= sc.nextInt();
        System.out.println(" Enter element to insert");
        int insert =sc.nextInt();
        int index = pos-1;
        for(int j=a.length-1;j>=pos-1;j--){
            a[j]=a[j-1];

        }
        a[index]=insert;

        for(int k=0;k<a.length;k++){
            System.out.println(+a[k]+" ");
        }       
    }
    
}