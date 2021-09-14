public class ThisUse2 {

    public void show(){
        System.out.println("Hello this is Show method");
    }
    public  void display(){
        show(); // show() and this.show() is same  as if we don't use this keyword then
                // compiler will automatically add "this " while invoking the method
    }

    public static void main(String[] args) {
        ThisUse2 t2 = new ThisUse2();
        t2.display();
    }
}
