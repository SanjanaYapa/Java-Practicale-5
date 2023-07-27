
package com.mycompany.q3tset;
public class Q3Tset
{

    public static void main(String[] args)
    {
         Person person = new Person();
        person.setName("ramith");
        person.setID(5865);

        System.out.println("Person name: " + person.getName());
        System.out.println("Person ID: " + person.getID());

        Student student = new Student();
        student.setName("sadun");
        student.setID(586);
        student.setCourse("Computer Science");

        System.out.println("Student name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Student course: " + student.getCourse());

        Lecturer lecturer = new Lecturer();
        lecturer.setName("Amal kariyawasam");
        lecturer.setID(1236);
        lecturer.setProg("Computer Science");


        System.out.println("Lecturer name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Lecturer programme: " + lecturer.getProg());
    }
}
