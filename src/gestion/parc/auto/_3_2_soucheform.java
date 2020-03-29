
package gestion.parc.auto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class _3_2_soucheform extends javax.swing.JFrame {

    ArrayList<_3_2_souche> souches = new ArrayList<_3_2_souche>();
    DefaultTableModel modele;
    
    public _3_2_soucheform() {
        initComponents();
        this.setTitle("Getion de Souche");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelid = new javax.swing.JLabel();
        labelMatricul = new javax.swing.JLabel();
        labelDebSerie = new javax.swing.JLabel();
        labelFinSerie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        id_soucheTextField = new javax.swing.JTextField();
        villeTextField = new javax.swing.JTextField();
        btn_modifier_souche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablesouche = new javax.swing.JTable();
        bnt_ajouter_souche = new javax.swing.JButton();
        btn_supprimer_souche = new javax.swing.JButton();
        matriculecombo = new javax.swing.JComboBox();
        labelid1 = new javax.swing.JLabel();
        prixTextField = new javax.swing.JTextField();
        qteTextField = new javax.swing.JTextField();
        labelDebSerie1 = new javax.swing.JLabel();
        conducteurcombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelid.setBackground(new java.awt.Color(59, 239, 170));
        labelid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelid.setForeground(new java.awt.Color(60, 63, 65));
        labelid.setText("Prix");
        labelid.setAlignmentX(0.5F);
        labelid.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        labelMatricul.setBackground(new java.awt.Color(59, 239, 170));
        labelMatricul.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMatricul.setForeground(new java.awt.Color(60, 63, 65));
        labelMatricul.setText("matricule");
        labelMatricul.setAlignmentX(0.5F);
        labelMatricul.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        labelDebSerie.setBackground(new java.awt.Color(59, 239, 170));
        labelDebSerie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDebSerie.setForeground(new java.awt.Color(60, 63, 65));
        labelDebSerie.setText("ville");
        labelDebSerie.setAlignmentX(0.5F);
        labelDebSerie.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        labelFinSerie.setBackground(new java.awt.Color(59, 239, 170));
        labelFinSerie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFinSerie.setForeground(new java.awt.Color(60, 63, 65));
        labelFinSerie.setText("conducteur");
        labelFinSerie.setAlignmentX(0.5F);
        labelFinSerie.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

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
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
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
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        id_soucheTextField.setBackground(new java.awt.Color(255, 255, 255));
        id_soucheTextField.setForeground(new java.awt.Color(0, 0, 0));
        id_soucheTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));

        villeTextField.setBackground(new java.awt.Color(255, 255, 255));
        villeTextField.setForeground(new java.awt.Color(0, 0, 0));
        villeTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));

        btn_modifier_souche.setBackground(new java.awt.Color(59, 239, 170));
        btn_modifier_souche.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_modifier_souche.setText("Modifier");
        btn_modifier_souche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifier_soucheActionPerformed(evt);
            }
        });

        Tablesouche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Matricule", "Condecteur", "Ville", "Qantite", "Prix"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tablesouche.setCellSelectionEnabled(true);
        Tablesouche.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tablesouche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablesoucheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tablesouche);
        Tablesouche.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bnt_ajouter_souche.setBackground(new java.awt.Color(59, 239, 170));
        bnt_ajouter_souche.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bnt_ajouter_souche.setText("Ajouter");
        bnt_ajouter_souche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_ajouter_soucheActionPerformed(evt);
            }
        });

        btn_supprimer_souche.setBackground(new java.awt.Color(59, 239, 170));
        btn_supprimer_souche.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_supprimer_souche.setText("Supprimer");
        btn_supprimer_souche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimer_soucheActionPerformed(evt);
            }
        });

        matriculecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mat1", "mat2" }));

        labelid1.setBackground(new java.awt.Color(59, 239, 170));
        labelid1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelid1.setForeground(new java.awt.Color(60, 63, 65));
        labelid1.setText("      Id");
        labelid1.setAlignmentX(0.5F);
        labelid1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        prixTextField.setBackground(new java.awt.Color(255, 255, 255));
        prixTextField.setForeground(new java.awt.Color(0, 0, 0));
        prixTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));

        qteTextField.setBackground(new java.awt.Color(255, 255, 255));
        qteTextField.setForeground(new java.awt.Color(0, 0, 0));
        qteTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));

        labelDebSerie1.setBackground(new java.awt.Color(59, 239, 170));
        labelDebSerie1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDebSerie1.setForeground(new java.awt.Color(60, 63, 65));
        labelDebSerie1.setText("Quantite");
        labelDebSerie1.setAlignmentX(0.5F);
        labelDebSerie1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        conducteurcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mohamed", "ali", "houda" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelDebSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(labelid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_soucheTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(villeTextField)
                    .addComponent(prixTextField))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(labelMatricul, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelFinSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDebSerie1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(matriculecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conducteurcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(bnt_ajouter_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btn_modifier_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(btn_supprimer_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 184, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_soucheTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMatricul)
                    .addComponent(matriculecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelid1))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDebSerie)
                    .addComponent(villeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFinSerie)
                    .addComponent(conducteurcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelid)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prixTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(qteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelDebSerie1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifier_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_supprimer_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_ajouter_souche, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modifier_soucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifier_soucheActionPerformed
        modifier_souche();
    }//GEN-LAST:event_btn_modifier_soucheActionPerformed
private void modifier_souche() {
        modele = (DefaultTableModel)Tablesouche.getModel();
        int ligne = Tablesouche.getSelectedRow();
        if(ligne!=-1){
            modele.setValueAt(matriculecombo.getSelectedItem(), ligne,1);
            modele.setValueAt(conducteurcombo.getSelectedItem(), ligne,2);
            modele.setValueAt(villeTextField.getText(), ligne,3);
            modele.setValueAt(qteTextField.getText(), ligne,4);
            modele.setValueAt(prixTextField.getText(), ligne,5);
            
            souches.get(ligne).setMatricule(matriculecombo.getSelectedItem().toString());  
            souches.get(ligne).setConducteur(conducteurcombo.getSelectedItem().toString()); 
            souches.get(ligne).setVille(villeTextField.getText());
            souches.get(ligne).setQuantite(Double.valueOf(qteTextField.getText()));
            souches.get(ligne).setPrix(Double.valueOf(prixTextField.getText()));
            JOptionPane.showMessageDialog(this, "Souche bien modifiée");
             viderChamps();
        }
    }
    private void bnt_ajouter_soucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_ajouter_soucheActionPerformed
        ajouter_souche();
    }//GEN-LAST:event_bnt_ajouter_soucheActionPerformed
    private void ajouter_souche() {
        Boolean ajout = true;
        modele = (DefaultTableModel)Tablesouche.getModel();
        if(qteTextField.getText().equals("")||prixTextField.getText().equals("")||villeTextField.getText().equals("")||conducteurcombo.getSelectedItem().toString().equals("")||matriculecombo.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(this, "remplissez tout les champs ","champ vide",JOptionPane.ERROR_MESSAGE);
            
            ajout=false;
        }
        if (ajout){
            _3_2_souche souche = new _3_2_souche(matriculecombo.getSelectedItem().toString(),conducteurcombo.getSelectedItem().toString(),villeTextField.getText(),Double.valueOf(qteTextField.getText()),Double.valueOf(prixTextField.getText()));
            souches.add(souche);
            modele.addRow(new Object[]{ souche.getId(), souche.getMatricule() , souche.getConducteur(), souche.getVille(), souche.getQuantite(), souche.getPrix()});
            JOptionPane.showMessageDialog(this, "Souche bien ajouter");
            viderChamps();
        }
    }
    private void btn_supprimer_soucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimer_soucheActionPerformed
        supprimer_souche();
    }//GEN-LAST:event_btn_supprimer_soucheActionPerformed

    private void TablesoucheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablesoucheMouseClicked
       DefaultTableModel modele = (DefaultTableModel) Tablesouche.getModel();
        
        //jTextField2.setText(tm.getValueAt(TableCarnet.getSelectedRow(), 0).toString());
        id_soucheTextField.setText(modele.getValueAt(Tablesouche.getSelectedRow(), 0).toString());
        matriculecombo.setSelectedItem(modele.getValueAt(Tablesouche.getSelectedRow(), 1).toString());
        conducteurcombo.setSelectedItem(modele.getValueAt(Tablesouche.getSelectedRow(), 2).toString());
        villeTextField.setText(modele.getValueAt(Tablesouche.getSelectedRow(), 3).toString());
         qteTextField.setText(modele.getValueAt(Tablesouche.getSelectedRow(), 4).toString());
          prixTextField.setText(modele.getValueAt(Tablesouche.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_TablesoucheMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        home c = new home();
        c.setResizable(false);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonMouseClicked
    private void supprimer_souche() {
        modele = (DefaultTableModel)Tablesouche.getModel();
        int ligne = Tablesouche.getSelectedRow();
        
        
        if(ligne!=-1){
            
            
            souches.remove(ligne);
            modele.removeRow(ligne);
            
            viderChamps();
            JOptionPane.showMessageDialog(this, "Souche bien supprimer");
        }
    }
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
            java.util.logging.Logger.getLogger(_3_2_soucheform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_2_soucheform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_2_soucheform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_2_soucheform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _3_2_soucheform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablesouche;
    private javax.swing.JButton bnt_ajouter_souche;
    private javax.swing.JButton btn_modifier_souche;
    private javax.swing.JButton btn_supprimer_souche;
    private javax.swing.JComboBox conducteurcombo;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextField id_soucheTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDebSerie;
    private javax.swing.JLabel labelDebSerie1;
    private javax.swing.JLabel labelFinSerie;
    private javax.swing.JLabel labelMatricul;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelid1;
    private javax.swing.JComboBox matriculecombo;
    private javax.swing.JTextField prixTextField;
    private javax.swing.JTextField qteTextField;
    private javax.swing.JTextField villeTextField;
    // End of variables declaration//GEN-END:variables

    private void viderChamps() {
        qteTextField.setText("");
        prixTextField.setText("");
        villeTextField.setText("");
        matriculecombo.requestFocus();
        
    }

    
}
