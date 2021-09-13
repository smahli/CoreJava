public class MethodOverRiding1 extends MethodOverRiding{
    void show(){
        System.out.println("2");

    }

    public static void main(String[] args) {
        MethodOverRiding1 m = new MethodOverRiding1();
        MethodOverRiding m1 = new MethodOverRiding();
        m1.show();
        m.show();

    }
}
