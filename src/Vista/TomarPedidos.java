/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Sepulveda
 */
public class TomarPedidos extends javax.swing.JFrame {

    private Controlador Controlador;
    public Cocina cocina;
    
    public TomarPedidos(Controlador Controlador,Cocina Cocina) throws IOException {
        this.Controlador=Controlador;
         this.cocina=Cocina;
         
        initComponents();
    }
    
     
      
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlatosFrame = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        PlatosTable = new javax.swing.JTable();
        ComprarButtonPla = new javax.swing.JButton();
        SalirButtonPla = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PostresFrame = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        PostresTable = new javax.swing.JTable();
        ComprarButtonPos = new javax.swing.JButton();
        SalirButtonPos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BebidasFrame = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        BebidasTable = new javax.swing.JTable();
        ComprarButtonBe = new javax.swing.JButton();
        SalirButtonBe = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TituloTomaDePedidosLabel = new javax.swing.JLabel();
        CamareroCbox = new javax.swing.JComboBox<>();
        MesaCbox = new javax.swing.JComboBox<>();
        CamareroLabel = new javax.swing.JLabel();
        MesaLabel = new javax.swing.JLabel();
        PostresButton = new javax.swing.JButton();
        PlatosButton = new javax.swing.JButton();
        BebidasButton = new javax.swing.JButton();
        SalirMenuButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        InfoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        PlatosFrame.setMinimumSize(new java.awt.Dimension(430, 347));

        PlatosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PlatosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        PlatosTable.getTableHeader().setResizingAllowed(false);
        PlatosTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(PlatosTable);

        ComprarButtonPla.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ComprarButtonPla.setText("Comprar");
        ComprarButtonPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarButtonPlaActionPerformed(evt);
            }
        });

        SalirButtonPla.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SalirButtonPla.setText("Salir");
        SalirButtonPla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonPlaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Platos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pribory.jpg"))); // NOI18N

        javax.swing.GroupLayout PlatosFrameLayout = new javax.swing.GroupLayout(PlatosFrame.getContentPane());
        PlatosFrame.getContentPane().setLayout(PlatosFrameLayout);
        PlatosFrameLayout.setHorizontalGroup(
            PlatosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlatosFrameLayout.createSequentialGroup()
                .addGroup(PlatosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlatosFrameLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlatosFrameLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlatosFrameLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ComprarButtonPla)
                        .addGap(62, 62, 62)
                        .addComponent(SalirButtonPla))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        PlatosFrameLayout.setVerticalGroup(
            PlatosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlatosFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(PlatosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComprarButtonPla)
                    .addComponent(SalirButtonPla)))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PostresFrame.setMinimumSize(new java.awt.Dimension(400, 355));
        PostresFrame.getContentPane().setLayout(null);

        PostresTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Postre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PostresTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        PostresTable.getTableHeader().setResizingAllowed(false);
        PostresTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(PostresTable);

        PostresFrame.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(39, 90, 307, 107);

        ComprarButtonPos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ComprarButtonPos.setText("Comprar");
        ComprarButtonPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarButtonPosActionPerformed(evt);
            }
        });
        PostresFrame.getContentPane().add(ComprarButtonPos);
        ComprarButtonPos.setBounds(74, 235, 85, 27);

        SalirButtonPos.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SalirButtonPos.setText("Salir");
        SalirButtonPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonPosActionPerformed(evt);
            }
        });
        PostresFrame.getContentPane().add(SalirButtonPos);
        SalirButtonPos.setBounds(229, 235, 59, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Postres");
        PostresFrame.getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 40, 100, 34);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1bb46265b5bb8f239b1a9de93d61a5c4.jpg"))); // NOI18N
        PostresFrame.getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, -6, 410, 330);

        BebidasFrame.setMinimumSize(new java.awt.Dimension(390, 345));
        BebidasFrame.getContentPane().setLayout(null);

        BebidasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bebida", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BebidasTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        BebidasTable.getTableHeader().setResizingAllowed(false);
        BebidasTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(BebidasTable);

        BebidasFrame.getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(26, 78, 307, 107);

        ComprarButtonBe.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ComprarButtonBe.setText("Comprar");
        ComprarButtonBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarButtonBeActionPerformed(evt);
            }
        });
        BebidasFrame.getContentPane().add(ComprarButtonBe);
        ComprarButtonBe.setBounds(60, 211, 85, 27);

        SalirButtonBe.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        SalirButtonBe.setText("Salir");
        SalirButtonBe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirButtonBeActionPerformed(evt);
            }
        });
        BebidasFrame.getContentPane().add(SalirButtonBe);
        SalirButtonBe.setBounds(211, 211, 59, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Bebidas");
        BebidasFrame.getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 40, 100, 34);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/27374059-Colored-seamless-vector-pattern-of-tequila-shots-with-splashes-of-paint-Stock-Vector_opt (1).jpg"))); // NOI18N
        BebidasFrame.getContentPane().add(jLabel7);
        jLabel7.setBounds(-6, 4, 410, 300);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 468));
        getContentPane().setLayout(null);

        TituloTomaDePedidosLabel.setFont(new java.awt.Font("Century Gothic", 1, 23)); // NOI18N
        TituloTomaDePedidosLabel.setForeground(new java.awt.Color(255, 255, 255));
        TituloTomaDePedidosLabel.setText("Toma de Pedidos");
        getContentPane().add(TituloTomaDePedidosLabel);
        TituloTomaDePedidosLabel.setBounds(160, 80, 210, 30);

        CamareroCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        CamareroCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamareroCboxActionPerformed(evt);
            }
        });
        getContentPane().add(CamareroCbox);
        CamareroCbox.setBounds(30, 120, 50, 20);

        MesaCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        getContentPane().add(MesaCbox);
        MesaCbox.setBounds(440, 120, 50, 20);

        CamareroLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CamareroLabel.setForeground(new java.awt.Color(255, 255, 255));
        CamareroLabel.setText("Camarero");
        getContentPane().add(CamareroLabel);
        CamareroLabel.setBounds(10, 90, 69, 19);

        MesaLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        MesaLabel.setForeground(new java.awt.Color(255, 255, 255));
        MesaLabel.setText("Mesa");
        getContentPane().add(MesaLabel);
        MesaLabel.setBounds(440, 90, 50, 19);

        PostresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono3_.png"))); // NOI18N
        PostresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostresButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PostresButton);
        PostresButton.setBounds(160, 380, 80, 30);

        PlatosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono2_.png"))); // NOI18N
        PlatosButton.setText("Platos");
        PlatosButton.setBorderPainted(false);
        PlatosButton.setFocusPainted(false);
        PlatosButton.setContentAreaFilled(false);
        PlatosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PlatosButton);
        PlatosButton.setBounds(70, 380, 70, 30);

        BebidasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono4_.png"))); // NOI18N
        BebidasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BebidasButton);
        BebidasButton.setBounds(260, 380, 80, 30);

        SalirMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono1_.png"))); // NOI18N
        SalirMenuButton.setText("Realizar pedido");
        SalirMenuButton.setBorderPainted(false);
        SalirMenuButton.setFocusPainted(false);
        SalirMenuButton.setContentAreaFilled(false);
        SalirMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirMenuButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SalirMenuButton);
        SalirMenuButton.setBounds(360, 380, 120, 30);

        InfoTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        InfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Alimento", "Precio", "Camarero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InfoTable.getTableHeader().setResizingAllowed(false);
        InfoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(InfoTable);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(70, 150, 366, 208);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/54a28c7532243d85e8f441bbeb92ffc5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PostresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostresButtonActionPerformed
        PostresFrame.setVisible(true);
    }//GEN-LAST:event_PostresButtonActionPerformed

    private void ComprarButtonPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarButtonPlaActionPerformed
   
         int fila = PlatosTable.getSelectedRow();
      
       
if(fila!=-1){      
DefaultTableModel model = (DefaultTableModel) PlatosTable.getModel();
DefaultTableModel model2=(DefaultTableModel) InfoTable.getModel();


String nombre=model.getValueAt(fila,0).toString();
double precio=Double.valueOf((String) model.getValueAt(fila, 1));
int camarero=Integer.parseInt((String)CamareroCbox.getSelectedItem());
int mesa=Integer.parseInt((String)MesaCbox.getSelectedItem());

             try {
                 Controlador.AgregarPedido(nombre,camarero,mesa,precio,model2,model,fila);
             } catch (IOException ex) {
                 Logger.getLogger(TomarPedidos.class.getName()).log(Level.SEVERE, null, ex);
             }

            
            
            PlatosTable.clearSelection();

            
            
}
    }//GEN-LAST:event_ComprarButtonPlaActionPerformed

    private void SalirButtonPlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonPlaActionPerformed
     PlatosFrame.setVisible(false);
    }//GEN-LAST:event_SalirButtonPlaActionPerformed

    private void PlatosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatosButtonActionPerformed
       PlatosFrame.setVisible(true);
    }//GEN-LAST:event_PlatosButtonActionPerformed

    private void BebidasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidasButtonActionPerformed
       BebidasFrame.setVisible(true);
    }//GEN-LAST:event_BebidasButtonActionPerformed

    private void ComprarButtonPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarButtonPosActionPerformed
        
         int fila = PostresTable.getSelectedRow();
       System.out.println(fila);
      
       
if(fila!=-1){      
DefaultTableModel model = (DefaultTableModel) PostresTable.getModel();
DefaultTableModel model2=(DefaultTableModel) InfoTable.getModel();


String nombre=model.getValueAt(fila,0).toString();
double precio=Double.valueOf((String) model.getValueAt(fila, 1));
int camarero=Integer.parseInt((String)CamareroCbox.getSelectedItem());
int mesa=Integer.parseInt((String)MesaCbox.getSelectedItem());


             try {
                 Controlador.AgregarPedido(nombre,camarero,mesa,precio,model2,model,fila);
             } catch (IOException ex) {
                 Logger.getLogger(TomarPedidos.class.getName()).log(Level.SEVERE, null, ex);
             }

            
            PostresTable.clearSelection();
}
        
    }//GEN-LAST:event_ComprarButtonPosActionPerformed

    private void SalirButtonPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonPosActionPerformed
       PostresFrame.setVisible(false);
    }//GEN-LAST:event_SalirButtonPosActionPerformed

    private void ComprarButtonBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarButtonBeActionPerformed
         int fila = BebidasTable.getSelectedRow();
       System.out.println(fila);
      
       
if(fila!=-1){      
DefaultTableModel model = (DefaultTableModel) BebidasTable.getModel();
DefaultTableModel model2=(DefaultTableModel) InfoTable.getModel();


String nombre=model.getValueAt(fila,0).toString();
double precio=Double.valueOf((String) model.getValueAt(fila, 1));
int camarero=Integer.parseInt((String)CamareroCbox.getSelectedItem());
int mesa=Integer.parseInt((String)MesaCbox.getSelectedItem());

             try {
                 Controlador.AgregarPedido(nombre,camarero,mesa,precio,model2,model,fila);
             } catch (IOException ex) {
                 Logger.getLogger(TomarPedidos.class.getName()).log(Level.SEVERE, null, ex);
             }
            
            BebidasTable.clearSelection();
}
    }//GEN-LAST:event_ComprarButtonBeActionPerformed

    
    public void mostrarError(String titulo, String mensaje){
        JOptionPane.showMessageDialog(this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
    }
    
    
    private void SalirButtonBeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirButtonBeActionPerformed
        BebidasFrame.setVisible(false);
    }//GEN-LAST:event_SalirButtonBeActionPerformed

    private void SalirMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuButtonActionPerformed
 
        
  int fila=InfoTable.getRowCount();
   
      
        for (int i = 0; i < fila-1; i++) {
            System.out.println("as");
            for (int j = i+1; j<fila ; j++) {
                System.out.println("assss");
                if ((int) InfoTable.getValueAt(i,0)==((int) InfoTable.getValueAt(j,0))) {
                  ((DefaultTableModel)InfoTable.getModel()).removeRow(j);
                  fila=InfoTable.getRowCount();
                }
            }
        }

        for (int i = 0; i < fila; i++) {
            Controlador.setCocina((int) InfoTable.getValueAt(i, 0), cocina);
        }
       
        DefaultTableModel dm = (DefaultTableModel) InfoTable.getModel();
        for (int i =InfoTable.getRowCount() - 1; i >= 0; i--) {
    dm.removeRow(i);
}
        
        Controlador.time=Controlador.Tiempo();
        
        
        
    }//GEN-LAST:event_SalirMenuButtonActionPerformed

    private void CamareroCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamareroCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CamareroCboxActionPerformed

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
            java.util.logging.Logger.getLogger(TomarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TomarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TomarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TomarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Controlador c=null;
                    Cocina co=null;
                    new TomarPedidos(c,co).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TomarPedidos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BebidasButton;
    private javax.swing.JFrame BebidasFrame;
    public javax.swing.JTable BebidasTable;
    private javax.swing.JComboBox<String> CamareroCbox;
    private javax.swing.JLabel CamareroLabel;
    private javax.swing.JButton ComprarButtonBe;
    private javax.swing.JButton ComprarButtonPla;
    private javax.swing.JButton ComprarButtonPos;
    public javax.swing.JTable InfoTable;
    private javax.swing.JComboBox<String> MesaCbox;
    private javax.swing.JLabel MesaLabel;
    private javax.swing.JButton PlatosButton;
    private javax.swing.JFrame PlatosFrame;
    public javax.swing.JTable PlatosTable;
    private javax.swing.JButton PostresButton;
    private javax.swing.JFrame PostresFrame;
    public javax.swing.JTable PostresTable;
    private javax.swing.JButton SalirButtonBe;
    private javax.swing.JButton SalirButtonPla;
    private javax.swing.JButton SalirButtonPos;
    private javax.swing.JButton SalirMenuButton;
    private javax.swing.JLabel TituloTomaDePedidosLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration//GEN-END:variables
}
