public class Animal {
    public void eat(){
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        System.out.println("Hello there");
        Animal kishu = new Animal();
        kishu.eat();
        kishu.run();


    }
    public void run(){
        System.out.println("I am Running");
    }

}
