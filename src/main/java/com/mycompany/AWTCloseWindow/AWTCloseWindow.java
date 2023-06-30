/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.AWTCloseWindow;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AWTCloseWindow {
    
    public AWTCloseWindow(){
        Frame frame = new Frame("AWT Frame");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.addWindowListener(new WindowAdapter(){
            
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
    });
        
    }
    
    public static void main(String[] args) {
        
        
        AWTCloseWindow at = new AWTCloseWindow();
   
       
    }
}
