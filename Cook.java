abstract class Cooking
{
    protected String name;
    abstract void cookingProcess();
    abstract void cookingTime();
}
class Noodles extends Cooking
{
    Noodles()
    {
        this.name="1.Noodles";
    }
    void cookingProcess()
    {
        System.out.println("Boil in hot water and add spices");
    }
    void cookingTime()
    {
        System.out.println("2 minutes");
    }
}
class ChickenCurry extends Cooking
{
    ChickenCurry()
    {
        this.name="2.Chicken Curry";
    }
    void cookingProcess()
    {
        System.out.println("Boil chicken. Add spices and vegetables");
    }
    void cookingTime()
    {
        System.out.println("45 minutes");
    }
}
class Pizza extends Cooking
{
    Pizza()
    {
        this.name="3.Pizza";
    }
    void cookingProcess()
    {
        System.out.println("Roll out the dough. Add sauce and cheese. Heat in the oven");
    }
    void cookingTime()
    {
        System.out.println("50 minutes");
    }
}
class Cook 
{
    public static void main(String args[]) 
    {
        Cooking obj1 = new Noodles();
        System.out.println(obj1.name);
        obj1.cookingProcess();
        obj1.cookingTime();
        System.out.println();
        Cooking obj2 = new ChickenCurry();
        System.out.println(obj2.name);
        obj2.cookingProcess();
        obj2.cookingTime();
        System.out.println();
        Cooking obj3 = new Pizza();
        System.out.println(obj3.name);
        obj3.cookingProcess();
        obj3.cookingTime();
    }
}