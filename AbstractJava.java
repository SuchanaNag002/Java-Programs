abstract class Animal {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzzz");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class AbstractJava {
    public static void main(String args[]) {
        //Animal obj2 = new Animal();//Animal is abstract, cannot be initiated
        Animal obj1 = new Pig();
        obj1.animalSound();
        Pig obj = new Pig(); // Create a Pig object
        obj.animalSound();
        obj.sleep();
    }
}