class Animal{
    void eat(){
        System.out.println("I am eating ");
    }
}
public class SimpleInheritance extends  Animal  {

    public static void main(String[] args) {
        SimpleInheritance s = new SimpleInheritance();
        s.eat();
    }

}
