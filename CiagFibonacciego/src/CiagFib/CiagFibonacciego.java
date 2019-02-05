/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CiagFib;



/**
 *
 * @author olcia
 */
public class CiagFibonacciego {
    
    
    private float fib;
    private float li1;
    
    public void setli1 (String value) {
        li1 = Float.parseFloat(value.replace(",", "."));
    }
    public float getli1() {
        return li1;
    }
    
    public String Fibonacci()
        {
            if (li1 <= 2)
            {
               if (li1==0) {
                  return String.format("0");
               } else {
                return String.format("1");
               }
            }
            else
            {
                float a = 1;
                float b = 1;
                float c = 0;
                for (int i = 0; i < li1-2; i++)
                {
                    c = a + b;
                    a = b;
                    b = c;
                }
                return String.format("", c);
            }
        }
    public CiagFibonacciego()
    {
        
    }

   
    
}
