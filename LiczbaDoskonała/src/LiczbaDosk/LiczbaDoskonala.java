/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LiczbaDosk;

/**
 *
 * @author olcia
 */
public class LiczbaDoskonala {
    private float liczba;
    
    public void setLiczba (String value) {
        liczba = Float.parseFloat(value.replace(",", "."));
    }
    public float getLiczba() {
        return liczba;
    }
    public String Doskonala()
    {       
        System.out.println(liczba);
    
        float suma = 0;
 
        for (int i = 1; i < liczba; i++)
        {
            if (liczba % i == 0)
                suma += i;
        }
 
        if (suma == liczba) {
            return String.format("Liczba jest doskonała");
 
        } else {
            return String.format("Liczba nie jest doskonała");
        }

    }
}

