/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.Person;
import model.Sys;
import model.VitalSigns;

/**
 *
 * @author kohli
 */
public class ImportData extends javax.swing.JPanel {

    /**
     * Creates new form ImportData
     */
    Sys sys;
    public ImportData(Sys sys) {
        initComponents();
        this.sys=sys;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPartition = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnImportCommunity = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtImportCommunity = new javax.swing.JTextField();
        btnImportHouse = new javax.swing.JButton();
        txtImportHouse = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(255, 255, 255));

        lblPartition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture12.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Import Community:");

        btnImportCommunity.setBackground(new java.awt.Color(0, 204, 204));
        btnImportCommunity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImportCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnImportCommunity.setText("Import");
        btnImportCommunity.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnImportCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportCommunityActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Import House:");

        txtImportCommunity.setText("C:/Users/kohli/OneDrive/Documents/NetBeansProjects/Assignment4/Book1.csv");
        txtImportCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImportCommunityActionPerformed(evt);
            }
        });

        btnImportHouse.setBackground(new java.awt.Color(0, 204, 204));
        btnImportHouse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnImportHouse.setForeground(new java.awt.Color(255, 255, 255));
        btnImportHouse.setText("Import");
        btnImportHouse.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnImportHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportHouseActionPerformed(evt);
            }
        });

        txtImportHouse.setText("C:/Users/kohli/OneDrive/Documents/NetBeansProjects/Assignment4/Houseno.csv");
        txtImportHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImportHouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblPartition, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtImportCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImportCommunity))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtImportHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImportHouse)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtImportCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnImportCommunity)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtImportHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportHouse))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblPartition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportCommunityActionPerformed
        String path=txtImportCommunity.getText();
        String line="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null){
                String[] records=line.split(",");
                createNewCommunity(records);
            }
            JOptionPane.showMessageDialog(this, "Import Successful!");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "File Not Found!");
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "IO Exception!");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnImportCommunityActionPerformed

    private void btnImportHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportHouseActionPerformed
        String path=txtImportHouse.getText();
        String line="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line=br.readLine())!=null){
                String[] records=line.split(",");
                createNewHouse(records);
            }
            JOptionPane.showMessageDialog(this, "Import Successful!");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "File Not Found!");
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "IO Exception!");
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnImportHouseActionPerformed

    private void txtImportCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImportCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImportCommunityActionPerformed

    private void txtImportHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImportHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImportHouseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImportCommunity;
    private javax.swing.JButton btnImportHouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPartition;
    private javax.swing.JTextField txtImportCommunity;
    private javax.swing.JTextField txtImportHouse;
    // End of variables declaration//GEN-END:variables

    private void createNewHouse(String[] records) throws Exception {
      String houseName=records[0];
      String streetname=records[1];
      long zip=Long.parseLong(records[2]);
        String communityName=records[3];
        Community community=this.sys.getCity().getCommunityByName(communityName);
        if(community==null){
            Exception e = new Exception("Error Importing. Cannot find community"+communityName);
            throw e;
        }
        House house=new House();
        house.setRowno(houseName);
        house.setStreetno(streetname);
        house.setZipcode(zip);
        house.setCommunity(community);
        community.addHouseToCommunity(house);
    }

    private void createNewPerson(String[] records) throws Exception {
        String personName=records[0];
        String houseName=records[1];
        String communityName=records[2];
        int age=Integer.parseInt(records[3]);
        long contactno=Long.parseLong(records[4]);
        Boolean isPatient=false;
        if(records[5].equals("y")||records[5].equals("Y")){
            isPatient=true;
        }
        
        Community community=this.sys.getCity().getCommunityByName(communityName);
        if(community==null){
            Exception e = new Exception("Error Importing. Cannot find community"+communityName);
            throw e;
        }
        //House house=community.getName(houseName);
        if(community==null){
            Exception e = new Exception("Error Importing. Cannot find House "+houseName+" in community "+communityName);
            throw e;
        }
        Person person;
        if(isPatient){
            person=new Patient(personName,age,contactno);
            this.sys.getPatientDirectory().addPatientToDirectory((Patient) person);
        }
        else{
            person=new Person(personName,age,contactno);
            this.sys.getPersonDirectory().addPersonToDirectory(person);
        }
       // person.setHouse(house);
       // house.addPerson(person);
        //house.setRowno(houseName);
        //house.setCommunity(community);
        //community.addHouseToCommunity(house);
         
    }

    private void createNewCommunity(String[] records) {
        //To change body of generated methods, choose Tools | Templates.
       String communityName=records[0];
        Community community = new Community();
        community.setName(communityName);
        community.setCity(this.sys.getCity());
        this.sys.getCity().addCommunityToCity(community);
    }

   
}