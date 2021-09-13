import java.util.Scanner;

public class RemoveDuplicateFromArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter index of the first array");
        int m= sc.nextInt();
        int a[] =  new int[m];
        int temp[]= new int[m];
        int j=0;
        System.out.println("Enter Elements of  array make sure this should be sorted: Example: [1,2,2,3,4,5,5,6,7,8,8,8] ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length-1;i++){
            
            if(a[i]!=a[i+1]){
                temp[j] =a[i];
                j=j+1;




            }
         

            
        }
        temp[j]=a[a.length-1];

        System.out.println("After Removing Duplicate Elements:");
        for(int k=0;k<temp.length;k++){
            System.out.println(temp[k]);
        }



        
    }
    
}