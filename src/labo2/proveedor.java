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
public class proveedor {
    private String producto;
    private String direccion;
    private int cel;
public proveedor (){
    }
public proveedor(String producto, String direccion, int cel){
    this.producto = producto;
    this.direccion = direccion;
    this.cel = cel;
}
public String getproducto(){
    return producto;
}
public String getdireccion(){
    return direccion;
}
public int getcel(){
    return cel;
}
public void setproducto(String producto){
    this.producto = producto;
}
public void setdireccion(String direccion){
    this.direccion = direccion;
} 
public void setcel(int cel){
    this.cel = cel;
}
}
