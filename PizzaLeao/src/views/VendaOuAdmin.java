/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import models.User;

/**
 *
 * @author hawks
 */
public class VendaOuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VendaOuAdmin
     */
    private final User user;
    public VendaOuAdmin(User user) {
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonVenda = new javax.swing.JButton();
        buttonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonVenda.setText("Venda");
        buttonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVendaActionPerformed(evt);
            }
        });

        buttonAdmin.setText("Admin");
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(buttonVenda)
                .addGap(64, 64, 64)
                .addComponent(buttonAdmin)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdmin)
                    .addComponent(buttonVenda))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVendaActionPerformed
        VendaPizza principal = new VendaPizza();
        principal.setVisible(true);
    }//GEN-LAST:event_buttonVendaActionPerformed

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        AdminPanel principal = new AdminPanel(user);
        principal.setVisible(true);
    }//GEN-LAST:event_buttonAdminActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonVenda;
    // End of variables declaration//GEN-END:variables
}
