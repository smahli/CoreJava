public class MethodOverLoading {
    void show(int i){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }

    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        m.show(4);


    }
}
