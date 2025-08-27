package com.mycompany.sistemafinal.views;

import com.mycompany.sistemafinal.model.Operador;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Menu2 extends javax.swing.JFrame {
    private Operador operador;
    public Menu2(Operador operador) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.operador = operador;
      
        panelOperador2 p1 = new panelOperador2(operador);
        ShowPanel(p1);
        
        txtBienvenido.setText("Bienvenido "+operador.getNombre());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBienvenido = new javax.swing.JTextField();
        btnOperador = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        Panel1 = new javax.swing.JPanel();
        btnOperador1 = new javax.swing.JButton();
        btnCuidadores = new javax.swing.JButton();
        btnCarrera = new javax.swing.JButton();
        btnJockey = new javax.swing.JButton();
        btnRemate = new javax.swing.JButton();
        btnTipoJugada = new javax.swing.JButton();
        btnInfoCarrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(66, 32, 66));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE REMATES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        txtBienvenido.setEditable(false);
        txtBienvenido.setBackground(new java.awt.Color(66, 32, 66));
        txtBienvenido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBienvenido.setBorder(null);

        txtBienvenido.setCaretColor(new java.awt.Color(66, 32, 66));
        txtBienvenido.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtBienvenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            }
        });

        btnOperador.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnOperador.setText("OPERADOR");
        btnOperador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperadorActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnCerrar.setBackground(new java.awt.Color(96, 45, 96));
        btnCerrar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("CERRAR SESIÓN");
        btnCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );

        btnOperador1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnOperador1.setText("CABALLOS");
        btnOperador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOperador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperador1ActionPerformed(evt);
            }
        });

        btnCuidadores.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnCuidadores.setText("CUIDADORES");
        btnCuidadores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCuidadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuidadoresActionPerformed(evt);
            }
        });

        btnCarrera.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnCarrera.setText("CARRERA");
        btnCarrera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreraActionPerformed(evt);
            }
        });

        btnJockey.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnJockey.setText("JOCKEY");
        btnJockey.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJockey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJockeyActionPerformed(evt);
            }
        });

        btnRemate.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnRemate.setText("REMATE");
        btnRemate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemateActionPerformed(evt);
            }
        });

        btnTipoJugada.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnTipoJugada.setText("TIPO DE JUGADA");
        btnTipoJugada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTipoJugada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoJugadaActionPerformed(evt);
            }
        });

        btnInfoCarrera.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnInfoCarrera.setText("PARTICIPACIÓN");
        btnInfoCarrera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfoCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtBienvenido)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCuidadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOperador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnJockey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTipoJugada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInfoCarrera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOperador1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuidadores, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJockey, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipoJugada, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperadorActionPerformed
        panelOperador2 p1 = new panelOperador2(operador);
        ShowPanel(p1);
    }//GEN-LAST:event_btnOperadorActionPerformed

    private void btnOperador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperador1ActionPerformed
        panelCaballos p2 = new panelCaballos();
        ShowPanel(p2);
    }//GEN-LAST:event_btnOperador1ActionPerformed

    private void btnCuidadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuidadoresActionPerformed
       panelCuidador p3 = new panelCuidador();
       ShowPanel(p3); 
    }//GEN-LAST:event_btnCuidadoresActionPerformed

    private void btnCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreraActionPerformed
        panelCarrera p4 = new panelCarrera();
        ShowPanel(p4);
    }//GEN-LAST:event_btnCarreraActionPerformed

    private void btnJockeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJockeyActionPerformed
        panelJockey p5 = new panelJockey();
        ShowPanel(p5);
    }//GEN-LAST:event_btnJockeyActionPerformed

    private void btnRemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemateActionPerformed
        panelRemate p6 = new panelRemate(operador);
        ShowPanel(p6);
    }//GEN-LAST:event_btnRemateActionPerformed

    private void btnTipoJugadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoJugadaActionPerformed
        panelTipoJugada p7 = new panelTipoJugada();
        ShowPanel(p7);
    }//GEN-LAST:event_btnTipoJugadaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        this.dispose();     

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnInfoCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCarreraActionPerformed
        panelInfoCarrera p8 = new panelInfoCarrera();
        ShowPanel(p8);
    }//GEN-LAST:event_btnInfoCarreraActionPerformed

    private void ShowPanel(JPanel p){
        p.setSize(499,555);
        p.setLocation(0, 0);
        
        Panel1.removeAll();
        Panel1.add(p, BorderLayout.CENTER);
        Panel1.revalidate();
        Panel1.repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btnCarrera;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCuidadores;
    private javax.swing.JButton btnInfoCarrera;
    private javax.swing.JButton btnJockey;
    private javax.swing.JButton btnOperador;
    private javax.swing.JButton btnOperador1;
    private javax.swing.JButton btnRemate;
    private javax.swing.JButton btnTipoJugada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBienvenido;
    // End of variables declaration//GEN-END:variables
}
