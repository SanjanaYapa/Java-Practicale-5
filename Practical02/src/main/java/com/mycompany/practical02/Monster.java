package com.mycompany.practical02;
public class Monster extends Item
{
    //constructoe method for the monster class
    public Monster(int a, String b);
    {
        this.location=a;
        this.description=b;
    
        //call the constructor of the base class
        super(a, b);
    }
}
