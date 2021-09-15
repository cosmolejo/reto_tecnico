/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xyz.view;

import com.xyz.controller.Controller;
import com.xyz.domain.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author antares
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaComerciales = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRepartidores = new javax.swing.JTable();
        crear = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("GestionXYZ"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 48)); // NOI18N
        jLabel1.setText("Empleados XYZ");

        tablaComerciales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Salario", "Comisión", "Bonificación", "Total"
            }
        ));
        jScrollPane1.setViewportView(tablaComerciales);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comerciales", jPanel1);

        tablaRepartidores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Salario", "Zona", "Bonificación", "Total"
            }
        ));
        jScrollPane2.setViewportView(tablaRepartidores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Repartidores", jPanel2);

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear)
                    .addComponent(actualizar)
                    .addComponent(eliminar))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    JTextField nombre = new JTextField();
    JTextField edad = new JTextField();
    JTextField salario = new JTextField();
    JTextField comision = new JTextField();
    JTextField zona = new JTextField();
    Object[] camposComercial = {
        "Nombre:", nombre,
        "Edad:", edad,
        "Salario:", salario,
        "Comision:", comision

    };
    Object[] camposRepartidor = {
        "Nombre:", nombre,
        "Edad:", edad,
        "Salario:", salario,
        "Zona:", zona

    };
    ArrayList<String[]> empleados;
    ArrayList<String[]> newEmpleados = new ArrayList<>();

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        nombre.setText("");
        edad.setText("");
        salario.setText("");
        comision.setText("");
        zona.setText("");

        int tab = jTabbedPane1.getSelectedIndex();
        if (tab == 1) {
            DefaultTableModel model = (DefaultTableModel) tablaRepartidores.getModel();

            if (tablaRepartidores.getSelectedRow() == -1) {
                if (tablaRepartidores.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "La tabla está vacia",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            } else {
                nombre.setText(String.valueOf(model.getValueAt(tablaRepartidores.getSelectedRow(), 0)));
                edad.setText(String.valueOf(model.getValueAt(tablaRepartidores.getSelectedRow(), 1)));
                salario.setText(String.valueOf(model.getValueAt(tablaRepartidores.getSelectedRow(), 2)));
                zona.setText(String.valueOf(model.getValueAt(tablaRepartidores.getSelectedRow(), 3)));

                String[] oldEmpleado = {"repartidor", nombre.getText(), edad.getText(),
                    salario.getText(), zona.getText()};

                int option = JOptionPane.showConfirmDialog(null, camposRepartidor, "Repartidor", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {

                    String nombreVal = nombre.getText();
                    String edadVal = edad.getText();
                    String salarioVal = salario.getText();
                    String zonaVal = zona.getText();

                    String[] newEmpleado = {"repartidor", nombre.getText(), edad.getText(),
                        salario.getText(), zona.getText()};

                    this.actualizarTabla(oldEmpleado, newEmpleado);

                }
            }

        } else {
            DefaultTableModel model = (DefaultTableModel) tablaComerciales.getModel();

            if (tablaComerciales.getSelectedRow() == -1) {
                if (tablaComerciales.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "La tabla está vacia",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            } else {
                nombre.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 0)));
                edad.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 1)));
                salario.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 2)));
                comision.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 3)));
                String[] oldEmpleado = {"comercial", nombre.getText(), edad.getText(),
                    salario.getText(), comision.getText()};

                int option = JOptionPane.showConfirmDialog(null, camposComercial, "Comercial", JOptionPane.OK_CANCEL_OPTION);

                if (option == JOptionPane.OK_OPTION) {

                    String nombreVal = nombre.getText();
                    String edadVal = edad.getText();
                    String salarioVal = salario.getText();
                    String comisionVal = comision.getText();

                    String[] newEmpleado = {"comercial", nombre.getText(), edad.getText(),
                        salario.getText(), comision.getText()};

                    this.actualizarTabla(oldEmpleado, newEmpleado);

                }
            }
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int tab = jTabbedPane1.getSelectedIndex();
        if (tab == 1) {
            DefaultTableModel model = (DefaultTableModel) tablaRepartidores.getModel();

            if (tablaRepartidores.getSelectedRow() == -1) {
                if (tablaRepartidores.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "La tabla está vacia",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            } else {

                model.removeRow(tablaRepartidores.getSelectedRow());

            }

        } else {
            DefaultTableModel model = (DefaultTableModel) tablaComerciales.getModel();

            if (tablaComerciales.getSelectedRow() == -1) {
                if (tablaComerciales.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "La tabla está vacia",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un registro",
                            "Error",
                            JOptionPane.WARNING_MESSAGE);
                }

            } else {
                nombre.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 0)));
                edad.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 1)));
                salario.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 2)));
                comision.setText(String.valueOf(model.getValueAt(tablaComerciales.getSelectedRow(), 3)));
                String[] empleado = {"comercial", nombre.getText(), edad.getText(),
                    salario.getText(), comision.getText()};
                this.borrarTabla(empleado);
                //model.removeRow(tablaComerciales.getSelectedRow());
            }

        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed

        nombre.setText("");
        edad.setText("");
        salario.setText("");
        comision.setText("");
        zona.setText("");

        Object[] tipos = {"Comercial", "Repartidor"};
        JComboBox comboBox = new JComboBox(tipos);
        Object[] message = {
            "Elija el tipo de empleado", comboBox
        };

        JOptionPane.showMessageDialog(null, message, "CREACIÓN DE EMPLEADO", JOptionPane.QUESTION_MESSAGE);
        String value = comboBox.getSelectedItem().toString();

        if (value.equals("Comercial")) {

            int option = JOptionPane.showConfirmDialog(null, camposComercial, "Comercial", JOptionPane.OK_CANCEL_OPTION);

            if (option == JOptionPane.OK_OPTION) {

                String nombreVal = nombre.getText();
                String edadVal = edad.getText();
                String salarioVal = salario.getText();
                String comisionVal = comision.getText();

                if (!nombreVal.equals("")
                        && !edadVal.equals("")
                        && !salarioVal.equals("")
                        && !comisionVal.equals("")) {

                    String[] empleado = {"comercial", nombreVal, edadVal, salarioVal, comisionVal};
                    this.llenarTabla(false, empleado);

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

        } else {
            int option = JOptionPane.showConfirmDialog(null, camposRepartidor, "Repartidor", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {

                String nombreVal = nombre.getText();
                String edadVal = edad.getText();
                String salarioVal = salario.getText();
                String zonaVal = zona.getText();

                if (!nombreVal.equals("")
                        && !edadVal.equals("")
                        && !salarioVal.equals("")
                        && !zonaVal.equals("")) {

                    String[] empleado = {"repartidor", nombreVal, edadVal, salarioVal, zonaVal};
                    this.llenarTabla(false, empleado);

                } else {
                    JOptionPane.showMessageDialog(null, "Debe llenar todos los campos",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_crearActionPerformed


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        ArrayList<String[]> mergeEmpleados = new ArrayList<>();
        mergeEmpleados.addAll(empleados);
        mergeEmpleados.addAll(newEmpleados);

        Controller.writeCSV(mergeEmpleados);


    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        empleados = Controller.readCSV();
        for (String[] emp : empleados) {
            llenarTabla(true, emp);
        }
    }//GEN-LAST:event_formWindowOpened

    private void borrarTabla(String[] empleado) {
        
        int sw = 0;
        for (String[] emp : empleados) {
            if (Arrays.equals(emp, empleado)) {
                empleados.remove(emp);
                sw = 1;
                break;
            }
        }
        if (sw == 0) {
            for (String[] emp : newEmpleados) {
                if (Arrays.equals(emp, empleado)) {
                    newEmpleados.remove(emp);
                    break;
                }

            }
        }

        if (empleado[0].equals("comercial")) {
            DefaultTableModel model = (DefaultTableModel) tablaComerciales.getModel();
            model.removeRow(tablaComerciales.getSelectedRow());
        } else {
            DefaultTableModel model = (DefaultTableModel) tablaRepartidores.getModel();
            model.removeRow(tablaRepartidores.getSelectedRow());

        }

    }

    private void actualizarTabla(String[] oldEmpleado, String[] newEmpleado) {
        int sw = 0;

        for (String[] emp : empleados) {
            if (Arrays.equals(emp, oldEmpleado)) {
                empleados.remove(emp);
                empleados.add(newEmpleado);

                sw = 1;
                break;
            }
        }
        if (sw == 0) {
            for (String[] emp : newEmpleados) {
                if (Arrays.equals(emp, oldEmpleado)) {
                    newEmpleados.remove(emp);
                    empleados.add(newEmpleado);
                    break;
                }

            }
        }

        if (newEmpleado[0].equals("repartidor")) {

            DefaultTableModel model = (DefaultTableModel) tablaRepartidores.getModel();

            String[] bonif = Controller.controlBonificacion(newEmpleado[0], newEmpleado[1], newEmpleado[2], newEmpleado[3], newEmpleado[4]);

            model.setValueAt(newEmpleado[1], tablaRepartidores.getSelectedRow(), 0);
            model.setValueAt(newEmpleado[2], tablaRepartidores.getSelectedRow(), 1);
            model.setValueAt(newEmpleado[3], tablaRepartidores.getSelectedRow(), 2);
            model.setValueAt(newEmpleado[4], tablaRepartidores.getSelectedRow(), 3);
            model.setValueAt(bonif[0], tablaRepartidores.getSelectedRow(), 4);
            model.setValueAt(bonif[1], tablaRepartidores.getSelectedRow(), 5);

        } else {
            DefaultTableModel model = (DefaultTableModel) tablaComerciales.getModel();

            String[] bonif = Controller.controlBonificacion(newEmpleado[0], newEmpleado[1], newEmpleado[2], newEmpleado[3], newEmpleado[4]);

            model.setValueAt(newEmpleado[1], tablaComerciales.getSelectedRow(), 0);
            model.setValueAt(newEmpleado[2], tablaComerciales.getSelectedRow(), 1);
            model.setValueAt(newEmpleado[3], tablaComerciales.getSelectedRow(), 2);
            model.setValueAt(newEmpleado[4], tablaComerciales.getSelectedRow(), 3);
            model.setValueAt(bonif[0], tablaComerciales.getSelectedRow(), 4);
            model.setValueAt(bonif[1], tablaComerciales.getSelectedRow(), 5);

        }

    }

    private void llenarTabla(boolean csv, String[] empleado) {

        if (!csv) {
            newEmpleados.add(empleado);
        }

        if (empleado[0].equals("comercial")) {
            DefaultTableModel model = (DefaultTableModel) tablaComerciales.getModel();
            String[] bonif = Controller.controlBonificacion(empleado[0], empleado[1], empleado[2], empleado[3], empleado[4]);
            model.addRow(new Object[]{empleado[1], empleado[2], empleado[3],
                empleado[4], bonif[0], bonif[1]});
        } else {
            DefaultTableModel model = (DefaultTableModel) tablaRepartidores.getModel();
            String[] bonif = Controller.controlBonificacion(empleado[0], empleado[1], empleado[2], empleado[3], empleado[4]);
            model.addRow(new Object[]{empleado[1], empleado[2], empleado[3],
                empleado[4], bonif[0], bonif[1]});

        }

    }

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton crear;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaComerciales;
    private javax.swing.JTable tablaRepartidores;
    // End of variables declaration//GEN-END:variables
}
