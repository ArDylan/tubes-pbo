/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public class Pelanggan extends Login {
    private String username;
    private String password;
    private String no_hp;
    private String nik;
    private String nama;
    private String gender;
    private String email;
    private String alamat;


    public Pelanggan(){
        super("test", "test");
        System.out.println("test");
    }
    public Pelanggan(String username, String password) {
		super(username, password);
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
}
