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
public class facturas {
    private String nomproducto;
    private int inversion;
    private int fecha;
public facturas (){
    }
public facturas(String nomproducto, int inversion, int fecha){
    this.nomproducto = nomproducto;
    this.inversion = inversion;
    this.fecha = fecha;
}
public String getnomproducto(){
    return nomproducto;
}
public int getinversion(){
    return inversion;
}
public int getfecha(){
    return fecha;
}
public void setnomproducto(String nomproducto){
    this.nomproducto = nomproducto;
}
public void setinversion(int inversion){
    this.inversion = inversion;
} 
public void setfecha(int fecha){
    this.fecha = fecha;
}
}
