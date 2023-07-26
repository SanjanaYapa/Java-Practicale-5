
package com.mycompany.q1employeewithconstructor;
public class EmployeewithConstructor
{
    private String name;
    private int age;
    private float salary;
    
    public EmployeewithConstructor(String name,int age,float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public float getSalary() 
    {
        return salary;
    }

}
