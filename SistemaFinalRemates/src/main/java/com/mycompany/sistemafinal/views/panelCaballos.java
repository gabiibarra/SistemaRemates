
package com.mycompany.sistemafinal.views;

import com.mycompany.sistemafinal.dao.CaballoDao;
import com.mycompany.sistemafinal.dao.CuidadorDao;
import com.mycompany.sistemafinal.model.Caballos;
import com.mycompany.sistemafinal.model.Cuidadores;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelCaballos extends javax.swing.JPanel {

    private CaballoDao dao = new CaballoDao();
    public panelCaballos() {
        initComponents();
        cargarTabla();
        llenarComboBox();
    }
    private int idSeleccionado = -1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(66, 32, 66));
        jLabel22.setText("TELEFONO");

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(66, 32, 66));
        jLabel24.setText("CONTRASEÑA");

        jTextField13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/sistemafinal/img/guardar.png"))); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(499, 555));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(66, 32, 66));
        jLabel21.setText("NOMBRE");

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(66, 32, 66));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(66, 32, 66));
        jLabel23.setText("PESO");

        txtPeso.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(66, 32, 66));
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(66, 32, 66));
        jLabel25.setText("ID_CUIDADOR");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/sistemafinal/img/guardar.png"))); // NOI18N
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(66, 32, 66));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("GUARDAR");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/sistemafinal/img/modificar.png"))); // NOI18N
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/sistemafinal/img/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(66, 32, 66));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("MODIFICAR");

        jLabel28.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(66, 32, 66));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("ELIMINAR");

        comboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        comboBox.setForeground(new java.awt.Color(66, 32, 66));
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<Cuidadores>());
        comboBox.addItem(new Cuidadores(0, "Seleccionar"));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtPeso)
                            .addComponent(comboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(jLabel27))
                    .addComponent(jLabel28))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                                       
        String nombre = txtNombre.getText();
        String peso = txtPeso.getText();
        Cuidadores cuidadorSeleccionado = (Cuidadores) comboBox.getSelectedItem();

        if (!validarDatos(nombre, peso) || cuidadorSeleccionado == null || cuidadorSeleccionado.getId() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los campos correctamente.");
            return;
        }

        int idCuidador = cuidadorSeleccionado.getId();

        Caballos caballo = new Caballos();
        caballo.setNombre(nombre);
        caballo.setPeso(peso);
        caballo.setIdCuidador(idCuidador);

        boolean guardado = dao.guardar(caballo);

        if (guardado) {
            JOptionPane.showMessageDialog(this, "Caballo guardado exitosamente.");
            limpiarCajas();
            cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar el caballo.");
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombre = txtNombre.getText();
        String peso = txtPeso.getText();
        Cuidadores cuidadorSeleccionado = (Cuidadores) comboBox.getSelectedItem();

        if (idSeleccionado == -1 || !validarDatos(nombre, peso) || cuidadorSeleccionado == null || cuidadorSeleccionado.getId() == 0) {
            JOptionPane.showMessageDialog(this, "Por favor complete todos los datos correctamente.");
            return;
        }

        int idCuidador = cuidadorSeleccionado.getId();

        Caballos caballo = new Caballos();
        caballo.setId(idSeleccionado);
        caballo.setNombre(nombre);
        caballo.setPeso(peso);
        caballo.setIdCuidador(idCuidador);

        boolean modificado = dao.modificar(caballo);

        if (modificado) {
            JOptionPane.showMessageDialog(this, "Caballo modificado correctamente.");
            limpiarCajas();
            cargarTabla();
            idSeleccionado = -1;
        } else {
            JOptionPane.showMessageDialog(this, "Error al modificar el caballo.");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idSeleccionado != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este caballo?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                boolean eliminado = dao.eliminar(idSeleccionado);
                if (eliminado) {
                    JOptionPane.showMessageDialog(this, "Caballo eliminado correctamente.");
                    cargarTabla();
                    limpiarCajas();
                    idSeleccionado = -1;
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar  caballo.");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int fila = jTable.getSelectedRow();
        if (fila >= 0) {
            idSeleccionado = Integer.parseInt(jTable.getValueAt(fila, 0).toString());
            txtNombre.setText(jTable.getValueAt(fila, 1).toString());
            txtPeso.setText(jTable.getValueAt(fila, 2).toString());
            
            int idCuidador = Integer.parseInt(jTable.getValueAt(fila, 3).toString());
            for (int i = 0; i < comboBox.getItemCount(); i++) {
            Cuidadores jok = comboBox.getItemAt(i);
            if (jok.getId() == idCuidador) {
                comboBox.setSelectedIndex(i);
                break;
            }
        }
        }
    }//GEN-LAST:event_jTableMouseClicked
    private boolean validarDatos(String nombre, String peso) {
        StringBuilder errores = new StringBuilder();
        boolean resul = true;

        if (nombre.isEmpty()) {
            errores.append("El nombre no puede estar vacío.\n");
            resul = false;
        }
        
        if (peso.isEmpty()) {
            errores.append("El peso no puede estar vacío.\n");
            resul = false;
        }
        
        if (!resul) {
            JOptionPane.showMessageDialog(this, errores.toString(), "Errores de validación", JOptionPane.WARNING_MESSAGE);
        }

        return resul;
    }

    
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Nombre", "Peso", "IdCuidador"});

        List<Caballos> caballo = dao.obtenerTodos(); 
        for (Caballos op : caballo) {
            model.addRow(new Object[]{
                op.getId(),
                op.getNombre(),
                op.getPeso(),
                op.getIdCuidador(),
            });
        }

        jTable.setModel(model);
}

    
    private void llenarComboBox() {
        DefaultComboBoxModel<Cuidadores> modelo = new DefaultComboBoxModel<>();
        modelo.addElement(new Cuidadores(0,"Seleccionar"));
        CuidadorDao cuidadorDao = new CuidadorDao();
        List<Cuidadores> lista = cuidadorDao.obtenerTodos();

        comboBox.removeAllItems();

        for (Cuidadores c : lista) {
            comboBox.addItem(c);
        }
    }


        
    public void limpiarCajas(){
        txtNombre.setText("");
        txtPeso.setText("");
        comboBox.setSelectedIndex(0);
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Cuidadores> comboBox;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
