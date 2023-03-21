/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pressure;

/**
 *
 * @author jomif
 */
public class PressureConverter {
    
    int value;
    private String from, to;
    private double result;
    /*
    Atmósfera (Atm) *
    Bar *
    Kilopascal (Kpa) *
    Libra por pulgada (Psi) *
    Pascal (Pa)
    Torr
    */
    public PressureConverter( String from, String to, int value  ){
        this.from = from;
        this.to = to;
        this.value = value;
    }
    
    public double convert(){
        switch ( from ) {
            case "Kilopascal (Kpa)":
                if( to == "Libra por pulgada (Psi)" ){
                    result = value / 6.895;
                }else if( to == "Atmósfera (Atm)" ){
                    result = value / 101.3;
                }else if( to == "Bar" ){
                    result = value / 100;
                }else if( to == "Pascal (Pa)" ){
                    result = value * 1000;
                }
                else if( to == "Torr" ){
                    result = value * 7.50;
                }
                break;
            case "Atmósfera (Atm)":
                if( to == "Libra por pulgada (Psi)" ){
                    result = value * 14.696;
                }else if( to == "Kilopascal (Kpa)" ){
                    result = value * 101.3;
                }else if( to == "Bar" ){
                    result = value * 1.013;
                }else if( to == "Pascal (Pa)" ){
                    result = value * 101300;
                }
                else if( to == "Torr" ){
                    result = value * 760;
                }
                break;
            case "Bar":
                if( to == "Libra por pulgada (Psi)" ){
                    result = value * 14.504;
                }else if( to == "Kilopascal (Kpa)" ){
                    result = value * 100;
                }else if( to == "Atmósfera (Atm)" ){
                    result = value * 1.013;
                }else if( to == "Pascal (Pa)" ){
                    result = value * 100000;
                }
                else if( to == "Torr" ){
                    result = value * 750.1;
                }
                break;
            case "Libra por pulgada (Psi)":
                if( to == "Bar" ){
                result = value / 14.504;
                }else if( to == "Kilopascal (Kpa)" ){
                    result = value * 6.895;
                }else if( to == "Atmósfera (Atm)" ){
                    result = value / 14.696;
                }else if( to == "Pascal (Pa)" ){
                    result = value * 6895;
                }
                else if( to == "Torr" ){
                    result = value * 51.715;
                }
            case "Pascal (Pa)":
                if( to == "Bar" ){
                result = value / 100000;
                }else if( to == "Kilopascal (Kpa)" ){
                    result = value / 1000;
                }else if( to == "Atmósfera (Atm)" ){
                    result = value / 101300;
                }else if( to == "Libra por pulgada (Psi)" ){
                    result = value / 6895;
                }
                else if( to == "Torr" ){
                    result = value / 133.3;
                }
                break;
            case "Torr":
                if( to == "Bar" ){
                result = value / 750.1;
                }else if( to == "Kilopascal (Kpa)" ){
                    result = value /  7.501;
                }else if( to == "Atmósfera (Atm)" ){
                    result = value / 760;
                }else if( to == "Libra por pulgada (Psi)" ){
                    result = value / 51.715;
                }
                else if( to == "Pascal (Pa)" ){
                    result = value * 133.3;
                }
                break;
        }
        /*
        if( from == "Kilopascal (Kpa)" ){
            if( to == "Libra por pulgada (Psi)" ){
                result = value / 6.895;
            }else if( to == "Atmósfera (Atm)" ){
                result = value / 101.3;
            }else if( to == "Bar" ){
                result = value / 100;
            }else if( to == "Pascal (Pa)" ){
                result = value * 1000;
            }
            else if( to == "Torr" ){
                result = value * 7.50;
            }
        }else if( from == "Atmósfera (Atm)" ){
            if( to == "Libra por pulgada (Psi)" ){
                result = value * 14.696;
            }else if( to == "Kilopascal (Kpa)" ){
                result = value * 101.3;
            }else if( to == "Bar" ){
                result = value * 1.013;
            }else if( to == "Pascal (Pa)" ){
                result = value * 101300;
            }
            else if( to == "Torr" ){
                result = value * 760;
            }
        }else if( from == "Bar" ){
            if( to == "Libra por pulgada (Psi)" ){
                result = value * 14.504;
            }else if( to == "Kilopascal (Kpa)" ){
                result = value * 100;
            }else if( to == "Atmósfera (Atm)" ){
                result = value * 1.013;
            }else if( to == "Pascal (Pa)" ){
                result = value * 100000;
            }
            else if( to == "Torr" ){
                result = value * 750.1;
            }
        }else if( from == "Libra por pulgada (Psi)" ){
            if( to == "Bar" ){
            result = value / 14.504;
            }else if( to == "Kilopascal (Kpa)" ){
                result = value * 6.895;
            }else if( to == "Atmósfera (Atm)" ){
                result = value / 14.696;
            }else if( to == "Pascal (Pa)" ){
                result = value * 6895;
            }
            else if( to == "Torr" ){
                result = value * 51.715;
            }
        }else if( from == "Pascal (Pa)" ){
            if( to == "Bar" ){
            result = value / 100000;
            }else if( to == "Kilopascal (Kpa)" ){
                result = value / 1000;
            }else if( to == "Atmósfera (Atm)" ){
                result = value / 101300;
            }else if( to == "Libra por pulgada (Psi)" ){
                result = value / 6895;
            }
            else if( to == "Torr" ){
                result = value / 133.3;
            }
        }else if( from == "Torr" ){
            if( to == "Bar" ){
            result = value / 750.1;
            }else if( to == "Kilopascal (Kpa)" ){
                result = value /  7.501;
            }else if( to == "Atmósfera (Atm)" ){
                result = value / 760;
            }else if( to == "Libra por pulgada (Psi)" ){
                result = value / 51.715;
            }
            else if( to == "Pascal (Pa)" ){
                result = value * 133.3;
            }
            
        }
        */
        return result;
    }
    
    
}   
    
    

