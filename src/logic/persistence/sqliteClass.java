/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.persistence;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.sqlite.SQLiteConnection;

/**
 *
 * @author seba
 */
public class sqliteClass {
 
    //Creo SQLite db
        public static void createSQLiteDB(String sqliteDBPath) throws SQLException
        {
            try
            {
                // register the driver 
                String sDriverName = "org.sqlite.JDBC";
                Class.forName(sDriverName);

                // now we set up a set of fairly basic string variables to use in the body of the code proper
                String sJdbc = "jdbc:sqlite";
                String sDbUrl = sJdbc + ":" + sqliteDBPath;
            }
            catch(Exception exc)
            {
                System.out.println(exc.getMessage() + "\n");
            }   
            
        }

        //Creo tabla SQLite
        public static void createTableSQLiteDB(String sqliteDBPath) throws SQLException
        {
            String sql = "CREATE TABLE SortingResults(ID INTEGER PRIMARY KEY AUTOINCREMENT, Date DATETIME, StartTime TIME, AlgorithmName VARCHAR(20),ExecutionTime TIME)";
            
            // register the driver 
            String sDriverName = "org.sqlite.JDBC";
            try{
                Class.forName(sDriverName);
            }catch(Exception exc){
            }

            // now we set up a set of fairly basic string variables to use in the body of the code proper
            String sJdbc = "jdbc:sqlite";
            String sDbUrl = sJdbc + ":" + sqliteDBPath;

            // ### Connect to the database
            int iTimeout = 30;
            
            // create a database connection
            Connection conn = DriverManager.getConnection(sDbUrl);
            try {
                Statement stmt = conn.createStatement();
                try {
                    stmt.setQueryTimeout(iTimeout);
                    stmt.executeUpdate(sql);
                } finally {
                    try { 
                        stmt.close(); 
                    } catch (Exception ignore) {
                    }
                }
            } finally {
                try { 
                    conn.close(); 
                } catch (Exception ignore) {
                }
            }
        }
        
        //Insert result on tabla SQLite
        public static void insertResultSQLiteDB(String sqliteDBPath, String sql) throws SQLException
        {
            // register the driver 
            String sDriverName = "org.sqlite.JDBC";
            try{
                Class.forName(sDriverName);
            }catch(Exception exc){
            }

            // now we set up a set of fairly basic string variables to use in the body of the code proper
            String sJdbc = "jdbc:sqlite";
            String sDbUrl = sJdbc + ":" + sqliteDBPath;

            // ### Connect to the database
            int iTimeout = 30;
            
            // create a database connection
            Connection conn = DriverManager.getConnection(sDbUrl);
            try {
                Statement stmt = conn.createStatement();
                try {
                    stmt.setQueryTimeout(iTimeout);
                    stmt.executeUpdate(sql); 
               } finally {
                    try { 
                        stmt.close(); 
                    } catch (Exception ignore) {
                    }
                }
            } finally {
                try { 
                    conn.close(); 
                } catch (Exception ignore) {
                }
            }
        }
        
        //Insert result on tabla SQLite
        public static void updateResultSQLiteDB(String sqliteDBPath, String sql) throws SQLException
        {
            // register the driver 
            String sDriverName = "org.sqlite.JDBC";
            try{
                Class.forName(sDriverName);
            }catch(Exception exc){
            }

            // now we set up a set of fairly basic string variables to use in the body of the code proper
            String sJdbc = "jdbc:sqlite";
            String sDbUrl = sJdbc + ":" + sqliteDBPath;

            // ### Connect to the database
            int iTimeout = 30;
            
            // create a database connection
            Connection conn = DriverManager.getConnection(sDbUrl);
            try {
                Statement stmt = conn.createStatement();
                try {
                    stmt.setQueryTimeout(iTimeout);
                    ResultSet rs = stmt.executeQuery(sql);
                    try {
                        while(rs.next()){
                            String sResult = rs.getString("response");
                            System.out.println(sResult);
                        }
                    } 
                    catch (SQLException exc){
                    
                    }
                    finally {
                        try { 
                            rs.close(); 
                        } catch (Exception ignore) {
                        }
                    }
                } finally {
                    try { 
                        stmt.close(); 
                    } catch (Exception ignore) {
                    }
                }
            } finally {
                try { 
                    conn.close(); 
                } catch (Exception ignore) {
                }
            }
        }
}
