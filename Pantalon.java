/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 *
 * @author ET36
 */
public class Pantalon extends Producto {

    private char talle;
    private String modelo;

    public Pantalon(char talle, String modelo, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
        this.modelo = modelo;
    }

  

    @Override
    public double getPrecio() {

        double precioFinal = 0;
        if ("Oxford".equals(modelo)) {
            precioFinal = precio + (precio * 15 / 100);

        } else if ("Skinny".equals(modelo)) {
            precioFinal = precio + (precio * 25 / 100);
        } else if ("Recto".equals(modelo)) {
            precioFinal = precio - (precio * 15 / 100);
        }

        return precioFinal;
    }

}
