public class StaticMethod {
    void show(){
        System.out.println(" This is a normal menthod");
    }
    static void display(){
        System.out.println(" This is static method");
    }

    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        s1.show();        // we can call only show() by StaticMethod Class object
        StaticMethod.display(); // we can invoke display method with StaticMethod Class because static Method belongs to Class
    }
}
