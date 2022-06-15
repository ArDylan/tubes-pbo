/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ARCHIE
 */
public class DatabaseConnection {
    Connection conn;
    private ResultSet result;
    public PreparedStatement pst;
    public String query;
     
    public Connection conn(){
        try{
            Class .forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/jasa_jahit", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return conn;
    }
    
    public ResultSet query_select(String table){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ResultSet query_select(String table, String statement){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table + " " + statement);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ResultSet query_select(String table,String data, String statement){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT " + data + " FROM " + table + " " + statement);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    
    public ResultSet query_filter(String table, String column, String option){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table + " WHERE " + column + " = '" + option + "'");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ResultSet query_filter(String table, String column, String option, String join){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table + join + " WHERE " + column + " = '" + option + "'");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public ResultSet query_filter(String table, String column, String option, String join, String argumen){
        try{
            Statement stm = conn().createStatement();
            result = stm.executeQuery("SELECT * FROM " + table + join + " WHERE " + column + " = '" + option + "'" + argumen);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
    public void query_insert(String table, String column, String value){
        try{
            query = ("INSERT INTO "+ table + "("+ column +") values" + " ("+ value +") ");    
            pst = conn().prepareStatement(query);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
       public void query_update(String table, String statement, String column, String option){
        try{
            query = ("UPDATE "+ table + " SET " + statement + " WHERE " + column + " = '" + option + "'");    
            pst = conn().prepareStatement(query);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void query_delete(String table, String head, String value){
        try{
            query = ("INSERT INTO "+ table + "("+ head +") values" + " ("+ value +") ");    
            pst = conn().prepareStatement(query);
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
