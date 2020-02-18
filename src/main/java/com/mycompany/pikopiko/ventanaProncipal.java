/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pikopiko;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author maksim
 */
public class ventanaProncipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaProncipal
     */
    ImageIcon image, icono;// Inicialización de objetos ImageIcon
    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
    int height = pantalla.height;
    int width = pantalla.width;

    public ventanaProncipal() {
        initComponents();
        this.setBounds((height/2), (width/2), 600, 500);
        setLocationRelativeTo(null);
        this.setResizable(false);
        image = new ImageIcon("res/Jugar1.png");
        jugar.setIcon(image);
        image = new ImageIcon("res/Salir1.png");
        salir.setIcon(image);
        image = new ImageIcon("res/logo.png");
        logo.setIcon(image);
        image = new ImageIcon("res/Fondo.png");
        fondo.setIcon(image);
        this.setVisible(true);
        
        //Declaración icono
        icono = new ImageIcon("res/minilogo.png");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jugarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jugarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jugarMouseReleased(evt);
            }
        });
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar);
        jugar.setBounds(341, 101, 180, 45);

        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir);
        salir.setBounds(341, 214, 179, 45);
        getContentPane().add(logo);
        logo.setBounds(0, 0, 264, 278);
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        //Array de jugadores
        Object[] jugadores = {2, 3, 4};
        //JOptionPane de lista deplegable con icono
        Object opcion = JOptionPane.showInputDialog(null,"Elige la cantidad de jugadores", "Jugadores",JOptionPane.QUESTION_MESSAGE,icono,jugadores, jugadores[0]);
    }//GEN-LAST:event_jugarActionPerformed

    private void jugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseEntered
        image = new ImageIcon("res/Jugar2.png");
        jugar.setIcon(image);
    }//GEN-LAST:event_jugarMouseEntered

    private void jugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseExited
        image = new ImageIcon("res/Jugar1.png");
        jugar.setIcon(image);
    }//GEN-LAST:event_jugarMouseExited

    private void jugarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMousePressed
        image = new ImageIcon("res/Jugar3.png");
        jugar.setIcon(image);
    }//GEN-LAST:event_jugarMousePressed

    private void jugarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugarMouseReleased
        image = new ImageIcon("res/Jugar1.png");
        jugar.setIcon(image);
    }//GEN-LAST:event_jugarMouseReleased

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        image = new ImageIcon("res/Salir2.png");
        salir.setIcon(image);
    }//GEN-LAST:event_salirMouseEntered

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        image = new ImageIcon("res/Salir1.png");
        salir.setIcon(image);
    }//GEN-LAST:event_salirMouseExited

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        image = new ImageIcon("res/Salir3.png");
        salir.setIcon(image);
    }//GEN-LAST:event_salirMousePressed

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
            java.util.logging.Logger.getLogger(ventanaProncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaProncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaProncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaProncipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaProncipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jugar;
    private javax.swing.JLabel logo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
