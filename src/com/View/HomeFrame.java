/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class HomeFrame extends javax.swing.JFrame {

    
    
    public HomeFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ButtonClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setTitle("My memo");
        jFrame1.setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("!AHOY CARATS!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 310, 100));

        Button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button1.setText("Subscribe");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        jPanel1.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 120, 50));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<html> <body> <p>New to being a carat? <br> Join our community NOW!! </p> </body> </html>");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 220, 60));

        Button2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Button2.setText("<html>\n<body>\n<p> Log out</p>\n</body>\n</html>");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        jPanel1.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, 150, 40));

        Button3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Button3.setText("<html>\n<body>\n<p> LOGIN </p>\n</body>\n</html>");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        jPanel1.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 120, 40));

        Button5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Button5.setText("<html>\n<body>\n<p> Create a NEW Channel </p>\n</body>\n</html>");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        jPanel1.add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 40));

        Button4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        Button4.setText("<html>\n<body>\n<p> My memo</p>\n</body>\n</html>");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        jPanel1.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        ButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/c2.jpg"))); // NOI18N
        ButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCloseActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 70, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 798, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        MyMemo mm1 = new MyMemo();
        mm1.setVisible(true);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed

        UserFrame hb1 = new UserFrame();
        hb1.setVisible(true);
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        LoginFrame1 lg1 = new LoginFrame1();
        lg1.setVisible(true);
    }//GEN-LAST:event_Button3ActionPerformed

    private void ButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ButtonCloseActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        ChannelFrame2 ch1 = new ChannelFrame2();
        ch1.setVisible(true);
    }//GEN-LAST:event_Button5ActionPerformed
/**/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton ButtonClose;
    public javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
