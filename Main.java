class Person
{
    public Person(){}
}
class Employee extends Person
{
    int id;
    String name;
    Employee()
    {
        id=-1;
        name="Unknown";
    }
    Employee(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    void print()
    {
        System.out.println(id+" "+name);
    }
}
class Manager extends Employee
{
    private String dept;
    Employee ob = new Employee();
    Manager()
    {
        dept="Unknown dept";
    }
    Manager(int id, String name, String dept)
    {
        this.dept=dept;
    }
    void print()
    {
        System.out.println("id: "+ob.id+" dept: "+dept);
    }
}
class Main
{
    public static void main(String args[])
    {
        Manager m1 = new Manager();
        m1.print();
        Manager m2 = new Manager(10, "abc", "IT");
        m2.print();
    }
}