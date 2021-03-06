/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import Business.Patients.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author foram
 */
public class PatientPersonalInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientPersonalInformationJPanel
     */
     private JPanel CardLayoutJPanel;
    private UserAccount account;
    private Patient patient;
    private boolean isPatientLoggedIn;
    public PatientPersonalInformationJPanel(JPanel CardLayoutJPanel, Patient patient, UserAccount account,boolean isPatientLoggedIn) {
        initComponents();
        this.CardLayoutJPanel = CardLayoutJPanel;
        this.patient = patient;
        this.account = account;
        this.isPatientLoggedIn = isPatientLoggedIn;
          this.txtPatientID.setText(patient.getId()+"");
        this.txtAddress.setText(patient.getAddress());
       this.txtAge.setText(patient.getAge());
       this.txtEmailID.setText(patient.getEmailId());
       this.txtContactDetails.setText(patient.getPhoneNo());
     
       this.txtPatientName.setText(patient.getName());
       //this.jComboboxBloodGroup.removeAllItems();
       this.jComboboxBloodGroup.setSelectedItem(patient.getBloodGroup());
       if(patient.getGender()== "Male" ){
        jRadioBtnMale.setSelected(true) ;
        jRadioBtnFemale.setSelected(false);
        }else {
        jRadioBtnMale.setSelected(true);
        jRadioBtnFemale.setSelected(false);
        }
      
       
       
//       ;
        
        
        this.txtPatientID.setEnabled(false);
       this.txtAddress.setEnabled(false);
       this.txtAge.setEnabled(false);
       this.txtContactDetails.setEnabled(false);
       this.txtEmailID.setEnabled(false);
       this.txtPatientName.setEnabled(false);
       this.jComboboxBloodGroup.setEnabled(false);
       this.jRadioBtnFemale.setEnabled(false);
       this.jRadioBtnMale.setEnabled(false);
       this.jRadioBtnFemale.setEnabled(false);
       this.btnUpdate.setEnabled(true);
       
       this.btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblPatientInfo = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblContactDetails = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblBloodGroup = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContactDetails = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jComboboxBloodGroup = new javax.swing.JComboBox<String>();
        jRadioBtnMale = new javax.swing.JRadioButton();
        jRadioBtnFemale = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 153, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientInfo.setBackground(new java.awt.Color(255, 153, 102));
        lblPatientInfo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblPatientInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientInfo.setText("Register Patient Information");
        lblPatientInfo.setOpaque(true);
        add(lblPatientInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        lblPatientID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPatientID.setText("Patient Id:");
        add(lblPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, 30));

        lblPatientName.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblPatientName.setText("Patient Name:");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 30));

        lblContactDetails.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblContactDetails.setText("Contact Details:");
        add(lblContactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        lblEmailID.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblEmailID.setText("Email ID:");
        add(lblEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 30));

        lblAddress.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 90, 30));

        lblAge.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblAge.setText("Age:");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 30));

        lblGender.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblGender.setText("Gender:");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 90, 30));

        lblBloodGroup.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblBloodGroup.setText("Blood Group:");
        add(lblBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 90, 30));

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });
        add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 206, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 206, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 206, -1));

        txtContactDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactDetailsActionPerformed(evt);
            }
        });
        add(txtContactDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 206, -1));

        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });
        add(txtEmailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 206, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 206, -1));

        jComboboxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-", " " }));
        add(jComboboxBloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 206, -1));

        jRadioBtnMale.setBackground(new java.awt.Color(255, 153, 102));
        buttonGroup2.add(jRadioBtnMale);
        jRadioBtnMale.setText("Male");
        jRadioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnMaleActionPerformed(evt);
            }
        });
        add(jRadioBtnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jRadioBtnFemale.setBackground(new java.awt.Color(255, 153, 102));
        buttonGroup2.add(jRadioBtnFemale);
        jRadioBtnFemale.setText("Female");
        add(jRadioBtnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 240, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtContactDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactDetailsActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayoutJPanel.remove(this);
        CardLayout layout = (CardLayout) CardLayoutJPanel.getLayout();
        layout.previous(CardLayoutJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       this.txtAddress.setEnabled(true);
       this.txtAge.setEnabled(true);
       this.txtContactDetails.setEnabled(true);
       this.txtEmailID.setEnabled(true);
       this.txtPatientName.setEnabled(true);
       this.jComboboxBloodGroup.setEnabled(true);
       this.jRadioBtnFemale.setEnabled(true);
       this.jRadioBtnMale.setEnabled(true);
       this.jRadioBtnFemale.setEnabled(true);
       this.btnUpdate.setEnabled(false);
       this.txtPatientID.setEnabled(false);
       this.btnSave.setEnabled(true);
       
       
       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         if( txtPatientName.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Required field is empty");
           return;
       }
       patient.setAddress(txtAddress.getText());
       patient.setEmailId(txtEmailID.getText());
       patient.setName(txtPatientName.getText());
       patient.setPhoneNo(txtContactDetails.getText());
       patient.setAge(txtAge.getText());
       patient.setBloodGroup(jComboboxBloodGroup.getSelectedItem().toString());
       //patient.setGender(buttonGroup1.getSelection().toString());
        patient.setGender(buttonGroup2.getSelection().toString());
         this.txtAddress.setEnabled(false);
       this.txtAge.setEnabled(false);
       this.txtContactDetails.setEnabled(false);
       this.txtEmailID.setEnabled(false);
       this.txtPatientName.setEnabled(false);
       this.jComboboxBloodGroup.setEnabled(false);
       this.jRadioBtnFemale.setEnabled(false);
       this.jRadioBtnMale.setEnabled(false);
      this.jRadioBtnFemale.setEnabled(false);
      this.btnUpdate.setEnabled(true);
       
       this.btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jRadioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBtnMaleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboboxBloodGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioBtnFemale;
    private javax.swing.JRadioButton jRadioBtnMale;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodGroup;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientInfo;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactDetails;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
