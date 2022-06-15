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
/**
 *
 * @author ARCHIE
 */
public abstract class Login {
    private String username;
    private String password;
    DatabaseConnection db;


//    public Login(String username, String password){
//	this.username = username;
//	this.password = password;
//    }

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
    
    public abstract String cek(String username, String password);
    
    public abstract void run(String auth);
}
