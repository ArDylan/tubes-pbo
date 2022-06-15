/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public interface Rating{
    float kualitas = 0.27f;
    float waktu = 0.27f;
    float pelayanan = 0.27f;
    float harga = 0.27f;
    void penilaian(String id, String kualitas, String waktu, String pelayanan, String harga);
}
