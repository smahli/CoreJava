public class UseSuper2 {
    void method1(){
        System.out.println("I am in Parent class");
    }

}
class UseSuper22 extends UseSuper2{

    void display(){
       super.method1(); // this will invoke parent class method


    }

    public static void main(String[] args) {
        UseSuper22 u22 = new UseSuper22();
        u22.display();
    }
}
