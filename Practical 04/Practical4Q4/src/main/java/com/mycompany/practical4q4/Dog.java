
package com.mycompany.practical4q4;
public class Dog extends Animal
        
{
    public static void main(String[] args)
    {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();
      System.out.println(a instanceof Animal);
      System.out.println(m instanceof Mammal);
      System.out.println(d instanceof Animal);
    }
}
