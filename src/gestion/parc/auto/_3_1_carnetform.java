/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.parc.auto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author POSTE
 */
public class _3_1_carnetform extends javax.swing.JFrame {

    ArrayList<_3_1_carnet> carnets = new ArrayList<_3_1_carnet>();
    DefaultTableModel modele;
    
    public _3_1_carnetform() {
        initComponents();
        this.setTitle("Getion de Carnet");
        
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
        labelid = new javax.swing.JLabel();
        labelMatricul = new javax.swing.JLabel();
        labelDebSerie = new javax.swing.JLabel();
        labelFinSerie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        DebutSerieTextField = new javax.swing.JTextField();
        FinSerieTextField = new javax.swing.JTextField();
        btn_modifier_carnet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCarnet = new javax.swing.JTable();
        bnt_ajouter_carnet = new javax.swing.JButton();
        btn_supprimer_carnet = new javax.swing.JButton();
        MatriculeTextField = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelid.setBackground(new java.awt.Color(59, 239, 170));
        labelid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelid.setForeground(new java.awt.Color(60, 63, 65));
        labelid.setText("      Id");
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
        labelDebSerie.setText("debut serie");
        labelDebSerie.setAlignmentX(0.5F);
        labelDebSerie.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(59, 239, 170), null));

        labelFinSerie.setBackground(new java.awt.Color(59, 239, 170));
        labelFinSerie.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFinSerie.setForeground(new java.awt.Color(60, 63, 65));
        labelFinSerie.setText("fin serie");
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
                .addGap(45, 45, 45)
                .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setForeground(new java.awt.Color(0, 0, 0));
        idTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 63, 65), 2, true));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        DebutSerieTextField.setBackground(new java.awt.Color(255, 255, 255));
        DebutSerieTextField.setForeground(new java.awt.Color(0, 0, 0));
        DebutSerieTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));

        FinSerieTextField.setBackground(new java.awt.Color(255, 255, 255));
        FinSerieTextField.setForeground(new java.awt.Color(0, 0, 0));
        FinSerieTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65), 2));

        btn_modifier_carnet.setBackground(new java.awt.Color(59, 239, 170));
        btn_modifier_carnet.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_modifier_carnet.setText("Modifier");
        btn_modifier_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifier_carnetActionPerformed(evt);
            }
        });

        TableCarnet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "matricule", "Serie Debut", "Serie Fin"
            }
        ));
        TableCarnet.setCellSelectionEnabled(true);
        TableCarnet.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TableCarnet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCarnetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCarnet);
        TableCarnet.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        bnt_ajouter_carnet.setBackground(new java.awt.Color(59, 239, 170));
        bnt_ajouter_carnet.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        bnt_ajouter_carnet.setText("Ajouter");
        bnt_ajouter_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_ajouter_carnetActionPerformed(evt);
            }
        });

        btn_supprimer_carnet.setBackground(new java.awt.Color(59, 239, 170));
        btn_supprimer_carnet.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btn_supprimer_carnet.setText("Supprimer");
        btn_supprimer_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimer_carnetActionPerformed(evt);
            }
        });

        MatriculeTextField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mat1", "mat2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelDebSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(labelid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(DebutSerieTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelMatricul, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(labelFinSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(bnt_ajouter_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btn_modifier_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_supprimer_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(FinSerieTextField)
                    .addComponent(MatriculeTextField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelid)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMatricul)
                    .addComponent(MatriculeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDebSerie)
                    .addComponent(DebutSerieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinSerieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFinSerie))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_supprimer_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifier_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnt_ajouter_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_modifier_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifier_carnetActionPerformed
        modifier_carnet();
    }//GEN-LAST:event_btn_modifier_carnetActionPerformed
    public void modifier_carnet(){
        modele = (DefaultTableModel)TableCarnet.getModel();
        int ligne = TableCarnet.getSelectedRow();
        if(ligne!=-1){
            modele.setValueAt(MatriculeTextField.getSelectedItem(), ligne,1);
            modele.setValueAt(DebutSerieTextField.getText(), ligne,2);
            modele.setValueAt(FinSerieTextField.getText(), ligne,3);
            
             carnets.get(ligne).setMtricule(MatriculeTextField.getSelectedItem().toString());   
             carnets.get(ligne).setDebut_serie(Integer.valueOf(DebutSerieTextField.getText()));
             carnets.get(ligne).setFin_serie(Integer.valueOf(FinSerieTextField.getText()));
             JOptionPane.showMessageDialog(this, "ligne bien modifiée");
               viderChamps();
        }
    }
    private void bnt_ajouter_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_ajouter_carnetActionPerformed
        ajouter_carnet();
    }//GEN-LAST:event_bnt_ajouter_carnetActionPerformed
    public void ajouter_carnet(){
   
        Boolean ajout = true;
        modele = (DefaultTableModel)TableCarnet.getModel();
        if(DebutSerieTextField.getText().equals("")||FinSerieTextField.getText().equals("")||MatriculeTextField.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(this, "remplissez tout les champs ","champ vide",JOptionPane.ERROR_MESSAGE);
            
            ajout=false;
        }
        if (ajout){
            _3_1_carnet carnet = new _3_1_carnet(MatriculeTextField.getSelectedItem().toString(),Integer.valueOf(DebutSerieTextField.getText()),Integer.valueOf(FinSerieTextField.getText()));
            carnets.add(carnet);
            modele.addRow(new Object[]{ carnet.getId(), carnet.getMtricule() , carnet.getDebut_serie(), carnet.getFin_serie()});
            
            viderChamps();
            JOptionPane.showMessageDialog(this, "ligne bien ajouter");
        }
    }
    private void btn_supprimer_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimer_carnetActionPerformed
        supprimer_carnet();
    }//GEN-LAST:event_btn_supprimer_carnetActionPerformed

    private void TableCarnetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCarnetMouseClicked
//        modele = (DefaultTableModel)TableCarnet.getModel();
//        int ligne = TableCarnet.getSelectedRow();
//        
//       if(ligne!=0){
//          MatriculeTextField.setSelectedItem(carnets.get(ligne).getMtricule());
//        DebutSerieTextField.setText(String.valueOf(carnets.get(ligne).getDebut_serie()));
//        FinSerieTextField.setText(String.valueOf(carnets.get(ligne).getFin_serie()));
//       }
        DefaultTableModel modele = (DefaultTableModel) TableCarnet.getModel();
        
        //jTextField2.setText(tm.getValueAt(TableCarnet.getSelectedRow(), 0).toString());
        idTextField.setText(modele.getValueAt(TableCarnet.getSelectedRow(), 0).toString());
        MatriculeTextField.setSelectedItem(modele.getValueAt(TableCarnet.getSelectedRow(), 1).toString());
        DebutSerieTextField.setText(modele.getValueAt(TableCarnet.getSelectedRow(), 2).toString());
        FinSerieTextField.setText(modele.getValueAt(TableCarnet.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_TableCarnetMouseClicked

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

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed
 
    private void viderChamps() {
         
        DebutSerieTextField.setText("");
        FinSerieTextField.setText("");
        MatriculeTextField.requestFocus();
        
    }

    public void supprimer_carnet(){
        modele = (DefaultTableModel)TableCarnet.getModel();
        int ligne = TableCarnet.getSelectedRow();
        
        
        if(ligne!=-1){
            
            
            carnets.remove(ligne);
            modele.removeRow(ligne);
            
            viderChamps();
            JOptionPane.showMessageDialog(this, "ligne bien supprimer");
        }
    }
    
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
            java.util.logging.Logger.getLogger(_3_1_carnetform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_3_1_carnetform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_3_1_carnetform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_3_1_carnetform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               _3_1_carnetform carnet = new _3_1_carnetform();
                            
                        carnet.setResizable(false);
                        carnet.setLocationRelativeTo(null);
                        
                       carnet.setVisible(true);
                       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DebutSerieTextField;
    private javax.swing.JTextField FinSerieTextField;
    private javax.swing.JComboBox MatriculeTextField;
    private javax.swing.JTable TableCarnet;
    private javax.swing.JButton bnt_ajouter_carnet;
    private javax.swing.JButton btn_modifier_carnet;
    private javax.swing.JButton btn_supprimer_carnet;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDebSerie;
    private javax.swing.JLabel labelFinSerie;
    private javax.swing.JLabel labelMatricul;
    private javax.swing.JLabel labelid;
    // End of variables declaration//GEN-END:variables
}
