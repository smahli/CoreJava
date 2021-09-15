public class FinalMethod {
    final void show() {
        System.out.println(" I am in final method");
    }

}
class FinalMethod1 extends FinalMethod {
  /*  void show(){
        System.out.println(" I am in Final Method 1");    cannot override method because we have already assign final keyword to the method

    }*/
  public static void main(String[] args) {
      System.out.println("hello");
  }
}
