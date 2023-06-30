/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyLogin;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Login {
       

 
        
    public static void main(String [] args){
        Frame frame = new Frame("My Login");
        
        Label lblUsername = new Label("Username:");
        lblUsername.setBounds(20, 50, 80, 20);
        frame.add(lblUsername);
        
        TextField txtfldUsername = new TextField();
        txtfldUsername.setBounds(100, 50, 120, 20);
        frame.add(txtfldUsername);
        
        Label lblPassword = new Label("Password:");
        lblPassword.setBounds(20, 100, 80, 20);
        frame.add(lblPassword);
        
        TextField txtfldPassword = new TextField();
        txtfldPassword.setBounds(100, 100, 120, 20);
        frame.add(txtfldPassword);
        
        Button btnLogin = new Button("LogIn");
        btnLogin.setBounds(70, 150, 50, 20);
        frame.add(btnLogin);
        
        Button btnClear = new Button("Clear");
        btnClear.setBounds(160, 150, 50, 20);
        frame.add(btnClear);
        
        frame.setSize(350,360);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
 
}   
    
    
 
