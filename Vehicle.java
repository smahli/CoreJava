
public abstract class Vehicle {
    int no_of_Tyres;

    abstract void start();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println(" Car Starts with Key");
    }
}

class Scooter extends Vehicle{
    @Override
    void start() {
        System.out.println(" Scooter starts with kick");
    }

    public static void main(String[] args) {
        //Vehicle v= new Vehicle();    // Why because Vehicle is abstract it cannot be instantiated mean we cannot create object of abstract class
        Car c = new Car();
        Scooter s = new Scooter();
        c.start();
        s.start();
    }
}


