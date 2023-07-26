
package com.mycompany.q1employee;
public class Q1Employee 
{

    public static void main(String[] args)
    {
      Employee emp=new Employee();
       emp.setName("Yapa YHSW");
       emp.setAge(22);
       emp.setSalary(120000);
       
        System.out.println("Name:"+emp.getName());
        System.out.println("Age:"+emp.getAge());
        System.out.println("Salary:"+emp.getSalary());

    }
}
