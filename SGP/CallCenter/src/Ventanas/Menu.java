package Ventanas;


import java.sql.Connection;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        btnestado = new javax.swing.JButton();
        btnestadoagente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnagente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");
        setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnestado.setBackground(new java.awt.Color(0, 0, 255));
        btnestado.setForeground(new java.awt.Color(255, 255, 255));
        btnestado.setText("estado");
        btnestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 210, 38));

        btnestadoagente.setBackground(new java.awt.Color(0, 0, 255));
        btnestadoagente.setForeground(new java.awt.Color(255, 255, 255));
        btnestadoagente.setText("estado agente");
        btnestadoagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadoagenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnestadoagente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 210, 33));

        btnagente.setBackground(new java.awt.Color(0, 0, 255));
        btnagente.setForeground(new java.awt.Color(255, 255, 255));
        btnagente.setText("agente");
        btnagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagenteActionPerformed(evt);
            }
        });
        getContentPane().add(btnagente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/call-center.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagenteActionPerformed
        Agente abrir=new Agente();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnagenteActionPerformed

    private void btnestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadoActionPerformed
           Estado abrir=new Estado();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnestadoActionPerformed

    private void btnestadoagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadoagenteActionPerformed
          Estado_agente abrir=new Estado_agente();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnestadoagenteActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagente;
    private javax.swing.JButton btnestado;
    private javax.swing.JButton btnestadoagente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
