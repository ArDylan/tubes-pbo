/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Penjahit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZaFee Tech HP 0099
 */
public class Beranda_Penjahit extends javax.swing.JFrame {
    private String auth;
    /**
     * Creates new form Beranda_Penjahit
     */
    public Beranda_Penjahit(String auth) throws SQLException {
        try {
            initComponents();
            Penjahit penjahit = new Penjahit(auth);
            this.auth = auth;
            penjahit.load_table(tabel_pemesan);
            cb_pelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(penjahit.show_pelanggan()));
        } catch (SQLException ex) {
            Logger.getLogger(RiwayatPesanan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pemesan = new javax.swing.JTable();
        button_detail = new javax.swing.JButton();
        cb_pelanggan = new javax.swing.JComboBox<>();
        button_logout = new javax.swing.JButton();
        button_rangking = new javax.swing.JButton();
        button_riwayat = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(253, 242, 200));

        jPanel1.setBackground(new java.awt.Color(253, 242, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel_pemesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "Nama", "Kategori", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_pemesan.setToolTipText("");
        tabel_pemesan.setGridColor(new java.awt.Color(0, 0, 0));
        tabel_pemesan.setShowGrid(true);
        jScrollPane1.setViewportView(tabel_pemesan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 450, 170));

        button_detail.setText("Detail");
        button_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_detailActionPerformed(evt);
            }
        });
        jPanel1.add(button_detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        cb_pelanggan.setBackground(new java.awt.Color(153, 152, 224));
        cb_pelanggan.setFont(new java.awt.Font("Century751 SeBd BT", 0, 10)); // NOI18N
        cb_pelanggan.setForeground(new java.awt.Color(153, 152, 224));
        cb_pelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        jPanel1.add(cb_pelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 120, -1));

        button_logout.setText("logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(button_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        button_rangking.setBackground(new java.awt.Color(102, 51, 0));
        button_rangking.setForeground(new java.awt.Color(255, 255, 255));
        button_rangking.setText("Rangking");
        button_rangking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_rangkingActionPerformed(evt);
            }
        });
        jPanel1.add(button_rangking, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        button_riwayat.setBackground(new java.awt.Color(102, 51, 0));
        button_riwayat.setForeground(new java.awt.Color(255, 255, 255));
        button_riwayat.setText("Riwayat");
        button_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_riwayatActionPerformed(evt);
            }
        });
        jPanel1.add(button_riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_detailActionPerformed
            // TODO add your handling code here:
            // new Beranda_Penjahit().setVisible(false);
            String id = cb_pelanggan.getSelectedItem().toString();
            Detail_Penjahit detail = new Detail_Penjahit(auth, id);
            this.setVisible(false);
            detail.setVisible(true);    
    }//GEN-LAST:event_button_detailActionPerformed

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

    private void button_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_riwayatActionPerformed
        try {
           this.setVisible(false);
            new Riwayat_Penjahit(auth).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Beranda_Penjahit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_button_riwayatActionPerformed

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
            java.util.logging.Logger.getLogger(Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Beranda_Penjahit(" ").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Beranda_Penjahit.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_detail;
    private javax.swing.JButton button_logout;
    private javax.swing.JButton button_rangking;
    private javax.swing.JButton button_riwayat;
    private javax.swing.JComboBox<String> cb_pelanggan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_pemesan;
    // End of variables declaration//GEN-END:variables
}
