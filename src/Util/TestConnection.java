package Util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import javax.swing.Timer;


public class TestConnection extends Thread implements ActionListener{
    
    boolean connectivity;

   
    private Timer timer;
    
     public TestConnection ( ){
        timer = new Timer(4000, this);
        timer.start();
    }

    public TestConnection(boolean conection, Timer timer) {
        this.connectivity = conection;
        this.timer = timer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        String dirWeb = "www.google.com";
        int puerto = 80;

        try{
            Socket s = new Socket(dirWeb, puerto);
            if(s.isConnected()){
                connectivity = true;
            } 
        }catch(Exception ex){
            connectivity = false;
            ex.printStackTrace();
        }

        
        
    }
        
     public boolean isConection() {
        return connectivity;
    }
  
    
    
   
    
    


}


/*
  {    "success": true,    "query": {        "from": "COP",        "to": "USD",        "amount": 60000    },    "info": {        "timestamp": 1678664224,        "rate": 0.000212    },    "date": "2023-03-12",    "result": 12.72}
 */