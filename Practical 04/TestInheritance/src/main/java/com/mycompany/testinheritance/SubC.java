
package com.mycompany.testinheritance;
public class SubC extends SuperB
{
     @Override
    public void triple() {
        // override existing method
        x = x + 3;
    }

    public void quadruple()
    {
        // new method
        x = x * 4;
    }
}
