/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DatabaseConnection;

/**
 *
 * @author ARCHIE
 */
public class Admin extends Login{
    private String username;
    private String password;
    private DatabaseConnection db;

    public Admin(){
//        super("test", "test");
        System.out.println("test");
        db = new DatabaseConnection();
    }
    public Admin(String username, String password) {
//	super(username, password);
    }  
    
        
    @Override
    public String cek(String username, String password){
        try {
            String statement = " WHERE username = '" + username + "' AND password = '" + password + "'";
            ResultSet login = db.query_select("users", statement);
            while (login.next()){
                return login.getString("role");
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public void run(String auth){
        
    }
        
}
