/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jonathan
 */
public class Database {
    
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/chat";
    private Connection conn;

    public Database() {
        
        try {
            Class.forName(classname);
            this.conn = DriverManager.getConnection(url, "root", "");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    public Connection getConnection(){
        return this.conn;
    }
    
    
    
}
