//Java Comparable interface is used to order the objects of the user-defined class. This interface is found in java.lang package and contains only one method named compareTo(Object). It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.
import java.util.*;
class Employee implements Comparable{
    private int eid;
    private String name;
    private double salary;
    public Employee(int eid, String name, double salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return eid + " : " + name + " : " + salary;  //10:Arup:1000
    }
    public int compareTo(Object otherOb){
        Employee e = (Employee)otherOb;
        return (int)this.eid - (int)e.eid;
    }
}

public class Main1234{
    public static void main(String[] args){
        Employee e1 = new Employee(10, "Arup", 10000.00);
        Employee e2 = new Employee(20, "Ram", 10000.00);
        Employee e3 = new Employee(30, "Anand", 15000.00);
        Employee e[]={e1, e2, e3};
        // Employee e[] = new Employee[3];
        // e[0] = e1;
        // e[1] = e2;
        // e[2] = e3;
        if(e1.compareTo(e2) > 0){
            System.out.println("e1 has greater");
        }    
        else if(e1.compareTo(e2) < 0){
            System.out.println("e2 has greater");
        }    
        else{
            System.out.println("both equal");
        }
        Arrays.sort(e);
        for(int i=0; i<3; i++)
        {
            System.out.println(e[i]);
        }
    }
}