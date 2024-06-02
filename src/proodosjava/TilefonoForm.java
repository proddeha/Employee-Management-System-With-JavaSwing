/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proodosjava;

import java.awt.Color;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kwstas
 */
public class TilefonoForm extends javax.swing.JFrame {
    private static String USERNAME = "root";
    private static String PASSWORD = "Helloimgosu1!";
    private static String CONN_STRING = "jdbc:mysql://localhost:3306/proodos";

    public TilefonoForm() {
        initComponents();
        this.getContentPane().setBackground(new Color(247,252,252));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        apply = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deleteEmpyRow = new javax.swing.JButton();
        insertEmptyRow = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectionBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TilefonoID", "ErgazomenosID", "TilefonoType", "Tilefono"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setGridColor(new java.awt.Color(247, 252, 252));
        jScrollPane2.setViewportView(jTable2);

        search.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        search.setText("ΑΝΑΖΗΤΗΣΗ");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 150, 32));
        jLabel1.setText("TILEFONO");

        delete.setBackground(new java.awt.Color(243, 66, 88));
        delete.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        delete.setText("ΔΙΑΓΡΑΦΗ");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        insert.setBackground(new java.awt.Color(36, 241, 151));
        insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        insert.setText("ΠΡΟΣΘΗΚΗ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        apply.setBackground(new java.awt.Color(217, 228, 88));
        apply.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        apply.setText("ΕΝΗΜΕΡΩΣΗ");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("ΑΦΜ ΕΡΓΑΖΟΜΕΝΟΥ");

        deleteEmpyRow.setBackground(new java.awt.Color(239, 55, 55));
        deleteEmpyRow.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        deleteEmpyRow.setText("-");
        deleteEmpyRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpyRowActionPerformed(evt);
            }
        });

        insertEmptyRow.setBackground(new java.awt.Color(82, 218, 50));
        insertEmptyRow.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        insertEmptyRow.setText("+");
        insertEmptyRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertEmptyRowActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(209, 212, 220));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Tilefono Type");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("ΑΝΑΖΗΤΗΣΗ ΜΕ :");

        selectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TilefonoID", "ErgazomenosID", "TilefonoType", "Tilefono" }));
        selectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(insertEmptyRow, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteEmpyRow, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(376, 376, 376))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(89, 89, 89)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(137, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteEmpyRow, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insertEmptyRow, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
               Connection conn = null;
               Object selectedOption=selectionBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try{
              
              conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
              Statement stmt = (Statement) conn.createStatement();
                            String st = "SELECT ifnull(`tilefono`.`TilefonoID`,0)," +
                                    "    ifnull(`tilefono`.`ErgazomenosID`,0)," +
                                    "    ifnull(`tt`.`Onoma`,'Δεν Εχει Οριστει')AS TilefonoType," +
                                    "    ifnull(`tilefono`.`Tilefono`,0)" +
                                    "FROM `proodos`.`tilefono` "+
                                    "JOIN `proodos`.`tilefono_type` AS tt ON `TilefonoTypeID` = `tilefono`.`TilefonoType`";
                                    if (selectedOption.equals("TilefonoType"))
                                    {
                                        st+="WHERE `tt`.`Onoma` LIKE'"+searchField.getText()+"%'";
                                    }
                                    else 
                                    {
                                        st+="WHERE `"+selectedOption+"` LIKE'"+searchField.getText()+"%'";
                                    }        
              
              ResultSet rs = stmt.executeQuery(st); 
              while (rs.next())
              {
                  model.insertRow(model.getRowCount(),
                        new Object[] {rs.getObject(1).toString(),
                                      rs.getObject(2).toString(),
                                      rs.getObject(3).toString(),
                                      rs.getObject(4).toString()});
                  
              }
              conn.close();
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_searchActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Connection conn = null;
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int response = JOptionPane.showConfirmDialog(null, "ΔΙΑΓΡΑΦΗ ΤΗΣ ΓΡΑΜΜΗΣ;", "ΕΠΙΒΕΒΑΙΩΣΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        String colName=model.getColumnName(0);
        String colValue=model.getValueAt(jTable2.getSelectedRow(), 0).toString();
        if (response == JOptionPane.YES_OPTION) {
            try{
              conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
              Statement stmt = (Statement) conn.createStatement();
              String st = "DELETE FROM `proodos`.`tilefono`WHERE(`"+colName+"`='"+colValue+"');";
              stmt.executeUpdate(st);
              conn.close();
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
       
            search.doClick();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            Connection conn = null;
            int selectedRow = jTable2.getSelectedRow();
            StringBuilder columnNames = new StringBuilder();
            StringBuilder columnValues = new StringBuilder();
            String exQuery = null;
            String dbColumnID = null;
            ArrayList<String> queryList = new ArrayList<>();
            queryList.add("`tilefono_type`.`TilefonoTypeID`FROM `proodos`.`tilefono_type` WHERE `Onoma`=");

            for (int i = 0; i < jTable2.getColumnCount(); i++) {
                String colName = model.getColumnName(i);
                Object cellValue = model.getValueAt(selectedRow, i);

                if (i > 0) {
                    columnNames.append(", ");
                    columnValues.append(", ");
                }

                columnNames.append("`").append(colName).append("`");

                if (cellValue == null) {
                    columnValues.append("NULL");
                } else {

                    
                    if(colName.equals("TilefonoType"))
                    {
                        exQuery=queryList.get(0);
                        dbColumnID="TilefonoTypeID";          
		    
                    Integer varID = -1;
                    try {
                        System.out.println(exQuery);
                        String st;
                        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                        Statement stmt = conn.createStatement();
                        
                        String query = "SELECT `proodos`."+exQuery+" '"+cellValue+"' LIMIT 1;";
                        System.out.println(query);
                        ResultSet rs = stmt.executeQuery(query);

                        if (rs.next()) {

                        varID = rs.getInt(dbColumnID);
                        System.out.println(varID);
                        columnValues.append("'").append(varID.toString()).append("'");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Δεν υπαρχει αυτη η τιμη στον πινακα!");
                        }
                    } 
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);

                    }
                    }
                else
                {
                    columnValues.append("'").append(cellValue.toString()).append("'");
                }
                }
            }

            int response = JOptionPane.showConfirmDialog(null, "ΠΡΟΣΘΗΚΗ ΤΗΣ ΓΡΑΜΜΗΣ;", "ΕΠΙΒΕΒΑΙΩΣΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response==JOptionPane.YES_OPTION){
            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                Statement stmt = conn.createStatement();
                String st = "INSERT INTO `proodos`.`tilefono`(" + columnNames.toString() + ") VALUES (" + columnValues.toString() + ")";
                System.out.println(st);
                stmt.executeUpdate(st);
                conn.close();
                JOptionPane.showMessageDialog(null,"ΕΠΙΤΥΧΗΣ ΠΡΟΣΘΗΚΗ");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            }
       
        
       

    }//GEN-LAST:event_insertActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
        Connection conn = null;
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int response = JOptionPane.showConfirmDialog(null, "ΕΝΗΜΕΡΩΣΗ ΤΗΣ ΓΡΑΜΜΗΣ;", "ΕΠΙΒΕΒΑΙΩΣΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION){
        for (int i=0;i<jTable2.getColumnCount();i++ ){
        
        String idName=model.getColumnName(0);
        String colName=model.getColumnName(i);
        String colValue=model.getValueAt(jTable2.getSelectedRow(), i).toString();
        String exQuery = null;
        String dbColumnID = null;
	ArrayList<String> queryList = new ArrayList<>();
        queryList.add("`tilefono_type`.`TilefonoTypeID`FROM `proodos`.`tilefono_type` WHERE `Onoma`=");
                    
                    if(colName.equals("TilefonoType"))
                    {
                        exQuery=queryList.get(0);
                        dbColumnID="TilefonoTypeID";
                    
                    Integer varID = -1;
                    try {
                        String st;
                        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                        Statement stmt = conn.createStatement();
                        
                        String query = "SELECT `proodos`."+exQuery+" '"+colValue+"' LIMIT 1;";
                        //System.out.println(query);
                        ResultSet rs = stmt.executeQuery(query);

                        if (rs.next()) {

                        varID = rs.getInt(dbColumnID);
                        //System.out.println(varID);
                        st = "Update `proodos`.`tilefono`SET`"+colName+"`='"+varID+"' WHERE (`"+idName+"`='"+model.getValueAt(jTable2.getSelectedRow(), 0)+"')";
                        //System.out.println(st);
                        stmt.executeUpdate(st);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Δεν υπαρχει αυτη η τιμη στον πινακα!");
                        }
                    } 
                    catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);

                    }
                    }

                    else{
                        try{
                          conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
                          Statement stmt = (Statement) conn.createStatement();
                          String st = "Update `proodos`.`tilefono`SET`"+colName+"`='"+colValue+"' WHERE (`"+idName+"`='"+model.getValueAt(jTable2.getSelectedRow(), 0)+"')";
                          stmt.executeUpdate(st);
                          conn.close();

                       }
                       catch(SQLException e)
                       {
                           JOptionPane.showMessageDialog(null,e);
                       }
                    }
                    }
                    search.doClick();
                    JOptionPane.showMessageDialog(null,"ΕΠΙΤΥΧΗΣ EΝΗΜΕΡΩΣΗ");
                    }
        
        
               
    }//GEN-LAST:event_applyActionPerformed

    private void deleteEmpyRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpyRowActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "ΔΙΑΓΡΑΦΗ ΤΗΣ ΓΡΑΜΜΗΣ;", "ΕΠΙΒΕΒΑΙΩΣΗ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        //model.addRow(new Object[] {null, null, null, null, null, null, null, null, null, null, null,null});
        int selectedRow = jTable2.getSelectedRow();
        Object cellValue;
        cellValue = model.getValueAt(selectedRow, 0);
        if (response == JOptionPane.YES_OPTION) {
        if (cellValue==null)
        {
        model.removeRow(jTable2.getSelectedRow());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "This button can only delete 'NULL' cells");
        }
        }
    }//GEN-LAST:event_deleteEmpyRowActionPerformed

    private void insertEmptyRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertEmptyRowActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.addRow(new Object[] {null, null, null, null, null, null, null, null, null, null, null,null});
    }//GEN-LAST:event_insertEmptyRowActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                HomePageForm f = new HomePageForm();
                Point location = this.getLocation();
                f.setLocation(location);
                f.setVisible(true);
                this.setVisible(false);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                TilefonoType f = new TilefonoType();
                f.setVisible(true);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void selectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBoxActionPerformed
        Object selectedOption=selectionBox.getSelectedItem();
        jLabel2.setText((String) selectedOption);
    }//GEN-LAST:event_selectionBoxActionPerformed

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
            java.util.logging.Logger.getLogger(TilefonoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TilefonoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TilefonoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TilefonoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TilefonoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteEmpyRow;
    private javax.swing.JButton insert;
    private javax.swing.JButton insertEmptyRow;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> selectionBox;
    // End of variables declaration//GEN-END:variables
}
