package com.mycompany.q1employeewithconstructor;
public class Q1EmployeewithConstructor 
{

    public static void main(String[] args)
    {
        EmployeewithConstructor emp = new EmployeewithConstructor ("John Doe", 30, 50000);

        // Get values using getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

    }
}
