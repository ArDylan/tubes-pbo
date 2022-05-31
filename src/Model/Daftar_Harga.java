/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public class Daftar_Harga {
    public Admin Admin;
    private String kategori;
    private int harga;

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public String getKategori(){
        return this.kategori;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public int getHarga(){
        return this.harga;
    }

}
