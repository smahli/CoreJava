public class ThisUse4 {
    public void show( ThisUse4 t4){  // don't forget to pass parameter (className objectName)
        System.out.println(" I am in show method");
    }
    public void display(){
        show(this);

    }

    public static void main(String[] args) {
        ThisUse4 t4 = new ThisUse4();
        t4.display();

    }
}
