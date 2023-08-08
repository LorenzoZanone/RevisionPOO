/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Venta {

    private ArrayList<Producto> producto = new ArrayList<Producto>();
    private Cliente cliente;
    private static int cantVentas;
    private int nroFact;
    private LocalDate fecha;

    public Venta(Cliente cliente, int nroFact, LocalDate fecha) {
        this.cliente = cliente;
        this.nroFact = nroFact;
        this.fecha = fecha;
    }

    public void agregarProducto(Producto p) {

    }

    public double calcularImporte() {

        return 0;
    }

}
