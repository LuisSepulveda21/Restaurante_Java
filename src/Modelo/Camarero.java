/*

 */
package Modelo;

public class Camarero {

    private MiLista mesas;
    private int numero;
    private int gestion;

    Camarero(int numero) {
        this.numero = numero;
        mesas = new MiLista();
    }

    public void setMesa(int id) {
        getMesas().add(new Mesa(id));
    }

    public int getId() {
        return numero;
    }

    public MiLista getMesas() {
        return mesas;
    }

    public int getGestion() {
        return gestion;
    }

    public void setGestion() {
        gestion++;
    }

}
