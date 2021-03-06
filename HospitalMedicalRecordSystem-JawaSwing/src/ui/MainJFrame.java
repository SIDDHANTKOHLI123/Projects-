/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Sys;

/**
 *
 * @author kohli
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Sys sys;
    public MainJFrame() {
        initComponents();
        this.sys=new Sys();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblCommunity = new javax.swing.JLabel();
        lblVisit = new javax.swing.JLabel();
        lblPerson = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        lblCommunity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCommunity.setText("COMMUNITY DASHBOARD");
        lblCommunity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCommunityMouseClicked(evt);
            }
        });

        lblVisit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblVisit.setForeground(new java.awt.Color(255, 255, 255));
        lblVisit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVisit.setText("IMPORT DATA");
        lblVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVisitMouseClicked(evt);
            }
        });

        lblPerson.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPerson.setForeground(new java.awt.Color(255, 255, 255));
        lblPerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerson.setText("ADD DETAILS");
        lblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPersonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(lblCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(lblVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVisit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        SplitPane.setTopComponent(jPanel1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture12.jpg"))); // NOI18N
        SplitPane.setRightComponent(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPersonMouseClicked
        // TODO add your handling code here:
        AddDetails adddetails = new AddDetails(this.sys, this);
        SplitPane.setRightComponent(adddetails);
        
    }//GEN-LAST:event_lblPersonMouseClicked

    private void lblCommunityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCommunityMouseClicked
        // TODO add your handling code here:
      displayPanel displaypanel=new displayPanel(this.sys,this);
     SplitPane.setRightComponent(displaypanel);
    }//GEN-LAST:event_lblCommunityMouseClicked

    private void lblVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVisitMouseClicked
        // TODO add your handling code here:
        ImportData importdata=new ImportData(this.sys);
         SplitPane.setRightComponent(importdata);
        
    }//GEN-LAST:event_lblVisitMouseClicked

    
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    public void updateRightJPanel(javax.swing.JPanel newJPanel){
        SplitPane.setRightComponent(newJPanel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JLabel lblVisit;
    // End of variables declaration//GEN-END:variables
}
