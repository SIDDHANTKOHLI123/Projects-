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
import model.Sys;

/**
 *
 * @author kohli
 */
public class HousePanel extends javax.swing.JPanel {

    /**
     * Creates new form HousePanel
     */
    MainJFrame mainjframe;
    Sys sys;
    public HousePanel(Sys sys, MainJFrame mainjFrame) {
        initComponents();
        this.sys = sys;
        this.mainjframe = mainjFrame;
        for(Community community: this.sys.getCity().getCommunityList()){
            drpdownCommunityList.addItem(community.getName());
        }
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHouseName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        drpdownCommunityList = new javax.swing.JComboBox<String>();
        jScrollPane1 = new javax.swing.JScrollPane();
        houseTable = new javax.swing.JTable();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        lblStreetno = new javax.swing.JLabel();
        lblZipcode = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        txtHouseName.setBackground(new java.awt.Color(0, 204, 204));
        txtHouseName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtHouseName.setForeground(new java.awt.Color(255, 255, 255));
        txtHouseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter House Name:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select community to add house to:");

        drpdownCommunityList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drpdownCommunityList.setForeground(new java.awt.Color(255, 255, 255));
        drpdownCommunityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drpdownCommunityListActionPerformed(evt);
            }
        });

        houseTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        houseTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        houseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "House", "Street", "Zip", "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(houseTable);

        btnSubmit.setBackground(new java.awt.Color(0, 204, 204));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Picture12.jpg"))); // NOI18N

        txtStreet.setBackground(new java.awt.Color(0, 204, 204));
        txtStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStreet.setForeground(new java.awt.Color(255, 255, 255));
        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        lblStreetno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStreetno.setForeground(new java.awt.Color(255, 255, 255));
        lblStreetno.setText("Street No:");

        lblZipcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblZipcode.setForeground(new java.awt.Color(255, 255, 255));
        lblZipcode.setText("Zipcode");

        txtZip.setBackground(new java.awt.Color(0, 204, 204));
        txtZip.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtZip.setForeground(new java.awt.Color(255, 255, 255));
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(drpdownCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStreetno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drpdownCommunityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetno, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(btnSubmit)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHouseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseNameActionPerformed

    private void drpdownCommunityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drpdownCommunityListActionPerformed

    }//GEN-LAST:event_drpdownCommunityListActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        House house = new House();
        Community selectedCommunity=new Community();
        for(Community community: this.sys.getCity().getCommunityList()){
            if(community.getName()==drpdownCommunityList.getSelectedItem()){
                selectedCommunity=community;
            }
        }
        house.setRowno(txtHouseName.getText());
        house.setStreetno(txtStreet.getText());
        house.setZipcode(Integer.parseInt(txtZip.getText()));
        house.setCommunity(selectedCommunity);
        selectedCommunity.addHouseToCommunity(house);
        JOptionPane.showMessageDialog(this, "House Added Successfully!");
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtZipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyPressed
        // TODO add your handling code here:
         char c =evt.getKeyChar();
if ((c >= '0' && c <= '9' )||(c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_DELETE)){
txtZip.setEditable(true);
}else{
txtZip.setEditable(false);
JOptionPane.showMessageDialog(null, "Please enter only numbers !");
}
    }//GEN-LAST:event_txtZipKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> drpdownCommunityList;
    private javax.swing.JTable houseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblStreetno;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JTextField txtHouseName;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) houseTable.getModel();
        model.setRowCount(0);
        for(House house: this.sys.getCity().getCommunityList().get(drpdownCommunityList.getSelectedIndex()).getHouses()){
            Object[] row= new Object[5];
            row[0]=house.getRowno() ;
            row[1]=house.getStreetno();
            row[2]=house.getZipcode();
            row[3]=house.getCommunity().getName();
            row[4]=house.getCommunity().getCity().getCityName();
            model.addRow(row);
        }
    }
}
