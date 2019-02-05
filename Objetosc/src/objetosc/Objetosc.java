/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosc;

/**
 *
 * @author olcia
 */
public class Objetosc {
     private float a,b,wys;
    
    public void setA(String value) {
        a = Float.parseFloat(value.replace(",", "."));
    }

    public float getA() {
        return a;
    }

    public void setB(String value) {
        b = Float.parseFloat(value.replace(",", "."));
    }

    public float getB() {
        return b;
    }

    public void setWys(String value) {
        wys = Float.parseFloat(value.replace(",", "."));
    }

    public Float getWys() {
        return wys;
    }

    public String ObProst() {
        System.out.println(a);

        float obj = (a * b * wys);

        return String.format("%.2f", obj);
    }

    public String ObSzes() {
        System.out.println(a);
        float objSzes = (a * a * a);

        return String.format("%.2f", objSzes);
    }

    public String ObGrn() {
        float objGrn = (a * a * wys);

        return String.format("%.2f", objGrn);
    }

    public Objetosc() {

    }
    
}
