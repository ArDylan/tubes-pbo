/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ARCHIE
 */
public class DatabaseConnection {
    Connection conn;
     
    public static Connection conn(){
        try{
            Class .forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/jasa_jahit", "root", "");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
