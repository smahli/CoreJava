public class StringClassConstructor {
    StringClassConstructor(){

    }

    public static void main(String[] args) {
        String s1 = "shiwshankar";
        String s2 = new String();
        byte[] b ={101,102,103};



        String s3 = new String(b);
        System.out.println(s3);   // It will print corresponding ascii characters 101 - ,e 102 - f ,103 - g


        System.out.println(s2.length());    // It will print as 0

        char[] c = {'a','b','c'};
        String s4 = new String(c);
        System.out.println(s4);       //  It will just print the String ("abc")




    }
}
