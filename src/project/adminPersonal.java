
package project;

import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.sql.*;

public final class adminPersonal extends JFrame {

    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public adminPersonal() {
        initComponents();
        selectAdmin();
    }
    public void selectAdmin(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM admin WHERE username='"+Register_Frame.uname+"'");
            rs.next();
            fnTxt.setText(rs.getString(1));
            lnTxt.setText(rs.getString(2));
            
            psTxt.setText(rs.getString(4));
            String gender=rs.getString(5);
            if(gender.equals("Male"))
                maleRB.setSelected(true);
                        else
                femaleRB.setSelected(true);
            emTxt.setText(rs.getString(6));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBG = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        fnLabel = new javax.swing.JLabel();
        lnLabel = new javax.swing.JLabel();
        emLabel1 = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        lnTxt = new javax.swing.JTextField();
        fnTxt = new javax.swing.JTextField();
        emTxt = new javax.swing.JTextField();
        psTxt = new javax.swing.JPasswordField();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        hidePassword = new javax.swing.JCheckBox();
        upButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fnLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        fnLabel.setForeground(new java.awt.Color(255, 255, 255));
        fnLabel.setText("First Name");
        jPanel3.add(fnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lnLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        lnLabel.setForeground(new java.awt.Color(255, 255, 255));
        lnLabel.setText("Last Name");
        jPanel3.add(lnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 80, 20));

        emLabel1.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        emLabel1.setForeground(new java.awt.Color(255, 255, 255));
        emLabel1.setText("E-mail");
        jPanel3.add(emLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 80, 20));

        passLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");
        jPanel3.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 80, 20));

        genderLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");
        jPanel3.add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));
        jPanel3.add(lnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 170, -1));

        fnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnTxtActionPerformed(evt);
            }
        });
        jPanel3.add(fnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, -1));
        jPanel3.add(emTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, -1));

        psTxt.setText("jPasswordField1");
        jPanel3.add(psTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 170, -1));

        genderBG.add(maleRB);
        maleRB.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        maleRB.setForeground(new java.awt.Color(255, 255, 255));
        maleRB.setText("Male");
        maleRB.setContentAreaFilled(false);
        maleRB.setFocusPainted(false);
        maleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRBActionPerformed(evt);
            }
        });
        jPanel3.add(maleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        genderBG.add(femaleRB);
        femaleRB.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        femaleRB.setForeground(new java.awt.Color(255, 255, 255));
        femaleRB.setText("Female");
        femaleRB.setContentAreaFilled(false);
        femaleRB.setFocusPainted(false);
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });
        jPanel3.add(femaleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        hidePassword.setBackground(new java.awt.Color(255, 255, 153));
        hidePassword.setForeground(new java.awt.Color(255, 255, 255));
        hidePassword.setText("Hide Password");
        hidePassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hidePasswordItemStateChanged(evt);
            }
        });
        jPanel3.add(hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        upButton.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        upButton.setForeground(new java.awt.Color(255, 255, 255));
        upButton.setText("Update");
        upButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        upButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upButtonMouseClicked(evt);
            }
        });
        jPanel3.add(upButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 100, 30));

        CancelButton.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel3.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 100, 30));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personal Information");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, 38));

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black-background.jpg"))); // NOI18N
        jPanel3.add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 770, 350));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 750, -1));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/home.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        homeButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/project/homeBL.png"))); // NOI18N
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel3.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 115, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 764, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        homeButton.setForeground(Color.BLACK);
        homeButton.setBackground(Color.WHITE);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        homeButton.setForeground(Color.WHITE);
        homeButton.setBackground(Color.BLACK);
    }//GEN-LAST:event_homeButtonMouseExited

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        new adminPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void fnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnTxtActionPerformed

    private void maleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void hidePasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hidePasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            psTxt.setEchoChar('*');
        } else {
            psTxt.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_hidePasswordItemStateChanged

    private void upButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upButtonMouseClicked
        
        boolean check = true;
        
        if(fnTxt.getText().isEmpty()||lnTxt.getText().isEmpty()||emTxt.getText().isEmpty()||psTxt.getPassword().equals("")){
        JOptionPane.showMessageDialog(this,"Empty Record, Kindely Fill All Information");
        check=false;
        }
        if (Character.isDigit(fnTxt.getText().charAt(0))||Character.isDigit(lnTxt.getText().charAt(0)))
        {
            JOptionPane.showMessageDialog(null, "First and Last names should not be digits", "Wrong Entry", JOptionPane.INFORMATION_MESSAGE);
            check=false;}
        if (fnTxt.getText().length()>20||lnTxt.getText().length()>20)
        {
             JOptionPane.showMessageDialog(null, "First and Last name should be less than 20 characters", "Name Modification", JOptionPane.INFORMATION_MESSAGE);
             check=false;
        }
        if(check){
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
                PreparedStatement ps1=con.prepareStatement("UPDATE admin SET first_name=?, last_name=?, password=?, gender=?, email=? where username='"+Register_Frame.uname+"'");

                String passText = new String(psTxt.getPassword());
                ps1.setString(1,fnTxt.getText());
                ps1.setString(2,lnTxt.getText());
                
                ps1.setString(3,passText);
                if(maleRB.isSelected())
                   ps1.setString(4,"Male");
                else
                   ps1.setString(4, "Female");
                ps1.setString(5, emTxt.getText());
                
                int status1 = ps1.executeUpdate();
                if(status1==1)
                JOptionPane.showMessageDialog(this,"Information Updated Successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_upButtonMouseClicked

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
     
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel emLabel1;
    private javax.swing.JTextField emTxt;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JTextField fnTxt;
    private javax.swing.ButtonGroup genderBG;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JCheckBox hidePassword;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lnLabel;
    private javax.swing.JTextField lnTxt;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField psTxt;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
