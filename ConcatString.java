public class ConcatString {
    public static void main(String[] args) {
        String s1 = new String("shiwshankar");
        String s2 =new String("java");



        System.out.println(s1+s2);   // output will be shiwshankarjava
        System.out.println(s1+10);  // output will be shiwshankar10

        System.out.println(s1+10+20);   // output will be shiwshankar1020
        System.out.println(10+20+s1);   // output will be 30shiwshankar    why ?????   + operator works left to right  first 10 and 20 will be added

        System.out.println(10+s1+20);       // output will be 10shiwshankar20   because first 10 and s1 will be concatenated
        System.out.println(s1+20/10);     // output will be shiwshankar2    because preference will be to / operator

        //System.out.println(s1+10-5);    // it will show an error

        System.out.println(s1.concat(s2));   // shiwshankarjava will be the output


       // System.out.println(String.join(null,s1,s2));// it will throw NullPointerException
        System.out.println(String.join(" & ",s1,s2));

        String s = new String("Hello there this is shiwshankar");

        System.out.println(s.subSequence(3,10));


        System.out.println(s.substring(3,10));
        System.out.println(s.substring(3));
        System.out.println(s.substring(0,0));    // show empty string
    }
}


