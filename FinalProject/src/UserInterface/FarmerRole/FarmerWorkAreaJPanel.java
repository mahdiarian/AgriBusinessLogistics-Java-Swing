/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */

public class FarmerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;
    public FarmerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewReportBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        manageOrdersJPanel = new javax.swing.JButton();
        manageProductsBtn = new javax.swing.JButton();
        manageInventoryJPanel = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        viewReportBtn.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        viewReportBtn.setText("View Report");
        viewReportBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        viewReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Farmer Work Area");

        manageOrdersJPanel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        manageOrdersJPanel.setText("Manage All Orders");
        manageOrdersJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manageOrdersJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersJPanelActionPerformed(evt);
            }
        });

        manageProductsBtn.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        manageProductsBtn.setText("Manage Product Catalog");
        manageProductsBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manageProductsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsBtnActionPerformed(evt);
            }
        });

        manageInventoryJPanel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        manageInventoryJPanel.setText("Manage Warehouse");
        manageInventoryJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        manageInventoryJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryJPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageOrdersJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageProductsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(manageInventoryJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewReportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(manageProductsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageInventoryJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manageOrdersJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportBtnActionPerformed
        ViewReportJPanel viewReportFarmJPanel = new ViewReportJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("viewReportFarmJPanel", viewReportFarmJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewReportBtnActionPerformed

    private void manageOrdersJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersJPanelActionPerformed
        ManageOrderJPanel manageOrderFarmJPanel = new ManageOrderJPanel(userProcessContainer, account, enterprise, network);
        userProcessContainer.add("manageOrderFarmJPanel", manageOrderFarmJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrdersJPanelActionPerformed

    private void manageProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsBtnActionPerformed
        ManageProductsJPanel manageProductsFarmJPanel = new ManageProductsJPanel(userProcessContainer, account);
        userProcessContainer.add("manageProductsFarmJPanel", manageProductsFarmJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductsBtnActionPerformed

    private void manageInventoryJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryJPanelActionPerformed
        ManageInventoryJPanel manageInventoryFarmJPanel = new ManageInventoryJPanel(userProcessContainer, account);
        userProcessContainer.add("manageInventoryFarmJPanel", manageInventoryFarmJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageInventoryJPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageInventoryJPanel;
    private javax.swing.JButton manageOrdersJPanel;
    private javax.swing.JButton manageProductsBtn;
    private javax.swing.JButton viewReportBtn;
    // End of variables declaration//GEN-END:variables
}
