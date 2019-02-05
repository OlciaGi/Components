/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalk;


import javax.swing.JButton;

/**
 *
 * @author olcia
 */
public class Calculator extends JButton {
    
    private float li1, li2;
    
    public void setli1 (String value) {
        li1 = Float.parseFloat(value.replace(",", "."));
    }
    public float getli1() {
        return li1;
    }

    public void setli2 (String value)
    {
        li2 = Float.parseFloat(value.replace(",", "."));
    }
    public float getli2(){
        return li2;
    }
    public String Dod() {
        System.out.println(li1);
        float dod= li1+li2;

        return String.format("%.2f", dod);
    }
        public String Odejm() {        

        float odejm= li1-li2;

        return String.format("%.2f", odejm);
    }
        public String Mnoz() {        

        float mnoz= (li1*li2);

        return String.format("%.2f", mnoz);
    }
        public String Dziel() {       

        float dziel= (li1/li2);

        return String.format("%.2f", dziel);
    }
        public Calculator()
        {
            
        }
}
