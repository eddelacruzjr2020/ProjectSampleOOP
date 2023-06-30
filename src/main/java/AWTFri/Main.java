/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AWTFri;

import java.awt.*;

/**
 *
 * @author Edmundo Dela Cruz
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame f = new Frame("Login Page");
        f.setSize(400, 300);
        
        Label lblUsername = new Label("Username: ");
        lblUsername.setBounds(50, 50, 80, 20);
        
        Label lblPassword = new Label("Password: ");
        lblPassword.setBounds(50, 100, 80, 20);
        
        TextField tfUsername = new TextField();
        tfUsername.setBounds(130, 50, 120, 20);
       
        TextField tfPassword = new TextField();
        tfPassword.setBounds(130, 100, 120, 20);
        
        Button btnLogin = new Button("Login");
        btnLogin.setBounds(80, 150, 50, 20);
        
        Button btnClear = new Button("Clear");
        btnClear.setBounds(150, 150, 50, 20);
        
        f.add(lblUsername);
        f.add(lblPassword);
        f.add(tfUsername);
        f.add(tfPassword);
        f.add(btnLogin);
        f.add(btnClear);
        
        f.setLayout(null);
        f.setResizable(false);
        f.setVisible(true);
        
    }
    
}
