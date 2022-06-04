/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Login;
import View.login;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARCHIE
 */
public class LoginController extends Login{
    public Statement st;
    public ResultSet rs;
    Connection cn = utility.DatabaseConnection.conn();
    String sql = "SELECT * FROM users";
    
    public LoginController(String username, String password) {
        super(username, password);
        try {
            this.st = cn.createStatement();
            this.rs = st.executeQuery(this.sql);
            while(this.rs.next()){
                if(username.equals(this.rs.getString(2))){
                    System.out.println("berhasil");
                    if(password.equals(this.rs.getString(3))){
                    }else{
                        System.out.println("password salah");
                    }
                }else{
                    System.out.println("username salah");
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
