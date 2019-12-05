/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.finalproject;

import javax.swing.JFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

/**
 *
 * @author jpats
 */
public class SearchResultsUI extends javax.swing.JFrame {
    Connection connection;
    String playerId;
    ResultSet rsTitles;
    String sqlSelect;
    Map<String, String> params;
    String rating;
    /**
     * Creates new form SearchResultsUI
     */
    public SearchResultsUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public SearchResultsUI(Connection connection, ResultSet rs, String sqlSelect, Map<String, String> params, String rating, String playerId) {
        initComponents();
        this.connection = connection;
        this.rsTitles = rs;
        this.sqlSelect = sqlSelect;
        this.params = params;
        this.rating = rating;
        int resultNumber = 0;
        DefaultListModel listModel = new DefaultListModel();
        
        try {
            while(rsTitles.next()) {
                listModel.addElement(rsTitles.getString("g.title"));
                resultNumber++;
            }
            gameCountLabel.setText(Integer.toString(resultNumber) + " games found");
            resultsList.setModel(listModel);
            rsTitles.close();
        }catch (SQLException e) {
                e.printStackTrace();
        }
        
        this.setLocationRelativeTo(null);
        this.playerId = playerId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homeButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortByComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsList = new javax.swing.JList<>();
        goToGameButton = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        gameCountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Search Results");

        sortByComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sortByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A - Z ↑", "A - Z ↓", "Release Date ↑", "Release Date ↓", "Rating ↑", "Rating ↓", "Price ↑", "Price ↓" }));
        sortByComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Sort By");

        resultsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(resultsList);

        goToGameButton.setText("Go to Game");
        goToGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToGameButtonActionPerformed(evt);
            }
        });

        error.setForeground(new java.awt.Color(200, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goToGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(error, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gameCountLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeButton)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(homeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gameCountLabel)
                        .addGap(42, 42, 42)
                        .addComponent(error)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(goToGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        SearchPageUI searchPage = new SearchPageUI(connection, playerId);
        searchPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void sortByComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByComboBoxActionPerformed
        JComboBox<String> order = (JComboBox<String>) evt.getSource();
        String orderAddition = "";
        switch (order.getSelectedIndex()) {
            case 0:
                orderAddition += " ORDER BY g.title ASC";
                break;
            case 1:
                orderAddition += " ORDER BY g.title DESC";
                break;
            case 2:
                orderAddition += " ORDER BY g.release_date ASC";
                break;
            case 3:
                orderAddition += " ORDER BY g.release_date DESC";
                break;
            case 4:
                orderAddition += " ORDER BY AVG(r.score) ASC";
                break;
            case 5:
                orderAddition += " ORDER BY AVG(r.score) DESC";
                break;
            case 6: 
                orderAddition += " ORDER BY g.price ASC";
                break;
            case 7:
                orderAddition += " ORDER BY g.price DESC";
                break;
        }
        
        if (connection != null) {
            try {
                PreparedStatement stmt = connection.prepareStatement(sqlSelect + orderAddition);
                
                int setCt = 1;
                for (String paramKey : params.keySet()) {
                    stmt.setString(setCt, params.get(paramKey));
                    setCt++;
                }
                if (!rating.equals("")) {
                    stmt.setString(setCt, rating);
                }
                
                System.out.println(stmt.toString());
                ResultSet rs = stmt.executeQuery();  
                
                DefaultListModel listModel = new DefaultListModel();
                int resultNumber = 0;
                while(rs.next()) {
                    listModel.addElement(rs.getString("g.title"));
                    resultNumber++;
                }
                gameCountLabel.setText(Integer.toString(resultNumber) + " games found");
                resultsList.setModel(listModel);
                rs.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_sortByComboBoxActionPerformed

    private void goToGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToGameButtonActionPerformed
        //modify list so only one selection allowed
        if (resultsList.isSelectionEmpty())
            error.setText("No game selected");
        else {
            String gameTitle = resultsList.getSelectedValue(); 
            String gameId = "-1";
            System.out.println("CLICK");
            if (connection != null) {
                System.out.println("CONNECTION");
                try {
                    String sqlSelectGameId = "SELECT game_id FROM game WHERE title=?";
                    PreparedStatement stmt = connection.prepareStatement(sqlSelectGameId);
                    stmt.setString(1, gameTitle);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                      gameId = rs.getString("game_id");
                    }
                }
                catch (SQLException e) {
                    e.printStackTrace();
                }
            ProductPageUI productPage = new ProductPageUI(gameId, playerId, connection);
            productPage.setVisible(true);
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_goToGameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchResultsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JLabel gameCountLabel;
    private javax.swing.JButton goToGameButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> resultsList;
    private javax.swing.JComboBox<String> sortByComboBox;
    // End of variables declaration//GEN-END:variables
}
