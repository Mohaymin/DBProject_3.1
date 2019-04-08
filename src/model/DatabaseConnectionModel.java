/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DatabaseConnectionModel {

    private Statement statement;

    public DatabaseConnectionModel() {
        connectDB();
    }
    
    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=AIR_TICKET_MANAGEMENT;"
                    + "selectMethod=cursor",
                    "sa",
                    "123456"
            );

            statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT FirstName FROM Customer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet makeQuesry(String string) {
        try {
            return statement.executeQuery(string);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnectionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void executePreparedStatement(PreparedStatement preparedStatement) {
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnectionModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/******************************************************************************
 * package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectMSSQL {

    public void connectDB() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=FLY_SKY;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT FirstName FROM Customer");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

*******************************************************************************/