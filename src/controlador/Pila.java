package controlador;

import javax.swing.JOptionPane;

public class Pila {

    protected final Object[] elementos;
    private int tamaño;
    private final int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new Object[capacidad];
        this.tamaño = 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public void push(Object elemento) {
        if (estaLlena()) {
            JOptionPane.showMessageDialog(null, "La pila está llena. No se puede apilar más elementos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public Object pop() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede desapilar ningún elemento.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        tamaño--;
        Object elemento = elementos[tamaño];
        elementos[tamaño] = null;
        return elemento;
    }

    public int tamaño() {
        return tamaño;
    }

    public Object[] imprimirPila() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede imprimir.", "Error", JOptionPane.ERROR_MESSAGE);
            return new Object[0];
        }
        Object[] arreglo = new Object[tamaño];
        System.arraycopy(elementos, 0, arreglo, 0, tamaño);
        return arreglo;
    }

    public Object buscarPorAtributo(Object atributo) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede buscar.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        for (int i = tamaño - 1; i >= 0; i--) {
            Object elemento = elementos[i];
            if (elemento.getClass().isArray()) {
                Object[] arreglo = (Object[]) elemento;
                if (arreglo.length > 0 && arreglo[0].equals(atributo)) {
                    return elemento;
                }
            } else {
                try {
                    java.lang.reflect.Field primerAtributo = elemento.getClass().getDeclaredFields()[0];
                    primerAtributo.setAccessible(true);
                    Object valorPrimerAtributo = primerAtributo.get(elemento);
                    if (valorPrimerAtributo.equals(atributo)) {
                        return elemento;
                    }
                } catch (IllegalAccessException | IndexOutOfBoundsException e) {
                }
            }
        }

        return null;
    }

}
