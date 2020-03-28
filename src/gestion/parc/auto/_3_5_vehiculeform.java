package gestion.parc.auto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class _3_5_vehiculeform extends javax.swing.JFrame {

    
    ArrayList<_3_5_vehicule> vehicules = new ArrayList<_3_5_vehicule>();
    DefaultTableModel modele;
    public _3_5_vehiculeform() {
        this.setTitle("Gestion des vehicules");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        matriculeLabel = new javax.swing.JLabel();
        matriculeField = new javax.swing.JTextField();
        carburantLabel = new javax.swing.JLabel();
        carburantField = new javax.swing.JTextField();
        kiloLabel = new javax.swing.JLabel();
        kiloField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        seuilLabel = new javax.swing.JLabel();
        seuilField = new javax.swing.JTextField();
        vidangeLabel = new javax.swing.JLabel();
        vidangeField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehTable = new javax.swing.JTable();
        marqueLabel = new javax.swing.JLabel();
        marqueField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(59, 239, 170));

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Quitter");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        matriculeLabel.setBackground(new java.awt.Color(59, 239, 170));
        matriculeLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        matriculeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matriculeLabel.setText("Matricule");
        matriculeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        matriculeField.setBackground(new java.awt.Color(255, 255, 255));
        matriculeField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        carburantLabel.setBackground(new java.awt.Color(59, 239, 170));
        carburantLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        carburantLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        carburantLabel.setText("Carburant");
        carburantLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        carburantField.setBackground(new java.awt.Color(255, 255, 255));
        carburantField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        kiloLabel.setBackground(new java.awt.Color(59, 239, 170));
        kiloLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        kiloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kiloLabel.setText("Kilometrage");
        kiloLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        kiloField.setBackground(new java.awt.Color(255, 255, 255));
        kiloField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        modelLabel.setBackground(new java.awt.Color(59, 239, 170));
        modelLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        modelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modelLabel.setText("Modèle");
        modelLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        modelField.setBackground(new java.awt.Color(255, 255, 255));
        modelField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        seuilLabel.setBackground(new java.awt.Color(59, 239, 170));
        seuilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seuilLabel.setText("Seuil");
        seuilLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        seuilField.setBackground(new java.awt.Color(255, 255, 255));
        seuilField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        vidangeLabel.setBackground(new java.awt.Color(59, 239, 170));
        vidangeLabel.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        vidangeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vidangeLabel.setText("Dernier Vidange");
        vidangeLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        vidangeField.setBackground(new java.awt.Color(255, 255, 255));
        vidangeField.setForeground(new java.awt.Color(0, 0, 0));
        vidangeField.setText("jj-mm-aaaa");
        vidangeField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

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

        vehTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matricule", "Carburant", "Kilometrage", "Modèle", "Seuil", "Dernier Vidange", "marque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        vehTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vehTable);

        marqueLabel.setBackground(new java.awt.Color(59, 239, 170));
        marqueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marqueLabel.setText("Marque");
        marqueLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        marqueField.setBackground(new java.awt.Color(255, 255, 255));
        marqueField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(marqueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(marqueField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(modelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(matriculeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matriculeField)
                                    .addComponent(modelField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(carburantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(carburantField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(seuilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seuilField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(kiloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kiloField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(vidangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vidangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carburantLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carburantField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kiloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kiloField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelField)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seuilField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vidangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vidangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seuilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(marqueField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marqueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        ajouterVeh();

    }//GEN-LAST:event_addButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        
        modiferCond();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       
        supprimerCond();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void vehTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehTableMouseClicked
        matriculeField.setText(modele.getValueAt(vehTable.getSelectedRow(), 0).toString());
        carburantField.setText(modele.getValueAt(vehTable.getSelectedRow(), 1).toString());
        kiloField.setText(modele.getValueAt(vehTable.getSelectedRow(), 2).toString());
        modelField.setText(modele.getValueAt(vehTable.getSelectedRow(), 3).toString());
        seuilField.setText(modele.getValueAt(vehTable.getSelectedRow(), 4).toString());
        vidangeField.setText(modele.getValueAt(vehTable.getSelectedRow(), 5).toString());
        marqueField.setText(modele.getValueAt(vehTable.getSelectedRow(), 6).toString());
    }//GEN-LAST:event_vehTableMouseClicked

    
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
            java.util.logging.Logger.getLogger(_3_5_vehiculeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_5_vehiculeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_5_vehiculeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_5_vehiculeform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               _3_5_vehiculeform v = new _3_5_vehiculeform();
               v.setResizable(false);
               v.setLocationRelativeTo(null);
               v.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField carburantField;
    private javax.swing.JLabel carburantLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kiloField;
    private javax.swing.JLabel kiloLabel;
    private javax.swing.JTextField marqueField;
    private javax.swing.JLabel marqueLabel;
    private javax.swing.JTextField matriculeField;
    private javax.swing.JLabel matriculeLabel;
    private javax.swing.JTextField modelField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField seuilField;
    private javax.swing.JLabel seuilLabel;
    private javax.swing.JTable vehTable;
    private javax.swing.JTextField vidangeField;
    private javax.swing.JLabel vidangeLabel;
    // End of variables declaration//GEN-END:variables

    private void ajouterVeh() {
        Boolean ajout = true;
        modele = (DefaultTableModel)vehTable.getModel();
        if(matriculeField.getText().equals("")||modelField.getText().equals("")||carburantField.getText().equals("")||seuilField.getText().equals("")||kiloField.getText().equals("")||vidangeField.getText().equals("")||marqueField.getText().equals("")){
            JOptionPane.showMessageDialog(this, "remplissez tout les champs ","champ vide",JOptionPane.ERROR_MESSAGE);
            ajout = false;
        }
        if(ajout){
            _3_5_vehicule vehicule = new _3_5_vehicule(matriculeField.getText(),carburantField.getText(),kiloField.getText(),modelField.getText(),seuilField.getText(),vidangeField.getText(),marqueField.getText());
            vehicules.add(vehicule);
            modele.addRow(new Object [] {vehicule.getMatricule(),vehicule.getCar(),vehicule.getKilo(),vehicule.getMod(),vehicule.getSeuil(),vehicule.getVid()});
            viderChamp();
        }
    }

    private void viderChamp() {
        matriculeField.setText("");
        modelField.setText("");
        carburantField.setText("");
        kiloField.setText("");   
        seuilField.setText("");
        vidangeField.setText("");
        marqueField.setText("");
    }

    private void modiferCond() {
        modele = (DefaultTableModel)vehTable.getModel();
        int ligne = vehTable.getSelectedRow();
        if(ligne!=-1){
            modele.setValueAt(matriculeField.getText(), ligne,0);
            modele.setValueAt(carburantField.getText(), ligne,1);
            modele.setValueAt(kiloField.getText(), ligne,2);
            modele.setValueAt(modelField.getText(), ligne,3);
            modele.setValueAt(seuilField.getText(), ligne,4);
            modele.setValueAt(vidangeField.getText(), ligne,5);
            modele.setValueAt(marqueField.getText(), ligne,6);
            
            vehicules.get(ligne).setMatricule(matriculeField.getText());   
            vehicules.get(ligne).setCar(carburantField.getText());
            vehicules.get(ligne).setKilo(kiloField.getText());
            vehicules.get(ligne).setMod(modelField.getText());
            vehicules.get(ligne).setSeuil(seuilField.getText());
            vehicules.get(ligne).setVid(vidangeField.getText());
            vehicules.get(ligne).setMarque(marqueField.getText());
            JOptionPane.showMessageDialog(this, "vehicule bien modifiée");
            
            viderChamp();
        }
}

    private void supprimerCond() {
        modele = (DefaultTableModel)vehTable.getModel();
        int ligne = vehTable.getSelectedRow();
        
        if(ligne!=-1){
            
            
            vehicules.remove(ligne);
            modele.removeRow(ligne);
            
            viderChamp();
            JOptionPane.showMessageDialog(this, "Vehicule bien supprimer");
        }
    }
}
