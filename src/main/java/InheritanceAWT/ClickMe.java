/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceAWT;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class ClickMe extends Frame{

   ClickMe(String pageName, String buttonName){
       
       Button btnClickme = new Button(buttonName);
       btnClickme.setBounds(100, 50, 80, 50);
       
       add(btnClickme);
       setTitle(pageName);
       setSize(250, 250);
       setLayout(null);
       setVisible(true);
       
   }
   
}
