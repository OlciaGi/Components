/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calc;

/**
 *
 * @author olcia
 */
public class WalutyCalc {
    private double zlotowki;
    private final double kurs_franka = 3.8202;
    private final double kurs_dolara = 3.8905;
    private final double kurs_euro = 4.3021;
   
	
	public void setZlotowki (String value) {
        zlotowki = Double.parseDouble(value.replace(",", "."));
    }
        public double getZlotowki() {
        return zlotowki;
    }
        
	public String Frank(){
            
              double frank= zlotowki * kurs_franka; 
              return String.format("%.2f", frank);
	}
             
        public String Dolar() {
           
            double dolar= zlotowki * kurs_dolara;
            return String.format("%.2f", dolar);
        }
        
        public String Euro() {
            double euro= zlotowki * kurs_euro;
            return String.format("%.2f", euro);
        }
        public WalutyCalc(){
            
        }
}
