package Modelo;

public class Alimento {

    private String tipo;

    private String precio;
    private String nombre;

    //Este me indica el numero de platos creado
    private int numero;

    //Y este me indica cuantas veces se compro en el restaurante
    private int contador;

    private int id;

    public Alimento(String tipo, String precio, String nombre, int unidades) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.numero = unidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero() {
        numero++;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public int getContador() {
        return contador;
    }

    public void setContador() {
        contador++;
        numero = numero - 1;

    }

}
