/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author User
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.Action;
import javax.swing.JOptionPane;
import view.LogInView;
import model.DatabaseConnectionModel;
import sun.security.util.Password;

import model.*;
import view.*;

public class LogInController {

    DatabaseConnectionModel model;
    LogInView view;
    
    ResultSet resultSet;
    
    public LogInController(LogInView view, DatabaseConnectionModel model) {
        this.model = model;
        this.view = view;
        this.view.setSubmitButtonListener(new SubmitButtonListener());
    }
    
    class SubmitButtonListener implements ActionListener {
        ResultSet resultSet = null;
        String email = view.getMail();
        String password = String.valueOf(view.getPassword());
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                model.makeQuesry(
                        "Select * FROM EMPLOYEE WHERE "
                        + "email="+email
                        + " AND "
                        + " PASSWORD="+password+';'
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                if(resultSet==null) {
                    JOptionPane.showMessageDialog(null, "ERROR!");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Successful");
                }
            }
        }
    }
}
