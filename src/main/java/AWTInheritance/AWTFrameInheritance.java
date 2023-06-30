/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTInheritance;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class AWTFrameInheritance extends Frame{
    
    //initializing Constructor
    AWTFrameInheritance(){
        
        Button button = new Button("Click me!!!");
        
        // setting button position on screen  
        button.setBounds(30,100,80,30);  
        
        //Adding button components into Frame
        add(button);
        
        //set Frame Title
        setTitle("Inheritance Frame");
        
        // frame size 300 width and 300 height    
        setSize(300,300);  
                
        //no layout manager
        setLayout(null);
        
        //frame set to visible
        setVisible(true);
       
    }
    
    public static void main(String [] args){
        new AWTFrameInheritance();
    }
    
}
