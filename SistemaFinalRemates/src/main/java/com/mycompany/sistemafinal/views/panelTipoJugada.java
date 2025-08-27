package com.mycompany.sistemafinal.views;

import com.mycompany.sistemafinal.dao.JugadaDao;
import com.mycompany.sistemafinal.model.TipoJugada;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelTipoJugada extends javax.swing.JPanel {
    private JugadaDao dao = new JugadaDao();
    public panelTipoJugada() {
        initComponents();
        cargarTabla();
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
        txtPorcentaje = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDes = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(66, 32, 66));
        jLabel23.setText("PORCENTAJE");

        txtPorcentaje.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPorcentaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(66, 32, 66));
        jLabel25.setText("DESCRIPCIÓN");

        txtDes.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtDes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

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
                            .addComponent(txtPorcentaje)
                            .addComponent(txtDes)))
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
                    .addComponent(txtPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String p = txtPorcentaje.getText();
        String des = txtDes.getText();
        boolean cn = true;

        int porcentaje = 0;
        try {
            porcentaje = Integer.parseInt(p);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El porcentaje debe ser un número entero válido.", "Error de formato", JOptionPane.WARNING_MESSAGE);
            cn = false;
        }

        if (!validarDatos(nombre, porcentaje, des)) {
            return;
        }

        TipoJugada tp = new TipoJugada();
        tp.setNombre(nombre);
        tp.setPorcentaje(porcentaje);
        tp.setDescripcion(des);
        
        boolean exito = dao.guardar(tp);
        if (exito) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            cargarTabla();
            limpiarCajas();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String nombre = txtNombre.getText();
        String p = txtPorcentaje.getText(); 
        String des = txtDes.getText();
        boolean cn = true;

        int porcentaje = 0; 

        if (idSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione na jugada para modificar.");
            cn = false;
        }

        try {
            porcentaje = Integer.parseInt(p);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El porcentaje debe ser un número entero válido.");
            cn = false;
        }

        if (!validarDatos(nombre, porcentaje, des)) {
            cn = false;
        }

        if (cn) {
            TipoJugada tp = new TipoJugada();
            tp.setId(idSeleccionado); 
            tp.setNombre(nombre);
            tp.setPorcentaje(porcentaje);
            tp.setDescripcion(des);
           
            boolean exito = dao.modificar(tp); 
            if (exito) {
                JOptionPane.showMessageDialog(this, "Modificación exitosa");
                cargarTabla();
                limpiarCajas();
                idSeleccionado = -1;
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar");
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idSeleccionado != -1) {
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este jugada?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                boolean eliminado = dao.eliminar(idSeleccionado);
                if (eliminado) {
                    JOptionPane.showMessageDialog(this, "Jugada eliminado correctamente.");
                    cargarTabla();
                    limpiarCajas();
                    idSeleccionado = -1;
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la jugada.");
                }
            }
        } 
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
       
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int fila = jTable.getSelectedRow();
        if (fila >= 0) {
            idSeleccionado = Integer.parseInt(jTable.getValueAt(fila, 0).toString());
            txtNombre.setText(jTable.getValueAt(fila, 1).toString());
            txtPorcentaje.setText(jTable.getValueAt(fila, 2).toString());
            txtDes.setText(jTable.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_jTableMouseClicked
    private boolean validarDatos(String nombre, int porcentaje, String des) {
        StringBuilder errores = new StringBuilder();
        boolean resul = true;

        if (nombre.isEmpty()) {
            errores.append("El nombre no puede estar vacío.\n");
            resul = false;
        }
        if (porcentaje <= 0) {
            errores.append("El porcentaje debe ser mayor que cero.\n");
            resul = false;
        }

        if (des.isEmpty()) {
            errores.append("La localidad no puede estar vacío.\n");
            resul = false;
        }
        
        if (!resul) {
            JOptionPane.showMessageDialog(this, errores.toString(), "Errores de validación", JOptionPane.WARNING_MESSAGE);
        }

        return resul;
    }

    
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Nombre", "Porcentaje", "Descripcion"});

        List<TipoJugada> tp = dao.obtenerTodos();
        for (TipoJugada fila : tp) {
           model.addRow(new Object[]{
                fila.getId(),
                fila.getNombre(),
                fila.getPorcentaje(),
                fila.getDescripcion()
            });
        }
        jTable.setModel(model);
    }
    
    
        
    public void limpiarCajas(){
        txtNombre.setText("");
        txtPorcentaje.setText("");
        txtDes.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
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
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorcentaje;
    // End of variables declaration//GEN-END:variables
}
