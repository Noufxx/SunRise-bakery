/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ruqayahalmubiareek
 */
public class updateProductPrice extends javax.swing.JFrame {

    
    
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    public void Referesh() {  
     
    pPriceTF.setText("");  
    pNumberTF.setText("");  
}  
    
    
    /**
     * Creates new form NewJFrame4
     */
    public updateProductPrice() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pPriceTF = new javax.swing.JTextField();
        pNumberTF = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Product Price");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("_________________________________________________________________________");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 530, 20));

        pPriceTF.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        pPriceTF.setForeground(new java.awt.Color(153, 153, 153));
        pPriceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pPriceTFActionPerformed(evt);
            }
        });
        jPanel1.add(pPriceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 270, -1));

        pNumberTF.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        pNumberTF.setForeground(new java.awt.Color(153, 153, 153));
        pNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNumberTFActionPerformed(evt);
            }
        });
        jPanel1.add(pNumberTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 270, -1));

        BackButton.setFont(new java.awt.Font("AppleGothic", 3, 18)); // NOI18N
        BackButton.setText("Back ");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 150, 40));

        UpdateButton.setFont(new java.awt.Font("AppleGothic", 3, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 150, 40));

        jLabel7.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 153));
        jLabel7.setText("Product Number:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, 20));

        jLabel8.setFont(new java.awt.Font("AppleGothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("New Product Price:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black-background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new adminPage().setVisible(true); 
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void pNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNumberTFActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        if(pNumberTF.equals("") || pPriceTF.equals("") ){
            JOptionPane.showMessageDialog(null,"Information not filled, you can't Update the Product !","Data Missing",JOptionPane.INFORMATION_MESSAGE);
        }
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
            PreparedStatement ps = con.prepareStatement("UPDATE products "
                    + "SET price ='"+pPriceTF.getText()+"' WHERE productID ='"+pNumberTF.getText()+"'");
            
            int up = ps.executeUpdate();
            if(up==0){
                JOptionPane.showMessageDialog(null, "Product is NOT Exist..");
            }
            else{
                JOptionPane.showMessageDialog(null, "Product Price is Updated Successfully..");
            }
            Referesh();
            
            
            
            
           
        } catch (SQLException ex) {
            Logger.getLogger(deleteProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void pPriceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pPriceTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pPriceTFActionPerformed

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
            java.util.logging.Logger.getLogger(updateProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProductPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pNumberTF;
    private javax.swing.JTextField pPriceTF;
    // End of variables declaration//GEN-END:variables
}
