/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author Ivan
 */
public class Tarea6EDClase {

    public final double DESCUENTO1 = 0.8;
    public final double REDUCCION = 5;
    public final int NUMERO_PRODUCTOS = 3;
    public final double DESCUENTO2 = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > NUMERO_PRODUCTOS) {
            precioProducto -= REDUCCION;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO1;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO2;
            mostrarTotal(total);
        }

    }
    

    public void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}

