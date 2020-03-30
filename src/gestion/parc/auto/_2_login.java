
package gestion.parc.auto;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class _2_login extends javax.swing.JFrame {

    
    public _2_login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new keeptoo.KGradientPanel();
        login = new javax.swing.JButton();
        pswd = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        close1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pswdfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        user.setkEndColor(new java.awt.Color(230, 247, 240));
        user.setkStartColor(new java.awt.Color(59, 239, 170));

        login.setBackground(new java.awt.Color(59, 239, 170));
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        pswd.setForeground(new java.awt.Color(69, 73, 74));
        pswd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lock.png"))); // NOI18N
        pswd.setText("Password");

        jLabel2.setForeground(new java.awt.Color(69, 73, 74));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jLabel2.setText("Username");

        close1.setBackground(new java.awt.Color(59, 239, 170));
        close1.setText("CLOSE");
        close1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 63, 65));
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswd)
                    .addComponent(jLabel2))
                .addGap(51, 51, 51)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userfield, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(pswdfield, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(userLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(close1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login)
                .addContainerGap(180, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(62, 62, 62)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswd)
                    .addComponent(pswdfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close1)
                    .addComponent(login))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close1ActionPerformed
      this.setVisible(false);
     System.exit(0);
        
    }//GEN-LAST:event_close1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        dispose();
        String username = new String(userfield.getText());
        String password = new String(pswdfield.getText());
        if(username.equals("admin") && password.equals("root")) {
            JOptionPane.showMessageDialog(null,"Bienvenue administrateur, vous êtes connecté.", "Bienvenue", JOptionPane.WARNING_MESSAGE);
            home c = new home();
            c.setResizable(false);
            c.setLocationRelativeTo(null);
            c.setVisible(true);
            this.setVisible(false);
           
        }
        else if (username.equals("") || password.equals("")) {
            int input = JOptionPane.showConfirmDialog(null, " veuillez remplir tous les champs", "erreur", JOptionPane.YES_NO_CANCEL_OPTION);
          if (input == 0){
              this.setVisible(true);
          }
             }
        else{
            
          int input = JOptionPane.showConfirmDialog(null, "mot de passe ou username inccorect \n voulez vous réessayer", "erreur", JOptionPane.YES_NO_CANCEL_OPTION);
          if (input == 0){
              
              this.setVisible(true);
              userfield.setText("");
              pswdfield.setText("");
          }
        }
    }//GEN-LAST:event_loginActionPerformed

    
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
            java.util.logging.Logger.getLogger(_2_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_2_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_2_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_2_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                _2_login l =new _2_login();
                l.setResizable(false);
                l.setLocationRelativeTo(null);
                l.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login;
    private javax.swing.JLabel pswd;
    private javax.swing.JPasswordField pswdfield;
    private keeptoo.KGradientPanel user;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}
