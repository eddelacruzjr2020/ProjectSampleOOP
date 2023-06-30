/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SwingFir;

import javax.swing.*;

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
        
        JFrame f = new JFrame("My Login Page");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 300);
        
        JLabel lblUsername = new JLabel("Username: ");
        lblUsername.setBounds(50, 50, 80, 20);
        
        JLabel lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(50, 100, 80, 20);
        
//        JTextField tfdUsername = new JTextField();
//        tfdUsername.setBounds(130, 50, 120, 20);
//        
//        JPasswordField pfdPassword = new JPasswordField();
//        pfdPassword.setBounds(130, 100, 120, 20);
        
//        JButton btnLogin = new JButton("Login");
//        btnLogin.setBounds(80, 150, 50, 20);
//        
//        JButton btnClear = new JButton("Clear");
//        btnClear.setBounds(150, 150, 50, 20);
                
        f.add(lblUsername);
        f.add(lblPassword);
//        f.add(tfdUsername);
//        f.add(pfdPassword);
//        f.add(btnLogin);
//        f.add(btnClear);
       
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);
    }
    
    
    
}
