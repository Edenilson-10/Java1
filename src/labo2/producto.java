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
public class producto {
    private String nombre;
    private int cantidad;
    private int fechaven;
    private int precio;
public producto (){
    }
public producto(String nombre, int cantidad, int fechaven, int precio){
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.fechaven = fechaven;
    this.precio = precio;
}
public String getnombre(){
    return nombre;
}
public int getcantidad(){
    return cantidad;
}
public int getfechaven(){
    return fechaven;
}
public int getprecio(){
    return precio;
}
public void setnombre(String nombre){
    this.nombre = nombre;
}
public void setcantidad(int cantidad){
    this.cantidad = cantidad;
} 
public void setfechaven(int fechaven){
    this.fechaven = fechaven;
} 
public void setprecio(int precio){
    this.precio = precio;
} 
}
