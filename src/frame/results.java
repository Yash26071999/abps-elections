/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frame;

import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Family
 */
public class results extends javax.swing.JFrame {

    // Instantiating Classes
    core.Config config = new core.Config();
    core.Repo repo = new core.Repo();
    core.Database db = new core.Database();
    
    private int limit = 0;
    private int size = 0;
    private ResultSet results = null;
    private Statement stmt = null;
    
    public results() {

        initComponents(); 
        
        setExtendedState(Frame.MAXIMIZED_BOTH);
        
        try {
            
            for (int i = 0, count = config.classes.length; i < count ; i++ ){
                CLASSNAME.addItem((String) config.classes[i]);
            }
            
            CANDIDATES.addItem((String) config.candidateGirl1);
            CANDIDATES.addItem((String) config.candidateGirl2);
            CANDIDATES.addItem((String) config.candidateGirl3);
            CANDIDATES.addItem((String) config.candidateBoy1);
            CANDIDATES.addItem((String) config.candidateBoy2);
            CANDIDATES.addItem((String) config.candidateBoy3);
            CANDIDATES.addItem((String) config.candidateBoy4);
            
            this.stmt = db.getStatement();
            this.size = db.getSize(stmt.executeQuery("SELECT id FROM votes"));
            this.render();
            
        } catch (SQLException e){
            repo.message("There was an error", e.toString(), "ERROR");
        }
        
    }
    
    private boolean render(){
        try {
            
            if (this.limit < 0 || this.limit >= this.size){
                repo.message("Cannot Render More Data", "No More Votes to Show.", "WARN");
                return false;
            }
            
            String classname = (String) CLASSNAME.getSelectedItem();
            String candidateName = (String) CANDIDATES.getSelectedItem();
            boolean isSearchingClass = false, isSearchingCandidate = false;
            
            String classSql = "", candidateSql = "", midSql = "";
            
            if (!classname.equals("All Classes")){
                isSearchingClass = true;
                classSql = "classname='"+classname+"'";
            }
            
            if (!candidateName.equals("All Candidates")){
                isSearchingCandidate = true;
                candidateSql = "(voted_girl = '"+candidateName+"' or voted_boy = '" + candidateName +  "')";
            }
            
            String startSql = "SELECT * FROM votes";
            
            if (isSearchingClass && !isSearchingCandidate){
                midSql = "WHERE "+classSql;
            } else if (!isSearchingClass && isSearchingCandidate){
                midSql = "WHERE "+candidateSql;
            } else if (isSearchingClass && isSearchingCandidate){
                midSql = "WHERE "+classSql+" AND "+candidateSql;
            }
            
            String sql = startSql + " " + midSql;
            
            this.results = stmt.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) TABLE.getModel();
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            TABLE.setDefaultRenderer(String.class, centerRenderer);
            
            for (int i = model.getRowCount() - 1; i > -1; --i){
                model.removeRow(i);
            }
            
                for (int i = 0, count = db.getSize(results); i < count; i++){
                    
                    results.next();
                    int id = i+1;
                    String class_name = results.getString("classname");
                    String voted_girl = results.getString("voted_girl");
                    String voted_boy = results.getString("voted_boy");
                    model.addRow(new Object[]{id, class_name, voted_girl,voted_boy});
                        
            }
                
            JUMBOTRON.setText(null);
            JUMBOTRON.setText("<html><table cellpadding=20 cellmargin=5><thead><th>Candidate Name</th><th>Class (Section)</th><th>Total Votes</th>"
                                    + "<tbody><tr><td>" + candidateName + "</td><td>" + classname + "</td><td>" + db.getSize(results) + "</td></tr></tbody>");
            
        } catch (SQLException e){
            repo.message("There was an Error", e.toString(), "ERROR");
            return false;
        }
        return true;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PREVIOUS = new javax.swing.JButton();
        NEXT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        TABLESCROLLPANE = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();
        CLASSNAME = new javax.swing.JComboBox();
        CANDIDATES = new javax.swing.JComboBox();
        JUMBOTRON = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Check Results | ABPS Elections");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImage(new javax.swing.ImageIcon("src/assets/logo.jpg").getImage());
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABPS Elections 2016 - 17");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        PREVIOUS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/leftdir.png"))); // NOI18N
        PREVIOUS.setToolTipText("Previous");
        PREVIOUS.setBorderPainted(false);
        PREVIOUS.setContentAreaFilled(false);
        PREVIOUS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PREVIOUS.setFocusable(false);
        PREVIOUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PREVIOUSActionPerformed(evt);
            }
        });

        NEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/rightdir.png"))); // NOI18N
        NEXT.setToolTipText("Next");
        NEXT.setBorderPainted(false);
        NEXT.setContentAreaFilled(false);
        NEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NEXT.setFocusable(false);
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home.png"))); // NOI18N
        jButton4.setToolTipText("Go Back");
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TABLESCROLLPANE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        TABLE.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vote No.", "Class", "Voted Girl Candidate", "Voted Boy Candidate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TABLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TABLE.setFocusable(false);
        TABLE.setRowHeight(20);
        TABLE.setRowMargin(5);
        TABLE.setShowVerticalLines(false);
        TABLESCROLLPANE.setViewportView(TABLE);

        CLASSNAME.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CLASSNAME.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Classes" }));
        CLASSNAME.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CLASSNAMEItemStateChanged(evt);
            }
        });

        CANDIDATES.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        CANDIDATES.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Candidates" }));
        CANDIDATES.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CANDIDATESItemStateChanged(evt);
            }
        });

        JUMBOTRON.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        JUMBOTRON.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JUMBOTRON.setToolTipText("No. Of Votes");
        JUMBOTRON.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), " No. Of Votes ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Trebuchet MS", 0, 14))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TABLESCROLLPANE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(PREVIOUS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(CLASSNAME, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CANDIDATES, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JUMBOTRON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CLASSNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CANDIDATES, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NEXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PREVIOUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(JUMBOTRON, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TABLESCROLLPANE, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
frame.main main = new frame.main("6th A", true);
this.dispose();
main.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PREVIOUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PREVIOUSActionPerformed
this.limit = this.limit - 100;
this.render();
    }//GEN-LAST:event_PREVIOUSActionPerformed

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
this.limit = this.limit + 100;
this.render();
    }//GEN-LAST:event_NEXTActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
if (evt.getKeyCode() == 37){
    PREVIOUS.doClick();
} else if (evt.getKeyCode() == 39){
    NEXT.doClick();
} else {
}
    }//GEN-LAST:event_formKeyPressed

    private void CLASSNAMEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CLASSNAMEItemStateChanged
this.render();
    }//GEN-LAST:event_CLASSNAMEItemStateChanged

    private void CANDIDATESItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CANDIDATESItemStateChanged
this.render();
    }//GEN-LAST:event_CANDIDATESItemStateChanged

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
            java.util.logging.Logger.getLogger(results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CANDIDATES;
    private javax.swing.JComboBox CLASSNAME;
    private javax.swing.JLabel JUMBOTRON;
    private javax.swing.JButton NEXT;
    private javax.swing.JButton PREVIOUS;
    private javax.swing.JTable TABLE;
    private javax.swing.JScrollPane TABLESCROLLPANE;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
