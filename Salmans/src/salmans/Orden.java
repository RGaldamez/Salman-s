/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class Orden {
    
    private ArrayList<Producto> listaProductos;
    private String numeroOrden;

    public Orden(ArrayList<Producto> listaProductos, String numeroOrden) {
        this.listaProductos = listaProductos;
        this.numeroOrden = numeroOrden;
    }

    public Orden() {
        listaProductos = new ArrayList();
    }
    
    public Orden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }
    
    public double getPrecioTotal(){
        double temp = 0;
        for (int i = 0; i < this.getListaProductos().size(); i++) {
            temp += this.getListaProductos().get(i).getPrecio();
        }
        return temp;
    }
    
    public int getTiempoTotal(){
        int temp =0;
        for (int i = 0; i < this.getListaProductos().size(); i++) {
            temp+= this.getListaProductos().get(i).getTiempo();
        }
        return temp;
        
    }
    
    
    
    
}
