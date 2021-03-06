/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorDepartmentOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kohli
 */
public class SchedulePatientAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SchedulePatientAppointmentJPanel
     */
    private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Patient patient;
    private boolean isPatientLoggedIn;
    private Enterprise ent;
    private EcoSystem business;
    
    public SchedulePatientAppointmentJPanel(JPanel CardLayoutJPanel, Patient patient, UserAccount account,boolean isPatientLoggedIn,Enterprise ent,EcoSystem business) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.patient = patient;
        this.account = account;
        this.ent = ent;
        this.business=business;
        this.isPatientLoggedIn = isPatientLoggedIn;
        populateHospitals();
        //populateDepartment();
        //populateDoctors();
    }

    
    public void populateHospitals(){
        cmbHospital.removeAllItems();
        
        for(Enterprise ent:business.getNetwork("Boston").getEnterpriseDirectory().getEnterpriseList()){
            if(!ent.getEnterpriseType().toString().equals("Hospital")){
                continue;
            }
            cmbHospital.addItem(ent);
        }
        //((HospitalEnterprise)ent).getOrganizationDirectory().getOrganization(Organization.Type.Hospital);
        
    }
    
    public void populateDepartment(){
        cmbDepartment.removeAllItems();
        
        HospitalEnterprise hosEnt = (HospitalEnterprise)cmbHospital.getSelectedItem();
        
        for(Organization org:hosEnt.getOrganizationDirectory().getOrganizationList()){
            
            if(!org.getType().toString().equals(Organization.Type.DoctorDepartment.toString())){
                continue;
            }
            cmbDepartment.addItem(org);
        }
        //((HospitalEnterprise)ent).getOrganizationDirectory().getOrganization(Organization.Type.Hospital);
        
    }
    
    public void populateDoctors(){
        cmbDoctor.removeAllItems();
        
        DoctorDepartmentOrganization docDepOrg = (DoctorDepartmentOrganization)cmbDepartment.getSelectedItem();
        
        for(Doctor doc:docDepOrg.getDoctorDirectory().getDoctorlist()){
            cmbDoctor.addItem(doc.getEmp());
        }
        //((HospitalEnterprise)ent).getOrganizationDirectory().getOrganization(Organization.Type.Hospital);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblHospital = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox();
        lblPhysician = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox();
        lblDate = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmbHospital = new javax.swing.JComboBox();
        cmbtime = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setBackground(new java.awt.Color(255, 153, 102));
        lblTitle.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SCHEDULE YOUR APPOINTMENT");
        lblTitle.setOpaque(true);

        lblHospital.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblHospital.setText("HOSPITAL :");

        lblDepartment.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDepartment.setText("DEPARTMENT:");

        cmbDepartment.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        lblPhysician.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPhysician.setText("PHYSICIAN:");

        cmbDoctor.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblDate.setText("DATE:");

        btnBook.setBackground(new java.awt.Color(255, 102, 51));
        btnBook.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        btnBook.setText("BOOK NOW");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbHospital.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbHospital.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHospitalItemStateChanged(evt);
            }
        });
        cmbHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospitalActionPerformed(evt);
            }
        });

        cmbtime.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        cmbtime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NA", "8-9", "9-10", "10-11", "11-12", "12-13", "13-14", "14-15", "15-16", "16-17", "17-18", "18-19" }));
        cmbtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtimeActionPerformed(evt);
            }
        });

        jButton2.setText("*");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\foram\\Downloads\\appointmnet.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhysician)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(lblHospital))
                                    .addComponent(lblDepartment)
                                    .addComponent(lblDate))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cmbtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBook)
                                .addGap(34, 34, 34)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHospital)
                            .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDepartment)
                            .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhysician)
                            .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(cmbtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btnBook)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        
        //Get doctors work requests
        Employee selectedDoc = ((Employee)cmbDoctor.getSelectedItem());
        DoctorDepartmentOrganization docCep = (DoctorDepartmentOrganization)cmbDepartment.getSelectedItem();
        UserAccount userDoc = docCep.getUserAccountDirectory().getUserAccountByEmployee(selectedDoc);

        boolean appointmentAvailable = true;
        for(WorkRequest wq: userDoc.getWorkQueue().getWorkRequestList()){
            
            if(((DoctorRequest)wq).getTimeSlot().equals(cmbtime)){
                JOptionPane.showMessageDialog(this, "Doctor unavailable");
                appointmentAvailable = false;
                return;
            }
        }
        
        if(appointmentAvailable){
            DoctorRequest docReq = new DoctorRequest();
            docReq.setSender(account);
            docReq.setReceiver(userDoc);
            docReq.setStatus("Booked");
            docReq.setTimeSlot((String)cmbtime.getSelectedItem());
            userDoc.getWorkQueue().getWorkRequestList().add(docReq);
            account.getWorkQueue().getWorkRequestList().add(docReq);
            JOptionPane.showMessageDialog(this, "Appointment booked");
        }
        
            
    }//GEN-LAST:event_btnBookActionPerformed

    private void cmbHospitalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHospitalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospitalItemStateChanged

    private void cmbHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateDepartment();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateDoctors();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoctorActionPerformed

    private void cmbtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JComboBox cmbDepartment;
    private javax.swing.JComboBox cmbDoctor;
    private javax.swing.JComboBox cmbHospital;
    private javax.swing.JComboBox cmbtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblHospital;
    private javax.swing.JLabel lblPhysician;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
