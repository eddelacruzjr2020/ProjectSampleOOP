package AWTActionListener;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edmundo Dela Cruz
 */
import java.awt.*;  
import java.awt.event.*;  
public class AEvent extends Frame implements ActionListener{  
TextField tf;  
Button b;
AEvent(){  
  
    //create components  
    tf=new TextField();  
    tf.setBounds(60,50,170,20);  
    b=new Button("click me");  
    b.setBounds(100,120,80,30);  

    //register listener  
    b.addActionListener(this);//passing current instance  

    //add components and set size, layout and visibility  
    add(b);add(tf);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true); 
    addWindowListener(new WindowAdapter(){
            
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        
    });
    }  

@Override
public void actionPerformed(ActionEvent e){  
tf.setText("Mabuhay");  
}  
public static void main(String args[]){  
    new AEvent();  
    }  
}  
