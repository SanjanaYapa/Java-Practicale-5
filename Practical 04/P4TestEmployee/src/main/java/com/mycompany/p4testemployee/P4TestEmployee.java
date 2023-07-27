
package com.mycompany.p4testemployee;
public class P4TestEmployee 
{

    public static void main(String[] args) 
    {
        Employee bogdan = new Employee();
        bogdan.setEmpID(1001);
        bogdan.setEmpName("Mr. Bogdan");
        bogdan.setEmpDesignation("Software Engineer");

        Employee bird = new Employee();
        bird.setEmpID(1002);
        bird.setEmpName("Ms. Bird");
        bird.setEmpDesignation("Project Manager");

        System.out.println("Mr. Bogdan's ID is: " + bogdan.getEmpID());
        System.out.println("Mr. Bogdan's name is: " + bogdan.getEmpName());
        System.out.println("Mr. Bogdan's designation is: " + bogdan.getEmpDesignation());

        System.out.println("Ms. Bird's ID is: " + bird.getEmpID());
        System.out.println("Ms. Bird's name is: " + bird.getEmpName());
        System.out.println("Ms. Bird's designation is: " + bird.getEmpDesignation());
    }
}
