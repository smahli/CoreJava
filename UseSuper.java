public class UseSuper {
    int i=10;


}
class UseSuper1 extends UseSuper{
    int i=20;
    void show(int i){
        System.out.println(" This is show method");
        System.out.println(i);     // this will be printing 30 as we have passed 30 in the main function
        System.out.println(this.i); //      This keyword can be used to refer current class instance variable
        System.out.println(super.i);  //	Super keyword is a reference variable which is used to refer immediate parent class object


    }

    public static void main(String[] args) {
        UseSuper1 u1 = new UseSuper1();
        u1.show(30);

    }

}
