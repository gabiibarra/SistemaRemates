package com.mycompany.sistemafinal.views;
import com.mycompany.sistemafinal.dao.OperadorDao;
import com.mycompany.sistemafinal.model.Operador;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class panelOperador extends javax.swing.JPanel {
    private OperadorDao dao = new OperadorDao();
    public panelOperador() {
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
        txtTelefono = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();

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

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(66, 32, 66));
        jLabel23.setText("TELÉFONO");

        txtTelefono.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(66, 32, 66));
        jLabel25.setText("CONTRASEÑA");

        txtPass.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

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

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTabla);

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

        txtRol.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        txtRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRolActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(66, 32, 66));
        jLabel29.setText("ROL");

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
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txtTelefono)
                            .addComponent(txtPass)
                            .addComponent(txtRol, javax.swing.GroupLayout.Alignment.TRAILING)))
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
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombre = txtNombre.getText();
        String telefono = txtTelefono.getText();
        String pass = txtPass.getText();
        String rol = txtRol.getText();

        if (!validarDatos(nombre, pass, telefono)) return;

        Operador op = new Operador();
        op.setNombre(nombre);
        op.setTelefono(telefono);
        op.setContrasenia(pass);
        op.setRol(rol);

        boolean exito = dao.guardar(op);
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
        String telefono = txtTelefono.getText();
        String pass = txtPass.getText();
        String rol = txtRol.getText();

        boolean cn = true;

        if (idSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un operador para modificar.");
            cn = false;
        }
        if (!validarDatos(nombre, pass, telefono)) {
            cn = false;
        }

        if (cn) {
            Operador op = new Operador();
            op.setId(idSeleccionado); 
            op.setNombre(nombre);
            op.setTelefono(telefono);
            op.setContrasenia(pass);
            op.setRol(rol);

            boolean exito = dao.modificar(op); 
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
            int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar este operador?");
            if (confirm == JOptionPane.YES_OPTION) {
                boolean eliminado = dao.eliminar(idSeleccionado);
                if (eliminado) {
                    JOptionPane.showMessageDialog(this, "Operador eliminado correctamente.");
                    cargarTabla();
                    limpiarCajas();
                    idSeleccionado = -1;
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el operador.");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
      
    }//GEN-LAST:event_txtPassActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked
        int fila = jTabla.getSelectedRow();
        if (fila >= 0) {
            idSeleccionado = Integer.parseInt(jTabla.getValueAt(fila, 0).toString());
            txtNombre.setText(jTabla.getValueAt(fila, 1).toString());
            txtTelefono.setText(jTabla.getValueAt(fila, 2).toString());
            txtPass.setText(jTabla.getValueAt(fila, 3).toString());
            txtRol.setText(jTabla.getValueAt(fila, 4).toString());
        }
    }//GEN-LAST:event_jTablaMouseClicked

    private void txtRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRolActionPerformed
    
    private boolean validarDatos(String nombre, String pass, String telefono) {
        StringBuilder errores = new StringBuilder();
        boolean resul = true;

        if (nombre.isEmpty()) {
            errores.append("El nombre no puede estar vacío.\n");
            resul = false;
        }
        if (telefono.isEmpty()||!numerico(telefono)||telefono.length()>15) {
            errores.append("El teléfono debe contener solo números (hasta 15).\n");
            resul = false;
        }

        if (pass.length() < 4) {
            errores.append("La contraseña debe tener al menos 4 caracteres.\n");
            resul = false;
        }
        if (!resul) {
            JOptionPane.showMessageDialog(this, errores.toString(), "Errores de validación", JOptionPane.WARNING_MESSAGE);
        }

        return resul;
    }

    
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"ID", "Nombre", "Teléfono", "Contraseña", "Rol"});

        List<Operador> operadores = dao.obtenerTodos(); 
        for (Operador op : operadores) {
            model.addRow(new Object[]{
                op.getId(),
                op.getNombre(),
                op.getTelefono(),
                op.getContrasenia(),
                op.getRol()
            });
        }

        jTabla.setModel(model);
}

    
    private boolean numerico(String texto) {
        boolean resul = true;
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                resul = false;
                break;
            }
        }
        return resul;
    }
    
    public void limpiarCajas(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPass.setText("");
        txtRol.setText("");
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
