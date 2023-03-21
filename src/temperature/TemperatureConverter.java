/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temperature;

import java.text.NumberFormat;

/**
 *
 * @author jomif
 */
public class TemperatureConverter {
    
    private String from, to;
    private int grados;
    private double result;
    
    //Celsius,Fahrenheit,Kelvin,Rankine
    
    
    
    public TemperatureConverter( String from, String to, int grados  ){
        this.from = from;
        this.to = to;
        this.grados = grados;
    }
    
    public double convert(){
        
        if ( from == "Celsius" ){
            if( to == "Fahrenheit" ){
                result = grados * 1.8 + 32;
            }
            else if( to == "Kelvin" ){
                result = grados + 273.15;
            }
            else if( to == "Rankine" ){
                result = grados * 1.8 + 491.67;
            }
        }
        else if ( from == "Fahrenheit" ){
            if( to == "Celsius" ){
                result = (grados - 32) / 1.8;
            }
            else if( to == "Kelvin" ){
                result = (grados - 32)  / 1.8 + 273.15;
            }
            else if( to == "Rankine" ){
                result = grados + 459.67;
            }
        }
        else if ( from == "Kelvin" ){
            if( to == "Celsius" ){
                result = grados - 273.15;
            }
            else if( to == "Fahrenheit" ){
                result = ( (grados - 273.15)  * 1.8 ) + 32;
            }
            else if( to == "Rankine" ){
                result = grados * 1.8;
            }
        }
        else if ( from == "Rankine" ){
            if( to == "Celsius" ){
                result = (grados - 491.67) / 1.8;
            }
            else if( to == "Kelvin" ){
                result = grados / 1.8;
            }
            else if( to == "Fahrenheit" ){
                result = grados - 459.67;
            }
        }
        return  result ;
    }
    
    
    
    
}
