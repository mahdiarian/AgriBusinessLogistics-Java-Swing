/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupplierRole;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierReceivedWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class PendingOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PendingOrdersJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private Network network;

    public PendingOrdersJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;
        populatePendingOrdersJTable();
    }

    public void populatePendingOrdersJTable() {
        DefaultTableModel model = (DefaultTableModel) pendingOrdersJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            if (request instanceof SupplierReceivedWorkRequest) {
                if (request.getReceiver().equals(account)) {
                    Object[] row = new Object[4];
                    row[0] = request;
                    row[1] = "abc";
                    row[2] = "xyz";
                    row[3] = request.getStatus();

                    model.addRow(row);
                }
            }
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
        pendingOrdersJTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resolveBtn = new javax.swing.JButton();
        orderHistory = new javax.swing.JButton();

        pendingOrdersJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pendingOrdersJTable);

        backBtn.setText("<< Back");
        backBtn.setBorder(new javax.swing.border.MatteBorder(null));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(96, 125, 139));
        jLabel2.setText("Pending Orders");

        resolveBtn.setText("Resolve >>");
        resolveBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        resolveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveBtnActionPerformed(evt);
            }
        });

        orderHistory.setText("Order History >>");
        orderHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        orderHistory.setEnabled(false);
        orderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(resolveBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orderHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resolveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void resolveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolveBtnActionPerformed

        int selectedRow = pendingOrdersJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        SupplierReceivedWorkRequest request = (SupplierReceivedWorkRequest) pendingOrdersJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ResolveOrderJPanel resolveOrderJPanel = new ResolveOrderJPanel(userProcessContainer, account, network, request, this);
        userProcessContainer.add("resolveOrderJPanel", resolveOrderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_resolveBtnActionPerformed

    private void orderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderHistoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderHistoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderHistory;
    private javax.swing.JTable pendingOrdersJTable;
    private javax.swing.JButton resolveBtn;
    // End of variables declaration//GEN-END:variables
}
