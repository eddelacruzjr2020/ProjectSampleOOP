/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTMyLoginTest;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */
public class Login {
    
    public static void main(String [] args){
        
        Frame frame = new Frame("My Login");
        
        Label lblUsername = new Label("Username:");
        lblUsername.setBounds(50, 50, 80, 30);
        frame.add(lblUsername);
        
        TextField txtFldUsername = new TextField();
        txtFldUsername.setBounds(130, 50, 80, 20);
        frame.add(txtFldUsername);
        
        Label lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 100, 80, 30);
        frame.add(lblPassword);
        
        Button btnLogin = new Button("LogIn");
        btnLogin.setBounds(70, 150, 50, 30);
        frame.add(btnLogin);
        
        Button btnClear = new Button("Clear");
        btnClear.setBounds(150, 150, 50, 30);
        frame.add(btnClear);
        
        TextField txtFldPassword = new TextField();
        txtFldPassword.setBounds(130, 100, 80, 20);
        frame.add(txtFldPassword);
        
        
        frame.setSize(350, 350);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
        
    }
    
}
