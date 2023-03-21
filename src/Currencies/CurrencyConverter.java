package Currencies;


import java.net.HttpURLConnection;
import java.net.URL;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.json.JSONObject;




public class CurrencyConverter {

  private String from;
  private String to;
  private String amount;
  private Number[] result = new Number[2];
  private String apiKey;
  private String date;//Next to implement.

    public String getDate() {
        return date;
    }

    

  

public CurrencyConverter( String from, String to, String amount, String apiKey ){//¿ Constructor.
    this.from = from;
    this.to = to;
    this.amount = amount;
    this.apiKey = apiKey;
  }

  public Number[] convert (  ){
    
    StringBuilder response = new StringBuilder();

    try {
        
        
        
       
      String apiUrl = "https://api.apilayer.com/exchangerates_data/convert?to="+this.to+"&from="+this.from+"&amount="+this.amount; // URL de la API

      //"lBklv3yRreJEXQpMoBwD3KbDtEgH4bAd"; // La API key
  
      URL url = new URL( apiUrl );
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      
      // Agrega el encabezado apikey a la solicitud
      conn.setRequestProperty("apikey", apiKey );
  
      // Lee la respuesta de la API
      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String inputLine;
      // StringBuffer response = new StringBuffer();
      while ((inputLine = in.readLine()) != null) {
          response.append(inputLine);
      }
      in.close();
      
  
      // Imprime la respuesta de la API

      
      //System.out.println(response);
      JSONObject obj = new JSONObject( response.toString() );
      this.result[0] = (Number) obj.getNumber("result");
      
      //Obteniendo el objeto rate que viene en la respuesta por medio de org.json.JSONObject;
//      JSONObject rateObject = new JSONObject( response );

      double rate = obj.getJSONObject("info").getDouble("rate");
      //Lo asignamos al arreglo result como número.
      this.result[1] = (Number) rate;
      //Obteniendo la fecha desde la respuesta.
      this.date = obj.getString("date");
      

      
      } catch (Exception e) {
          e.printStackTrace();
          System.out.println( e.getCause() );
      }
      return result;
  }
    
  
    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAmount() {
        return amount;
    }
    
    
   



}
  
 

  
  






 
  //     .addHeader("apikey", "lBklv3yRreJEXQpMoBwD3KbDtEgH4bAd")
  
  
 
