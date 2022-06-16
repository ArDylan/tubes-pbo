/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.logging.Level;
import java.util.logging.Logger;
import utility.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ARCHIE
 */
public abstract class Login {
    private String username;
    private String password;
    DatabaseConnection db;
    
    public Login(){
        db = new DatabaseConnection();
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
    
//    public abstract String cek(String auth);
//    public abstract String cek(String username, String password);
    
     public String cek(String auth){
        try {
            ResultSet login = db.query_filter("users", "username", auth);
            while (login.next()){
                return login.getString("role");
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
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
            JOptionPane.showMessageDialog(null, "Username atau password salah!");
        return null;
    }   
   
    public abstract void run(String auth);
}
