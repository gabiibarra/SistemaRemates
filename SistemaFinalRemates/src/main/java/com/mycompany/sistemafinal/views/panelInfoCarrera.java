package com.mycompany.sistemafinal.views;

import com.mycompany.sistemafinal.dao.CaballoDao;
import com.mycompany.sistemafinal.dao.CarreraDao;
import com.mycompany.sistemafinal.dao.InfoCarreraDao;
import com.mycompany.sistemafinal.dao.JockeyDao;
import com.mycompany.sistemafinal.model.Caballos;
import com.mycompany.sistemafinal.model.Carrera;
import com.mycompany.sistemafinal.model.InfoCarrera;
import com.mycompany.sistemafinal.model.Jockey;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class panelInfoCarrera extends javax.swing.JPanel {

    private InfoCarreraDao dao = new InfoCarreraDao();
    public panelInfoCarrera() {
        initComponents();
        cargarTabla();
        llenarCar();
        llenarCab();
        llenarJ();
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
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        comboBoxJockey = new javax.swing.JComboBox<>();
        comboBoxCarrera = new javax.swing.JComboBox<>();
        comboBoxCaballo = new javax.swing.JComboBox<>();

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
        jLabel21.setText("ID_CARRERA");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(66, 32, 66));
        jLabel23.setText("ID_CABALLO");

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(66, 32, 66));
        jLabel25.setText("ID_JOCKEY");

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

        comboBoxJockey.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        comboBoxJockey.setForeground(new java.awt.Color(66, 32, 66));
        comboBoxJockey.setModel(new javax.swing.DefaultComboBoxModel<Jockey>());
        comboBoxJockey.addItem(new Jockey(0, "Seleccionar")); 

        comboBoxCarrera.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        comboBoxCarrera.setForeground(new java.awt.Color(66, 32, 66));
        comboBoxCarrera.setModel(new javax.swing.DefaultComboBoxModel<Carrera>());
        comboBoxCarrera.addItem(new Carrera(0, "Seleccionar")); 

        comboBoxCaballo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        comboBoxCaballo.setForeground(new java.awt.Color(66, 32, 66));
        comboBoxCaballo.setModel(new javax.swing.DefaultComboBoxModel<Caballos>());
        comboBoxCaballo.addItem(new Caballos(0, "Seleccionar")); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxCaballo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxJockey, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(comboBoxJockey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean valido = true;

        Carrera car = (Carrera) comboBoxCarrera.getSelectedItem();
        Caballos cab = (Caballos) comboBoxCaballo.getSelectedItem();
        Jockey joc = (Jockey) comboBoxJockey.getSelectedItem();

        if (!validarDatos(car, cab, joc)) {
            valido = false;
        }

        if (valido) {
            java.sql.Date fechaCarrera = car.getFecha();
            boolean participo = dao.existe(cab.getId(), fechaCarrera);

            if (participo) {
                JOptionPane.showMessageDialog(this, "Este caballo ya participa en otra carrera en esa fecha.");
                valido = false;
            }
        }

        if (valido) {
            InfoCarrera participacion = new InfoCarrera();
            participacion.setIdCarrera(car.getId());
            participacion.setIdCaballo(cab.getId());
            participacion.setIdJokey(joc.getId());

            boolean guardado = dao.guardar(participacion);

            if (guardado) {
                JOptionPane.showMessageDialog(this, "Guardado exitosamente.");
                limpiarCajas();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar.");
            }
        }
                           
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        boolean valido = true;  

        if (idSeleccionado == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una participación para modificar.");
            valido = false;
        }

        Carrera car = (Carrera) comboBoxCarrera.getSelectedItem();
        Caballos cab = (Caballos) comboBoxCaballo.getSelectedItem();
        Jockey joc = (Jockey) comboBoxJockey.getSelectedItem();

        if (!validarDatos(car, cab, joc)) {
            valido = false;
        }

        if (valido) {
            java.sql.Date fechaCarrera = car.getFecha();
            boolean yaParticipa = dao.existeM(cab.getId(), fechaCarrera, idSeleccionado);

            if (yaParticipa) {
                JOptionPane.showMessageDialog(this, "Este caballo ya participa en otra carrera en esa fecha.");
                valido = false;
            }
        }

        if (valido) {
            InfoCarrera participacion = new InfoCarrera();
            participacion.setId(idSeleccionado);
            participacion.setIdCarrera(car.getId());
            participacion.setIdCaballo(cab.getId());
            participacion.setIdJokey(joc.getId());

            boolean modificado = dao.modificar(participacion);

            if (modificado) {
                limpiarCajas();
                cargarTabla();
                idSeleccionado = -1;
                JOptionPane.showMessageDialog(this, "Modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo modificar.");
            }
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
            int idCar = Integer.parseInt(jTable.getValueAt(fila, 1).toString());
            int idCab = Integer.parseInt(jTable.getValueAt(fila, 2).toString());
            int idJo = Integer.parseInt(jTable.getValueAt(fila, 3).toString());
            
            for (int i = 0; i < comboBoxCarrera.getItemCount(); i++) {
            Carrera ca = comboBoxCarrera.getItemAt(i);
            if (ca.getId() == idCar) {
                comboBoxCarrera.setSelectedIndex(i);
                break;
             }
            }
            
            for (int i = 0; i < comboBoxCaballo.getItemCount(); i++) {
            Caballos cab = comboBoxCaballo.getItemAt(i);
            if (cab.getId() == idCab) {
                comboBoxCarrera.setSelectedIndex(i);
                break;
                }
            }
            for (int i = 0; i < comboBoxJockey.getItemCount(); i++) {
            Jockey jo = comboBoxJockey.getItemAt(i);
            if (jo.getId() == idJo) {
                comboBoxJockey.setSelectedIndex(i);
                break;
                }
            }
            
        }
    }//GEN-LAST:event_jTableMouseClicked

    private boolean validarDatos(Carrera carrera, Caballos caballo, Jockey jockey) {
        StringBuilder errores = new StringBuilder();
        boolean valido = true;

        if (carrera == null) {
            errores.append("Debe seleccionar una carrera.\n");
            valido = false;
        }

        if (caballo == null) {
            errores.append("Debe seleccionar un caballo.\n");
            valido = false;
        }

        if (jockey == null) {
            errores.append("Debe seleccionar un jockey.\n");
            valido = false;
        }

        if (!valido) {
            JOptionPane.showMessageDialog(this, errores.toString(), "Error de validación", JOptionPane.WARNING_MESSAGE);
        }

        return valido;
    }
    
    private void cargarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"IdCarrera", "IdCabllo", "IdJockey"});
        List<InfoCarrera> iC = dao.obtenerTodos();
        for (InfoCarrera fila : iC) {
           model.addRow(new Object[]{
                fila.getIdCarrera(),
                fila.getIdCaballo(),
                fila.getIdJokey()
            });
        }

        jTable.setModel(model);
    }
    
    private void llenarCar() {
           DefaultComboBoxModel<Carrera> modelo = new DefaultComboBoxModel<>();
           modelo.addElement(new Carrera(0,"Seleccionar"));

           CarreraDao carDao = new CarreraDao();
           List<Carrera> lista = carDao.obtenerTodos();

           for (Carrera c : lista) {
               modelo.addElement(c);
           }

           comboBoxCarrera.setModel(modelo);
   }
    
    private void llenarCab() {
           DefaultComboBoxModel<Caballos> modelo = new DefaultComboBoxModel<>();
           modelo.addElement(new Caballos(0,"Seleccionar"));

           CaballoDao cabDao = new CaballoDao();
           List<Caballos> lista = cabDao.obtenerTodos();

           for (Caballos c : lista) {
               modelo.addElement(c);
           }

           comboBoxCaballo.setModel(modelo);
   }
    
    private void llenarJ() {
           DefaultComboBoxModel<Jockey> modelo = new DefaultComboBoxModel<>();
           modelo.addElement(new Jockey(0,"Seleccionar"));

           JockeyDao jocDao = new JockeyDao();
           List<Jockey> lista = jocDao.obtenerTodos();

           for (Jockey j : lista) {
               modelo.addElement(j);
           }

           comboBoxJockey.setModel(modelo);
   }
    
    
    public void limpiarCajas(){
       comboBoxCarrera.setSelectedIndex(0);
       comboBoxCaballo.setSelectedIndex(0);
       comboBoxJockey.setSelectedIndex(0);
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Caballos> comboBoxCaballo;
    private javax.swing.JComboBox<Carrera> comboBoxCarrera;
    private javax.swing.JComboBox<Jockey> comboBoxJockey;
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
    // End of variables declaration//GEN-END:variables
}
