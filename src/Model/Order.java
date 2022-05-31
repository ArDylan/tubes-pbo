/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public class Order {
    private String kategori;
    private int kuantitas;
    private int ukuran;
    private String design_gambar;
    private String keterangan;
    private String jenis_kain;
    private Pelanggan Pelanggan;

    public void setKategori(String kategori){
        this.kategori = kategori;
    }

    public String getKategori(){
        return this.kategori;
    }
    
    public void setKuantitas(int kuantitas){
        this.kuantitas = kuantitas;
    }

    public int getKuantitas(){
        return this.kuantitas;
    }

    public void setUkuran(int ukuran){
        this.ukuran = ukuran;
    }

    public int getUkuran(){
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
}
