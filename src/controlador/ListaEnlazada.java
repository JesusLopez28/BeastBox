package controlador;

import javax.swing.JOptionPane;
import modelo.Usuario;

public class ListaEnlazada {

    private class Nodo {

        Object elemento;
        Nodo siguiente;

        public Nodo(Object elemento) {
            this.elemento = elemento;
            this.siguiente = null;
        }
    }

    private Nodo inicio;
    private int tamaño;
    private final int capacidad;

    public ListaEnlazada(int capacidad) {
        this.capacidad = capacidad;
        this.inicio = null;
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

    public void insertar(Object elemento) {
        if (estaLlena()) {
            JOptionPane.showMessageDialog(null, "La lista está llena. No se puede insertar más elementos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Nodo nuevoNodo = new Nodo(elemento);
        if (estaVacia()) {
            inicio = nuevoNodo;
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
        tamaño++;
    }

    public Object eliminar(Object elemento) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No se puede eliminar ningún elemento.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        Object elementoEliminado = null;
        if (inicio.elemento.equals(elemento)) {
            elementoEliminado = inicio.elemento;
            inicio = inicio.siguiente;
        } else {
            Nodo nodoActual = inicio;
            while (nodoActual.siguiente != null) {
                if (nodoActual.siguiente.elemento.equals(elemento)) {
                    elementoEliminado = nodoActual.siguiente.elemento;
                    nodoActual.siguiente = nodoActual.siguiente.siguiente;
                    break;
                }
                nodoActual = nodoActual.siguiente;
            }
        }
        if (elementoEliminado != null) {
            tamaño--;
        }
        return elementoEliminado;
    }

    public int tamaño() {
        return tamaño;
    }

    public Object[] imprimirLista() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No se puede imprimir.", "Error", JOptionPane.ERROR_MESSAGE);
            return new Object[0];
        }
        Object[] arreglo = new Object[tamaño];
        Nodo nodoActual = inicio;
        int indice = 0;
        while (nodoActual != null) {
            arreglo[indice] = nodoActual.elemento;
            nodoActual = nodoActual.siguiente;
            indice++;
        }
        return arreglo;
    }

    public Object buscarPorAtributo(Object atributo) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía. No se puede buscar.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Nodo nodoActual = inicio;
        while (nodoActual != null) {
            Object elemento = nodoActual.elemento;
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
            nodoActual = nodoActual.siguiente;
        }

        return null;
    }

    public Usuario login(String user, String password) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista de usuarios está vacía. No se puede realizar el login.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Nodo nodoActual = inicio;
        while (nodoActual != null) {
            Usuario usuario = (Usuario) nodoActual.elemento;
            if (usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
                return usuario;
            }
            nodoActual = nodoActual.siguiente;
        }

        return null;
    }

    public Usuario recuperarContraseña(String user, String pregunta, String respuesta) {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista de usuarios está vacía. No se puede recuperar la contraseña.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        Nodo nodoActual = inicio;
        while (nodoActual != null) {
            Usuario usuario = (Usuario) nodoActual.elemento;
            if (usuario.getUser().equals(user) && usuario.getPregunta().equals(pregunta) && usuario.getRespuesta().equals(respuesta)) {
                return usuario;
            }
            nodoActual = nodoActual.siguiente;
        }

        return null;
    }
}
