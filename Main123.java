abstract class Vehicle1 {
    public abstract void start();
}

class Car1 extends Vehicle1 {
    public void start() {
        System.out.println("Starts with key");
    }
}

class Scooter extends Vehicle1 {
    public void start() {
        System.out.println("Starts with steering");
    }

}

class Main123 {
    public static void main(String args[]) {
        // Car1 c = new Car1();
        // c.start();
        Scooter s = new Scooter();
        s.start();
    }
}