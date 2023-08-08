/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciorevision;

import javax.swing.JOptionPane;

/**
 *
 * @author ET36
 */
public class ShopOnLine {

    public static void main(String[] args) {
        Cliente cliente = CrearCliente();
        HacerCompra(cliente);

    }

    public static Cliente CrearCliente() {
        String nombre;
        int dni;
        int telefono;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        dni = Integer.parseInt(JOptionPane.showInputDialog("Digite su dni"));
        telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de telefono"));

        Cliente cliente = new Cliente(nombre, dni, telefono);
        return cliente;
    }

    public static Remera CrearRemera(char talle, double precio, String desc) {
        Remera remera = new Remera(talle, desc, precio);
        return remera;
    }

    public static Pantalon CrearPantalon(String modelo, double precio, String desc, char talle) {
        Pantalon pantalon = new Pantalon(talle, modelo, desc, precio);
        return pantalon;
    }

    public static void HacerCompra(Cliente cliente) {
        int ingresar = 1;
        int opc = 0;
        char talle;
        double precio;
        String desc;
        double precioFinal;
        while (ingresar == 1) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer: 1 - Comprar remeras: - 2 Pantalon - 3 Accesorios"));
            switch (opc) {
                case 1:
                    talle = JOptionPane.showInputDialog("Digite el talle de su remera: S-M-L-XL").charAt(0);
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Digite su precio"));
                    desc = JOptionPane.showInputDialog("Diigte la discripccion");

                    Remera remera = CrearRemera(talle, precio, desc);
                    precioFinal = cliente.HacerCompra(remera);

                     {

                    }
                    break;
                case 2:
                    String modelo = JOptionPane.showInputDialog("Digite el modelo de su pantalon: a - Oxford -b Skinny - c- Recto");
                    talle = JOptionPane.showInputDialog("Digite el talle de su pantalon: S-M-L-XL").charAt(0);
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Digite su precio"));
                    desc = JOptionPane.showInputDialog("Diigte la discripccion");
                    Pantalon p = CrearPantalon(modelo, precio, desc, talle);
                    precioFinal = cliente.HacerCompra(p);

                    break;
                case 3:
                    precio= Double.parseDouble(JOptionPane.showInputDialog(""));
                    
                    
                    break;
                default:
                    break;
            }
        }
    }

}
