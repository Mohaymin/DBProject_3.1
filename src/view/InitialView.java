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

/**
 *
 * @author User
 */
//public class InitialView extends JFrame {
public class InitialView {
    
    private final JFrame jFrame;
    private JButton loginBtn, signupBtn;
    
    public InitialView() {
        jFrame = new CustomizedJFrame();
        initializeButtons();
        addItemsToFrame();
    }
    
    private void initializeButtons() {
        loginBtn = new JButton("Log In");
        signupBtn = new JButton("Sign Up");
        loginBtn.setBounds(350, 100, 100, 20);
        signupBtn.setBounds(350, 150, 100, 20);
        addBtnActionListener();
    }
    private void addBtnActionListener() {
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new LogInView();
            }
        });
        signupBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //new
            }
        });
    }
    
    private void addItemsToFrame() {
        jFrame.add(loginBtn);
        jFrame.add(signupBtn);
    }
}
