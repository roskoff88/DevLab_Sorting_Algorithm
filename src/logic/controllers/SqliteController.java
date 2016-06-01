/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.controllers;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.interfaces.ISqlite;
import logic.persistence.sqliteClass;

/**
 *
 * @author seba
 */
public class SqliteController 
    implements ISqlite{

    @Override
    public void createSQLiteDB(String sqliteDBPath) {
        try {
            sqliteClass.createSQLiteDB(sqliteDBPath);
        } catch (Exception ex) {
            Logger.getLogger(SqliteController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }

    @Override
    public void createTableSQLiteDB(String sqliteDBPath) {
        try {
            sqliteClass.createTableSQLiteDB(sqliteDBPath);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }

    @Override
    public void insertResultSQLiteDB(String sqliteDBPath, String sql) {
        try {
            sqliteClass.insertResultSQLiteDB(sqliteDBPath, sql);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }

    @Override
    public void updateResultSQLiteDB(String sqliteDBPath, String sql) {
        try {
            sqliteClass.updateResultSQLiteDB(sqliteDBPath, sql);
        } catch (SQLException ex) {
            Logger.getLogger(SqliteController.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
    }
    
}
