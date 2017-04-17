/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Restaurante {

    private Almacen Almacen;
    private Almacen BodegaAlimentos;
    private MiLista Camareros;
    private MiLista Mesas;
    private MiLista Alimentos;

    public int NumerosOrden = 0;
    private int NumerosAlimento = 0;

    public Restaurante() throws IOException {
        String ruta = "MisArchivos/BodegaAlmacen.txt";

        String ruta2 = "MisArchivos/BodegaAlimentos.txt";

        Almacen = new Almacen(ruta);
        BodegaAlimentos = new Almacen(ruta2);

        Camareros = new MiLista();
        Mesas = new MiLista();
        Alimentos = new MiLista();
        for (int i = 1; i < 21; i++) {
            Mesas.add(new Mesa(i));
        }
        for (int i = 1; i < 6; i++) {
            Camareros.add(new Camarero(i));
        }

        //Alimentos por defecto
        AlimentosIniciales();

    }

    public Mesa getInfoMesa(int id) {

        if (getMesas().RetornarMesa(id).getId() == id) {
            System.out.println("3nj");
            return getMesas().RetornarMesa(id);

        }
        return null;

    }

    //Obtener informacion de alimento en especifico
    public Alimento getInfoAlimento(String nombre) {

        Alimento ali = getAlimentos().RetornarAlimento(nombre);

        if (ali != null) {
            if (ali.getNombre().equals(nombre)) {
                System.out.println("3nj");
                return getAlimentos().RetornarAlimento(nombre);

            }
        }
        return null;
    }

    public void AlimentosIniciales() throws FileNotFoundException, IOException {
        getBodegaAlimentos().setAlimentosIni(getAlimentos(), this);
    }

    public void AgregarAlimento(String tipo, String precio, String nombre, int unidades) throws IOException {
        getBodegaAlimentos().AgregarAlimentos(tipo, precio, nombre, unidades, getAlimentos(), this);
    }

    public void BorrarMesa(Mesa m) {

        int Ventas = m.getVentas() + 1;

        int miId = m.getId();

        m.getCamarero().setGestion();

        m.getCamarero().getMesas().Eliminar(m.getId());

        m = new Mesa(miId);
        m.setVentas(Ventas);
        getMesas().add(m);

    }

    public void AgregarIngredientesAlmacen(DefaultTableModel model, int fila) throws IOException {
        getAlmacen().setProductos(model, fila);

    }

    public void getIngredientesAlmacen(DefaultTableModel model) throws FileNotFoundException {
        getAlmacen().getProductos(model);
    }

    public void ModificarAlmacen(int unidades, String nombre, DefaultTableModel model, int fila) throws IOException {
        getAlmacen().Modificar(unidades, nombre, model, fila);
    }

    public Almacen getAlmacen() {
        return Almacen;
    }

    public Almacen getBodegaAlimentos() {
        return BodegaAlimentos;
    }

    public MiLista getCamareros() {
        return Camareros;
    }

    public MiLista getMesas() {
        return Mesas;
    }

    public MiLista getAlimentos() {
        return Alimentos;
    }

    public int getNumerosAlimento() {
        return NumerosAlimento;
    }

    public void setNumerosAlimento() {
        NumerosAlimento++;
    }

    //Funciones para el fin del dia
    public void Fin(JLabel ventas, JLabel plato, JLabel Camarero, DefaultTableModel model, JLabel MenosVendido, JLabel Agotados) {

        ventas.setText(String.valueOf(NumerosOrden));

        Alimento aux1 = null;
        int aux = -2;

        for (int i = 0; i < getAlimentos().size(); i++) {
            if (getAlimentos().RetornarAlimento(i).getContador() > aux) {
                aux = getAlimentos().RetornarAlimento(i).getContador();
                aux1 = getAlimentos().RetornarAlimento(i);
            }
        }

        plato.setText(aux1.getNombre() + ", con un numero de ventas de: " + String.valueOf(aux));

        aux = -2;
        Camarero aux2 = null;

        for (int i = 1; i < Camareros.size(); i++) {
            if (Camareros.getCamarero(i).getGestion() > aux) {
                aux = Camareros.getCamarero(i).getGestion();
                aux2 = Camareros.getCamarero(i);
            }

        }

        Alimento aux3 = null;
        int aux4 = 99999;

        for (int i = 0; i < getAlimentos().size(); i++) {
            if (getAlimentos().RetornarAlimento(i).getContador() > 0) {
                if (getAlimentos().RetornarAlimento(i).getContador() < aux4) {
                    aux4 = getAlimentos().RetornarAlimento(i).getContador();
                    aux3 = getAlimentos().RetornarAlimento(i);
                }
            }
        }

        MenosVendido.setText(aux3.getNombre() + ", con un numero de ventas de: " + String.valueOf(aux4));

        Camarero.setText("# " + aux2.getId());

        try {
            for (int i = 1; i < Mesas.size(); i++) {
                if (Mesas.RetornarMesa(i).getVentas() > 0) {
                    model.addRow(new Object[]{Mesas.RetornarMesa(i).getId(), Mesas.RetornarMesa(i).getVentas()});
                }
            }
        } catch (Exception ex) {
        }

        String agotados = "";
        boolean enter = false;

        for (int i = 0; i < getAlimentos().size(); i++) {
            if (getAlimentos().RetornarAlimento(i).getNumero() == 0) {
                if (enter == false) {
                    agotados = getAlimentos().RetornarAlimento(i).getNombre();
                    enter = true;
                } else {
                    agotados = agotados + "," + getAlimentos().RetornarAlimento(i).getNombre();
                }
            }
        }
        if (agotados.equals("")) {
            Agotados.setText("Ninguno");
        } else {
            Agotados.setText(agotados);
        }

    }

}
