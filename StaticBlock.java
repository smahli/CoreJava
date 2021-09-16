public class StaticBlock {
   static int i;
    static{        // static block is used to do any activity at the time of class execution example native method
       i=10; // static block is used to initialise static variables
        System.out.println(" Hello This is static block");  // static block executes automatically when class is loaded in the memory
                                                            // version 1.6 or earlier supports automatically execution without main method
                                                            // version 1.6 or later required main method to execute static block.

    }

    public static void main(String[] args) {
        System.out.println("Hello I am in the  main method ");  //  first static method will be called then main method .
    }
    static{
        System.out.println(" I am in the second static block");
    }
}
