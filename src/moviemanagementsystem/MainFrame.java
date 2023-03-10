/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moviemanagementsystem;

import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaarlosasiang
 */
public class MainFrame extends javax.swing.JFrame {

    private static Movie movie = new Movie();
    private DefaultTableModel model;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        displayTable();
        setTitle("Movie Management System");
    }

    private void displayTable() {
        model = (DefaultTableModel) RecentsTB.getModel();
        movie.displayRecent(model);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecentsTB = new javax.swing.JTable();
        newMovieBtn = new javax.swing.JButton();
        newDirectorBtn = new javax.swing.JButton();
        newActorBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        manageMoviess = new javax.swing.JLabel();
        manageActors = new javax.swing.JLabel();
        manageDirectors = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 62, 69));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movie Management");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Montserrat Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(187, 187, 187))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(35, 40, 47));

        RecentsTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Director", "Actor", "Genre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RecentsTB.setDragEnabled(true);
        RecentsTB.setFocusable(false);
        RecentsTB.setGridColor(new java.awt.Color(54, 62, 69));
        RecentsTB.setRowHeight(26);
        RecentsTB.setShowGrid(true);
        jScrollPane1.setViewportView(RecentsTB);

        newMovieBtn.setBackground(new java.awt.Color(132, 176, 39));
        newMovieBtn.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        newMovieBtn.setForeground(new java.awt.Color(255, 255, 255));
        newMovieBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/file-icon.png"))); // NOI18N
        newMovieBtn.setText("New Movie");
        newMovieBtn.setBorderPainted(false);
        newMovieBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newMovieBtn.setFocusPainted(false);
        newMovieBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newMovieBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMovieBtnActionPerformed(evt);
            }
        });

        newDirectorBtn.setBackground(new java.awt.Color(54, 62, 69));
        newDirectorBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        newDirectorBtn.setForeground(new java.awt.Color(255, 255, 255));
        newDirectorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/director-icon.png"))); // NOI18N
        newDirectorBtn.setText("New Director");
        newDirectorBtn.setBorderPainted(false);
        newDirectorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newDirectorBtn.setFocusPainted(false);
        newDirectorBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newDirectorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDirectorBtnActionPerformed(evt);
            }
        });

        newActorBtn.setBackground(new java.awt.Color(54, 62, 69));
        newActorBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        newActorBtn.setForeground(new java.awt.Color(255, 255, 255));
        newActorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/actor-icon.png"))); // NOI18N
        newActorBtn.setText("New Actor");
        newActorBtn.setBorderPainted(false);
        newActorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newActorBtn.setFocusPainted(false);
        newActorBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        newActorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newActorBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Get Started");

        manageMoviess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/movie-btn.png"))); // NOI18N
        manageMoviess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageMoviess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageMoviessMouseClicked(evt);
            }
        });

        manageActors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/actors-btn.png"))); // NOI18N
        manageActors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageActors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageActorsMouseClicked(evt);
            }
        });

        manageDirectors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moviemanagementsystem/images/director-btn.png"))); // NOI18N
        manageDirectors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageDirectors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDirectorsMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Recently Added Movies");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(newMovieBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(newActorBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(newDirectorBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addComponent(manageMoviess, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(manageActors)
                            .addGap(37, 37, 37)
                            .addComponent(manageDirectors, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(newMovieBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newDirectorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newActorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageDirectors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageActors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageMoviess))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(54, 62, 69));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newMovieBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMovieBtnActionPerformed
        AddMovie addMovie = new AddMovie();
        this.dispose();
        addMovie.setVisible(true);
    }//GEN-LAST:event_newMovieBtnActionPerformed

    private void newDirectorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDirectorBtnActionPerformed
        AddDirector addDirector = new AddDirector();
        this.dispose();
        addDirector.setVisible(true);
    }//GEN-LAST:event_newDirectorBtnActionPerformed

    private void newActorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newActorBtnActionPerformed
        AddActor addActor = new AddActor();
        this.dispose();
        addActor.setVisible(true);
        
    }//GEN-LAST:event_newActorBtnActionPerformed

    private void manageDirectorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDirectorsMouseClicked
        // TODO add your handling code here:
        ManageDirector manageDirector = new ManageDirector();
        this.dispose();
        manageDirector.setVisible(true);
    }//GEN-LAST:event_manageDirectorsMouseClicked

    private void manageActorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageActorsMouseClicked
        // TODO add your handling code here:
        ManageActor manageActor = new ManageActor();
        this.dispose();
        manageActor.setVisible(true);
    }//GEN-LAST:event_manageActorsMouseClicked

    private void manageMoviessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageMoviessMouseClicked
        // TODO add your handling code here:
        ManageMovie manageMovie = new ManageMovie();
        this.dispose();
        manageMovie.setVisible(true);
    }//GEN-LAST:event_manageMoviessMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RecentsTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageActors;
    private javax.swing.JLabel manageDirectors;
    private javax.swing.JLabel manageMoviess;
    private javax.swing.JButton newActorBtn;
    private javax.swing.JButton newDirectorBtn;
    private javax.swing.JButton newMovieBtn;
    // End of variables declaration//GEN-END:variables
}
