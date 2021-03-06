/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.LabRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kohli
 */
public class UserHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserHistoryJPanel
     */
    
    private JPanel CardLayoutJPanel;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;

    
    
    
    public UserHistoryJPanel(JPanel CardLayoutJPanel, Patient patient, UserAccount account,Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.CardLayoutJPanel=CardLayoutJPanel;
        this.organization=organization;
        this.enterprise=enterprise;
        this.account=account;
        this.business=business;

        populateWorkAreaTable();

    }

    public void populateWorkAreaTable(){

        DefaultTableModel model = (DefaultTableModel) tblUserHistory.getModel();
        //Delete empty rows
        model.setRowCount(0);
        for(WorkRequest workReq:account.getWorkQueue().getWorkRequestList()){
        Object[] row = new Object[3]; // Number of elements in the table - 6
        if(!workReq.getStatus().equals("Completed") && !workReq.getStatus().equals("Assigned to lab") && !workReq.getStatus().equals("Lab Test Completed")&& !workReq.getStatus().equals("Prescription") && !workReq.getStatus().equals("Requested Pharmacy") && !workReq.getStatus().equals("Delivered by pharma")&& !workReq.getStatus().equals("Rejected") ){
        continue;
        }
        row[0] = workReq.getSender();
        try{
        row[1] = ((DoctorRequest)workReq).getTimeSlot();
        }catch(Exception e){
        try{
        row[1] = ((LabRequest)workReq).getDoctorRequest().getTimeSlot();
        }
        catch(Exception f){
        row[1]= "-";
        }
        }
        row[2] = workReq;
        model.addRow(row);
    }

}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserHistory = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnSendReq = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblUserHistory.setBackground(new java.awt.Color(255, 102, 51));
        tblUserHistory.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tblUserHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Physician", "Time Slot", "Status"
            }
        ));
        tblUserHistory.setGridColor(new java.awt.Color(255, 255, 255));
        tblUserHistory.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblUserHistory.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblUserHistory.setShowGrid(true);
        jScrollPane1.setViewportView(tblUserHistory);

        btnBack.setBackground(new java.awt.Color(255, 153, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(255, 153, 102));
        btnView.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblTitle.setBackground(new java.awt.Color(255, 153, 102));
        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("User History");
        lblTitle.setOpaque(true);

        btnSendReq.setBackground(new java.awt.Color(255, 153, 102));
        btnSendReq.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnSendReq.setText("Send Request to Pharmacy");
        btnSendReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReqActionPerformed(evt);
            }
        });

        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnSendReq, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSendReq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int row = tblUserHistory.getSelectedRow();

        if(row < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row");
        return;
        }
        else if(tblUserHistory.getValueAt(row, 2).toString().equals("Lab Test Completed")){
        LabRequest wq = (LabRequest)tblUserHistory.getValueAt(row, 2);
        lblImage.setIcon(new ImageIcon(wq.getFileDir()));
        }       
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSendReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReqActionPerformed
        // TODO add your handling code here:
        
        int row = tblUserHistory.getSelectedRow();

        if(row < 0) {
        JOptionPane.showMessageDialog(null, "Please select a row");
        return;
        }
        else if(tblUserHistory.getValueAt(row, 2).toString().equals("Prescription")){

        DoctorRequest wq = (DoctorRequest)tblUserHistory.getValueAt(row, 2);
        RequestPharmacy requestPharmacy=new RequestPharmacy(CardLayoutJPanel, account, organization, enterprise,business,wq);
        CardLayoutJPanel.add("requestPharmacy", requestPharmacy);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.next(CardLayoutJPanel);

        }
    }//GEN-LAST:event_btnSendReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSendReq;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblUserHistory;
    // End of variables declaration//GEN-END:variables
}
