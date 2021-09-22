public class CharArrayPass {
    public static void main(String[] args) {
        char[] s2 = new char[]{'a', 'b','c'};
        String s1 = new String("abc");
        System.out.println(s1);
        System.out.println(s2);   /* Why character array is preffered over string for storing password???
        __________________________________________________________________

        String objects are immutable in java and therefore if password is stored as
        plain text it will be available in memory until Garbage collector clears it
                , but String objects are stored in string constant pool for re uasability and garbage
        collection is not applicable in SCP, which is a security threat.
        With an array, you can explicitly wipe the data after you are done
        with it.
        You can overwrite the array with anything you like , and the password won't be present anywhere in the system - even before garbage collection.
        */
    }
}
