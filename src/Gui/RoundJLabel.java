/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import Util.TestConnection;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RoundJLabel extends JLabel implements ActionListener{


    private Timer timer;
    private Color[] colors = { Color.RED, new Color( 10,10,35 )};
    private int colorIndex = 0;
    
    
    


    public RoundJLabel() {
        timer = new Timer(1000, this);
        timer.start();
        
    }
    // private boolean conection = TestConection();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillOval(0, 0, getWidth() - 1, getHeight() - 1);
        g2.setColor(getForeground());
        g2.drawOval(0, 0, getWidth() - 1, getHeight() - 1);
        g2.setClip(null);
        
    }
    
    // Comprobando conección a internet.
    TestConnection connectivity = new TestConnection();   
    


    @Override
    public void actionPerformed(ActionEvent e) {
        
        colorIndex++;
        if (colorIndex == colors.length) {
            colorIndex = 0;
        }
        if( connectivity.isConection() ){
            colors[0] = new Color(102, 255, 102);
        }else{
            colors[0] = Color.red;
        }
        setBackground( colors[colorIndex] );
        setForeground( new Color( 10,10,35 ) );
        
    }

    public boolean isConnect() {
        return connectivity.isConection();
    }

    public void setColor( Color color ){
        this.colors[0] = color;
    }
    
    
    
    
    
    
    
    
    
    
}
