final class Final {
    void show() {
        System.out.println("Welcome to final class");
    }
}
class Final2 extends Final{  // extned final class cannot be inherited because of the final keyword
    public static void main(String[] args) {
        System.out.println("Welcome to the world of java");
    }

}
