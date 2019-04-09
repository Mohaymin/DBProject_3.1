package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import view.LogInView;
import model.DatabaseConnectionModel;
import controller.LogInController;

public class LogIn {
    public LogIn() {
        DatabaseConnectionModel model = new DatabaseConnectionModel();
        LogInView logInView = new LogInView();
        LogInController controller = new LogInController(logInView, model);
    }
}
