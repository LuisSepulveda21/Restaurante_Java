/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class Almacen {

    File archivo;

    public Almacen(String ruta) {
        archivo = new File(ruta);
    }

//Crear productos(Ingredientes)
    public void setProductos(DefaultTableModel model, int fila) throws IOException {

        try (BufferedWriter Ingredientes = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < fila; i++) {
                Ingredientes.write(model.getValueAt(i, 0) + "," + model.getValueAt(i, 1));
                Ingredientes.newLine();
            }
        }

    }

    //Crear productos (Alimentos)
    public void setProductos(MiLista Alimentos) throws IOException {

        try (BufferedWriter AlimTxt = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < Alimentos.size(); i++) {
                String tipo = Alimentos.RetornarAlimento(i).getTipo();
                String precio = Alimentos.RetornarAlimento(i).getPrecio();
                String nombre = Alimentos.RetornarAlimento(i).getNombre();
                int unidades = Alimentos.RetornarAlimento(i).getNumero();

//Creacion del archivo             
                AlimTxt.write(tipo + "," + precio + "," + nombre + "," + unidades);
                AlimTxt.newLine();
                //

            }
        }

    }

    //Obtener productos
    public void getProductos(DefaultTableModel model) throws FileNotFoundException {
        try (Scanner lector = new Scanner(archivo)) {

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[0];
                int unidades = parseInt(datos[1]);
                model.addRow(new Object[]{nombre, unidades});

            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    //Agrega alimentos al archivo
    public void AgregarAlimentos(String tipo1, String precio1, String nombre1,
            int unidades1, MiLista Alimentos, Restaurante restaurante) throws FileNotFoundException, IOException {

        try (BufferedWriter AlimTxt = new BufferedWriter(new FileWriter(archivo))) {
            for (int i = 0; i < Alimentos.size(); i++) {
                String tipo = Alimentos.RetornarAlimento(i).getTipo();
                String precio = Alimentos.RetornarAlimento(i).getPrecio();
                String nombre = Alimentos.RetornarAlimento(i).getNombre();
                int unidades = Alimentos.RetornarAlimento(i).getNumero();

//Creacion del archivo             
                AlimTxt.write(tipo + "," + precio + "," + nombre + "," + unidades);
                AlimTxt.newLine();
                //

            }

            //Aqui agrega el nuevo ingrediente
            AlimTxt.write(tipo1 + "," + precio1 + "," + nombre1 + "," + unidades1);
            AlimTxt.newLine();

            //Igualmente lo agrega como objeto en el array del restaurante
            Alimento m = new Alimento(tipo1, precio1, nombre1, unidades1);
            m.setId(restaurante.getNumerosAlimento());
            Alimentos.add(m);
            restaurante.setNumerosAlimento();

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

    }

    //Abre el archivo de alimentos
    public void setAlimentosIni(MiLista Alimentos, Restaurante restaurante) {

        try (Scanner lector = new Scanner(archivo)) {

            while (lector.hasNextLine()) {

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String tipo = datos[0];
                String precio = datos[1];
                String nombre = datos[2];
                String unidades = datos[3];

                Alimento m = new Alimento(tipo, precio, nombre, Integer.parseInt(unidades));
                System.out.println(nombre);

                m.setId(restaurante.getNumerosAlimento());

                Alimentos.add(m);
                restaurante.setNumerosAlimento();
            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

    }

//Modifica el archivo de ingredientes
    public void Modificar(int unidades2, String nombre2, DefaultTableModel model, int fila) throws IOException {

        //Busqueda   
        int bus = -1;
        int realbus = -2;
        int realunidades = 0;
        //
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                bus = bus + 1;

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[0];
                int unidades = parseInt(datos[1]);

                //Encontro el elemento
                if (nombre.equals(nombre2)) {
                    realunidades = unidades - unidades2;
                    realbus = bus;
                }//   
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        //reescribe el archivo con las nuevas unidades
        try (BufferedWriter Ingredientes = new BufferedWriter(new FileWriter(archivo))) {

            for (int i = 0; i < fila; i++) {

                if (i == realbus) {
                    Ingredientes.write(nombre2 + "," + realunidades);
                    Ingredientes.newLine();
                } else {
                    Ingredientes.write(model.getValueAt(i, 0) + "," + model.getValueAt(i, 1));
                    Ingredientes.newLine();
                }

            }
        }

    }

    //Modifica el archivo de alimentos
    public void Modificar(String nombre2,int unidades2,MiLista Alimentos) throws IOException {

        //Busqueda   
        int bus = -1;
        int realbus = -2;
        int realunidades = 0;
        //
        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                bus = bus + 1;

                String linea = lector.nextLine();

                String[] datos = linea.split(",");

                String nombre = datos[2];
                int unidades = parseInt(datos[3]);

                //Encontro el elemento
                if (nombre.equals(nombre2)) {
                    realunidades = unidades + unidades2;
                    realbus = bus;
                }//   
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        //reescribe el archivo con las nuevas unidades
        try (BufferedWriter AlimTxt = new BufferedWriter(new FileWriter(archivo))) {

            for (int i = 0; i < Alimentos.size(); i++) {
               
                String tipo = Alimentos.RetornarAlimento(i).getTipo();
                String precio = Alimentos.RetornarAlimento(i).getPrecio();
                String nombre = Alimentos.RetornarAlimento(i).getNombre();
                int unidades = Alimentos.RetornarAlimento(i).getNumero();
                
                if (i == realbus) {
                
                AlimTxt.write(tipo + "," + precio + "," + nombre + "," + realunidades);
                AlimTxt.newLine();
                } 
                else {    
                AlimTxt.write(tipo + "," + precio + "," + nombre + "," + unidades);
                AlimTxt.newLine();
                }

            }
        }

    }
    
    
}


 




