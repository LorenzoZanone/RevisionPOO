/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 *
 * @author ET36
 */
public class Accesorio extends Producto{
    
   private  double peso;
    private String metal;

    public Accesorio(double peso, String metal, String desc, double precio, int codigo) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }

   
    @Override
    public double getPrecio() {
        return precio;

    }
    
    
    
 
}
