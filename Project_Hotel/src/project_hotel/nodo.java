package project_hotel;

public class nodo {
    public nodo siguiente;
    public int valor;
    public usuario dato;

    public nodo(usuario dato, nodo siguiente) {
        this.siguiente = siguiente;
        this.valor = 0;
        this.dato = dato;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public usuario getDato() {
        return dato;
    }

    public void setDato(usuario dato) {
        this.dato = dato;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}