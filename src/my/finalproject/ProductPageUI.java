/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.finalproject;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Properties;
import javax.swing.JFrame;

/**
 *
 * @author jpats
 */
public class ProductPageUI extends javax.swing.JFrame {
    String gameId;
    String playerId;
    Connection connection;
    boolean rating;

    /**
     * Creates new form ProductPageUI
     */
    public ProductPageUI(Connection connection, String gameId) {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.connection = connection;
        this.gameId = gameId;
        
        submitButton.setEnabled(false);
        

        loadInfo();
    }

    public ProductPageUI(String gameId, String playerId) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.playerId = playerId;
        
        try {
	    // connection info
	    Properties prop = new Properties();
	    FileInputStream in = new FileInputStream("config.properties");
	    prop.load(in);
	    in.close();
	    
	    // connect to datbase
	    String hst = prop.getProperty("host");
	    String usr = prop.getProperty("user");
	    String pwd = prop.getProperty("password");
	    String dab = "cpsc321_groupD_DB";
	    String url = "jdbc:mysql://" + hst + "/" + dab;
	    connection = DriverManager.getConnection(url, usr, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.gameId = gameId;

        loadInfo();
    }
    
    public ProductPageUI() {
        initComponents();
        this.setLocationRelativeTo(null);     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ratingButttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        averageRatingLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        numberRecommendLabel = new javax.swing.JLabel();
        numberNotRecommendLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        releaseDateLabel = new javax.swing.JLabel();
        esrbLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        recommendRadioButton = new javax.swing.JRadioButton();
        notRecommendRadioButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        recommendGameLabel1 = new javax.swing.JLabel();
        recommendGameLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tagList = new javax.swing.JList<>();
        submittedLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Video Game Title Here");

        averageRatingLabel.setText("USER RATING HERE");

        priceLabel.setText("PRICE HERE");

        numberRecommendLabel.setText("NUMBER THAT RECOMMEND HERE");

        numberNotRecommendLabel.setText("NUMBER THAT DONT RECOMMEND HERE");

        releaseDateLabel.setText("RELEASE DATE HERE?");

        esrbLabel.setText("ESRB: HERE");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Rate This Game");

        ratingButttonGroup.add(recommendRadioButton);
        recommendRadioButton.setText("Recommended");
        recommendRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommendRadioButtonActionPerformed(evt);
            }
        });

        ratingButttonGroup.add(notRecommendRadioButton);
        notRecommendRadioButton.setText("Not Recommended");
        notRecommendRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notRecommendRadioButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        recommendGameLabel1.setText("Recommended Game 1");

        recommendGameLabel2.setText("Recommended Game 2");

        jLabel12.setText("RELATED GAMES");

        tagList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Tag 1", "Tag 2", "Tag 3", "Tag 4", "Tag 1", "Tag 2", "Tag 3", "Tag 4", "Tag 1", "Tag 2", "Tag 3", "Tag 4", "Tag 1", "Tag 2", "Tag 3", "Tag 4" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        tagList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tagList.setFocusable(false);
        tagList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tagList.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tagList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recommendRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(recommendGameLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(recommendGameLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(147, 147, 147)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(releaseDateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(esrbLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(averageRatingLabel)
                                    .addComponent(priceLabel)
                                    .addComponent(numberRecommendLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(numberNotRecommendLabel)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notRecommendRadioButton)
                                .addGap(81, 81, 81)
                                .addComponent(submittedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homeButton)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(homeButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(averageRatingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberRecommendLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberNotRecommendLabel)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(releaseDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recommendGameLabel1)
                    .addComponent(recommendGameLabel2)
                    .addComponent(esrbLabel))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recommendRadioButton)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notRecommendRadioButton)
                    .addComponent(submittedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        submittedLabel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recommendRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommendRadioButtonActionPerformed
        
        submitButton.setEnabled(true);
    }//GEN-LAST:event_recommendRadioButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        boolean recommendIsChecked = false;
        boolean notRecommendIsChecked = false;
        if(recommendRadioButton.isSelected()) {
            recommendIsChecked = true;
        }
        if (notRecommendRadioButton.isSelected()) {
            notRecommendIsChecked = true;
        }
        else {
            submittedLabel.setText("No button was selected");
        }
        try
        {
            if (recommendIsChecked) {
                String query = "INSERT INTO rating(player_id, game_id, score) VALUES (?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, this.playerId);
                stmt.setString(2, this.gameId);
                stmt.setInt(3, 1);
                stmt.execute();
                submittedLabel.setText("Review saved");
            }
            if (notRecommendIsChecked) {
                String query = "INSERT INTO rating(player_id, game_id, score) VALUES (?,?,?)";
                PreparedStatement stmt = connection.prepareStatement(query);
                stmt.setString(1, this.playerId);
                stmt.setString(2, this.gameId);
                stmt.setInt(3, 0);
                stmt.execute();
                submittedLabel.setText("Review saved");
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void notRecommendRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notRecommendRadioButtonActionPerformed
        submitButton.setEnabled(true);
    }//GEN-LAST:event_notRecommendRadioButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        SearchPageUI searchPage = new SearchPageUI(connection, playerId);
        searchPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPageUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageRatingLabel;
    private javax.swing.JLabel esrbLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton notRecommendRadioButton;
    private javax.swing.JLabel numberNotRecommendLabel;
    private javax.swing.JLabel numberRecommendLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.ButtonGroup ratingButttonGroup;
    private javax.swing.JLabel recommendGameLabel1;
    private javax.swing.JLabel recommendGameLabel2;
    private javax.swing.JRadioButton recommendRadioButton;
    private javax.swing.JLabel releaseDateLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel submittedLabel;
    private javax.swing.JList<String> tagList;
    // End of variables declaration//GEN-END:variables

    private void loadInfo() {
        if (connection != null) {
            try {
                String sqlSelect1 = "SELECT * FROM game WHERE game_id=?";
                String sqlSelect2 = "SELECT COUNT(*) FROM rating WHERE game_id=? AND score = 0";
                String sqlSelect3 = "SELECT COUNT(*) FROM rating WHERE game_id=?";
                int downvotes = 0;
                int upvotes = 0;
                double averageRating = 0;
                
                PreparedStatement stmt = connection.prepareStatement(sqlSelect1);
                stmt.setString(1, gameId);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    DecimalFormat df = new DecimalFormat("0.00");
                    jLabel1.setText(rs.getString("title"));
                    releaseDateLabel.setText(rs.getString("release_date"));
                    esrbLabel.setText(rs.getString("esrb"));
                    priceLabel.setText("$" + df.format(rs.getDouble("price")));
                    
                } else {
                    jLabel1.setText("Could not find game");
                    return;
                }
                rs.close();
                
                PreparedStatement stmt2 = connection.prepareStatement(sqlSelect2);
                stmt2.setString(1, gameId);
                ResultSet rs2 = stmt2.executeQuery();
                if (rs2.next()) {
                    downvotes = rs2.getInt("COUNT(*)");
                    
                }
                rs2.close();
                
                PreparedStatement stmt3 = connection.prepareStatement(sqlSelect3);
                stmt3.setString(1, gameId);
                ResultSet rs3 = stmt3.executeQuery();
                if (rs3.next()) {
                    int totalRatings = rs3.getInt("COUNT(*)");
                    upvotes = totalRatings - downvotes;
                    averageRating = (double) upvotes / totalRatings * 100;
                }
                rs3.close();
                DecimalFormat df = new DecimalFormat("0.00");
                averageRatingLabel.setText(df.format(averageRating) + "% of people recommend");
                numberRecommendLabel.setText(upvotes + " people recommend");
                numberNotRecommendLabel.setText(downvotes + " people do not recommend");
                
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
