
package project;

import project.MyQuery;
import project.Product;
import project.TheModel;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Menu extends JFrame{
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    Object[] row = new Object[2];
    int []qty2;
    int [] pid2;
    int Rows;
    public void loadMenu(){
    
         MyQuery mq = new MyQuery();
        ArrayList<Product> list = mq.BindTable();
        String[] columnName = {"ID","Name","Type","Price","Image"};
        Object[][] rows = new Object[list.size()][5];  
         for(int i = 0; i < list.size(); i++){
            rows[i][0] = list.get(i).getId();
            rows[i][1] = list.get(i).getName();
            rows[i][2] = list.get(i).getType();
            rows[i][3] = list.get(i).getPrice();
            
            if(list.get(i).getImage() != null){
                
            ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getImage()).getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   
            rows[i][4] = image;
            }
            else{
                rows[i][4] = null;
            }
            
        }
        TheModel model = new TheModel(rows, columnName);
        menuTable.setModel(model);
        menuTable.setRowHeight(120);
        menuTable.getColumnModel().getColumn(4).setPreferredWidth(150);
       
    }
    public Menu() {
        initComponents();
        loadMenu();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        removeBtn = new java.awt.Button();
        upBtn = new java.awt.Button();
        idTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addBtn = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        order = new javax.swing.JTable();
        payBtn = new java.awt.Button();
        BackBtn = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tamil MN", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jLabel1)
                .addContainerGap(319, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 775, 61));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Total");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        txtsub.setBackground(new java.awt.Color(0, 0, 0));
        txtsub.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtsub.setForeground(new java.awt.Color(255, 255, 255));
        txtsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubActionPerformed(evt);
            }
        });
        getContentPane().add(txtsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 115, 44));

        removeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        removeBtn.setLabel("Remove Selected Row ");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(removeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 164, 33));

        upBtn.setLabel("Confirm");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        getContentPane().add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 331, 120, 34));

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, 29));

        jLabel6.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 14)); // NOI18N
        jLabel6.setText("Enter Item ID ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        getContentPane().add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 70, 29));

        jLabel7.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 14)); // NOI18N
        jLabel7.setText("QTY");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 410, 30, -1));

        addBtn.setLabel("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 164, 34));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Price", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Byte.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(menuTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 67, 773, 238));

        order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(order);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 210, 147));

        payBtn.setLabel("Proceed");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        getContentPane().add(payBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 120, 34));

        BackBtn.setActionCommand("Back");
        BackBtn.setLabel("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 120, 34));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubActionPerformed

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
       DefaultTableModel model = (DefaultTableModel) order.getModel();
       int SelectedRowIndex = order.getSelectedRow();
       model.removeRow(SelectedRowIndex);
       
    }//GEN-LAST:event_removeBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
       DefaultTableModel model = (DefaultTableModel) order.getModel();
        int rows= model.getRowCount();
        Rows=rows;
        int[]id=new int[rows];
        int[]qty=new int[rows];
        for(int i=0;i<rows;i++){
            id[i]= Integer.parseInt(model.getValueAt(i,0).toString());
            qty[i]= Integer.parseInt(model.getValueAt(i,1).toString());
         }
        pid2=new int[Rows];
        qty2=new int[Rows];
        for(int i=0;i<rows;i++)
        {
        pid2[i]=id[i];
        qty2[i]=qty[i];
        }
        double tot=0;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");
            st=con.createStatement();
            for(int i=0;i<rows;i++)
            {
            rs=st.executeQuery("SELECT price FROM products WHERE productID="+id[i]+"");
            rs.next();
            tot+=rs.getDouble(1)*qty[i];
            }  
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(this,"Error, Review your Cart..");  
        }
       txtsub.setText(Double.toString(tot));
        
    }//GEN-LAST:event_upBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) order.getModel();
                 String qty=qtyTxt.getText();
                 if(Integer.parseInt(qty) <=0)
                     JOptionPane.showMessageDialog(this,"QTY Must be Greater Than 0");
                 else{
                row[0] =idTxt.getText(); ;
                row[1] =qty;
                model.addRow(row);}
    }//GEN-LAST:event_addBtnActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        if(txtsub.getText().isEmpty())
            JOptionPane.showMessageDialog(this,"Please Confirm Order to Proceed");
        else{     
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bakery","root","Ruqayyah");  
            PreparedStatement ps1=con.prepareStatement("INSERT INTO bakery.`order` (cust_username, total) VALUES (?, ?)");
            ps1.setString(1,Register_Frame.uname);
            ps1.setDouble(2,Double.parseDouble(txtsub.getText()));
            int stat1=ps1.executeUpdate();
            
            st=con.createStatement();
            rs=st.executeQuery("SELECT orderID FROM bakery.`order` WHERE cust_username='"+Register_Frame.uname+"'");
            
            
            
            rs.next();
            int orderID=rs.getInt(1);
            
            PreparedStatement ps2=con.prepareStatement("INSERT INTO bakery.`order_details`(orderID,productID,quantity) VALUES (?,?,?)");
            for(int i=0;i<Rows;i++)
            {
            ps2.setInt(1, orderID);
            ps2.setInt(2,pid2[i]);
            ps2.setInt(3, qty2[i]);
            ps2.executeUpdate();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        new Payment().setVisible(true);
        dispose();
        
        }
    }//GEN-LAST:event_payBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new CustomerMain().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button BackBtn;
    private java.awt.Button addBtn;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable order;
    private java.awt.Button payBtn;
    private javax.swing.JTextField qtyTxt;
    private java.awt.Button removeBtn;
    private javax.swing.JTextField txtsub;
    private java.awt.Button upBtn;
    // End of variables declaration//GEN-END:variables

}
