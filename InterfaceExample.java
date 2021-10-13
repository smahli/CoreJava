public interface InterfaceExample {


    int Var=10;  // compiler automatically adds public static final
    public static final int Var2 =20;
   abstract  public  void display();
  // protected abstract void Display();  // modifier protected not allowed here
 //   default  abstract void show();    // default and abstract illegal combination
   /* void display(){
        // interface abstract method cannot have bodies
    }*/


    default  void Show(){
        System.out.println("Default method having body is allowed ");
    }


    static  void Dis(){
        System.out.println(" Static method having body is allowed here");
    }

}
 interface InterfaceExample2{
    void Show2();

}
class Test implements InterfaceExample,InterfaceExample2{
    /* void display(){
        System.out.println("Interface Example");   // attempting to assign weaker access privileges ; was public
    }*/                                             // we need to declare same method access modifier as It was in Interface

     public  void display() {
        System.out.println("Interface Example");
    }

    @Override
    public void Show2() {
        System.out.println(" Multiple inheritance As Show2 is overridden and Implements via second interface");
    }

    public static void main(String[] args) {
        // InterfaceExample i1 = new InterfaceExample()// Interface is abstract cannot be instantiated or object cannot be created


        Test t = new Test();
        t.display();
        t.Show2();

    }
}