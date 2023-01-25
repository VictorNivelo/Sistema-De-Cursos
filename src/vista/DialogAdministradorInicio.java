/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Victor
 */
public class DialogAdministradorInicio extends javax.swing.JFrame {

    /**
     * Creates new form DialogAdministradorInicio
     */
    public DialogAdministradorInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
//        this.setLocation(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblAdministradorDocentes = new javax.swing.JLabel();
        lblAdministradorCarreras = new javax.swing.JLabel();
        lblAdministradorAlumnos = new javax.swing.JLabel();
        lblAdministradorAsignaturas = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        lblAdministradorAsistencias = new javax.swing.JLabel();
        lblAdministradorCuentas = new javax.swing.JLabel();
        lblAdministradorAdministradores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));

        lblAdministradorDocentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoDocentes.png"))); // NOI18N
        lblAdministradorDocentes.setText("ADMINISTRAR DOCENTES");
        lblAdministradorDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorDocentesMouseClicked(evt);
            }
        });

        lblAdministradorCarreras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorCarreras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoCarreras.png"))); // NOI18N
        lblAdministradorCarreras.setText("ADMINISTRAR CARRERAS");
        lblAdministradorCarreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorCarrerasMouseClicked(evt);
            }
        });

        lblAdministradorAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoAlumnos.png"))); // NOI18N
        lblAdministradorAlumnos.setText("ADMINISTRAR ALUMNOS");
        lblAdministradorAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorAlumnosMouseClicked(evt);
            }
        });

        lblAdministradorAsignaturas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorAsignaturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoAsignaturas.png"))); // NOI18N
        lblAdministradorAsignaturas.setText("ADMINISTRAR ASIGNATURAS");
        lblAdministradorAsignaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorAsignaturasMouseClicked(evt);
            }
        });

        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        lblAdministradorAsistencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoAsistencia.png"))); // NOI18N
        lblAdministradorAsistencias.setText("ADMINISTRAR ASISTENCIAS");
        lblAdministradorAsistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorAsistenciasMouseClicked(evt);
            }
        });

        lblAdministradorCuentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoCuentas.png"))); // NOI18N
        lblAdministradorCuentas.setText("ADMINISTRAR CUENTAS");
        lblAdministradorCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorCuentasMouseClicked(evt);
            }
        });

        lblAdministradorAdministradores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministradorAdministradores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IconoAdministrador.png"))); // NOI18N
        lblAdministradorAdministradores.setText("ADMINISTRAR ADMINISTRADORES");
        lblAdministradorAdministradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministradorAdministradoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdministradorDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorCarreras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorAsistencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorCuentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministradorAdministradores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAdministradorAdministradores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorCuentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorCarreras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorAsignaturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorDocentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorAlumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministradorAsistencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        DialogoAdmLogin dal = new DialogoAdmLogin();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void lblAdministradorAdministradoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorAdministradoresMouseClicked
        // TODO add your handling code here:
        DialogoAdmAdministrador dal = new DialogoAdmAdministrador();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorAdministradoresMouseClicked

    private void lblAdministradorCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorCuentasMouseClicked
        // TODO add your handling code here:
        DialogoAdmCuenta dal = new DialogoAdmCuenta();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorCuentasMouseClicked

    private void lblAdministradorAsistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorAsistenciasMouseClicked
        // TODO add your handling code here:
        DialogoAdmAsistencia dal = new DialogoAdmAsistencia();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorAsistenciasMouseClicked

    private void lblAdministradorDocentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorDocentesMouseClicked
        // TODO add your handling code here:
        DialogoAdmDocente dal = new DialogoAdmDocente();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorDocentesMouseClicked

    private void lblAdministradorAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorAlumnosMouseClicked
        // TODO add your handling code here:
        DialogoAdmAlumno dal = new DialogoAdmAlumno();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorAlumnosMouseClicked

    private void lblAdministradorAsignaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorAsignaturasMouseClicked
        // TODO add your handling code here:
        DialogoAdmAsignatura dal = new DialogoAdmAsignatura();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorAsignaturasMouseClicked

    private void lblAdministradorCarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministradorCarrerasMouseClicked
        // TODO add your handling code here:
        DialogoAdmCarrera dal = new DialogoAdmCarrera();
        dal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAdministradorCarrerasMouseClicked

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
            java.util.logging.Logger.getLogger(DialogAdministradorInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAdministradorInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAdministradorInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAdministradorInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogAdministradorInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAdministradorAdministradores;
    public static javax.swing.JLabel lblAdministradorAlumnos;
    public static javax.swing.JLabel lblAdministradorAsignaturas;
    private javax.swing.JLabel lblAdministradorAsistencias;
    public static javax.swing.JLabel lblAdministradorCarreras;
    private javax.swing.JLabel lblAdministradorCuentas;
    public static javax.swing.JLabel lblAdministradorDocentes;
    // End of variables declaration//GEN-END:variables
}
