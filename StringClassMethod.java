public class StringClassMethod {
    public static void main(String[] args) {
        String name ="abc";
        //String name = null;   Null pointer exception if we want to print length of the string
        String email= "abc@gmail.com";
        String Password = "abc123";
        int i=name.length();
        if(i==0){
            System.out.println(" The String is Empty");
        }
        else{
            System.out.println("The String is of length "+i);
        }

        //isEmpty Method
        System.out.println(name.isEmpty());
        if (name.isEmpty()==true){
            System.out.println("Name can't be empty");
        }

        //trim() method
        String name1 = new String("      abc       Z       ");
        System.out.println(name1.trim());  // trim() method of String class eliminates only leading and trailing spaces

        if(name1.trim().isEmpty()==true){
            System.out.println("Name can't be empty");
        }

    }


}
