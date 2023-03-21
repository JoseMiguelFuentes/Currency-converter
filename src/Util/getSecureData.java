/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;


import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author jomif
 */
public class getSecureData {
    
    
    public String getApiKey() {
        try {
            //se crea una instancia a la clase Properties
            Properties propiedades = new Properties();
            //se leen el archivo .properties
            propiedades.load( getClass().getResourceAsStream("data.properties") );
            //si el archivo de propiedades NO esta vacio retornan las propiedes leidas
            String key = propiedades.getProperty( "apiKey" );
            if (!propiedades.isEmpty()) {
                return key;
            } else {//sino  retornara NULL
                return null;
            }
        } catch (IOException ex) {
            return null;
        }
    }
}
