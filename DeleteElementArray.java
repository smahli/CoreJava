import java.util.Scanner;

public class DeleteElementArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter index of the first array");
        int m= sc.nextInt();
        int a[] =  new int[m];
        System.out.println("Enter Elements of First array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Element you want to delete");
        int DeleteItem = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==DeleteItem){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }
        }
        System.out.println(" After Deletion");
        for(int k=0;k<a.length-1;k++){
            System.out.println(a[k]);
        }
          
    }
    
}