package com.mycompany.sistemafinal.views;


import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.sistemafinal.dao.InfoCarreraDao;
import com.mycompany.sistemafinal.dao.JugadaDao;
import com.mycompany.sistemafinal.dao.RemateDao;
import com.mycompany.sistemafinal.model.InfoCarrera;
import com.mycompany.sistemafinal.model.Operador;
import com.mycompany.sistemafinal.model.Remate;
import com.mycompany.sistemafinal.model.TipoJugada;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class panelRemate extends javax.swing.JPanel {
    
    private Operador operador; 
    private RemateDao dao = new RemateDao();
    public panelRemate(Operador operador) {
        this.operador = operador;
        initComponents();
        cargarTabla();
        llenarC();
        llenarJ();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtPago = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        cComboBox = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtCobro = new javax.swing.JTextField();
        jComboBox = new javax.swing.JComboBox<>();

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

        txtPago.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtPago.setForeground(new java.awt.Color(66, 32, 66));
        txtPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        txtPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPagoActionPerformed(evt);
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

        cComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cComboBox.setForeground(new java.awt.Color(66, 32, 66));
        cComboBox.setModel(new javax.swing.DefaultComboBoxModel<InfoCarrera>());
        cComboBox.addItem(new InfoCarrera(0, 0)); 

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(66, 32, 66));
        jLabel29.setText("ID_JUGADA");

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(66, 32, 66));
        jLabel30.setText("IMPORTE DE PAGO");

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(66, 32, 66));
        jLabel31.setText("IMPORTE DE COBRO");

        txtCobro.setEditable(false);
        txtCobro.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtCobro.setForeground(new java.awt.Color(66, 32, 66));
        txtCobro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 32, 66)));
        txtCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCobroActionPerformed(evt);
            }
        });

        jComboBox.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBox.setForeground(new java.awt.Color(66, 32, 66));
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<TipoJugada>());
        jComboBox.addItem(new TipoJugada(0, "Seleccionar")); 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPago)
                        .addComponent(txtCobro)
                        .addComponent(cComboBox, 0, 229, Short.MAX_VALUE))
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        InfoCarrera carrera = (InfoCarrera) cComboBox.getSelectedItem();
        TipoJugada jugada = (TipoJugada) jComboBox.getSelectedItem();
        String pagoTexto = txtPago.getText();

        if (validarDatos(pagoTexto, carrera, jugada)) {
            try {
                float pago = Float.parseFloat(pagoTexto);
                float porcentaje = jugada.getPorcentaje();
                float cobro = pago - ((porcentaje / 100.0f) * pago);

                txtCobro.setText(String.format("%.2f", cobro));

                Remate rm = new Remate();
                rm.setIdInfoCarrera(carrera.getIdCarrera());
                rm.setIdTipoJugada(jugada.getId());
                rm.setImportePagado(pago);
                rm.setImporteCobrar(cobro);
                rm.setIdOperador(operador.getId());
                
                

                boolean exito = dao.guardar(rm);

                if (exito) {
                    JOptionPane.showMessageDialog(this, "Guardado correctamente.");
                    cargarTabla();
                    limpiarCajas();
                    imprimirPDF();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar.");
                }

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al convertir el importe de pago.");
                } 
            }
 

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoActionPerformed

    private void txtCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCobroActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
    }//GEN-LAST:event_jTableMouseClicked

    private void cargarTabla() {
    List<Remate> lista = dao.obtenerTodos();

    DefaultTableModel model = new DefaultTableModel(
        new String[]{ "Id","idCarrera", "Operador", "Pagado", "Cobrar", "Tipo Jugada"},
        0
    );

    for (Remate remate : lista) {
        model.addRow(new Object[]{
            remate.getId(),
            remate.getIdInfoCarrera(),
            remate.getIdOperador(),
            remate.getImportePagado(),
            remate.getImporteCobrar(),
            remate.getIdTipoJugada()
        });
    }

    jTable.setModel(model);
}

    
    
    private void llenarC(){
        DefaultComboBoxModel<InfoCarrera> modelo = new DefaultComboBoxModel<>();
        modelo.addElement(new InfoCarrera(0,0));

        InfoCarreraDao ca = new InfoCarreraDao();
        List<InfoCarrera> lista = ca.obtenerTodos();

        for (InfoCarrera c : lista) {
            modelo.addElement(c);
        }

        cComboBox.setModel(modelo);

    }
    
    private void llenarJ() {
        DefaultComboBoxModel<TipoJugada> modelo = new DefaultComboBoxModel<>();
        modelo.addElement(new TipoJugada(0,"Seleccionar"));

        JugadaDao tj = new JugadaDao();
        List<TipoJugada> lista = tj.obtenerTodos();

        for (TipoJugada j : lista) {
            modelo.addElement(j);
        }

       jComboBox.setModel(modelo);
    }

     
    private boolean validarDatos(String pago, InfoCarrera carrera, TipoJugada jugada) {
        boolean valido = true;
        StringBuilder errores = new StringBuilder();

        if (carrera == null || carrera.getIdCarrera()== 0) {
            errores.append("Debe seleccionar una carrera.\n");
            valido = false;
        }

        if (jugada == null || jugada.getId() == 0) {
            errores.append("Debe seleccionar un tipo de jugada.\n");
            valido = false;
        }

        if (!esFloatValido(pago)) {
            errores.append("El importe de pago no es válido.\n");
            valido = false;
        }

        if (!valido) {
            JOptionPane.showMessageDialog(this, errores.toString(), "Errores de validación", JOptionPane.WARNING_MESSAGE);
        }

        return valido;
    }

    private void imprimirPDF() {
        try {
            String fechaHora = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String rutaArchivo = "C:/Users/Usuaario/Downloads/remate_" + fechaHora + ".pdf"; 

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
            documento.open();

            documento.add(new Paragraph("====== TICKET DE REMATE ======"));
            documento.add(new Paragraph("Fecha y hora: " + new Date()));
            documento.add(new Paragraph(" "));

            int ultimaFila = jTable.getRowCount() - 1;

            documento.add(new Paragraph("Operador: " + jTable.getValueAt(ultimaFila, 1)));
            documento.add(new Paragraph("ID Carrera: " + jTable.getValueAt(ultimaFila, 2)));
            documento.add(new Paragraph("ID Caballo: " + jTable.getValueAt(ultimaFila, 3)));
            documento.add(new Paragraph("Importe: $" + jTable.getValueAt(ultimaFila, 4)));
            documento.add(new Paragraph("ID Remate: " + jTable.getValueAt(ultimaFila, 0)));

            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("Gracias por participar"));
            documento.add(new Paragraph("=============================="));

            documento.close();

            System.out.println("Ticket generado: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    
    
    private boolean esFloatValido(String texto) {
    boolean valido;
    try {
        Float.valueOf(texto);
        valido = true;
    } catch (NumberFormatException e) {
        valido = false;
    }
    return valido;
}


    
    public void limpiarCajas(){
        txtPago.setText("");
        txtCobro.setText("");
        cComboBox.setSelectedIndex(0);
        jComboBox.setSelectedIndex(0);
                
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<InfoCarrera> cComboBox;
    private javax.swing.JButton jButton10;
    private javax.swing.JComboBox<TipoJugada> jComboBox;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField txtCobro;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
