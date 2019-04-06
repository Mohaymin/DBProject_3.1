/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class LogInView extends JFrame {
    
    private final JFrame jFrame;
    
    private final JTextField userMail;

    private final JPasswordField userPassword;
    
    private final JButton jButton;
    
    private final JLabel emailLabel;
    private final JLabel passwordLabel;
    
    public LogInView() {
        jFrame = new CustomizedJFrame();
        userMail = new JTextField();
        userPassword = new JPasswordField();
        jButton = new JButton("Submit");
        emailLabel = new JLabel("Email: ");
        passwordLabel = new JLabel("Password: ");
        addAttributes();
        addActionListeners();
        addItemsToFrame();
    }
    

    private void addAttributes() {
        emailLabel.setBounds(50, 50, 60, 20);
        passwordLabel.setBounds(50, 80, 70, 20);
        jButton.setBounds(50, 110, 90, 20);
        userMail.setBounds(130, 50, 100, 20);
        userPassword.setBounds(130, 80, 100, 20);
    }

    private void addActionListeners() {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jFrame.setVisible(false);
            }
        });
    }

    private void addItemsToFrame() {
        jFrame.add(emailLabel);
        jFrame.add(passwordLabel);
        jFrame.add(userMail);
        jFrame.add(userPassword);
        jFrame.add(jButton);
    }
}
