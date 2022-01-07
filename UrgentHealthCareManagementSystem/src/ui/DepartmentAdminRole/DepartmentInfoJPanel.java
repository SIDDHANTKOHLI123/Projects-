/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DepartmentAdminRole;

import Business.Department.Department;
import javax.swing.JPanel;



/**
 *
 * @author foram
 */
public class DepartmentInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DepartmentInfoJPanel
     */
    private JPanel CardLayoutJPanel;
    private Department viewDepartment;
    
    public DepartmentInfoJPanel() {
        initComponents();
    }

    public DepartmentInfoJPanel(JPanel CardLayoutJPanel, Department viewDepartment) {
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.viewDepartment = viewDepartment;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        lblDepartmentInfo = new javax.swing.JLabel();
        lblDepartName = new javax.swing.JLabel();
        lblDepartmentAdminName = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        txtDepartmentAdminName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSave.setText("Back");

        lblDepartmentInfo.setBackground(new java.awt.Color(255, 153, 102));
        lblDepartmentInfo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblDepartmentInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepartmentInfo.setText("Department Information");
        lblDepartmentInfo.setOpaque(true);

        lblDepartName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDepartName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDepartName.setText("Department Name: ");

        lblDepartmentAdminName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDepartmentAdminName.setText("Department Admin Name: ");

        txtDepartmentName.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        txtDepartmentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentNameActionPerformed(evt);
            }
        });

        txtDepartmentAdminName.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        txtDepartmentAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentAdminNameActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(255, 153, 102));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\information.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDepartmentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDepartmentAdminName)
                            .addComponent(lblDepartName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDepartmentAdminName)
                                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDepartmentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartName)
                            .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartmentAdminName)
                            .addComponent(txtDepartmentAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(btnUpdate)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblDepartName, lblDepartmentAdminName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartmentAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentAdminNameActionPerformed

    private void txtDepartmentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDepartName;
    private javax.swing.JLabel lblDepartmentAdminName;
    private javax.swing.JLabel lblDepartmentInfo;
    private javax.swing.JTextField txtDepartmentAdminName;
    private javax.swing.JTextField txtDepartmentName;
    // End of variables declaration//GEN-END:variables
}