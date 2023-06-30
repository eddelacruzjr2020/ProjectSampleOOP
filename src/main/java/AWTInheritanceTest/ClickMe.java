/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTInheritanceTest;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ClickMe extends Frame{
    
    ClickMe(String pageName, String btnName){
        setTitle(pageName);
        setSize(360, 300);
        setLayout(null);
        setVisible(true);
        setResizable(true);
        
        Button btnClickMe = new Button(btnName);
        btnClickMe.setBounds(140, 140, 60, 30);
        add(btnClickMe);
    }
        
}
