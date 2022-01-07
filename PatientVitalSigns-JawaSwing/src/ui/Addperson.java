/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.Sys;

/**
 *
 * @author kohli
 */
public class Addperson extends javax.swing.JPanel {

    /**
     * Creates new form Person
     */
    MainJFrame mainjframe;
    Sys sys;
    Community selectedCommunity=new Community();
    House selectedHouse=new House();
    public Addperson(Sys sys, MainJFrame mainjFrame) {
        initComponents();
        this.sys = sys;
        this.mainjframe = mainjFrame;
        setDropCommunity();
        populateTable();
        isPatientSelected.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblPartition = new javax.swing.JLabel();
        lblcontactno = new javax.swing.JLabel();
        txtContactno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnAddpatient = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        drpdwnCommunityList = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        drpdwnHouseList = new javax.swing.JComboBox<String>();
        lblPatientid = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        isPatientSelected = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        updatebtn = new javax.swing.JButton();
        updatebtn1 = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(102, 0, 102));
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPartition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture12.jpg"))); // NOI18N
        lblPartition.setText("jLabel2");

        lblcontactno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblcontactno.setForeground(new java.awt.Color(255, 255, 255));
        lblcontactno.setText("CONTACT NO:");

        txtContactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactnoKeyPressed(evt);
            }
        });

        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NAME:");

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("AGE:");

        btnAddpatient.setBackground(new java.awt.Color(0, 204, 204));
        btnAddpatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddpatient.setText("Add Person");
        btnAddpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddpatientActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("ADDRESS:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Community:");

        drpdwnCommunityList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drpdwnCommunityList.setForeground(new java.awt.Color(255, 255, 255));
        drpdwnCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdwnCommunityListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select House:");

        drpdwnHouseList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drpdwnHouseList.setForeground(new java.awt.Color(255, 255, 255));
        drpdwnHouseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdwnHouseListActionPerformed(evt);
            }
        });

        lblPatientid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPatientid.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientid.setText("Paitient ID:");

        idlbl.setForeground(new java.awt.Color(255, 255, 255));
        idlbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 102), null, null));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Is Patient:");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 204, 204));
        jRadioButton2.setText("No");

        buttonGroup1.add(isPatientSelected);
        isPatientSelected.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        isPatientSelected.setForeground(new java.awt.Color(0, 204, 204));
        isPatientSelected.setText("Yes");
        isPatientSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isPatientSelectedActionPerformed(evt);
            }
        });

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "House", "ZipCode", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        updatebtn.setBackground(new java.awt.Color(0, 204, 204));
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Delete");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        updatebtn1.setBackground(new java.awt.Color(0, 204, 204));
        updatebtn1.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn1.setText("Update");
        updatebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPartition, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(drpdwnHouseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(drpdwnCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblcontactno)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(lblPatientid, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(isPatientSelected)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddpatient)
                                .addGap(100, 100, 100)
                                .addComponent(updatebtn1))
                            .addComponent(updatebtn))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(drpdwnHouseList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(drpdwnCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(isPatientSelected)
                    .addComponent(jRadioButton2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPatientid)
                    .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContactno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddpatient)
                    .addComponent(updatebtn1))
                .addGap(13, 13, 13)
                .addComponent(updatebtn)
                .addGap(49, 49, 49))
            .addComponent(lblPartition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drpdwnCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpdwnCommunityListActionPerformed
        drpdwnHouseList.removeAllItems();
        for(Community community:this.sys.getCity().getCommunityList()){
            if(community.getName()==drpdwnCommunityList.getSelectedItem()){
                this.selectedCommunity=community;
            }
        }
        for(House house: this.selectedCommunity.getHouses()){
            drpdwnHouseList.addItem(house.getRowno());
        }
    }//GEN-LAST:event_drpdwnCommunityListActionPerformed

    private void drpdwnHouseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpdwnHouseListActionPerformed
        for(House house:this.selectedCommunity.getHouses()){
            if(house.getRowno()==drpdwnHouseList.getSelectedItem()){
                this.selectedHouse=house;
            }
        }

    }//GEN-LAST:event_drpdwnHouseListActionPerformed

    private void isPatientSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isPatientSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isPatientSelectedActionPerformed

    private void btnAddpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddpatientActionPerformed
        // TODO add your handling code here:
        if(txtContactno.getText().equals("")){
             
       JOptionPane.showMessageDialog(null, "Enter a Contact No");  
        return;
       } 
         if(isPatientSelected.isSelected()){
           Patient person = new Patient(txtname.getText(),Integer.parseInt(txtAge.getText()),Long.parseLong(txtContactno.getText()));
           person.setHouse(this.selectedHouse);
           this.sys.getPersonDirectory().addPersonToDirectory(person);
           this.sys.getPatientDirectory().addPatientToDirectory(person);
           this.selectedHouse.addPerson(person);
          idlbl.setText(String.valueOf(person.getPersonID()));
          JOptionPane.showMessageDialog(this,"Patient created ID:"+person.getPersonID());
           
       }
       else{
           Person person = new Person(txtname.getText(),Integer.parseInt(txtAge.getText()),Long.parseLong(txtContactno.getText()));
           person.setHouse(this.selectedHouse);
           this.sys.getPersonDirectory().addPersonToDirectory(person);
           this.selectedHouse.addPerson(person);
           JOptionPane.showMessageDialog(this, "Person Added Successfully!");
        }
        populateTable();
        
       txtname.setText("");
       txtAge.setText("");
       txtContactno.setText("");
       idlbl.setText("");
       
       
    }//GEN-LAST:event_btnAddpatientActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        Person personToRemove=this.sys.getPersonDirectory().getPersonById(Integer.parseInt(String.valueOf(personTable.getValueAt(personTable.getSelectedRow(), 0))));
        this.sys.getPersonDirectory().getPersonList().remove(personToRemove);
        if(personToRemove instanceof Patient){
            this.sys.getPatientDirectory().removePatientFromDirectory((Patient) personToRemove);
        }
        JOptionPane.showMessageDialog(this, "Record Deleted!");
        populateTable();
         
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void updatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn1ActionPerformed
        // TODO add your handling code here:
        UpdatePersonJPanel updatePersonJPanel= new UpdatePersonJPanel(this.sys.getPatientDirectory().getPatientByID(Integer.parseInt(String.valueOf(personTable.getValueAt(personTable.getSelectedRow(), 0)))),this.mainjframe,this.sys);
        this.mainjframe.updateRightJPanel(updatePersonJPanel);
    }//GEN-LAST:event_updatebtn1ActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
       char c =evt.getKeyChar();
if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
txtAge.setEditable(true);
}else{
txtAge.setEditable(false);
JOptionPane.showMessageDialog(null, "Please enter only numbers !");
}
        
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        // TODO add your handling code here:
         char m = evt.getKeyChar();
    if(Character.isDigit(m)){
      txtname.setEditable(false);
      JOptionPane.showMessageDialog(this,"Wrire characters only");
    }
    else{
      txtname.setEditable(true);

    }
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtContactnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactnoKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
txtContactno.setEditable(true);
}else{
txtContactno.setEditable(false);
JOptionPane.showMessageDialog(null, "Please enter only numbers !");
}
    }//GEN-LAST:event_txtContactnoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddpatient;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> drpdwnCommunityList;
    private javax.swing.JComboBox<String> drpdwnHouseList;
    private javax.swing.JLabel idlbl;
    private javax.swing.JRadioButton isPatientSelected;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPartition;
    private javax.swing.JLabel lblPatientid;
    private javax.swing.JLabel lblcontactno;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactno;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton updatebtn1;
    // End of variables declaration//GEN-END:variables

    private void setDropCommunity() {
        for(Community community:this.sys.getCity().getCommunityList()){
           drpdwnCommunityList.addItem(community.getName());
        }
    }

    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        model.setRowCount(0);
        for(Person person: this.sys.getPersonDirectory().getPersonList()){
            Object[] row= new Object[7];
           row[0]=person.getPersonID();
            row[1]=person.getName();
            row[2]=person.getAge();
            row[3]=person.getHouse().getRowno();
            row[4]=person.getHouse().getZipcode();
            row[5]=person.getHouse().getCommunity().getName();
            row[6]=person.getHouse().getCommunity().getCity().getCityName();
            model.addRow(row);
        }
//            for(Patient patient: this.sys.getPatientDirectory().getPatientList()) {
//            Object[] row= new Object[7];
//            row[0]=patient.getId();
//            row[1]=patient.getName();
//            row[2]=patient.getAge();
//            row[3]=patient.getHouse().getRowno();
//            row[4]=patient.getHouse().getZipcode();
//            row[5]=patient.getHouse().getCommunity().getName();
//            row[6]=patient.getHouse().getCommunity().getCity().getCityName();
//            model.addRow(row);
//        }
    }
    }

   

