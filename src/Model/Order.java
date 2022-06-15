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
/**
 *
 * @author ARCHIE
 */
public class Order implements Rating{
    private int id;
    private String auth;    
    private String kategori;
    private int kuantitas;
    private String ukuran;
    private String design_gambar;
    private String keterangan;
    private String jenis_kain;    
    private String harga;
    private String status;
    private Pelanggan pelanggan;
    private DatabaseConnection db;
    
    public Order (){
        db = new DatabaseConnection();
        pelanggan = new Pelanggan();
    }
    
     public Order (String auth){
        db = new DatabaseConnection();
        pelanggan = new Pelanggan();
        this.auth = auth;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    
    public void setAuth(String auth){
        this.auth = auth;
    }

    public String getAuth(){
        return this.auth;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public String getKategori(){
        return this.kategori;
    }
    
    public void setHarga(String harga){
        this.harga = harga;
    }

    public String getHarga(){
        return this.harga;
    }
    
    
    public void setKuantitas(int kuantitas){
        this.kuantitas = kuantitas;
    }

    public int getKuantitas(){
        return this.kuantitas;
    }

    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }

    public String getUkuran(){
        return this.ukuran;
    }

    public void setDesign_gambar(String design_gambar){
        this.design_gambar = design_gambar;
    }

    public String getDesign_gambar(){
        return this.design_gambar;
    }

    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }

    public String getKeterangan(){
        return this.keterangan;
    }

    public void setJenis_kain(String jenis_kain){
        this.jenis_kain = jenis_kain;
    }

    public String getJenis_kain(){
        return this.jenis_kain;
    }
    
    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
    
    public void tambah_order(String auth, String penjahit, String kategori, int kuantitas, String ukuran, String jenis_kain, String keterangan, String gambar, String status){
        try {
            ResultSet users = db.query_filter("users", "username", auth);
            int id = 0;
            while (users.next()){
                id = users.getInt("id");
            }
            String column = "user_id, penjahit_username, kategori, kuantitas, ukuran, jenis_kain, keterangan, gambar, status";
            String value = "'" + String.valueOf(id) + "', '" + penjahit + "', '" + kategori + "', '" + kuantitas + "', '" + ukuran + "', '" + jenis_kain + "', '" + keterangan + "', '" + gambar + "', '" + status + "'";
            db.query_insert("orders", column, value);
            JOptionPane.showMessageDialog(null, "Pesanan berhasil dibuat!");
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Pesanan gagal dibuat!");
        }        
    }
    
    public void load_table(javax.swing.JTable tablePesanan) throws SQLException{
        try{
            DefaultTableModel tableModel = (DefaultTableModel) tablePesanan.getModel();
//            String auth = "test";
            String join = " JOIN orders ON users.id = orders.user_id ";
            ResultSet dataTable = db.query_filter("users", "users.username", auth, join);

            tableModel.setRowCount(0);

            while(dataTable.next()){
                setId(dataTable.getInt("orders.id"));
                String uname_penjahit = dataTable.getString("penjahit_username");
                setKategori(dataTable.getString("kategori"));
                setKuantitas(dataTable.getInt("kuantitas"));
                setUkuran(dataTable.getString("ukuran"));
                setJenis_kain(dataTable.getString("jenis_kain"));
                setKeterangan(dataTable.getString("keterangan"));
                setDesign_gambar(dataTable.getString("gambar"));
                setStatus(dataTable.getString("status"));
                tableModel.addRow(new Object[] {getId(), uname_penjahit, getKategori(),getKuantitas(),getUkuran(),getJenis_kain(),getKeterangan(), getDesign_gambar(), getStatus()});
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void detail_pesanan(String auth, javax.swing.JTable tablePesanan, javax.swing.JLabel text_nama, javax.swing.JLabel text_username, javax.swing.JLabel text_no_hp, javax.swing.JLabel text_gender, javax.swing.JLabel text_alamat) {
        try{
            DefaultTableModel tableModel = (DefaultTableModel) tablePesanan.getModel();
            String join = " JOIN users ON orders.user_id = users.id ";
            ResultSet dataTable = db.query_filter(" orders ", "orders.id", auth, join);
            tableModel.setRowCount(0);

            while(dataTable.next()){
                setKategori(dataTable.getString("kategori"));
                setKuantitas(dataTable.getInt("kuantitas"));
                setUkuran(dataTable.getString("ukuran"));                
                setJenis_kain(dataTable.getString("jenis_kain"));
                setDesign_gambar(dataTable.getString("gambar"));                
                setKeterangan(dataTable.getString("keterangan"));
                setHarga(dataTable.getString("harga"));
                setStatus(dataTable.getString("status"));
                pelanggan.setNama(dataTable.getString("users.nama"));
                pelanggan.setUsername(dataTable.getString("users.username"));
                pelanggan.setNo_hp(dataTable.getString("users.no_hp"));
                pelanggan.setGender(dataTable.getString("users.gender"));
                pelanggan.setAlamat(dataTable.getString("users.alamat"));
                text_nama.setText(pelanggan.getNama());
                text_username.setText(pelanggan.getUsername());
                text_no_hp.setText(pelanggan.getNo_hp());
                text_gender.setText(pelanggan.getGender());
                text_alamat.setText(pelanggan.getAlamat());

                
                tableModel.addRow(new Object[] {getKategori(), getKuantitas(), getUkuran(), getJenis_kain(), getDesign_gambar(), getHarga(), getStatus()});
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }
    
    public void batal_pesan(String auth){
        String statement = "status = 'dibatalkan' ";
        db.query_update("orders", statement, " id ", auth);
    }

    @Override
    public void penilaian(String id, String kualitas, String waktu, String pelayanan, String harga) {
        double indeks_kualitas = 0;
        double indeks_waktu = 0;
        double indeks_pelayanan = 0;
        double indeks_harga = 0;
        if(kualitas.equals("sangat suka")){
            indeks_kualitas = 1;
        }else if(kualitas.equals("suka")){
            indeks_kualitas = 0.5;
        }else{
            indeks_kualitas = 0;
        }
        
        if(waktu.equals("sangat suka")){
            indeks_waktu = 1;
        }else if(waktu.equals("suka")){
            indeks_waktu = 0.5;
        }else{
            indeks_waktu = 0;
        }
        
        if(pelayanan.equals("sangat suka")){
            indeks_pelayanan = 1;
        }else if(pelayanan.equals("suka")){
            indeks_pelayanan = 0.5;
        }else{
            indeks_pelayanan = 0;
        }
        
        if(harga.equals("sangat baik")){
            indeks_harga = 1;
        }else if(harga.equals("baik")){
            indeks_harga = 0.5;
        }else{
            indeks_harga = 0;
        }
        
        double nilai = indeks_kualitas * 0.27 + indeks_waktu * 0.27 + indeks_pelayanan * 0.22 + indeks_harga * 0.25;
        String column = " order_id, nilai ";
        String value = "'" + String.valueOf(id) + "', '" + String.valueOf(nilai)  + "'";
        db.query_insert("rating", column, value);
        
    }
    
    public boolean checker(String id){
        ResultSet data_rating = db.query_filter("rating", "order_id", id);
        try {
            while (data_rating.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void tabel_ranking(String auth, javax.swing.JTable ranking_penjahit){
            try {
                DefaultTableModel tableModel = (DefaultTableModel) ranking_penjahit.getModel();
                String data = "orders.id, users.nama, users.username, users.no_hp, users.alamat, round(AVG(rating.nilai), 2)*100 AS rank";
                String statement = " JOIN rating ON orders.id = rating.order_id  JOIN users ON orders.penjahit_username = users.username Group By users.username ORDER BY rank DESC;";
                ResultSet dataTable = db.query_select(" orders ", data, statement);
        
                tableModel.setRowCount(0);

                while(dataTable.next()){
                    String name = dataTable.getString("users.nama");
                    String username = dataTable.getString("users.username");                
                    String no_hp = dataTable.getString("users.no_hp");
                    String alamat = dataTable.getString("users.alamat");                
                    String rating = dataTable.getString("rank") + "%";


                    tableModel.addRow(new Object[] {name, username, no_hp, alamat, rating});
                }
            } catch (SQLException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
