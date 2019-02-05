/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LPierwcze;

/**
 *
 * @author olcia
 */
public class LiczbyPierwsze {
     private float liczba;
    
    public void setLiczba (String value) {
        liczba = Float.parseFloat(value.replace(",", "."));
    }
    public float getLiczba() {
        return liczba;
    }
    public String Pierwsza()
    {
        int i;
        
        System.out.println(liczba);
    
        if (liczba < 2)
        {
            return String.format("Liczba nie jest pierwsza");
        }
        for( i=2;i*i<=liczba;i=i+1)
        if(liczba %i==0)
	{
            return String.format("Liczba nie jest pierwsza");
        }

            return String.format("Liczba jest pierwsza");
    }
}


