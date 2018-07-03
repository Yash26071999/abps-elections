package frame;

import java.awt.Frame;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class vote_boys extends javax.swing.JFrame {
    
    // Instantiating Classes
    core.Config config = new core.Config();
    core.Play play = new core.Play();
    core.Repo repo = new core.Repo();
    core.Database db = new core.Database();
    
    // Declaring Variables
    private boolean isEnabledSound = true;
    
    private String cg = null, cb = null;
    private String classname = null;
    
    private int schno = 0;

    // Constructor
    public vote_boys(String classname, int schno, boolean isEnabledSound, String cg) {
        initComponents();
    
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
        this.classname = classname;
        this.schno = schno;
        this.isEnabledSound = isEnabledSound;
        this.cg = cg;
        
        CB1.setText(config.candidateBoy1);
        CB2.setText(config.candidateBoy2);
        CB3.setText(config.candidateBoy3);
        CB4.setText(config.candidateBoy4);
        
        CBLOGO1.setIcon(new javax.swing.ImageIcon(config.candidateBoy1logo));
        CBLOGO2.setIcon(new javax.swing.ImageIcon(config.candidateBoy2logo));
        CBLOGO3.setIcon(new javax.swing.ImageIcon(config.candidateBoy3logo));
        CBLOGO4.setIcon(new javax.swing.ImageIcon(config.candidateBoy4logo));

        
    }
    
    // Method Overriding from Imported Class
    private void playSound(boolean noError){
        if (isEnabledSound){
            play.playSound(noError);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADING = new javax.swing.JLabel();
        VOTENOW = new javax.swing.JButton();
        HOME = new javax.swing.JButton();
        HGPANEL1 = new javax.swing.JPanel();
        CB2 = new javax.swing.JButton();
        CB1 = new javax.swing.JButton();
        CBLOGO1 = new javax.swing.JLabel();
        CBLOGO2 = new javax.swing.JLabel();
        CB4 = new javax.swing.JButton();
        CBLOGO4 = new javax.swing.JLabel();
        CB3 = new javax.swing.JButton();
        CBLOGO3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vote Now | ABPS Elections 2016 - 17");
        setIconImage(new javax.swing.ImageIcon("src/assets/logo.jpg").getImage());
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        HEADING.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        HEADING.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HEADING.setText("ABPS Elections 2016 - 17");
        HEADING.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        VOTENOW.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        VOTENOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        VOTENOW.setText("Vote Now");
        VOTENOW.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VOTENOW.setContentAreaFilled(false);
        VOTENOW.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VOTENOW.setFocusable(false);
        VOTENOW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOTENOWActionPerformed(evt);
            }
        });

        HOME.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        HOME.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HOME.setBorderPainted(false);
        HOME.setContentAreaFilled(false);
        HOME.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HOME.setFocusable(false);
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });

        HGPANEL1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Choose Boys Candidate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        HGPANEL1.setToolTipText("");

        CB2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CB2.setBorderPainted(false);
        CB2.setContentAreaFilled(false);
        CB2.setFocusable(false);
        CB2.setHideActionText(true);
        CB2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB2ActionPerformed(evt);
            }
        });

        CB1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CB1.setBorderPainted(false);
        CB1.setContentAreaFilled(false);
        CB1.setFocusable(false);
        CB1.setHideActionText(true);
        CB1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });

        CBLOGO1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBLOGO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBLOGO1MouseClicked(evt);
            }
        });

        CBLOGO2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBLOGO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBLOGO2MouseClicked(evt);
            }
        });

        CB4.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CB4.setBorderPainted(false);
        CB4.setContentAreaFilled(false);
        CB4.setFocusable(false);
        CB4.setHideActionText(true);
        CB4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB4ActionPerformed(evt);
            }
        });

        CBLOGO4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBLOGO4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBLOGO4MouseClicked(evt);
            }
        });

        CB3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CB3.setBorderPainted(false);
        CB3.setContentAreaFilled(false);
        CB3.setFocusable(false);
        CB3.setHideActionText(true);
        CB3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB3ActionPerformed(evt);
            }
        });

        CBLOGO3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBLOGO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBLOGO3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HGPANEL1Layout = new javax.swing.GroupLayout(HGPANEL1);
        HGPANEL1.setLayout(HGPANEL1Layout);
        HGPANEL1Layout.setHorizontalGroup(
            HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HGPANEL1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addComponent(CB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBLOGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addComponent(CB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBLOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addComponent(CB4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBLOGO4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addComponent(CB3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBLOGO3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        HGPANEL1Layout.setVerticalGroup(
            HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HGPANEL1Layout.createSequentialGroup()
                .addGroup(HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBLOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(CB1)))
                .addGroup(HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CBLOGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(CB2)))
                .addGroup(HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBLOGO3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(CB3)))
                .addGroup(HGPANEL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(CBLOGO4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANEL1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(CB4)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOTENOW, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HGPANEL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(HEADING)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HGPANEL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VOTENOW, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
frame.main main = new frame.main(this.classname, this.isEnabledSound);
this.dispose();
main.setVisible(true);
    }//GEN-LAST:event_HOMEActionPerformed

    private void VOTENOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOTENOWActionPerformed
if (this.cg != null && this.classname != null && this.schno != 0 && this.cb != null){
    
    try {
        
        Statement stmt = db.getStatement();
        
        if (!stmt.executeQuery("SELECT id FROM votes WHERE schno="+schno+";").first()){
            
            if (stmt.executeUpdate("INSERT INTO votes (classname, schno, voted_girl, voted_boy) values('" + this.classname + "', " + this.schno + ", '" + this.cg + "', '" + this.cb + "') ;") == 1){
                
                this.playSound(true);
                HOME.doClick();
            
            } else {

                this.playSound(false);
                repo.message("3350 - There was an error", "There was an error while registering your vote.", "ERROR");

            }
            
        } else {
            
            this.playSound(false);
            repo.message("Already Voted", "Vote From Your Roll No. has already been registered.", "ERROR");
            
        }

    } catch (Exception e){
        
        this.playSound(false);
        repo.message("3304 - There was an error", e.getMessage(), "ERROR");
        
    }
    
} else if (this.cg == null){
    
    this.playSound(false);
    repo.message("Girl Candidate Not Selected", "Please Select Girl Candidate.", "ERROR");
    
} else if (this.cb == null){
    
    this.playSound(false);
    repo.message("Boy Candidate Not Selected", "Please Select Boy Candidate.", "ERROR");
    
} else {
    
    this.playSound(false);
    repo.message("Error", "There was an error while casting your vote.", "ERROR");
    
}
db.closeConnection();
    }//GEN-LAST:event_VOTENOWActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode() == 10){
    VOTENOW.doClick();
}
    }//GEN-LAST:event_formKeyPressed

    private void CB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB2ActionPerformed
CB1.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB2.setIcon(new ImageIcon("src/assets/radioon.png"));
CB3.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB4.setIcon(new ImageIcon("src/assets/radiooff.png"));

this.cb = CB2.getText();
    }//GEN-LAST:event_CB2ActionPerformed

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed
CB1.setIcon(new ImageIcon("src/assets/radioon.png"));
CB2.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB3.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB4.setIcon(new ImageIcon("src/assets/radiooff.png"));

this.cb = CB1.getText();
    }//GEN-LAST:event_CB1ActionPerformed

    private void CBLOGO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBLOGO1MouseClicked
CB1.doClick();
    }//GEN-LAST:event_CBLOGO1MouseClicked

    private void CBLOGO2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBLOGO2MouseClicked
CB2.doClick();
    }//GEN-LAST:event_CBLOGO2MouseClicked

    private void CB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB4ActionPerformed
CB1.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB2.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB3.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB4.setIcon(new ImageIcon("src/assets/radioon.png"));

this.cb = CB4.getText();
    }//GEN-LAST:event_CB4ActionPerformed

    private void CBLOGO4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBLOGO4MouseClicked
CB4.doClick();
    }//GEN-LAST:event_CBLOGO4MouseClicked

    private void CB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB3ActionPerformed
CB1.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB2.setIcon(new ImageIcon("src/assets/radiooff.png"));
CB3.setIcon(new ImageIcon("src/assets/radioon.png"));
CB4.setIcon(new ImageIcon("src/assets/radiooff.png"));

this.cb = CB3.getText();
    }//GEN-LAST:event_CB3ActionPerformed

    private void CBLOGO3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBLOGO3MouseClicked
CB3.doClick();
    }//GEN-LAST:event_CBLOGO3MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vote_boys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vote_boys("12th A", 5342, true, "Dolores").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CB1;
    private javax.swing.JButton CB2;
    private javax.swing.JButton CB3;
    private javax.swing.JButton CB4;
    private javax.swing.JLabel CBLOGO1;
    private javax.swing.JLabel CBLOGO2;
    private javax.swing.JLabel CBLOGO3;
    private javax.swing.JLabel CBLOGO4;
    private javax.swing.JLabel HEADING;
    private javax.swing.JPanel HGPANEL1;
    private javax.swing.JButton HOME;
    private javax.swing.JButton VOTENOW;
    // End of variables declaration//GEN-END:variables
}
