/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author User
 */
public class CustomizedJFrame extends JFrame {

    public CustomizedJFrame() {
        setUpFrame();
    }

    private void setUpFrame() {
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setBounds(400, 200, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Fly-Sky: Air Ticket Management");
    }
}
