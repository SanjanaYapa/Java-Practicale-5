
package com.mycompany.question04;
public class Question04 
{

    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop now");
    }
    
}

/*output
    10
    20
    40
    50
    I'm out of the Loop now
*/