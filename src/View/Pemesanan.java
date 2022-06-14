/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Pelanggan;
import Model.Order;

/**
 *
 * @author NITRO 5
 */
public class Pemesanan extends javax.swing.JFrame {
    private String auth;
    /**
     * Creates new form Pemesanan
     */
    public Pemesanan(String auth) {
        this.auth = auth;
        initComponents();
        Pelanggan pelanggan = new Pelanggan(auth);
        cb_penjahit.setModel(new javax.swing.DefaultComboBoxModel<>(pelanggan.show_penjahit()));
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
        cb_kategori = new javax.swing.JComboBox<>();
        cb_ukuran = new javax.swing.JComboBox<>();
        input_kuantitas = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_lingkar_badan = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input_lingkar_pinggang = new javax.swing.JFormattedTextField();
        input_lebar_bahu = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        input_lebar_dada = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        input_panjang_lengan = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        input_panjang_kaki = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        input_lingkar_paha = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        input_lingkar_lutut = new javax.swing.JFormattedTextField();
        cb_penjahit = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        button_pesan = new javax.swing.JButton();
        button_riwayat = new javax.swing.JButton();
        cb_jenis_kain = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        input_gambar = new javax.swing.JTextField();
        button_logout = new javax.swing.JButton();
        button_rangking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 480));
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb_kategori.setBackground(new java.awt.Color(153, 152, 224));
        cb_kategori.setFont(new java.awt.Font("Century751 SeBd BT", 0, 10)); // NOI18N
        cb_kategori.setForeground(new java.awt.Color(153, 152, 224));
        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Setelan Jas", "Kemeja ", "Celana", "Rok", "Gaun", "Kebaya", "Blus", "Dres", " " }));
        cb_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_kategoriActionPerformed(evt);
            }
        });
        jPanel1.add(cb_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, -1));

        cb_ukuran.setBackground(new java.awt.Color(153, 152, 224));
        cb_ukuran.setFont(new java.awt.Font("Century751 SeBd BT", 0, 10)); // NOI18N
        cb_ukuran.setForeground(new java.awt.Color(153, 152, 224));
        cb_ukuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Small", "Medium", "Large", "Extra Large", "Others :...." }));
        cb_ukuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ukuranActionPerformed(evt);
            }
        });
        jPanel1.add(cb_ukuran, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 120, -1));

        input_kuantitas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        input_kuantitas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(input_kuantitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 60, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText("Kategori");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 69, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setText("Kuantitas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 57, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Penjahit");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 60, -1));

        input_lingkar_badan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lingkar_badan.setName(""); // NOI18N
        input_lingkar_badan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lingkar_badanActionPerformed(evt);
            }
        });
        jPanel1.add(input_lingkar_badan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 101, -1));

        jLabel4.setText("Lingkar Badan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 109, -1));

        jLabel5.setText("Lingkar Pinggang");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 101, -1));

        input_lingkar_pinggang.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lingkar_pinggang.setName(""); // NOI18N
        input_lingkar_pinggang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lingkar_pinggangActionPerformed(evt);
            }
        });
        jPanel1.add(input_lingkar_pinggang, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 101, -1));

        input_lebar_bahu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lebar_bahu.setName(""); // NOI18N
        input_lebar_bahu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lebar_bahuActionPerformed(evt);
            }
        });
        jPanel1.add(input_lebar_bahu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 101, -1));

        jLabel8.setText("Lebar Bahu");
        jLabel8.setPreferredSize(new java.awt.Dimension(52, 13));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 101, -1));

        input_lebar_dada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lebar_dada.setName(""); // NOI18N
        input_lebar_dada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lebar_dadaActionPerformed(evt);
            }
        });
        jPanel1.add(input_lebar_dada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 101, -1));

        jLabel6.setText("Lebar Dada");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 101, -1));

        jLabel7.setText("Panjang Lengan");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 101, -1));

        input_panjang_lengan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_panjang_lengan.setName(""); // NOI18N
        input_panjang_lengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_panjang_lenganActionPerformed(evt);
            }
        });
        jPanel1.add(input_panjang_lengan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 101, -1));

        jLabel9.setText("Panjang Kaki");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 101, -1));

        input_panjang_kaki.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_panjang_kaki.setName(""); // NOI18N
        input_panjang_kaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_panjang_kakiActionPerformed(evt);
            }
        });
        jPanel1.add(input_panjang_kaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 101, -1));

        jLabel10.setText("Lingkar Paha");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 101, -1));

        input_lingkar_paha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lingkar_paha.setName(""); // NOI18N
        input_lingkar_paha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lingkar_pahaActionPerformed(evt);
            }
        });
        jPanel1.add(input_lingkar_paha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 101, -1));

        jLabel11.setText("Lingkar Lutut");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 101, -1));

        input_lingkar_lutut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        input_lingkar_lutut.setName(""); // NOI18N
        input_lingkar_lutut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_lingkar_lututActionPerformed(evt);
            }
        });
        jPanel1.add(input_lingkar_lutut, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 101, -1));

        cb_penjahit.setBackground(new java.awt.Color(153, 152, 224));
        cb_penjahit.setFont(new java.awt.Font("Century751 SeBd BT", 0, 10)); // NOI18N
        cb_penjahit.setForeground(new java.awt.Color(153, 152, 224));
        cb_penjahit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jPanel1.add(cb_penjahit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 120, -1));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel12.setText("Jenis Kain");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 55, -1));

        button_pesan.setBackground(new java.awt.Color(195, 195, 164));
        button_pesan.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        button_pesan.setText("PESAN");
        button_pesan.setBorder(null);
        button_pesan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pesanActionPerformed(evt);
            }
        });
        jPanel1.add(button_pesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 130, 30));

        button_riwayat.setBackground(new java.awt.Color(195, 195, 164));
        button_riwayat.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        button_riwayat.setForeground(new java.awt.Color(51, 51, 51));
        button_riwayat.setText("Riwayat Pesanan");
        button_riwayat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.gray));
        button_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_riwayatActionPerformed(evt);
            }
        });
        jPanel1.add(button_riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 110, 30));

        cb_jenis_kain.setBackground(new java.awt.Color(153, 152, 224));
        cb_jenis_kain.setFont(new java.awt.Font("Century751 SeBd BT", 0, 10)); // NOI18N
        cb_jenis_kain.setForeground(new java.awt.Color(153, 152, 224));
        cb_jenis_kain.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acrylic", "Batik", "Brokat", "Chiffon", "Corduroy", "Drill", "Denim", "Flanel", "Katun", "Oxford", "Organdi", "Polyester", "Satin ", "Silk", "Sutra", "Velvet" }));
        jPanel1.add(cb_jenis_kain, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 120, -1));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel13.setText("Ukuran");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 60, -1));

        jLabel14.setText("LINK GAMBAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        jPanel1.add(input_gambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 150, -1));

        button_logout.setText("logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(button_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        button_rangking.setText("Rangking Penjahit");
        button_rangking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rangkingActionPerformed(evt);
            }
        });
        jPanel1.add(button_rangking, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_lebar_bahuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lebar_bahuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lebar_bahuActionPerformed

    private void input_lingkar_pinggangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lingkar_pinggangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lingkar_pinggangActionPerformed

    private void input_lingkar_badanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lingkar_badanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lingkar_badanActionPerformed

    private void cb_ukuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ukuranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ukuranActionPerformed

    private void cb_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_kategoriActionPerformed

    private void input_lebar_dadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lebar_dadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lebar_dadaActionPerformed

    private void input_panjang_lenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_panjang_lenganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_panjang_lenganActionPerformed

    private void input_panjang_kakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_panjang_kakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_panjang_kakiActionPerformed

    private void input_lingkar_pahaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lingkar_pahaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lingkar_pahaActionPerformed

    private void input_lingkar_lututActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_lingkar_lututActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_lingkar_lututActionPerformed

    private void button_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pesanActionPerformed
        String deskripsi = "lingkar badan = " + input_lingkar_badan.getText() + ", lingkar pinggang = " + input_lingkar_pinggang.getText() + ", lebar bahu = " + input_lebar_bahu.getText() + ", Lebar dada = " + input_lebar_dada.getText() + ", panjang lengan = " + input_panjang_lengan.getText() + ", Panjang kaki = " + input_panjang_kaki.getText() + ", Lingkar paha = " + input_lingkar_paha.getText() + ", Lingkar lutut = " + input_lingkar_lutut.getText();
        Order order = new Order();
        
        order.tambah_order(auth, cb_penjahit.getSelectedItem().toString(), cb_kategori.getSelectedItem().toString(), (int) input_kuantitas.getValue(), cb_ukuran.getSelectedItem().toString(), cb_jenis_kain.getSelectedItem().toString(), deskripsi, input_gambar.getText(), "pending");
    }//GEN-LAST:event_button_pesanActionPerformed

    private void button_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_riwayatActionPerformed
        this.setVisible(false);
        RiwayatPesanan riwayat = new RiwayatPesanan(auth);
        riwayat.setVisible(true);
    }//GEN-LAST:event_button_riwayatActionPerformed

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new View_Login().setVisible(true);
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_rangkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_rangkingActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Ranking_Penjahit(auth).setVisible(true);
    }//GEN-LAST:event_button_rangkingActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pemesanan(" ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_pesan;
    private javax.swing.JButton button_rangking;
    private javax.swing.JButton button_riwayat;
    private javax.swing.JComboBox<String> cb_jenis_kain;
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JComboBox<String> cb_penjahit;
    private javax.swing.JComboBox<String> cb_ukuran;
    private javax.swing.JTextField input_gambar;
    private javax.swing.JSpinner input_kuantitas;
    private javax.swing.JFormattedTextField input_lebar_bahu;
    private javax.swing.JFormattedTextField input_lebar_dada;
    private javax.swing.JFormattedTextField input_lingkar_badan;
    private javax.swing.JFormattedTextField input_lingkar_lutut;
    private javax.swing.JFormattedTextField input_lingkar_paha;
    private javax.swing.JFormattedTextField input_lingkar_pinggang;
    private javax.swing.JFormattedTextField input_panjang_kaki;
    private javax.swing.JFormattedTextField input_panjang_lengan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}