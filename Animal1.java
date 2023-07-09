class Animal
{
    int val = 50;
    void animalSound()
    {
        System.out.println("All animals make a sound");
    }
}
class Pig extends Animal
{
    int val =100;
    void animalSound()
    {
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal
{
    void animalSound()
    {
        System.out.println("The dog says: bow wow");
    }
}
class Animal1
{
    public static void main(String args[])
    {
        Animal obj = new Animal();
        obj.animalSound();
        System.out.println(obj.val);
        Dog obj1 = new Dog();
        obj1.animalSound();
        Pig obj2 = new Pig();
        obj2.animalSound();
        System.out.println(obj2.val);
        Animal obj3 = new Dog();
        obj3.animalSound();
        Animal obj4 = new Pig();
        System.out.println(obj4.val);
        obj4.animalSound();
    }
}