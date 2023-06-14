/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author ivann
 */
public class PilaListaCostoDetalle {
    public ListaCostosDetalle pila;
    
    public PilaListaCostoDetalle() {
        pila = null;
    }
    
    public void push(double pesoMinimo, double pesoMaximo, int zona, String servicio, double precio, String listaCostos) {
        ListaCostosDetalle nuevo = new ListaCostosDetalle(pesoMinimo, pesoMaximo, zona, servicio, precio, listaCostos);
        if (pila == null) {
            pila = nuevo;
        } else {
            ListaCostosDetalle aux = pila;
            pila = nuevo;
            nuevo.setCostoDetallesiguiente(aux);
        }
    }
    
    public void pop() {
        ListaCostosDetalle aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getCostoDetallesiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getCostoDetallesiguiente();
            }
        }
    }

}
