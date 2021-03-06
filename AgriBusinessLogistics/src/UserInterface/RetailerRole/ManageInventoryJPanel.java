/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.RetailerRole;

import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryItem;
import Business.UserAccount.UserAccount;
import Business.Utils.MyPositiveIntegerVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageInventoryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    public ManageInventoryJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateInventoryTable();
        MyPositiveIntegerVerifier myPositiveIntegerVerifier = new MyPositiveIntegerVerifier();
        thresholdTxtField.setInputVerifier(myPositiveIntegerVerifier);
    }
    
    public void populateInventoryTable(){
        DefaultTableModel dtm = (DefaultTableModel) inventoryTable.getModel();
        dtm.setRowCount(0);
        for (InventoryItem item : account.getInventory().getInventoryList()) {
            Object row[] = new Object[4];
            row[0] = item;
            row[1] = item.getProduct().getBatchNumber();
            row[2] = item.getQuantity();
            row[3] = item.getThreshold();
            dtm.addRow(row);
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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        perishTxtField = new javax.swing.JTextField();
        priceTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        thresholdTxtField = new javax.swing.JTextField();
        threshBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Manage Inventory");

        inventoryTable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Batch Number", "Quantity", "Threshold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        deleteBtn.setBackground(new java.awt.Color(51, 51, 51));
        deleteBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete Inventory Item");
        deleteBtn.setBorder(new javax.swing.border.MatteBorder(null));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        orderBtn.setBackground(new java.awt.Color(51, 51, 51));
        orderBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        orderBtn.setForeground(new java.awt.Color(255, 255, 255));
        orderBtn.setText("Order New Items >>");
        orderBtn.setBorder(new javax.swing.border.MatteBorder(null));
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.MatteBorder(null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 13), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("Perishability Level:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Price:");

        nameTxtField.setEditable(false);
        nameTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        perishTxtField.setEditable(false);
        perishTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        priceTxtField.setEditable(false);
        priceTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        priceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTxtField)
                    .addComponent(perishTxtField)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(perishTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(priceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jLabel9.setText("Click on any product to get details & set threshold");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setText("Threshold:");

        thresholdTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        thresholdTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thresholdTxtFieldActionPerformed(evt);
            }
        });

        threshBtn.setBackground(new java.awt.Color(51, 51, 51));
        threshBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        threshBtn.setForeground(new java.awt.Color(255, 255, 255));
        threshBtn.setText("Update Threshold!");
        threshBtn.setBorder(new javax.swing.border.MatteBorder(null));
        threshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(267, 267, 267)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel10)
                                .addGap(35, 35, 35)
                                .addComponent(thresholdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(threshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(thresholdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow >= 0) {
            InventoryItem ii = (InventoryItem) inventoryTable.getValueAt(selectedRow, 0);
            account.getInventory().removeInventory(ii);
        } else {
            JOptionPane.showMessageDialog(null, "Kindly select a row");
        }
        populateInventoryTable();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        PlaceOrderJPanel placeOrderRetailerJPanel = new PlaceOrderJPanel(userProcessContainer, account, enterprise, this);
        userProcessContainer.add("placeOrderRetailerJPanel", placeOrderRetailerJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void priceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtFieldActionPerformed

    private void thresholdTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thresholdTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thresholdTxtFieldActionPerformed

    private void threshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threshBtnActionPerformed
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow >= 0) {
            InventoryItem ii = (InventoryItem) inventoryTable.getValueAt(selectedRow, 0);
            try {
                String thresh = thresholdTxtField.getText();
                if (!thresholdTxtField.getText().trim().isEmpty()) {
                    ii.setThreshold(Integer.parseInt(thresholdTxtField.getText().trim()));
                    populateInventoryTable();
                    JOptionPane.showMessageDialog(null, "Threshold updated successfully!");
                    thresholdTxtField.setText("");
                }

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Please enter appropriate values!");
            }
        }
    }//GEN-LAST:event_threshBtnActionPerformed

    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow >= 0) {
            InventoryItem ii = (InventoryItem) inventoryTable.getValueAt(selectedRow, 0);
            nameTxtField.setText(ii.getProduct().getName());
            perishTxtField.setText(ii.getProduct().getPerish());
            priceTxtField.setText(String.valueOf(ii.getProduct().getPrice()));            
        }
    }//GEN-LAST:event_inventoryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JButton orderBtn;
    private javax.swing.JTextField perishTxtField;
    private javax.swing.JTextField priceTxtField;
    private javax.swing.JButton threshBtn;
    private javax.swing.JTextField thresholdTxtField;
    // End of variables declaration//GEN-END:variables
}
