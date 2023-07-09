class Vehicle
{
    String brand="FORD";
    public void honk()
    {
        System.out.println("Tuut, tuut!");
    }
}
class Car extends Vehicle
{
    String modelName="Mustang";
}
class Solution1
{
    public static void main(String args[])
    {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand+" "+myCar.modelName);
        Vehicle Vehicle = new Vehicle();
        Vehicle.honk();
        System.out.println(Vehicle.brand);
        //System.out.println(Vehicle.modelName);
    }
}