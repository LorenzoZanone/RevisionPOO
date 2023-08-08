/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 *
 * @author ET36
 */
public class Remera extends Producto {

    private char talle;

    public Remera(char talle, String desc, double precio) {
        super(desc, precio);
        this.talle = talle;
    }

   

    @Override
    public double getPrecio() {
        double precioFinal;
        if (talle == 'S') {
            precioFinal = precio + (precio * 5 / 100);

        } else if (talle == 'M') {
            precioFinal = precio + (precio * 10 / 100);
        } else if (talle == 'L') {
            precioFinal = precio + (precio * 15 / 100);
        } else {
            precioFinal = precio + (precio * 20 / 100);
        }

        return precioFinal;
    }

}
