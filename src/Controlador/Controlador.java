/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Alimento;
import Modelo.Camarero;
import Modelo.Mesa;
import Modelo.Restaurante;
import Vista.Aprovisionamiento;
import Vista.Cocina;
import Vista.CreacionPlatos;
import Vista.TomarPedidos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Controlador  {
    private Restaurante restaurante;
    public long time;
    
    
    public Controlador() throws IOException{
        restaurante=new Restaurante();
    }
   
   public long Tiempo(){
long Tiempo = System.currentTimeMillis();
System.out.println(Tiempo);
return Tiempo;                      //de ejecución 
   }
   
    
    
            
     //Creacion de mi archivo de ingredientes       
    public void AgregarIngredientesAlmacen(DefaultTableModel model,int fila) throws IOException{
    restaurante.AgregarIngredientesAlmacen(model,fila);
    }
//
    
    
    //Polimorfismo para agregar archivo en tablas
    public void AgregarIngredientesPlato(CreacionPlatos CreacionPlatos) throws FileNotFoundException{
    DefaultTableModel model = (DefaultTableModel) CreacionPlatos.IngredienteTable.getModel();
       restaurante.getIngredientesAlmacen(model);
    }
    
    public void AgregarIngredientesPlato(Aprovisionamiento Aprovisionamiento) throws FileNotFoundException{
    DefaultTableModel model = (DefaultTableModel) Aprovisionamiento.AlmacenTable.getModel();
       restaurante.getIngredientesAlmacen(model);
    }
    //
    
    
    
    
    
    public void AgregarPedido(String pedido,int numeroCamarero, int numeroMesa,double precio,
            DefaultTableModel model2,DefaultTableModel model ,int fila) throws IOException{
        
        
        //Busca el objeto (alimento)
       Alimento al= restaurante.getAlimentos().RetornarAlimento(pedido);
       
       
    
       //Si hay unidades disponibles  si se puede vender
            if (al.getNumero()!=0) {
                
                    al.setContador();
                
                
                //Obtiene el camarero
        Camarero c=restaurante.getCamareros().getCamarero(numeroCamarero);
        
        //Obtiene la mesa
        Mesa m=restaurante.getMesas().RetornarMesa(numeroMesa);  
        
        
        //Asigna un numero de orden
         if(m.NumeroOrden==0){
         restaurante.NumerosOrden++;
         int z=restaurante.NumerosOrden;
         m.setNumeroOrden(z);
        }
  
         /*PROCESO PARA QUE EL CAMARERO SOLO PUEDA TENER 5 MESAS Y UNA MESA 1 SOLO CAMARERO*/
         
         //Si la mesa ya esta siendo usada pero el camarero arrojado como parametro no corresponde al de la mesa, no hace nada
         if (m.uso==1 && m.getCamarero()!=c){
         System.out.println("La mesa ya tiene camarero");
         }
         
         
         else{
         //Si ya tiene la mesa simplemente agrega el pedido
         if(c.getMesas().RetornarMesa(numeroMesa)!=null){
        m.setPedidos(pedido,precio);
        m.setTotal(m.getTotal()+precio);
        model2.addRow(new Object[]{numeroMesa,pedido,precio,numeroCamarero});
            }
         
         //Sino, pregunta si ya esta llena la lista simple de mesas
         else{
         if(c.getMesas().size()==5){
             
             //Si encuentra una mesa agrega el pedido
         if(c.getMesas().RetornarMesa(numeroMesa)!=null){
        m.setPedidos(pedido,precio);
        m.setTotal(m.getTotal()+precio);
        model2.addRow(new Object[]{numeroMesa,pedido,precio,numeroCamarero});
            }
         
         //Sino, no agrega la mesa ya que solo puede tener 5
         else{
         System.out.println("Solo se pueden 5 mesas por camarero");
         }
         }
         
         //Si no esta llena, agrega la nueva mesa
        else{
        c.setMesa(numeroMesa);
        m.setCamarero(c);
        
        /*Indica que la mesa ya esta siendo usada por un camarero*/   m.uso=1;
        
        m.setPedidos(pedido,precio);
        m.setTotal(precio);
        model2.addRow(new Object[]{numeroMesa,pedido,precio,numeroCamarero});
        }
         }
         }
         
         //Si al final se acaba ya no debe aparecer en el menu
         if(al.getNumero()==0){
         model.removeRow(fila);
         
         }      
         
         
            }
            
            //No hay
            else{
            System.out.println("No disponible");
            
            }
        
       
       
        
        
        
        
        
        
        
        
        
    }
  
  
    
    public void ActualizarStock() throws IOException{
        restaurante.getBodegaAlimentos().setProductos(restaurante.getAlimentos());  
    }
    
    
    
    
    //Agrega en cocina los alimentos pedidos
    public void setCocina(int numeroMesa,Cocina cocina){
    DefaultTableModel model = (DefaultTableModel) cocina.CocinaTable.getModel();
 
   Mesa mesa=restaurante.getInfoMesa(numeroMesa);
 
   model.addRow(new Object[]{mesa.getId(),mesa.getCamarero().getId(),mesa.getPedidos().getPedidos(),mesa.getNumeroOrden()});
    }
    //
    
    
    //Obtiene una mesa en especifico
    public Mesa ObtenerMesa(int mesa){
    Mesa Mimesa=restaurante.getInfoMesa(mesa);
    return Mimesa;
    }
    //
    
    //Obtiene una mesa en especifico
    public Alimento ObtenerAlimento(String nombre){
    Alimento Alimento=restaurante.getInfoAlimento(nombre);
    return Alimento;
    }
    //
    
    
    
    public void ModificarUnidades(int unidades,String nombre,DefaultTableModel model,int fila) throws IOException{
    restaurante.ModificarAlmacen(unidades,nombre,model,fila);
    }
    
    
    public void AgregarAlimento(String tipo,String precio, String nombre,int unidades) throws IOException{
    restaurante.AgregarAlimento(tipo, precio, nombre,unidades);
    }
    
    

//Agrega el archivo en los distintos tables del menu
    public void AgregarEnMenu(DefaultTableModel platos,DefaultTableModel bebidas,DefaultTableModel postres){
        if (restaurante.getAlimentos()!=null) {
            for (int i = 0; i < restaurante.getAlimentos().size(); i++) {
                if (restaurante.getAlimentos().RetornarAlimento(i).getId()==i) {
                    Alimento alimento=restaurante.getAlimentos().RetornarAlimento(i);
                    if (alimento.getNumero()==0) {
                        System.out.println("Necesita crear mas:"+alimento.getNombre()+" porque se ha agotado");
                    }
                    else{
                    if ("Bebida".equals(alimento.getTipo())) {
                       bebidas.addRow(new Object[]{alimento.getNombre(),alimento.getPrecio()});
                    }
                    if ("Plato".equals(alimento.getTipo())) {
                        platos.addRow(new Object[]{alimento.getNombre(),alimento.getPrecio()});
                    }
                    if ("Postre".equals(alimento.getTipo())) {
                        postres.addRow(new Object[]{alimento.getNombre(),alimento.getPrecio()});
                    }
                    }
                }
            }
 
        }
    
    
    }
    
    
    
    //Hace un reset de los atributos una vez se ha pedido la factura
      public void reset(Mesa m){
 
        restaurante.BorrarMesa(m);

    }
   // 
      
      
      public void FinDia(JLabel ventas,JLabel plato,JLabel Camarero,DefaultTableModel model, JLabel MenosVendido, JLabel Agotado){
      restaurante.Fin(ventas,plato,Camarero,model,MenosVendido,Agotado);
          
      }
      
      
}
