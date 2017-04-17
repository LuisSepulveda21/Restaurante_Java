/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wim
 */
public class CreacionPlatos extends javax.swing.JFrame {

    private Controlador Controlador;

    public CreacionPlatos(Controlador Controlador) {
        this.Controlador = Controlador;

        initComponents();

        AgregarButton.setEnabled(false);
        UnidadesTxtField.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreTxtField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        IngredienteTable = new javax.swing.JTable();
        AgregarButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TipoCbox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        UnidadesTxtField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        PrecioTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(556, 355));
        setPreferredSize(new java.awt.Dimension(556, 320));
        getContentPane().setLayout(null);

        NombreTxtField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        NombreTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NombreTxtFieldKeyReleased(evt);
            }
        });
        getContentPane().add(NombreTxtField);
        NombreTxtField.setBounds(75, 72, 134, 21);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(11, 75, 60, 17);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel2.setText("Creacion de alimentos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 20, 290, 28);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel3.setText("Tipo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 70, 40, 17);

        IngredienteTable.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        IngredienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Unidades disponibles"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        IngredienteTable.getTableHeader().setResizingAllowed(false);
        IngredienteTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(IngredienteTable);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 104, 307, 157);

        AgregarButton.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        AgregarButton.setText("Agregar Ingrediente");
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarButton);
        AgregarButton.setBounds(372, 129, 141, 23);

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton2.setText("Crear alimento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(123, 279, 111, 23);

        TipoCbox.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        TipoCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plato", "Bebida", "Postre" }));
        getContentPane().add(TipoCbox);
        TipoCbox.setBounds(270, 70, 64, 21);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel4.setText("Unidades:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(355, 173, 70, 17);

        UnidadesTxtField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        UnidadesTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UnidadesTxtFieldKeyReleased(evt);
            }
        });
        getContentPane().add(UnidadesTxtField);
        UnidadesTxtField.setBounds(429, 170, 69, 21);

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(373, 279, 87, 23);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel5.setText("Precio:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 70, 44, 17);

        PrecioTxtField.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        PrecioTxtField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrecioTxtFieldKeyReleased(evt);
            }
        });
        getContentPane().add(PrecioTxtField);
        PrecioTxtField.setBounds(430, 70, 70, 21);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/depositphotos_23928845-stock-photo-green-pastel-background-design.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-150, -40, 730, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }


    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) IngredienteTable.getModel();

        int unidades = parseInt(UnidadesTxtField.getText());
        int fila = IngredienteTable.getSelectedRow();
        int numfilas = IngredienteTable.getRowCount();
        String valor = String.valueOf(model.getValueAt(fila, 1));
        int num = Integer.parseInt(valor);

        if (num - unidades < 0) {
            mostrarError("Error", "No se tiene esa cantidad del ingrediente en almacen");
        } else {
            String nombre = (String) model.getValueAt(fila, 0);
            try {
                Controlador.ModificarUnidades(unidades, nombre, model, numfilas);
            } catch (IOException ex) {
                Logger.getLogger(CreacionPlatos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int fila = IngredienteTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) IngredienteTable.getModel();

        for (int i = fila - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        try {
            Controlador.AgregarIngredientesPlato(this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    void mostrarAviso(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String nombre = NombreTxtField.getText();

        String tipo = String.valueOf(TipoCbox.getSelectedItem());

        String precio = PrecioTxtField.getText();

        if (Controlador.ObtenerAlimento(nombre) != null) {
            Controlador.ObtenerAlimento(nombre).setNumero();
            mostrarAviso("Unidades agregadas", "Se han agregado unidades de su platillo");
        } else {
            try {
                Controlador.AgregarAlimento(tipo, precio, nombre, 1);
            } catch (IOException ex) {
                Logger.getLogger(CreacionPlatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrarAviso("Plato creado", "Su plato ha sido creado satisfactoriamente");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void NombreTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTxtFieldKeyReleased

        if (NombreTxtField.getText().length() != 0 && PrecioTxtField.getText().length() != 0) {
            UnidadesTxtField.setEditable(true);
        } else {
            AgregarButton.setEnabled(false);
            UnidadesTxtField.setEditable(false);
        }
    }//GEN-LAST:event_NombreTxtFieldKeyReleased

    private void PrecioTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioTxtFieldKeyReleased
        if (NombreTxtField.getText().length() != 0 && PrecioTxtField.getText().length() != 0) {

            UnidadesTxtField.setEditable(true);
        } else {
            AgregarButton.setEnabled(false);
            UnidadesTxtField.setEditable(false);
        }
    }//GEN-LAST:event_PrecioTxtFieldKeyReleased

    private void UnidadesTxtFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnidadesTxtFieldKeyReleased
        if (UnidadesTxtField.getText().length() != 0) {
            AgregarButton.setEnabled(true);
        }
    }//GEN-LAST:event_UnidadesTxtFieldKeyReleased

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
            java.util.logging.Logger.getLogger(CreacionPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionPlatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controlador c = null;
                new CreacionPlatos(c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    public javax.swing.JTable IngredienteTable;
    private javax.swing.JTextField NombreTxtField;
    private javax.swing.JTextField PrecioTxtField;
    private javax.swing.JComboBox<String> TipoCbox;
    private javax.swing.JTextField UnidadesTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
