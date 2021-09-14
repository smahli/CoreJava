public class ThisUse3 {
    ThisUse3(){
        System.out.println(" No argument constructor");
    }
    ThisUse3(int i){
        System.out.println("Parameterised constructor");
    }

    public static void main(String[] args) {
        ThisUse3 t3 = new ThisUse3(10);

    }
}
