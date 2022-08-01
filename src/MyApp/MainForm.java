/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;

import MyLibs.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Izak
 */
public class MainForm extends javax.swing.JFrame {
    private OfficeMediator officeMed;
    private Office office1;
    private Office office2;
    private Office office3;
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        officeMed = new OfficeMediator();
        office1 = new Headquarters(officeMed, "Head Office", 6, 20, 50);
        office2 = new CustomerService(officeMed, "Customer Service Branch", 9, 21, 100);
        office3 = new Security(officeMed, "Security Office", 7, 17, 20);
    }
    
    private void showEquipmentList(){
        DefaultTableModel model = (DefaultTableModel) getEquipmentListTbl().getModel();
        model.setRowCount(0);
        for(Equipment e:officeMed.equipmentList){
            String name = e.getName();
            int years = e.getYears();
            String office = e.getOffice();
            String condition = e.getCondition();
            
            model.insertRow(model.getRowCount(), new Object[]{name, years, office, condition});
        }
    }
    
    private void updateTable(){
        DefaultTableModel off1 = (DefaultTableModel) getOffice1Tbl().getModel();
        DefaultTableModel off2 = (DefaultTableModel) getOffice2Tbl().getModel();
        DefaultTableModel off3 = (DefaultTableModel) getOffice3Tbl().getModel();
        DefaultTableModel lost = (DefaultTableModel) getlostTbl().getModel();
        lost.setRowCount(0);
        off1.setRowCount(0);
        off2.setRowCount(0);
        off3.setRowCount(0);
        for(Equipment e:officeMed.equipmentList){
            if(e.getOffice() == office1.getName()){
                String name = e.getName();
                int years = e.getYears();
                String office = e.getOffice();
                String condition = e.getCondition();
                
                off1.insertRow(off1.getRowCount(), new Object[]{name, years, office, condition});
            }
            else if(e.getOffice() == office2.getName()){
                String name = e.getName();
                int years = e.getYears();
                String office = e.getOffice();
                String condition = e.getCondition();
                off2.insertRow(off2.getRowCount(), new Object[]{name, years, office, condition});
            }
            else if(e.getOffice() == office3.getName()){
                String name = e.getName();
                int years = e.getYears();
                String office = e.getOffice();
                String condition = e.getCondition();
                off3.insertRow(off3.getRowCount(), new Object[]{name, years, office, condition});
            }
        }
        showEquipmentList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        officeLabel1 = new javax.swing.JLabel();
        Office1 = new javax.swing.JScrollPane();
        Office1Tbl = new javax.swing.JTable();
        AddOffice1Btn = new javax.swing.JButton();
        officeLabel2 = new javax.swing.JLabel();
        Office2 = new javax.swing.JScrollPane();
        Office2Tbl = new javax.swing.JTable();
        AddOffice2Btn = new javax.swing.JButton();
        AddOffice3Btn = new javax.swing.JButton();
        Office3 = new javax.swing.JScrollPane();
        Office3Tbl = new javax.swing.JTable();
        officeLabel3 = new javax.swing.JLabel();
        dispEqBtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EquipmentListTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lostTbl = new javax.swing.JTable();
        lostEqBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SA2");

        jPanel1.setBackground(new java.awt.Color(173, 211, 250));

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 0, 50)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\Group5AssetAcquisition\\icon.png")); // NOI18N
        jLabel3.setText("ASSET ACQUISITION & MONITORING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 239, 195));

        officeLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        officeLabel1.setText("Office 1");

        Office1Tbl.setBackground(new java.awt.Color(187, 230, 246));
        Office1Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Years", "Condition"
            }
        ));
        Office1.setViewportView(Office1Tbl);

        AddOffice1Btn.setBackground(new java.awt.Color(0, 69, 102));
        AddOffice1Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddOffice1Btn.setForeground(new java.awt.Color(255, 255, 255));
        AddOffice1Btn.setText("Add to Office1");
        AddOffice1Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddOffice1BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddOffice1BtnMouseExited(evt);
            }
        });
        AddOffice1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOffice1BtnActionPerformed(evt);
            }
        });

        officeLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        officeLabel2.setText("Office 2");

        Office2Tbl.setBackground(new java.awt.Color(187, 230, 246));
        Office2Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Years", "Condition"
            }
        ));
        Office2.setViewportView(Office2Tbl);

        AddOffice2Btn.setBackground(new java.awt.Color(0, 69, 102));
        AddOffice2Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddOffice2Btn.setForeground(new java.awt.Color(255, 255, 255));
        AddOffice2Btn.setText("Add to Office2");
        AddOffice2Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddOffice2BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddOffice2BtnMouseExited(evt);
            }
        });
        AddOffice2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOffice2BtnActionPerformed(evt);
            }
        });

        AddOffice3Btn.setBackground(new java.awt.Color(0, 69, 102));
        AddOffice3Btn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddOffice3Btn.setForeground(new java.awt.Color(255, 255, 255));
        AddOffice3Btn.setText("Add to Office3");
        AddOffice3Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddOffice3BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddOffice3BtnMouseExited(evt);
            }
        });
        AddOffice3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOffice3BtnActionPerformed(evt);
            }
        });

        Office3Tbl.setBackground(new java.awt.Color(187, 230, 246));
        Office3Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Years", "Condition"
            }
        ));
        Office3.setViewportView(Office3Tbl);

        officeLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        officeLabel3.setText("Office 3");

        dispEqBtn1.setBackground(new java.awt.Color(0, 69, 102));
        dispEqBtn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dispEqBtn1.setForeground(new java.awt.Color(255, 255, 255));
        dispEqBtn1.setText("START");
        dispEqBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dispEqBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dispEqBtn1MouseExited(evt);
            }
        });
        dispEqBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispEqBtn1ActionPerformed(evt);
            }
        });

        EquipmentListTbl.setBackground(new java.awt.Color(185, 235, 250));
        EquipmentListTbl.setFont(new java.awt.Font("Eras Demi ITC", 0, 13)); // NOI18N
        EquipmentListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Years", "Office", "Condition"
            }
        ));
        jScrollPane1.setViewportView(EquipmentListTbl);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setText("Equipment List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Office1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOffice1Btn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Office2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOffice2Btn))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Office3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOffice3Btn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(officeLabel1)
                                .addGap(233, 233, 233)
                                .addComponent(officeLabel2)
                                .addGap(243, 243, 243)
                                .addComponent(officeLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dispEqBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(dispEqBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(officeLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(officeLabel3)
                    .addComponent(officeLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Office3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Office1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Office2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddOffice1Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddOffice2Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddOffice3Btn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))))))
        );

        jPanel3.setBackground(new java.awt.Color(250, 223, 170));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lenovo\\Documents\\GitHub\\Group5AssetAcquisition\\warn.png")); // NOI18N
        jLabel2.setText("Needs repair, lost, or for replacement");

        lostTbl.setBackground(new java.awt.Color(255, 184, 179));
        lostTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Years", "Office", "Condition"
            }
        ));
        jScrollPane2.setViewportView(lostTbl);

        lostEqBtn.setBackground(new java.awt.Color(0, 69, 102));
        lostEqBtn.setForeground(new java.awt.Color(255, 255, 255));
        lostEqBtn.setText("SHOW EQUIPMENT THAT NEEDS ATTENTION");
        lostEqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lostEqBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lostEqBtnMouseExited(evt);
            }
        });
        lostEqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lostEqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(lostEqBtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2)
                .addGap(23, 23, 23)
                .addComponent(lostEqBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dispEqBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispEqBtn1ActionPerformed
        showEquipmentList();
    }//GEN-LAST:event_dispEqBtn1ActionPerformed

    private void AddOffice1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOffice1BtnActionPerformed
        if(EquipmentListTbl.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Select an equipment first!");
        }
        else{
            DefaultTableModel model1 = (DefaultTableModel) getEquipmentListTbl().getModel();
            DefaultTableModel model2 = (DefaultTableModel) getOffice1Tbl().getModel();
            int col = 0;
            int row = EquipmentListTbl.getSelectedRow();
            String x = model1.getValueAt(row, col).toString();
            for(Equipment e:officeMed.equipmentList){
                if(e.getName() == x){
                    office1.addEquipment(office1, e);
                }
            }
            updateTable();
        }
    }//GEN-LAST:event_AddOffice1BtnActionPerformed

    private void AddOffice2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOffice2BtnActionPerformed
        if(EquipmentListTbl.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Select an equipment first!");
        }
        else{
            DefaultTableModel model1 = (DefaultTableModel) getEquipmentListTbl().getModel();
            DefaultTableModel model2 = (DefaultTableModel) getOffice2Tbl().getModel();
            int col = 0;
            int row = EquipmentListTbl.getSelectedRow();
            String x = model1.getValueAt(row, col).toString();
            for(Equipment e:officeMed.equipmentList){
                if(e.getName() == x){
                    office2.addEquipment(office2, e);
                }
            }
            updateTable();
        }
    }//GEN-LAST:event_AddOffice2BtnActionPerformed

    private void AddOffice3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOffice3BtnActionPerformed
        if(EquipmentListTbl.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "Select an equipment first!");
        }
        else{
            DefaultTableModel model1 = (DefaultTableModel) getEquipmentListTbl().getModel();
            DefaultTableModel model2 = (DefaultTableModel) getOffice3Tbl().getModel();
            int col = 0;
            int row = EquipmentListTbl.getSelectedRow();
            String x = model1.getValueAt(row, col).toString();
            for(Equipment e:officeMed.equipmentList){
                if(e.getName() == x){
                    office3.addEquipment(office3, e);
                }
            }
            updateTable();
        }
    }//GEN-LAST:event_AddOffice3BtnActionPerformed

    private void lostEqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lostEqBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) getlostTbl().getModel();
        model.setRowCount(0);
        for(Equipment e:officeMed.equipmentList){
            if((e.getCondition() == "replacement or lost") || (e.getCondition() == "needs repair")){
                String name = e.getName();
                int years = e.getYears();
                String office = e.getOffice();
                String condition = e.getCondition();
                
                model.insertRow(model.getRowCount(), new Object[]{name, years, office, condition});
            }
        }
    }//GEN-LAST:event_lostEqBtnActionPerformed

    private void dispEqBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dispEqBtn1MouseEntered
       dispEqBtn1.setBackground(new Color(246,69,102));
    }//GEN-LAST:event_dispEqBtn1MouseEntered

    private void dispEqBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dispEqBtn1MouseExited
        dispEqBtn1.setBackground(new Color(0,69,102));
    }//GEN-LAST:event_dispEqBtn1MouseExited

    private void AddOffice1BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice1BtnMouseEntered
       AddOffice1Btn.setBackground(new Color(246,69,102));
    }//GEN-LAST:event_AddOffice1BtnMouseEntered

    private void AddOffice1BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice1BtnMouseExited
       AddOffice1Btn.setBackground(new Color(0,69,102));
    }//GEN-LAST:event_AddOffice1BtnMouseExited

    private void AddOffice2BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice2BtnMouseEntered
       AddOffice2Btn.setBackground(new Color(246,69,102));
    }//GEN-LAST:event_AddOffice2BtnMouseEntered

    private void AddOffice2BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice2BtnMouseExited
       AddOffice2Btn.setBackground(new Color(0,69,102));
    }//GEN-LAST:event_AddOffice2BtnMouseExited

    private void AddOffice3BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice3BtnMouseEntered
       AddOffice3Btn.setBackground(new Color(246,69,102));
    }//GEN-LAST:event_AddOffice3BtnMouseEntered

    private void AddOffice3BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOffice3BtnMouseExited
        AddOffice3Btn.setBackground(new Color(0,69,102));
    }//GEN-LAST:event_AddOffice3BtnMouseExited

    private void lostEqBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lostEqBtnMouseEntered
       lostEqBtn.setBackground(new Color(246,69,102));
    }//GEN-LAST:event_lostEqBtnMouseEntered

    private void lostEqBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lostEqBtnMouseExited
        lostEqBtn.setBackground(new Color(0,69,102));
    }//GEN-LAST:event_lostEqBtnMouseExited

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOffice1Btn;
    private javax.swing.JButton AddOffice2Btn;
    private javax.swing.JButton AddOffice3Btn;
    private javax.swing.JTable EquipmentListTbl;
    private javax.swing.JScrollPane Office1;
    private javax.swing.JTable Office1Tbl;
    private javax.swing.JScrollPane Office2;
    private javax.swing.JTable Office2Tbl;
    private javax.swing.JScrollPane Office3;
    private javax.swing.JTable Office3Tbl;
    private javax.swing.JButton dispEqBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lostEqBtn;
    private javax.swing.JTable lostTbl;
    private javax.swing.JLabel officeLabel1;
    private javax.swing.JLabel officeLabel2;
    private javax.swing.JLabel officeLabel3;
    // End of variables declaration//GEN-END:variables

    public JTable getEquipmentListTbl() {
        return EquipmentListTbl;
    }

    public void setEquipmentListTbl(JTable EquipmentListTbl) {
        this.EquipmentListTbl = EquipmentListTbl;
    }
    
    public JTable getOffice1Tbl() {
        return Office1Tbl;
    }

    public void setOffice1Tbl(JTable Office1Tbl) {
        this.Office1Tbl = Office1Tbl;
    }
    
    public JTable getOffice2Tbl() {
        return Office2Tbl;
    }

    public void setOffice2Tbl(JTable Office2Tbl) {
        this.Office2Tbl = Office2Tbl;
    }
    
    public JTable getOffice3Tbl() {
        return Office3Tbl;
    }

    public void setOffice3Tbl(JTable Office3Tbl) {
        this.Office3Tbl = Office3Tbl;
    }
    
    public JTable getlostTbl() {
        return lostTbl;
    }

    public void setlostTbl(JTable lostTbl) {
        this.lostTbl = lostTbl;
    }
}
