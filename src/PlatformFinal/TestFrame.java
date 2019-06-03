/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlatformFinal;

/**
 *
 * @author beere1633
 */
public class TestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TestFrame
     */
    public TestFrame() {
        initComponents();
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
        mainTitle_Lbl = new javax.swing.JLabel();
        update_Btn = new javax.swing.JButton();
        NewTitle_Lbl = new javax.swing.JLabel();
        NewTitle_TxtArea = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        score_lst = new javax.swing.JList();
        Score_Lbl = new javax.swing.JLabel();
        Play_btn = new javax.swing.JButton();
        starring_lbl = new javax.swing.JLabel();
        intructions_Lbl = new javax.swing.JLabel();
        instructControls_Lbl = new javax.swing.JLabel();
        author_Lbl = new javax.swing.JLabel();
        instruct2_Lbl = new javax.swing.JLabel();
        previous_Lbl = new javax.swing.JLabel();
        previousUser_Lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        mainTitle_Lbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mainTitle_Lbl.setText("Super Blocko");

        update_Btn.setText("Update Username");
        update_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_BtnActionPerformed(evt);
            }
        });

        NewTitle_Lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NewTitle_Lbl.setText("New User:");

        NewTitle_TxtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTitle_TxtAreaActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(score_lst);

        Score_Lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Score_Lbl.setText("All Users:");

        Play_btn.setBackground(new java.awt.Color(255, 0, 0));
        Play_btn.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Play_btn.setForeground(new java.awt.Color(255, 255, 0));
        Play_btn.setText("PLAY");
        Play_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Play_btnActionPerformed(evt);
            }
        });

        starring_lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        starring_lbl.setText("Starring: You!");

        intructions_Lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        intructions_Lbl.setText("Instructions:");

        instructControls_Lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        instructControls_Lbl.setText("Use the WASD Keys!");

        author_Lbl.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        author_Lbl.setText("Made By: Erik Beer, P.2");

        instruct2_Lbl.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        instruct2_Lbl.setText("Avoid red blocks!");

        previous_Lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previous_Lbl.setText("Previous User:");

        previousUser_Lbl.setText("No one!");

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel1.setText("Green is the goal!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(mainTitle_Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(starring_lbl))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Score_Lbl)
                                    .addComponent(previous_Lbl)
                                    .addComponent(previousUser_Lbl))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(update_Btn)
                                            .addComponent(NewTitle_TxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(author_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(Play_btn))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(NewTitle_Lbl)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(intructions_Lbl)
                                            .addComponent(instructControls_Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(instruct2_Lbl)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainTitle_Lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(starring_lbl)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Play_btn)
                                .addGap(16, 16, 16)
                                .addComponent(NewTitle_Lbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(intructions_Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instructControls_Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instruct2_Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)))
                        .addGap(9, 9, 9)
                        .addComponent(NewTitle_TxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(author_Lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(previous_Lbl)
                        .addGap(4, 4, 4)
                        .addComponent(previousUser_Lbl)
                        .addGap(18, 18, 18)
                        .addComponent(Score_Lbl)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Score_Lbl.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void update_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_BtnActionPerformed
        // TODO add your handling code here:
        String newTitle = "";
        newTitle = NewTitle_TxtArea.getText();
        starring_lbl.setText("Starring: "+newTitle+"!");
        previousUser_Lbl.setText(newTitle);
    }//GEN-LAST:event_update_BtnActionPerformed

    private void NewTitle_TxtAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTitle_TxtAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewTitle_TxtAreaActionPerformed

    private void Play_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Play_btnActionPerformed
        // TODO add your handling code here:
        new PlayPlatformer();
    }//GEN-LAST:event_Play_btnActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NewTitle_Lbl;
    private javax.swing.JTextField NewTitle_TxtArea;
    private javax.swing.JButton Play_btn;
    private javax.swing.JLabel Score_Lbl;
    private javax.swing.JLabel author_Lbl;
    private javax.swing.JLabel instruct2_Lbl;
    private javax.swing.JLabel instructControls_Lbl;
    private javax.swing.JLabel intructions_Lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainTitle_Lbl;
    private javax.swing.JLabel previousUser_Lbl;
    private javax.swing.JLabel previous_Lbl;
    private javax.swing.JList score_lst;
    private javax.swing.JLabel starring_lbl;
    private javax.swing.JButton update_Btn;
    // End of variables declaration//GEN-END:variables
}
