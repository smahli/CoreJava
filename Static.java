public class Static {
    static int i =10;
    void show(){
       // int i=10;  //static keyword not allowed here we cannot make local variables static
    }

}
class Static1 {
    public static void main(String[] args) {
        //Static s = new Static();     // static variable belongs to a class not object
        System.out.println(Static.i);  //
       // System.out.println(s.i); this will show an error because
    }
}
