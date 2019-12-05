/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

import java.text.DecimalFormat;


/**
 *
 * @author jpats
 */
public class SearchPageUI extends javax.swing.JFrame {
    Connection connection;
    
    
    /**
     * Creates new form SearchPageUI
     */
    public SearchPageUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public SearchPageUI(Connection connection) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.connection = connection;
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        titleSearchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        esrbPicker = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minPriceTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        maxPriceTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tagList = new javax.swing.JList<String>();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        welcomeLabel.setText("Welcome, Gamer");

        titleSearchBar.setToolTipText("");
        titleSearchBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleSearchBarActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        esrbPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "E", "E10", "T", "M" }));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ESRB");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tags");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rating   >");

        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("-");

        maxPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPriceTextFieldActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("%");

        tagList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Tag 1", "Tag 2", "Tag 3", "Tag 4", "Tag 5", "Multiplayer", "Free-to-Play", "Tag 1", "Tag 2", "Tag 3", "Tag 4", "Tag 5", "Multiplayer", "Free-to-Play" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(tagList);

        errorLabel.setForeground(new java.awt.Color(200, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(esrbPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(esrbPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleSearchBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleSearchBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleSearchBarActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (!checkTextFields()) {
            return;
        }
        
        
        String sqlSelect = "SELECT g.game_id FROM game g JOIN rating r USING "
                + "(game_id) JOIN tag t USING (game_id)";
        
        Map<String, String> params = new HashMap<>();
        if (!titleSearchBar.getText().equals("")) {
            params.put("g.title = ?", titleSearchBar.getText());
        }
        
        if (esrbPicker.getSelectedIndex() != 0) {
            params.put("g.esrb = ?", esrbPicker.getSelectedItem().toString());
        }

        int tagCt = 0;
        for (String tagString : tagList.getSelectedValuesList()) {
            params.put("tag" + tagCt, tagString);
            tagCt++;
        }
        
        if (!minPriceTextField.getText().equals("")) {
            params.put("g.price >= ?", minPriceTextField.getText());
        }
        
        if (!maxPriceTextField.getText().equals("")) {
            params.put("g.price <= ?", maxPriceTextField.getText());
        }
        
        int pCt = 0;
        for (String paramKey : params.keySet()) {
            if (pCt == 0) {
                if (paramKey.contains("tag")) {
                    sqlSelect += " WHERE t.genre_name = ?";
                } else {
                    sqlSelect += " WHERE " + paramKey;
                }
                pCt++;
            } else {
                System.out.println(paramKey + ", t.genre_name");
                if (paramKey.contains("tag")) {
                    sqlSelect += " OR t.genre_name = ?";
                } else {
                    sqlSelect += " AND " + paramKey;
                }
                pCt++;
            }
        }
        
        sqlSelect += " GROUP BY game_id";
        
        String minRating = jTextField1.getText();
        if (!jTextField1.getText().equals("")) {
            sqlSelect += " HAVING AVG(r.score) > ?";
        }
        
        System.out.println(sqlSelect);
        
        
        if (connection != null) {
            try {
                PreparedStatement stmt = connection.prepareStatement(sqlSelect);
                
                int setCt = 1;
                for (String paramKey : params.keySet()) {
                    stmt.setString(setCt, params.get(paramKey));
                    setCt++;
                }
                if (!minRating.equals("")) {
                    stmt.setString(setCt, minRating);
                }
                
                System.out.println(stmt.toString());
//                ResultSet rs = stmt.executeQuery();
//                
//                SearchResultsUI results = new SearchResultsUI(connection, rs);
//                this.setVisible(false);
//                results.setVisible(true);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        

        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void maxPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxPriceTextFieldActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPageUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorLabel;
    private javax.swing.JComboBox<String> esrbPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField maxPriceTextField;
    private javax.swing.JTextField minPriceTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JList<String> tagList;
    private javax.swing.JTextField titleSearchBar;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

    private boolean checkTextFields() {
        String rating = jTextField1.getText();
        String minPrice = minPriceTextField.getText();
        String maxPrice = maxPriceTextField.getText();
        
        try {
            if (!rating.equals("")) {
                if (Double.parseDouble(rating) > 100) {
                    errorLabel.setText("Ratings must be between 0 and 100");
                    return false;
                }
            }
            
            if (!minPrice.equals("")) {
                Double.parseDouble(minPrice);
            }
            if (!maxPrice.equals("")) {
                Double.parseDouble(maxPrice);
            }
            

            if (!minPrice.equals("") && !maxPrice.equals("")) {
                return Double.parseDouble(minPrice) < Double.parseDouble(maxPrice);
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            errorLabel.setText("Enter numeric values for rating and price range");
            return false;
        }
    }
}
