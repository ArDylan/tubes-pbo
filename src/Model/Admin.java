/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ARCHIE
 */
public class Admin extends Login{
    public Admin(){
        super("test", "test");
        System.out.println("test");
    }
    public Admin(String username, String password) {
	super(username, password);
    }
}
