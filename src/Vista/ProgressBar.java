/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis Sepulveda
 */
public class ProgressBar extends SwingWorker<Integer, String> {

    private JLabel label;
    private JProgressBar jpbar;
    private JTextField txtfield;
    private JTable jtable;

    @Override
    protected Integer doInBackground() throws Exception {

        getLabel().setVisible(true);
        getJpbar().setIndeterminate(true);

        try {

            for (int i = 0; i < 3; i++) {
                getTxtField().setText("Proceso en: " + i + "\n");
                Thread.sleep(1000);
            }

            DefaultTableModel model = (DefaultTableModel) getJtable().getModel();

            model.removeRow(getJtable().getSelectedRow());
            getTxtField().setText("");

        } catch (Exception e) {
            System.out.println("error" + e);
        }

        getLabel().setVisible(false);
        getJpbar().setIndeterminate(false);
        return 0;
    }

    public ProgressBar(JLabel label, JProgressBar jpbar, JTextField txtfield, JTable jtable) {
        this.label = label;
        this.jpbar = jpbar;
        this.txtfield = txtfield;
        this.jtable = jtable;
    }

    /**
     * @return the label
     */
    public JLabel getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(JLabel label) {
        this.label = label;
    }

    /**
     * @return the jpbar
     */
    public JProgressBar getJpbar() {
        return jpbar;
    }

    /**
     * @param jpbar the jpbar to set
     */
    public void setJpbar(JProgressBar jpbar) {
        this.jpbar = jpbar;
    }

    /**
     * @return the txtarea
     */
    public JTextField getTxtField() {
        return txtfield;
    }

    /**
     *
     */
    public void setTxtfield(JTextField txtfield) {
        this.txtfield = txtfield;
    }

    /**
     * @return the jtable
     */
    public JTable getJtable() {
        return jtable;
    }

    /**
     * @param jtable the jtable to set
     */
    public void setJtable(JTable jtable) {
        this.jtable = jtable;
    }

}
