/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DepartmentAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Department.Department;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
//import ui.Hospital.ManageDoctorJPanel;

/**
 *
 * @author foram
 */
public class DepartmentAdminJPanel extends javax.swing.JPanel {
    
    private JPanel CardLayoutJPanel;
    private EcoSystem business;
    private UserAccount account;
    
    private Department department;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    /**
     * Creates new form WelcomePatientJPanel
     */
    
    public DepartmentAdminJPanel(JPanel CardLayoutJPanel, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.business = business;
        this.account = account;
        
        //this.department = (Department) this.account.getDetails();
    }
    
  

    /**
     * Creates new form DepartmentAdminJPanel
     */
    public DepartmentAdminJPanel() {
        initComponents();
    }

    /**
     creates department admin panels 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDepartmentInfo = new javax.swing.JButton();
        btnManagePhysicians = new javax.swing.JButton();

        jSplitPane1.setDividerLocation(175);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Department Admin Panel");
        jLabel1.setOpaque(true);

        btnLogout.setBackground(new java.awt.Color(255, 102, 51));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBack.setText("Back");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\webpage.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel1);

        btnDepartmentInfo.setBackground(new java.awt.Color(255, 102, 51));
        btnDepartmentInfo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnDepartmentInfo.setText("Department Information");
        btnDepartmentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentInfoActionPerformed(evt);
            }
        });

        btnManagePhysicians.setBackground(new java.awt.Color(255, 102, 51));
        btnManagePhysicians.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnManagePhysicians.setText("Manage Doctors");
        btnManagePhysicians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePhysiciansActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDepartmentInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
            .addComponent(btnManagePhysicians, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnDepartmentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManagePhysicians, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
         dB4OUtil.storeSystem(business);
        //LoginJPanel loginJPanel = new LoginJPanel(CardLayoutJPanel, business,"");
        //CardLayoutJPanel.add("LoginJPanel", loginJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnManagePhysiciansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePhysiciansActionPerformed
        // TODO add your handling code here:
//        ManageDoctorJPanel managePhysicianJPanel = new ManageDoctorJPanel(CardLayoutJPanel, this.department, this.business);
//        CardLayoutJPanel.add("ManagePhysicianJPanel", managePhysicianJPanel);
//        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
//        layout.next(CardLayoutJPanel); 

       
    }//GEN-LAST:event_btnManagePhysiciansActionPerformed

    private void btnDepartmentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentInfoActionPerformed
        // TODO add your handling code here:
        
        DepartmentInfoJPanel departmentInfoJPanel = new DepartmentInfoJPanel(CardLayoutJPanel, this.department);
        CardLayoutJPanel.add("DepartmentInfoJPanel", departmentInfoJPanel);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel); 
    }//GEN-LAST:event_btnDepartmentInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDepartmentInfo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManagePhysicians;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
