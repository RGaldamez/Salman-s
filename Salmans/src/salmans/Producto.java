/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;

/**
 *
 * @author rick
 */
public class Producto {
    
    // lista de ingredientes, un tiempo de preparación (medido en segundos), un nombre y un precio.
    private ArrayList<String> ingredientes;
    private int tiempo;
    private String nombre;
    private int precio;

    public Producto(ArrayList<String> ingredientes, int tiempo, String nombre, int precio) {
        this.ingredientes = ingredientes;
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(int tiempo, String nombre, int precio) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList();
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tiempo de Preparacion: " + tiempo + ", Precio: " + precio;
    }
    
    
    
    
    
}
