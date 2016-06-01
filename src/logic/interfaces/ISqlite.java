/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.interfaces;

/**
 *
 * @author seba
 */
public interface ISqlite {
    public abstract void createSQLiteDB(String sqliteDBPath);
    public abstract void createTableSQLiteDB(String sqliteDBPath);
    public abstract void insertResultSQLiteDB(String sqliteDBPath, String sql);
    public abstract void updateResultSQLiteDB(String sqliteDBPath, String sql);
}
