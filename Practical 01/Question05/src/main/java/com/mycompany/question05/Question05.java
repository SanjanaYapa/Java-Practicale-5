
package com.mycompany.question05;
public class Question05
{

    public static void main(String[] args) 
    {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
               
            case 'D':
                System.out.println("You passed");
                break;
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);
    }
}
/*Outputs
Excellent!
Your grade is A
*/

/*Output after removing the 6th line break
Excellent!
You passed
Your grade is A
*/