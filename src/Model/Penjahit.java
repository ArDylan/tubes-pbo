/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utility.DatabaseConnection;
import View.Beranda_Penjahit;

/**
 *
 * @author ARCHIE
 */
public class Penjahit extends Login {
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
    public Order order;



    public Penjahit(){
//        super("test", "test");
//        System.out.println("test");

        db = new DatabaseConnection();
        order = new Order();
    }
    
    public Penjahit(String auth){
        this.auth = auth;
        db = new DatabaseConnection();
        order = new Order();
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
        try {
            new Beranda_Penjahit(auth).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Penjahit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void register(String nama, String username, String password, String no_hp, String nik, String gender, String alamat, String role){
        String column = "nama, username, password, no_hp, nik, gender, alamat, role";
        String value = "'" +nama + "', '" + username + "', '" + password + "', '" + no_hp + "', '" + nik + "', '" + gender + "', '" + alamat + "', '" + role + "'";
        db.query_insert("users", column, value);
    }
    
    public String[] show_pelanggan(){
        try{
            ResultSet data_penjahit = db.query_filter("orders", "penjahit_username", getAuth());
            ArrayList<String> pelanggan = new ArrayList<String>();
            while(data_penjahit.next()){
                if (data_penjahit.getString("status").equals("pending") || data_penjahit.getString("status").equals("proses") ){
                    pelanggan.add(String.valueOf(data_penjahit.getInt("id")));
                }
            }
            
            String array[] = new String[pelanggan.size()];
            for(int j =0;j<pelanggan.size();j++){
		 array[j] = pelanggan.get(j);
            }
            return array;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
     public String[] show_riwayat_detail(){
        try{
            ResultSet data_penjahit = db.query_filter("orders", "penjahit_username", getAuth());
            ArrayList<String> pelanggan = new ArrayList<String>();
            while(data_penjahit.next()){
                if (data_penjahit.getString("status").equals("selesai") || data_penjahit.getString("status").equals("dibatalkan") ){
                    pelanggan.add(String.valueOf(data_penjahit.getInt("id")));
                }
            }
            
            String array[] = new String[pelanggan.size()];
            for(int j =0;j<pelanggan.size();j++){
		 array[j] = pelanggan.get(j);
            }
            return array;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public void load_table(javax.swing.JTable tablePesanan) throws SQLException{
        try{
            DefaultTableModel tableModel = (DefaultTableModel) tablePesanan.getModel();
            String join = " JOIN users ON orders.user_id = users.id ";
            ResultSet dataTable = db.query_filter(" orders ", "penjahit_username", getAuth(), join);

            tableModel.setRowCount(0);

            while(dataTable.next()){
                if(!dataTable.getString("status").equals("selesai") && !dataTable.getString("status").equals("dibatalkan")){
                    int id = dataTable.getInt("orders.id");
                    setUsername(dataTable.getString("username"));               
                    setNama(dataTable.getString("nama"));                
                    order.setKategori(dataTable.getString("kategori"));
                    order.setStatus(dataTable.getString("status"));

                    tableModel.addRow(new Object[] {id, getUsername(), getNama(), order.getKategori(), order.getStatus()});
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
      public void riwayat_table(javax.swing.JTable tablePesanan) throws SQLException{
        try{
            DefaultTableModel tableModel = (DefaultTableModel) tablePesanan.getModel();
            String join = " JOIN users ON orders.user_id = users.id ";
            ResultSet dataTable = db.query_filter(" orders ", "penjahit_username", getAuth(), join);

            tableModel.setRowCount(0);

            while(dataTable.next()){
                if (dataTable.getString("status").equals("selesai") || dataTable.getString("status").equals("dibatalkan") ){
                    int id = dataTable.getInt("orders.id");
                    setUsername(dataTable.getString("username"));               
                    setNama(dataTable.getString("nama"));                
                    order.setKategori(dataTable.getString("kategori"));
                    order.setStatus(dataTable.getString("status"));

                    tableModel.addRow(new Object[] {id, getUsername(), getNama(), order.getKategori(), order.getStatus()});
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void detail_pesanan(String auth, javax.swing.JTable tablePesanan, javax.swing.JTextArea input_deskripsi) {
        try{
            DefaultTableModel tableModel = (DefaultTableModel) tablePesanan.getModel();
            String join = " JOIN users ON orders.user_id = users.id ";
            ResultSet dataTable = db.query_filter(" orders ", "orders.id", auth, join);
            tableModel.setRowCount(0);

            while(dataTable.next()){
                order.setKategori(dataTable.getString("kategori"));
                order.setKuantitas(dataTable.getInt("kuantitas"));
                order.setUkuran(dataTable.getString("ukuran"));                
                order.setJenis_kain(dataTable.getString("jenis_kain"));
                order.setDesign_gambar(dataTable.getString("gambar"));                
                order.setKeterangan(dataTable.getString("keterangan"));
                order.setStatus(dataTable.getString("status"));
                input_deskripsi.setText(order.getKeterangan());
                setNama(dataTable.getString("users.nama"));
                setUsername(dataTable.getString("users.username"));
                setNo_hp(dataTable.getString("users.no_hp"));
                setGender(dataTable.getString("users.gender"));
                setAlamat(dataTable.getString("users.alamat"));

                
                tableModel.addRow(new Object[] {order.getKategori(), order.getKuantitas(), order.getUkuran(), order.getJenis_kain(), order.getDesign_gambar(), order.getStatus()});
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }

    public void terima_pesanan(String id, String harga){
        String statement = "harga = '" + harga +"', status = 'proses' ";
        db.query_update("orders", statement, " id ", id);
    }
    
    public void tolak_pesanan(String id){
        String statement = " status = 'dibatalkan' ";
        db.query_update("orders", statement, " id ", id);
    }
    
    public void selesaikan_pesanan(String id){
        String statement = " status = 'selesai' ";
        db.query_update("orders", statement, " id ", id);
    }

    
}