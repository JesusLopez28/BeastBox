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
public class PilaListaCosto {
    public ListaCostos pila;
    
    public PilaListaCosto() {
        pila = null;
    }
    
    public void push(String nombre, int areaRemota, int seguro, boolean paqueteFragil, int excesoPeso, boolean sobreDimension) {
        ListaCostos nuevo = new ListaCostos(nombre, areaRemota, seguro, paqueteFragil, excesoPeso, sobreDimension);
        if (pila == null) {
            pila = nuevo;
        } else {
            ListaCostos aux = pila;
            pila = nuevo;
            nuevo.setCostosiguiente(aux);
        }
    }
    
    public void pop() {
        ListaCostos aux = pila;
        if (pila == null) {
            System.out.println("La pila está vacía.");
        } else {
            if (aux.getCostosiguiente()== null) {
                pila = null;
            } else {
                pila = aux.getCostosiguiente();
            }
        }
    }
}
