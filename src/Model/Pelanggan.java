/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utility.DatabaseConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import View.Pemesanan;
/**
 *
 * @author ARCHIE
 */
public class Pelanggan extends Login {
    private String auth;
    private String username;
    private String password;
    private String no_hp;
    private String nik;
    private String nama;
    private String gender;
    private String email;
    private String alamat;
    private DatabaseConnection db;


    public Pelanggan(){
//        super("test", "test");
        db = new DatabaseConnection();
    }
    public Pelanggan(String auth) {
//        super(username, password);
        this.auth = auth;
        db = new DatabaseConnection();
    }
    
    public void setAuth(String auth){
        this.auth = auth;
    }

    public String getAuth(){
        return this.auth;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setNo_hp(String no_hp){
        this.no_hp = no_hp;
    }

    public String getNo_hp(){
        return this.no_hp;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getNik(){
        return this.nik;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return this.alamat;
    }
    
//    @Override
//    public String cek(String auth){
//        try {
//            ResultSet login = db.query_filter("users", "username", auth);
//            while (login.next()){
//                return login.getString("role");
//            }
//        } catch (java.sql.SQLException ex) {
//            Logger.getLogger(Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//    
//    @Override
//    public String cek(String username, String password){
//        try {
//            String statement = " WHERE username = '" + username + "' AND password = '" + password + "'";
//            ResultSet login = db.query_select("users", statement);
//            while (login.next()){
//                return login.getString("role");
//            }
//        } catch (java.sql.SQLException ex) {
//            Logger.getLogger(Pelanggan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            JOptionPane.showMessageDialog(null, "Username atau password salah!");
//        return null;
//    }   
    
    @Override
    public void run(String auth){
        new Pemesanan(auth).setVisible(true);
    }
    
    public void register(String nama, String username, String password, String no_hp, String nik, String gender, String alamat, String role){
        String column = "nama, username, password, no_hp, nik, gender, alamat, role";
        String value = "'" +nama + "', '" + username + "', '" + password + "', '" + no_hp + "', '" + nik + "', '" + gender + "', '" + alamat + "', '" + role + "'";
        db.query_insert("users", column, value);
    }
    
    public String[] show_penjahit(){
        try{
            ResultSet data_penjahit = db.query_filter("users", "role", "penjahit");
            ArrayList<String> penjahit = new ArrayList<String>();
            int index = 0;
            while(data_penjahit.next()){
                penjahit.add(data_penjahit.getString("username"));
                index++;
            }
            
            String array[] = new String[penjahit.size()];
            for(int j =0;j<penjahit.size();j++){
		 array[j] = penjahit.get(j);
            }
            return array;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
