/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Modelo.Mesa;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Sepulveda
 */
public class Mesa_Info extends javax.swing.JFrame {
private Controlador Controlador;
    /**
     * Creates new form Mesa_Info
     * @param Controlador
     * @throws java.io.IOException
     */
    public Mesa_Info(Controlador Controlador) throws IOException {
         initComponents();
        DefaultListModel model = new DefaultListModel();
        lista.setModel(model);
        this.Controlador=Controlador;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Factura = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MesaCbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FacturaButton = new javax.swing.JButton();
        CambiarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Factura.setMinimumSize(new java.awt.Dimension(372, 300));
        Factura.getContentPane().setLayout(null);

        lista.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lista);

        Factura.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(29, 39, 289, 212);

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 1, 20)); // NOI18N
        jLabel4.setText("FACTURA");
        Factura.getContentPane().add(jLabel4);
        jLabel4.setBounds(128, 8, 93, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/7.png"))); // NOI18N
        Factura.getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 370, 300);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(357, 307));
        getContentPane().setLayout(null);

        MesaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        MesaCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesaCboxActionPerformed(evt);
            }
        });
        getContentPane().add(MesaCbox);
        MesaCbox.setBounds(140, 130, 50, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("#Mesa");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 130, 50, 21);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("InfoMesa");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 10, 150, 90);

        FacturaButton.setText("Solicitar factura");
        FacturaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FacturaButton);
        FacturaButton.setBounds(20, 200, 130, 23);

        CambiarPedido.setText("Reiniciar Pedido");
        CambiarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(CambiarPedido);
        CambiarPedido.setBounds(190, 200, 130, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dark-wood-background-3_opt.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MesaCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesaCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesaCboxActionPerformed

    
    
    void mostrarError(String titulo, String mensaje){
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }
    
    void mostrarAviso(String titulo, String mensaje){
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }
    
    
    private void FacturaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaButtonActionPerformed
       
        
  
       Mesa mesa;
       int valor=Integer.parseInt((String)MesaCbox.getSelectedItem());
       mesa=Controlador.ObtenerMesa(valor);
       
    

    if (mesa.getProceso()==1)
{
     DefaultListModel model = (DefaultListModel) lista.getModel();
     model.clear();
     
        for (int i = 0; i < mesa.getPedidos().size(); i++) {
            model.addElement(mesa.getPedidos().getPedidoYPrecio(i));
        }
           
        model.addElement("TOTAL = "+mesa.getTotal());
        model.addElement("IVA = "+ mesa.getTotal()*0.19);
        model.addElement("PROPINA = "+mesa.getTotal()*0.1);
    Controlador.reset(mesa);
        Factura.setVisible(true);


    }                                             
else{
mostrarError("Error", "No puede solicitar factura ");

}
    }//GEN-LAST:event_FacturaButtonActionPerformed

    private void CambiarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarPedidoActionPerformed
      
        
        Mesa mesa;
        int valor=Integer.parseInt((String)MesaCbox.getSelectedItem());
        mesa=Controlador.ObtenerMesa(valor);
        
        if (mesa.getProceso()==1){ 
        if (Controlador.Tiempo()-Controlador.time> 10000) {
            mostrarError("Tiempo agotado", "Usted no puede cambiar el pedido ");
        }
        else{
            
        Controlador.reset(mesa);
        mesa.setVentas(0);
        mostrarAviso("PEDIDOS BORRADOS SATISFACTORIAMENTE","Dirijase a tomar pedido e ingrese sus nuevos pedidos");
        }
        
        }
        
        else{
       mostrarError("Error", "No puede solicitar cambio de pedido "); 
        }
        
    }//GEN-LAST:event_CambiarPedidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesa_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Controlador c=null;
                    new Mesa_Info(c).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Mesa_Info.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiarPedido;
    private javax.swing.JFrame Factura;
    private javax.swing.JButton FacturaButton;
    private javax.swing.JComboBox<String> MesaCbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
