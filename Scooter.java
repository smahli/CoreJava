public class Scooter extends Vehicle {
    @Override
    void Start() {
        System.out.println("starts with kick");
    }

    public static void main(String[] args) {
        Scooter s = new Scooter();
        s.Start();
    }
}
