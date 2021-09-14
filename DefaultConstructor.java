public class DefaultConstructor {
    int i;
    String name;   // Here we have not created Constructor but Compiler Automatic creates and initialized all to zero
                    // called Default Constructor
    public static void main(String[] args) {
        DefaultConstructor d = new DefaultConstructor();
        System.out.println(d.i+" "+d.name);  // we will get output as 0 and null because compiler initialize it to zero and null

    }
}
