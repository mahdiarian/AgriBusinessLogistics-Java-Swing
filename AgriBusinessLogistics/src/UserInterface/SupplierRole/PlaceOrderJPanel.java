/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Enterprise.Enterprise;
import Business.Inventory.InventoryItem;
import Business.Network.Network;
import Business.Organization.FarmerOrganization;
import Business.Organization.Organization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.Utils.MyPositiveIntegerVerifier;
import Business.WorkQueue.SupplierSentWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrderJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;
    private ManageInventoryJPanel mijp;

    public PlaceOrderJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, ManageInventoryJPanel mijp) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        this.mijp = mijp;
        populateProdJTable();
        populateProductComboBox();
        int min = 0;
        int max = 1000;
        int step = 1;
        int initValue = 1;
        SpinnerModel model = new SpinnerNumberModel(initValue, min, max, step);
        qtySpinner.setModel(model);
        MyPositiveIntegerVerifier myPositiveIntegerVerifier = new MyPositiveIntegerVerifier();
        qtySpinner.setInputVerifier(myPositiveIntegerVerifier);
    }

    public void populateProdJTable() {
        DefaultTableModel dtm = (DefaultTableModel) prodJTable.getModel();
        dtm.setRowCount(0);
        for (InventoryItem item : account.getInventory().getInventoryList()) {
            Object row[] = new Object[3];
            row[0] = item;
            row[1] = item.getQuantity();
            row[2] = item.getThreshold();
            dtm.addRow(row);
        }
    }

    public void populateProductComboBox() {
        productComboBox.removeAllItems();
        for (Product p : account.getProductCatalog().getProductList()) {
            productComboBox.addItem(p);
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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        placeOrderBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        qtySpinner = new javax.swing.JSpinner();
        productComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Quantity:");

        backBtn.setBackground(new java.awt.Color(51, 51, 51));
        backBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.MatteBorder(null));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        placeOrderBtn.setBackground(new java.awt.Color(51, 51, 51));
        placeOrderBtn.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        placeOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderBtn.setText("Place Order!");
        placeOrderBtn.setBorder(new javax.swing.border.MatteBorder(null));
        placeOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderBtnActionPerformed(evt);
            }
        });

        prodJTable.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        prodJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Availability", "Threshold"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodJTable);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Generate New Order");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Select Product:");

        qtySpinner.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        productComboBox.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        productComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel4.setText("Your Inventory Items:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel5.setText("Place Order Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(placeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(223, 223, 223))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(productComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addComponent(placeOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        mijp.populateInvenItemTable();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void placeOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderBtnActionPerformed

        SupplierSentWorkRequest request = new SupplierSentWorkRequest();
        String date = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date());
        request.setRequestDate(date);
        request.setSender(account);
        request.setStatus("Sent");
        request.getOrder().setBuyer(account);
        request.getOrder().setType("f2s");

        int fetchedQty = (Integer) qtySpinner.getValue();
        if (fetchedQty <= 0) {
            Product product = (Product) productComboBox.getSelectedItem();
            request.getOrder().addOrderItem(product, fetchedQty);
            request.setProduct(product);

        //network.getMasterOrderCatalog().addOrder(request.getOrder());
            Organization org = null;
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FarmerOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                account.getWorkQueue().getWorkRequestList().add(request);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantity should be greater than 0");
        }
    }//GEN-LAST:event_placeOrderBtnActionPerformed

    private void productComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton placeOrderBtn;
    private javax.swing.JTable prodJTable;
    private javax.swing.JComboBox productComboBox;
    private javax.swing.JSpinner qtySpinner;
    // End of variables declaration//GEN-END:variables
}