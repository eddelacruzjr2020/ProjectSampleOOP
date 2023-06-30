    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AWTMyLogin;

import java.awt.*;



/**
 *
 * @author Edmundo Dela Cruz
 */
public class AWTMyLogin {
    public static void main(String[] args){
    Frame frame = new Frame("My Login AWT");
    Label lblUsename = new Label("Username: ");
    Label lblPassword = new Label("Password: ");
    TextField txtFldUsername = new TextField(10);
    TextField txtFldPassword = new TextField(10);    
    Button btnClear = new Button("Clear");
    Button btnLogin = new Button("LogIn");
    
    lblUsename.setBounds(50, 50, 100, 30);
    lblPassword.setBounds(50, 100, 100, 30);
    txtFldUsername.setBounds(160, 50, 120, 30);
    txtFldPassword.setBounds(160, 100, 120, 30);
    btnClear.setBounds(80, 150, 80, 30);
    btnLogin.setBounds(170, 150, 80, 30);
    
    frame.add(lblUsename);
    frame.add(lblPassword);
    frame.add(txtFldUsername);
    frame.add(txtFldPassword);
    frame.add(btnClear);
    frame.add(btnLogin);
    
    frame.setSize(350, 260);
    frame.setLayout(null);
    frame.setVisible(true);
    
    }
    
    
}
