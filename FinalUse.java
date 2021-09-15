public class FinalUse {
    public static void main(String[] args) {
       final int i=10;
      //  i =i+20;  // here compiler will throw an error because once final variable declared cannot be changed thereafter
        System.out.println(i);
    }
}
