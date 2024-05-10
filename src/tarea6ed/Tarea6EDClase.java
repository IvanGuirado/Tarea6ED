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
    
    // Constantes de clase para definir el primer descuento aplicable, 
    //la reducción de precio,
    // el número de productos a partir del cual se aplica la reducción, 
    //y el segundo descuento.
    public final double DESCUENTO1 = 0.8;
    public final double REDUCCION = 5;
    public final int NUMERO_PRODUCTOS = 3;
    public final double DESCUENTO2 = 0.95;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        // Si la cantidad de productos supera el número establecido, 
        //se aplica una reducción al precio.
        if (numProductos > NUMERO_PRODUCTOS) {
            precioProducto -= REDUCCION;
        }
        // Si hay al menos un producto, se aplica un descuento del 20% al
        //precio después de cualquier reducción.
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO1;
            mostrarTotal(total);
        } else {
            // Si no hay productos, se aplica un descuento del 5% al precio 
            //original.
            total = precioProducto * DESCUENTO2;
            mostrarTotal(total);
        }

    }
    
 // Método para mostrar el total a pagar en la consola.
    public void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
