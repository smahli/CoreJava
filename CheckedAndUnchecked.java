import java.io.FileInputStream;

public class CheckedAndUnchecked {
    public static void main(String[] args) {
        try{

        FileInputStream fis = new FileInputStream("c:/file.txt");  // checked exception compile time compiler will throw
                                                                        // an exception before run the program so this is
                                                                        // compile time exception or checked exception
        }
        catch ( Exception e){
            System.out.println(e);
        }

        int a,b,c;
        a=100; b=0;
        c=a/b;
        System.out.println(c);    // it will compile successfully but at runtime this will throw an exception divide by zero
                                    // therefore this is run time exception or unchecked exception
    }
}
