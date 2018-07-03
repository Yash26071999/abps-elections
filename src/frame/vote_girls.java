package frame;

import java.awt.Frame;
import javax.swing.ImageIcon;

public class vote_girls extends javax.swing.JFrame {
    
    // Instantiating Classes
    core.Config config = new core.Config();
    core.Play play = new core.Play();
    core.Repo repo = new core.Repo();
    
    // Declaring Variables
    private boolean isEnabledSound = true;
  
    private String cg = null;
    private String classname = null;
    
    private int schno = 0;

    // Constructor
    public vote_girls(String classname, int schno, boolean isEnabledSound) {
        initComponents();
    
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
        this.classname = classname;
        this.schno = schno;
        this.isEnabledSound = isEnabledSound;
        
        CG1.setText(config.candidateGirl1);
        CG2.setText(config.candidateGirl2);
        CG3.setText(config.candidateGirl3);
        
        CGLOGO1.setIcon(new javax.swing.ImageIcon(config.candidateGirl1logo));
        CGLOGO2.setIcon(new javax.swing.ImageIcon(config.candidateGirl2logo));
        CGLOGO3.setIcon(new javax.swing.ImageIcon(config.candidateGirl3logo));
        
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
        HGPANEL = new javax.swing.JPanel();
        CG2 = new javax.swing.JButton();
        CG1 = new javax.swing.JButton();
        CGLOGO1 = new javax.swing.JLabel();
        CGLOGO2 = new javax.swing.JLabel();
        CG3 = new javax.swing.JButton();
        CGLOGO3 = new javax.swing.JLabel();
        VOTENOW = new javax.swing.JButton();
        HOME = new javax.swing.JButton();

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

        HGPANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Choose Girl Candidate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        HGPANEL.setToolTipText("");

        CG2.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CG2.setBorderPainted(false);
        CG2.setContentAreaFilled(false);
        CG2.setFocusable(false);
        CG2.setHideActionText(true);
        CG2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CG2ActionPerformed(evt);
            }
        });

        CG1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CG1.setBorderPainted(false);
        CG1.setContentAreaFilled(false);
        CG1.setFocusable(false);
        CG1.setHideActionText(true);
        CG1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CG1ActionPerformed(evt);
            }
        });

        CGLOGO1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CGLOGO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CGLOGO1MouseClicked(evt);
            }
        });

        CGLOGO2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CGLOGO2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CGLOGO2MouseClicked(evt);
            }
        });

        CG3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        CG3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/radiooff.png"))); // NOI18N
        CG3.setBorderPainted(false);
        CG3.setContentAreaFilled(false);
        CG3.setFocusable(false);
        CG3.setHideActionText(true);
        CG3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        CG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CG3ActionPerformed(evt);
            }
        });

        CGLOGO3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CGLOGO3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CGLOGO3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HGPANELLayout = new javax.swing.GroupLayout(HGPANEL);
        HGPANEL.setLayout(HGPANELLayout);
        HGPANELLayout.setHorizontalGroup(
            HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HGPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANELLayout.createSequentialGroup()
                        .addComponent(CG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CGLOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HGPANELLayout.createSequentialGroup()
                        .addGroup(HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CG3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CG2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CGLOGO3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CGLOGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        HGPANELLayout.setVerticalGroup(
            HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HGPANELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CGLOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HGPANELLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(CG1)))
                .addGroup(HGPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HGPANELLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CGLOGO2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CGLOGO3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(HGPANELLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(CG2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CG3)
                        .addGap(66, 66, 66))))
        );

        VOTENOW.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        VOTENOW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        VOTENOW.setText("Save & Next");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HGPANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(VOTENOW, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(HEADING)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HGPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VOTENOW, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
frame.main main = new frame.main(this.classname, this.isEnabledSound);
this.dispose();
main.setVisible(true);
    }//GEN-LAST:event_HOMEActionPerformed

    private void VOTENOWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOTENOWActionPerformed
if (this.cg != null && this.classname != null && this.schno != 0){

    frame.vote_boys vote = new frame.vote_boys(classname, schno, isEnabledSound, cg);
    this.dispose();
    vote.setVisible(true);
    
} else if (this.cg == null){
    
    this.playSound(false);
    repo.message("Girl Candidate Not Selected", "Please Select Girl Candidate.", "ERROR");
    
} else {
    
    this.playSound(false);
    repo.message("Error", "There was an error while casting your vote.", "ERROR");
    
}
    }//GEN-LAST:event_VOTENOWActionPerformed

    private void CG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CG1ActionPerformed

CG1.setIcon(new ImageIcon("src/assets/radioon.png"));
CG2.setIcon(new ImageIcon("src/assets/radiooff.png"));
CG3.setIcon(new ImageIcon("src/assets/radiooff.png"));

this.cg = CG1.getText();
        
    }//GEN-LAST:event_CG1ActionPerformed

    private void CG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CG2ActionPerformed

CG1.setIcon(new ImageIcon("src/assets/radiooff.png"));
CG2.setIcon(new ImageIcon("src/assets/radioon.png"));
CG3.setIcon(new ImageIcon("src/assets/radiooff.png"));

this.cg = CG2.getText();        
        
    }//GEN-LAST:event_CG2ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode() == 10){
    VOTENOW.doClick();
}
    }//GEN-LAST:event_formKeyPressed

    private void CGLOGO1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CGLOGO1MouseClicked
CG1.doClick();
    }//GEN-LAST:event_CGLOGO1MouseClicked

    private void CGLOGO2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CGLOGO2MouseClicked
CG2.doClick();
    }//GEN-LAST:event_CGLOGO2MouseClicked

    private void CG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CG3ActionPerformed
CG1.setIcon(new ImageIcon("src/assets/radiooff.png"));
CG2.setIcon(new ImageIcon("src/assets/radiooff.png"));
CG3.setIcon(new ImageIcon("src/assets/radioon.png"));

this.cg = CG3.getText();
    }//GEN-LAST:event_CG3ActionPerformed

    private void CGLOGO3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CGLOGO3MouseClicked
CG3.doClick();
    }//GEN-LAST:event_CGLOGO3MouseClicked

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
            java.util.logging.Logger.getLogger(vote_girls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vote_girls("12th A", 5342, true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CG1;
    private javax.swing.JButton CG2;
    private javax.swing.JButton CG3;
    private javax.swing.JLabel CGLOGO1;
    private javax.swing.JLabel CGLOGO2;
    private javax.swing.JLabel CGLOGO3;
    private javax.swing.JLabel HEADING;
    private javax.swing.JPanel HGPANEL;
    private javax.swing.JButton HOME;
    private javax.swing.JButton VOTENOW;
    // End of variables declaration//GEN-END:variables
}
