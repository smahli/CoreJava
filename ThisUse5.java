

class Test22{
        Test22(ThisUse5 t5 ) {
            System.out.println(" Test Contructor argument");
        }

}
public class ThisUse5 {
    public void show(){
        Test22 t22 = new Test22(this);
    }


    public static void main(String[] args) {
        ThisUse5 t5 = new ThisUse5();
        t5.show();


    }
}
