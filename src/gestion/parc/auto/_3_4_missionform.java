package gestion.parc.auto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class _3_4_missionform extends javax.swing.JFrame {

    ArrayList<_3_4_mission> missions = new ArrayList<_3_4_mission>();
    DefaultTableModel modele;
    public _3_4_missionform() {
        initComponents();
        this.setTitle("Gestion des missions");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        condCombo = new javax.swing.JComboBox();
        matriculeLabel = new javax.swing.JLabel();
        matriculeCombo = new javax.swing.JComboBox();
        localDLabel = new javax.swing.JLabel();
        localDField = new javax.swing.JTextField();
        localALabel = new javax.swing.JLabel();
        localAField = new javax.swing.JTextField();
        dateDLabel = new javax.swing.JLabel();
        dateDField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateAField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        missionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(59, 239, 170));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        exitButton.setText("Quitter");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        idLabel.setBackground(new java.awt.Color(59, 239, 170));
        idLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        idLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idLabel.setText("Id mission");
        idLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        idField.setBackground(new java.awt.Color(255, 255, 255));
        idField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        jLabel1.setBackground(new java.awt.Color(59, 239, 170));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conducteur");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        condCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "amine", "houda", "karim" }));

        matriculeLabel.setBackground(new java.awt.Color(59, 239, 170));
        matriculeLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        matriculeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matriculeLabel.setText("Matricule");
        matriculeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        matriculeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mat 1", "mat 2" }));

        localDLabel.setBackground(new java.awt.Color(59, 239, 170));
        localDLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        localDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localDLabel.setText("Local depart");
        localDLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        localDField.setBackground(new java.awt.Color(255, 255, 255));
        localDField.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        localDField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        localALabel.setBackground(new java.awt.Color(59, 239, 170));
        localALabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        localALabel.setText("Local arrivé");
        localALabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        localAField.setBackground(new java.awt.Color(255, 255, 255));
        localAField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        dateDLabel.setBackground(new java.awt.Color(59, 239, 170));
        dateDLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        dateDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateDLabel.setText("Date Depart");
        dateDLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        dateDField.setBackground(new java.awt.Color(255, 255, 255));
        dateDField.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        dateDField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        jLabel2.setBackground(new java.awt.Color(59, 239, 170));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date Arrivée");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        dateAField.setBackground(new java.awt.Color(255, 255, 255));
        dateAField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        addButton.setBackground(new java.awt.Color(59, 239, 170));
        addButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        addButton.setText("Ajouter");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        modifyButton.setBackground(new java.awt.Color(59, 239, 170));
        modifyButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        modifyButton.setText("Modifier");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(59, 239, 170));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        deleteButton.setText("Supprimer");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        missionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Conducteur", "Matricule", "Local Depart", "Local Arrivé", "Date Depart", "Date Arrivée"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        missionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                missionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(missionTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(localDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateAField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(localDField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(condCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(localALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(localAField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(matriculeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(matriculeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dateDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateDField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(condCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localDField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localAField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateDField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateAField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        home c = new home();
        c.setResizable(false);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        ajouterMission();

    }//GEN-LAST:event_addButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        
        modiferMission();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       
        supprimerMission();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void missionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_missionTableMouseClicked
        idField.setText(modele.getValueAt(missionTable.getSelectedRow(), 0).toString());
        condCombo.setSelectedItem(modele.getValueAt(missionTable.getSelectedRow(), 1).toString());
        matriculeCombo.setSelectedItem(modele.getValueAt(missionTable.getSelectedRow(), 2).toString());
        localDField.setText(modele.getValueAt(missionTable.getSelectedRow(), 3).toString());
        localAField.setText(modele.getValueAt(missionTable.getSelectedRow(), 4).toString());
        dateDField.setText(modele.getValueAt(missionTable.getSelectedRow(), 5).toString());
        dateAField.setText(modele.getValueAt(missionTable.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_missionTableMouseClicked

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(_3_4_missionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_4_missionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_4_missionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_4_missionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                _3_4_missionform cond = new _3_4_missionform();
                cond.setResizable(false);
                cond.setLocationRelativeTo(null);
                cond.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox condCombo;
    private javax.swing.JTextField dateAField;
    private javax.swing.JTextField dateDField;
    private javax.swing.JLabel dateDLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField localAField;
    private javax.swing.JLabel localALabel;
    private javax.swing.JTextField localDField;
    private javax.swing.JLabel localDLabel;
    private javax.swing.JComboBox matriculeCombo;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JTable missionTable;
    private javax.swing.JButton modifyButton;
    // End of variables declaration//GEN-END:variables

    private void ajouterMission() {
        Boolean ajout = true;
        modele = (DefaultTableModel)missionTable.getModel();
        if(condCombo.getSelectedItem().equals("")||matriculeCombo.getSelectedItem().equals("")||localDField.getText().equals("")||localAField.getText().equals("")||dateDField.getText().equals("")||dateAField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "remplissez tout les champs ","champ vide",JOptionPane.ERROR_MESSAGE);
            ajout = false;
        }
        if(ajout){
            _3_4_mission miss = new _3_4_mission(condCombo.getSelectedItem().toString(),matriculeCombo.getSelectedItem().toString(),localDField.getText(),localAField.getText(),dateDField.getText(),dateAField.getText());
            missions.add(miss);
            modele.addRow(new Object [] {miss.getId(),miss.getCond(),miss.getMatricule(),miss.getLocalD(),miss.getLocalA(),miss.getDateD(),miss.getDateA()});
            viderChamp();
            JOptionPane.showMessageDialog(this, "ligne bien ajouter");
        }
    }

    private void viderChamp() {
        localDField.setText("");
        localAField.setText("");
        dateDField.setText("");
        dateAField.setText("");
    }

    private void modiferMission() {
        modele = (DefaultTableModel)missionTable.getModel();
        int ligne = missionTable.getSelectedRow();
        if(ligne!=-1){
            modele.setValueAt(condCombo.getSelectedItem(), ligne,1);
            modele.setValueAt(matriculeCombo.getSelectedItem(), ligne,2);
            modele.setValueAt(localDField.getText(), ligne,3);
            modele.setValueAt(localAField.getText(), ligne,4);
            modele.setValueAt(dateDField.getText(), ligne,5);
            modele.setValueAt(dateAField.getText(), ligne,6);
            
            missions.get(ligne).setCond(condCombo.getSelectedItem().toString());   
            missions.get(ligne).setMatricule(matriculeCombo.getSelectedItem().toString());
            missions.get(ligne).setLocalA(localAField.getText());
            missions.get(ligne).setLocalD(localDField.getText());
            missions.get(ligne).setDateD(dateDField.getText());
            missions.get(ligne).setDateA(dateAField.getText());
            JOptionPane.showMessageDialog(this, "mission bien modifiée");
             viderChamp();
        }
    }

    private void supprimerMission() {
        modele = (DefaultTableModel)missionTable.getModel();
        int ligne = missionTable.getSelectedRow();
        
        if(ligne!=-1){
            
            
            missions.remove(ligne);
            modele.removeRow(ligne);
            
            viderChamp();
            JOptionPane.showMessageDialog(this, "Missione bien supprimer");
        }
    }
}
