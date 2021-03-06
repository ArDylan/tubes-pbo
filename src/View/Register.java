/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Pelanggan;
import Model.Penjahit;
/**
 *
 * @author NITRO 5
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        buttonPP = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        button_kembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        input_no_hp = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        input_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_alamat = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        input_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        input_password = new javax.swing.JPasswordField();
        rb_penjahit = new javax.swing.JRadioButton();
        rb_pelanggan = new javax.swing.JRadioButton();
        button_register = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cb_gender = new javax.swing.JComboBox<>();
        input_nik = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 470));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_kembali.setText("<<<");
        button_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(button_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(81, 0, 0));
        jLabel7.setText("NIK");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 47, -1));

        jLabel6.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(81, 0, 0));
        jLabel6.setText("Nomor HP");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, -1));

        input_no_hp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jPanel1.add(input_no_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 117, -1));

        jLabel5.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 0, 0));
        jLabel5.setText("Nama");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 47, -1));

        input_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_namaActionPerformed(evt);
            }
        });
        jPanel1.add(input_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 117, -1));

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 0, 0));
        jLabel4.setText("e-Mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 47, -1));

        input_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_emailActionPerformed(evt);
            }
        });
        jPanel1.add(input_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 170, 117, -1));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 0, 0));
        jLabel3.setText("Alamat");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 47, -1));

        input_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(input_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 200, 117, -1));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 0, 0));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 60, -1));

        input_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(input_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 117, -1));

        jLabel2.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(81, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 61, 22));

        input_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(input_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 117, -1));

        buttonPP.add(rb_penjahit);
        rb_penjahit.setText("Penjahit");
        rb_penjahit.setName(""); // NOI18N
        rb_penjahit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_penjahitActionPerformed(evt);
            }
        });
        jPanel1.add(rb_penjahit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 75, -1));

        buttonPP.add(rb_pelanggan);
        rb_pelanggan.setText("Pelanggan");
        rb_pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_pelangganActionPerformed(evt);
            }
        });
        jPanel1.add(rb_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        button_register.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        button_register.setForeground(new java.awt.Color(81, 0, 0));
        button_register.setText("Register");
        button_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_registerActionPerformed(evt);
            }
        });
        jPanel1.add(button_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai Medium", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(81, 0, 0));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 260, 61, 22));

        cb_gender.setFont(new java.awt.Font("Dubai Medium", 0, 10)); // NOI18N
        cb_gender.setForeground(new java.awt.Color(81, 0, 0));
        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "laki-laki", "perempuan" }));
        cb_gender.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        cb_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_genderActionPerformed(evt);
            }
        });
        jPanel1.add(cb_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 117, -1));

        input_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_nikActionPerformed(evt);
            }
        });
        jPanel1.add(input_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 117, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fac&Co.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_usernameActionPerformed

    private void input_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_namaActionPerformed

    private void input_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_emailActionPerformed

    private void input_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_passwordActionPerformed

    private void rb_penjahitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_penjahitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_penjahitActionPerformed

    private void rb_pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_pelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_pelangganActionPerformed

    private void button_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_registerActionPerformed
        Pelanggan pelanggan = new Pelanggan();        
        Penjahit penjahit = new Penjahit();
        String password = new String(input_password.getPassword());

        if (rb_pelanggan.isSelected()) {
            System.out.println(rb_pelanggan.getText());
            pelanggan.register(input_nama.getText(), input_username.getText(), password, input_no_hp.getText(), input_nik.getText(), cb_gender.getSelectedItem().toString(), input_alamat.getText(), "pelanggan");
            View_Login login = new View_Login();
            this.setVisible(false);
            login.setVisible(true);
            this.dispose();
        }else if(rb_penjahit.isSelected()){
            penjahit.register(input_nama.getText(), input_username.getText(), password, input_no_hp.getText(), input_nik.getText(), cb_gender.getSelectedItem().toString(), input_alamat.getText(), "penjahit");
            View_Login login = new View_Login();
            this.setVisible(false);
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_button_registerActionPerformed

    private void input_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_alamatActionPerformed

    private void cb_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_genderActionPerformed

    private void input_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_nikActionPerformed

    private void button_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new View_Login().setVisible(true);
    }//GEN-LAST:event_button_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonPP;
    private javax.swing.JButton button_kembali;
    private javax.swing.JButton button_register;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JTextField input_alamat;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_nama;
    private javax.swing.JTextField input_nik;
    private javax.swing.JFormattedTextField input_no_hp;
    private javax.swing.JPasswordField input_password;
    private javax.swing.JTextField input_username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton rb_pelanggan;
    private javax.swing.JRadioButton rb_penjahit;
    // End of variables declaration//GEN-END:variables
}
