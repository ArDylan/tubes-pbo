/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public class Rating extends Order{
    private String pilihan;
    private String kriteria;

    public void setPilihan(String pilihan){
        this.pilihan = pilihan;
    }

    public String getPilihan(){
        return this.pilihan;
    }

    public void setKriteria(String kriteria){
        this.kriteria = kriteria;
    }

    public String getKriteria(){
        return this.kriteria;
    }
}
