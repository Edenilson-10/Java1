/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

/**
 *
 * @author Victor.Morales
 */
public class perfil {
    private String usuario;
    private String contraseña;
public perfil (){
    }
public perfil(String usuario, String contraseña){
    this.usuario = usuario;
    this.contraseña = contraseña;
}
public String getusuario(){
    return usuario;
}
public String getcontraseña(){
    return contraseña;
}
public void setusuario(String usuario){
    this.usuario = usuario;
}
public void setcontraseña(String contraseña){
    this.contraseña = contraseña;
}

}
