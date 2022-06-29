
package project;

import project.CustomerMain;
import java.awt.*;
import java.awt.event.ItemEvent;
import javax.swing.*;
import java.sql.*;



public class PersonalInfo extends JFrame {

   
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public PersonalInfo() {
        initComponents();
        selectCustomer();
    }
    // selectCustomer recieves the customer username from login frame and display info
    public void selectCustomer(){
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
            st=con.createStatement();
            rs=st.executeQuery("SELECT * FROM customer WHERE username='"+Register_Frame.uname+"'");
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
            rs=st.executeQuery("SELECT * FROM payment WHERE cust_username='"+Register_Frame.uname+"'");
            rs.next();
            cnTxt.setText(rs.getString(2));
            cvTxt.setText(rs.getString(3));
            expTxt.setText(rs.getString(4));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBG = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        expLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        emTxt = new javax.swing.JTextField();
        lnTxt = new javax.swing.JTextField();
        fnTxt = new javax.swing.JTextField();
        femaleRB = new javax.swing.JRadioButton();
        maleRB = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        emLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        expTxt = new javax.swing.JTextField();
        psTxt = new javax.swing.JPasswordField();
        fnLabel = new javax.swing.JLabel();
        cnLabel = new javax.swing.JLabel();
        cnTxt = new javax.swing.JTextField();
        cvvLabel = new javax.swing.JLabel();
        cvTxt = new javax.swing.JTextField();
        upButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        lnLabel = new javax.swing.JLabel();
        hidePassword = new javax.swing.JCheckBox();
        cnWar = new javax.swing.JLabel();
        cvWar = new javax.swing.JLabel();
        bgLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        expLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        expLabel.setForeground(new java.awt.Color(255, 255, 255));
        expLabel.setText("Expiry Date");
        jPanel1.add(expLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        passLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(255, 255, 255));
        passLabel.setText("Password");
        jPanel1.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 80, 20));
        jPanel1.add(emTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, -1));
        jPanel1.add(lnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 170, -1));

        fnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnTxtActionPerformed(evt);
            }
        });
        jPanel1.add(fnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 170, -1));

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
        jPanel1.add(femaleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

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
        jPanel1.add(maleRB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        genderLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");
        jPanel1.add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 20));

        emLabel1.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        emLabel1.setForeground(new java.awt.Color(255, 255, 255));
        emLabel1.setText("E-mail");
        jPanel1.add(emLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 20));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Payment Info");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153), 2));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 260, -1));

        expTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expTxt.setText("MM/YY");
        expTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expTxtActionPerformed(evt);
            }
        });
        jPanel1.add(expTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 150, -1));

        psTxt.setText("jPasswordField1");
        psTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psTxtActionPerformed(evt);
            }
        });
        jPanel1.add(psTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 170, -1));

        fnLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        fnLabel.setForeground(new java.awt.Color(255, 255, 255));
        fnLabel.setText("First Name");
        jPanel1.add(fnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        cnLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        cnLabel.setForeground(new java.awt.Color(255, 255, 255));
        cnLabel.setText("Card Number");
        jPanel1.add(cnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        cnTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cnTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 150, -1));

        cvvLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        cvvLabel.setForeground(new java.awt.Color(255, 255, 255));
        cvvLabel.setText("CVV");
        jPanel1.add(cvvLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        cvTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cvTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 150, -1));

        upButton.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        upButton.setForeground(new java.awt.Color(255, 255, 255));
        upButton.setText("Update");
        upButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        upButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upButtonMouseClicked(evt);
            }
        });
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        jPanel1.add(upButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 100, 30));

        CancelButton.setFont(new java.awt.Font("Stencil", 0, 12)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 100, 30));

        lnLabel.setFont(new java.awt.Font("Verdana Pro Semibold", 0, 14)); // NOI18N
        lnLabel.setForeground(new java.awt.Color(255, 255, 255));
        lnLabel.setText("Last Name");
        jPanel1.add(lnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 80, 20));

        hidePassword.setBackground(new java.awt.Color(255, 255, 153));
        hidePassword.setForeground(new java.awt.Color(255, 255, 255));
        hidePassword.setText("Hide Password");
        hidePassword.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hidePasswordItemStateChanged(evt);
            }
        });
        jPanel1.add(hidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, -1, -1));
        jPanel1.add(cnWar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 200, 20));
        jPanel1.add(cvWar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 200, 20));

        bgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/black-background.jpg"))); // NOI18N
        jPanel1.add(bgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 440));

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 750, 20));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Personal Information");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        homeButton.setBackground(new java.awt.Color(0, 0, 0));
        homeButton.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        homeButton.setForeground(new java.awt.Color(255, 255, 255));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/home.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorderPainted(false);
        homeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 635, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 750, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnTxtActionPerformed

    private void maleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRBActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void expTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expTxtActionPerformed

    private void cnTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnTxtActionPerformed

    private void cvTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvTxtActionPerformed

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
       homeButton.setForeground(Color.WHITE);
       homeButton.setBackground(Color.BLACK);
    }//GEN-LAST:event_homeButtonMouseExited

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
       homeButton.setForeground(Color.BLACK);
       homeButton.setBackground(Color.WHITE);
    }//GEN-LAST:event_homeButtonMouseEntered

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        new CustomerMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void upButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upButtonMouseClicked
        boolean check=true;
        if(fnTxt.getText().isEmpty()||lnTxt.getText().isEmpty()||emTxt.getText().isEmpty()||psTxt.getPassword().equals("")||cnTxt.getText().isEmpty()||cvTxt.getText().isEmpty()||expTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Empty Record, Kindely Fill All Information");
            check=false;}
         if(cnTxt.getText().length()!=16 ){
            cnWar.setForeground(Color.red);
            cnWar.setText("Card Number Must be 16 Digits");
            check=false;}
         if (cvTxt.getText().length()!=3){
            cvWar.setForeground(Color.red);
            cvWar.setText("CVV Must be 3 Digits");
            check=false;}
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
                
                cnWar.setText("");
                cvWar.setText("");
                
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
                PreparedStatement ps1=con.prepareStatement("UPDATE customer SET first_name=?, last_name=?, password=?, gender=?, email=? where username='"+Register_Frame.uname+"'");
                PreparedStatement ps2=con.prepareStatement("UPDATE payment SET card_number=?, cvv=?, exp_date=? where cust_username='"+Register_Frame.uname+"'");
                
                String passText = new String(psTxt.getPassword());
                ps1.setString(1,fnTxt.getText());
                ps1.setString(2,lnTxt.getText());
                
                ps1.setString(3,passText);
                if(maleRB.isSelected())
                    ps1.setString(4,"Male");
                else
                    ps1.setString(4, "Female");
                ps1.setString(5,emTxt.getText());
                int status1 = ps1.executeUpdate();
                
                ps2.setString(1,cnTxt.getText());
                ps2.setString(2,cvTxt.getText());
                ps2.setString(3,expTxt.getText());
                int status2 = ps2.executeUpdate();
                
                if(status1==1&& status2==1)
                    JOptionPane.showMessageDialog(this,"Information Updated Successfully");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_upButtonMouseClicked

    private void hidePasswordItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hidePasswordItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            psTxt.setEchoChar('*');
        } else {
             psTxt.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_hidePasswordItemStateChanged

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        new CustomerMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed

        new CustomerMain().setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_homeButtonActionPerformed

    private void psTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psTxtActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonalInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel bgLabel;
    private javax.swing.JLabel cnLabel;
    private javax.swing.JTextField cnTxt;
    private javax.swing.JLabel cnWar;
    private javax.swing.JTextField cvTxt;
    private javax.swing.JLabel cvWar;
    private javax.swing.JLabel cvvLabel;
    private javax.swing.JLabel emLabel1;
    private javax.swing.JTextField emTxt;
    private javax.swing.JLabel expLabel;
    private javax.swing.JTextField expTxt;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JTextField fnTxt;
    private javax.swing.ButtonGroup genderBG;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JCheckBox hidePassword;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
