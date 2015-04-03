/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.winter2015.minesweeper.swing;

import cit260.winter2015.minesweeper.exceptions.EndGameException;
import cit260.winter2015.minesweeper.menuControls.LevelSelectionControl;
import static cit260.winter2015.minesweeper.swing.MainFrame.mainPanel;

/**
 *
 * @author knban_000
 */
public class LevelSelection extends javax.swing.JPanel {

    /**
     * Creates new form LevelSelection
     */
    public LevelSelection() {
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
        jPanel3 = new javax.swing.JPanel();
        jbBeginner = new javax.swing.JButton();
        jbIntermediate = new javax.swing.JButton();
        jbExpert = new javax.swing.JButton();
        jbPreset = new javax.swing.JButton();
        jbQuitToMain = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jPanel3.setBackground(new java.awt.Color(0, 51, 153));

        jbBeginner.setText("Beginner");
        jbBeginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBeginnerActionPerformed(evt);
            }
        });

        jbIntermediate.setText("Intermediate");
        jbIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIntermediateActionPerformed(evt);
            }
        });

        jbExpert.setText("Expert");
        jbExpert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExpertActionPerformed(evt);
            }
        });

        jbPreset.setText("Preset Beginner");
        jbPreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPresetActionPerformed(evt);
            }
        });

        jbQuitToMain.setText("Quit to Main Menu");
        jbQuitToMain.setToolTipText("");
        jbQuitToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitToMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbBeginner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbIntermediate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbExpert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbPreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbQuitToMain, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbBeginner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbIntermediate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExpert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbPreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbQuitToMain)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Select the difficulty level you would like to play.");
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jlTitle.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(240, 240, 240));
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Minesweeper");
        jlTitle.setToolTipText("");
        jlTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jlTitle.setMaximumSize(new java.awt.Dimension(2000, 37));
        jPanel4.add(jlTitle, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBeginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBeginnerActionPerformed
        try {
            LevelSelectionControl.beginner();
        } catch (EndGameException ex) {
            // Todo
        }
    }//GEN-LAST:event_jbBeginnerActionPerformed

    private void jbIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIntermediateActionPerformed
        try {
            LevelSelectionControl.intermediate();
        } catch (EndGameException ex) {
            // Todo
        }
    }//GEN-LAST:event_jbIntermediateActionPerformed

    private void jbExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExpertActionPerformed
        try {
            LevelSelectionControl.expert();
        } catch (EndGameException ex) {
            // Todo
        }
    }//GEN-LAST:event_jbExpertActionPerformed

    private void jbPresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPresetActionPerformed
        try {
            LevelSelectionControl.beginnerPreset();
        } catch (EndGameException ex) {
            // Todo
        }
    }//GEN-LAST:event_jbPresetActionPerformed

    private void jbQuitToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitToMainActionPerformed
        MainFrame.card.show(mainPanel, "mainMenu");
    }//GEN-LAST:event_jbQuitToMainActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbBeginner;
    private javax.swing.JButton jbExpert;
    private javax.swing.JButton jbIntermediate;
    private javax.swing.JButton jbPreset;
    private javax.swing.JButton jbQuitToMain;
    private javax.swing.JLabel jlTitle;
    // End of variables declaration//GEN-END:variables
}
