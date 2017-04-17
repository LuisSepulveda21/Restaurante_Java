package Modelo;

public class Nodo {

    double valor;
    String ped;
    Camarero ca;
    Mesa me;
    Alimento al;
    Nodo link;

    public Nodo() {
        valor = 0;
        link = null;

    }

    public Nodo(Camarero ca) {
        this.ca = ca;
        link = null;

    }

    //Constructores
    public Nodo(Mesa me) {
        this.me = me;
        link = null;

    }

    public Nodo(Alimento al) {
        this.al = al;
        link = null;

    }

    public Nodo(String ped, double valor) {
        this.valor = valor;
        this.ped = ped;
        link = null;
    }

    public Nodo(int valor, Nodo n) {

        this.valor = valor;

        link = n;

    }

}
