package frame;

import java.awt.Frame;
import java.sql.Statement;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class main extends javax.swing.JFrame {

    
    
    /**
     * 
     *@application ABPS Elections 2016-17 
     *@author Sameer Khan 
     */
    
    private boolean isEnabledSound = true;
    private String schno = null;
    core.Config config = new core.Config();
    core.Repo repo = new core.Repo();
    core.Play play = new core.Play();
    core.Database db = new core.Database();
    
    public main(String classname, boolean isEnabledSound) {
        initComponents();
        
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
        this.enableSound(isEnabledSound);
        
        if (!this.isEnabledSound){
            SOUND.setIcon(new javax.swing.ImageIcon("src/assets/soundnot.png"));
            SOUND.setText("Disabled");
            SOUND.setToolTipText("Enabled Sound");
        }
        
        for (int i = 0, count = config.classes.length; i < count ; i++){
            CLASS.addItem((String) config.classes[i]);
        }
        if (classname == null){
            CLASS.setSelectedIndex(0);
        } else {
            CLASS.setSelectedItem(classname);
        }
        
        SCHNO.requestFocus();
    }
    
    public void enableSound(boolean enable){
        this.isEnabledSound = enable;
    }
    
    private void playSound(boolean noError){
        if (isEnabledSound){
            play.playSound(noError);
        }
    }
    
    private void openBrower(String url){
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            repo.message("We're social!", "Reach out to us on " + url, "INFO");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CONTAINER = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CLASS = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        SCHNO = new javax.swing.JTextField();
        START = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        CHECK = new javax.swing.JButton();
        SOUND = new javax.swing.JButton();
        GITHUB = new javax.swing.JLabel();
        LINKEDIN = new javax.swing.JLabel();
        TWITTER = new javax.swing.JLabel();
        FACEBOOK = new javax.swing.JLabel();
        SITE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ABPS Elections 2016-17");
        setIconImage(new javax.swing.ImageIcon("src/assets/logo.jpg").getImage());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABPS Elections 2018 - 19");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        CONTAINER.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Enter Your Credentials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("What's Your Class -");

        CLASS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CLASS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Your Roll No. -");

        SCHNO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SCHNO.setSelectionColor(new java.awt.Color(0, 0, 0));
        SCHNO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SCHNOKeyReleased(evt);
            }
        });

        START.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        START.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        START.setText("Start Voting");
        START.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        START.setContentAreaFilled(false);
        START.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        START.setEnabled(false);
        START.setFocusable(false);
        START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CONTAINERLayout = new javax.swing.GroupLayout(CONTAINER);
        CONTAINER.setLayout(CONTAINERLayout);
        CONTAINERLayout.setHorizontalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINERLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SCHNO)
                            .addComponent(CLASS, 0, 626, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINERLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(START, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        CONTAINERLayout.setVerticalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CLASS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SCHNO, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(START, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/poweroff.png"))); // NOI18N
        EXIT.setToolTipText("Quit ABPS Elections");
        EXIT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EXIT.setBorderPainted(false);
        EXIT.setContentAreaFilled(false);
        EXIT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EXIT.setFocusable(false);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        CHECK.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CHECK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/getin.png"))); // NOI18N
        CHECK.setText("Check Results");
        CHECK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CHECK.setContentAreaFilled(false);
        CHECK.setFocusable(false);
        CHECK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKActionPerformed(evt);
            }
        });

        SOUND.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        SOUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/sound.png"))); // NOI18N
        SOUND.setText("Enabled");
        SOUND.setToolTipText("Disable Sound");
        SOUND.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SOUND.setContentAreaFilled(false);
        SOUND.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SOUND.setFocusable(false);
        SOUND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOUNDActionPerformed(evt);
            }
        });

        GITHUB.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        GITHUB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/github.png"))); // NOI18N
        GITHUB.setToolTipText("monkfromearth on Github");
        GITHUB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GITHUB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GITHUBMouseClicked(evt);
            }
        });

        LINKEDIN.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        LINKEDIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/linkedin.png"))); // NOI18N
        LINKEDIN.setToolTipText("monkfromearth on LinkedIn");
        LINKEDIN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LINKEDIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LINKEDINMouseClicked(evt);
            }
        });

        TWITTER.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        TWITTER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/twitter.png"))); // NOI18N
        TWITTER.setToolTipText("monkfromearth on Twitter");
        TWITTER.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TWITTER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TWITTERMouseClicked(evt);
            }
        });

        FACEBOOK.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        FACEBOOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/facebook.png"))); // NOI18N
        FACEBOOK.setToolTipText("monkfromearth on Facebook");
        FACEBOOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FACEBOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FACEBOOKMouseClicked(evt);
            }
        });

        SITE.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        SITE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/monkfromearth.png"))); // NOI18N
        SITE.setToolTipText("monkfromearth on website");
        SITE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SITE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SITEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SOUND, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SITE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GITHUB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FACEBOOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TWITTER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LINKEDIN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CHECK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GITHUB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(SOUND, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                .addComponent(SITE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(FACEBOOK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TWITTER, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LINKEDIN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void SOUNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOUNDActionPerformed

this.enableSound(!this.isEnabledSound);

if (!this.isEnabledSound){
    
    if (repo.confirm("Disabling Sound?", "Are You Sure You Want to Disable Sound?") == 0){
        SOUND.setIcon(new javax.swing.ImageIcon("src/assets/soundnot.png"));
        SOUND.setText("Disabled");
        SOUND.setToolTipText("Enabled Sound");
    }

} else {
    
    SOUND.setIcon(new javax.swing.ImageIcon("src/assets/sound.png")); 
    SOUND.setText("Enabled");
    SOUND.setToolTipText("Disable Sound");
    
}
    }//GEN-LAST:event_SOUNDActionPerformed

    private void STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTActionPerformed
if (SCHNO.getText().replaceAll("\\s", "").length() != 0){
    
    String classname = (String) CLASS.getSelectedItem();
    int schno;
    
    try {
        
        schno = Integer.parseInt(SCHNO.getText());
        
        Statement stmt = db.getStatement();
        
        if (!stmt.executeQuery("SELECT id FROM votes WHERE schno="+schno+";").first()){
            
            String configClass = config.giveClass(schno);
        
            if (configClass != null){

                if (!(configClass).equals(classname)){
                    
                    throw new Exception("<html>Your Class Is - <b>"+configClass+"</b>.<br/><br/>Please Select <b>Correct Class</b>.<br/>");
                    
                }

            } else {

                throw new Exception("Your Roll No was Not Found in Any Class.");

            }
            
            frame.vote_girls vote = new frame.vote_girls(classname, schno, this.isEnabledSound);
            this.dispose();
            vote.setVisible(true);
            
        } else {
            
            this.playSound(false);
            repo.message("Already Voted", "Vote From Your Roll No. has already been registered.", "ERROR");
            
        }

    } catch (Exception e){
        
        playSound(false);
        repo.message("There Was An Error", e.getMessage(), "ERROR");
        
    }
    
    
    
} else if (CLASS.getSelectedIndex() == 0){
    
    playSound(false);
    repo.message("Class not selected", "Please Select Your Class!", "ERROR");
    
} else if (SCHNO.getText().replaceAll("\\s", "").length() == 0){

    playSound(false);
    repo.message("Roll No. not written", "Please Give Your Roll No.", "ERROR");
    
} 
    }//GEN-LAST:event_STARTActionPerformed

    private void SCHNOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SCHNOKeyReleased
int length = SCHNO.getText().replaceAll("\\s", "").length();
SCHNO.setText(SCHNO.getText().replaceAll("\\s", ""));

if (length == 4){
        
    this.schno = SCHNO.getText();
    START.setEnabled(true);
    this.requestFocus();
        
} else if (length > 4){
       
    play.playSound(false);
    repo.message("Invalid Roll No", "Roll No should be of 4 Characters", "ERROR");
    START.setEnabled(false);
    SCHNO.setText(this.schno);
    START.setEnabled(true);
        
} else if (length < 4) {
    
    START.setEnabled(false);
    
}
    }//GEN-LAST:event_SCHNOKeyReleased

    private void CHECKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKActionPerformed
frame.passcode passcode = new frame.passcode();
this.dispose();
passcode.setVisible(true);
    }//GEN-LAST:event_CHECKActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode() == 10){
    START.doClick();
}
    }//GEN-LAST:event_formKeyPressed

    private void SITEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SITEMouseClicked
    this.openBrower("https://monkfromearth.github.io");
    }//GEN-LAST:event_SITEMouseClicked

    private void GITHUBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GITHUBMouseClicked
    this.openBrower("https://github.com/monkfromearth");
    }//GEN-LAST:event_GITHUBMouseClicked

    private void FACEBOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FACEBOOKMouseClicked
    this.openBrower("https://facebook.com/monkfromearth");
    }//GEN-LAST:event_FACEBOOKMouseClicked

    private void LINKEDINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LINKEDINMouseClicked
    this.openBrower("https://linkedin.com/in/monkfromearth");
    }//GEN-LAST:event_LINKEDINMouseClicked

    private void TWITTERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TWITTERMouseClicked
        this.openBrower("https://twitter.com/monkfromearth");
    }//GEN-LAST:event_TWITTERMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main(null, true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECK;
    private javax.swing.JComboBox CLASS;
    private javax.swing.JPanel CONTAINER;
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel FACEBOOK;
    private javax.swing.JLabel GITHUB;
    private javax.swing.JLabel LINKEDIN;
    private javax.swing.JTextField SCHNO;
    private javax.swing.JLabel SITE;
    private javax.swing.JButton SOUND;
    private javax.swing.JButton START;
    private javax.swing.JLabel TWITTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
