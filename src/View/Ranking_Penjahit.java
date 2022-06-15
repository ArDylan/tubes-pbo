/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.Order;
import Model.Penjahit;
import Model.Pelanggan;


/**
 *
 * @author ARCHIE
 */
public class Ranking_Penjahit extends javax.swing.JFrame {
    private String auth;
    private Order order;
    private Pelanggan pelanggan;
    private Penjahit penjahit;
    /**
     * Creates new form Ranking_Penjahit
     */
    public Ranking_Penjahit(String auth) {
        initComponents();
        order = new Order();
        penjahit = new Penjahit();
        pelanggan = new Pelanggan();

        this.auth = auth;
        
        order.tabel_ranking(auth, ranking_penjahit);
        
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
        button_logout = new javax.swing.JButton();
        button_kembali = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ranking_penjahit = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_logout.setText("Logout");
        button_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_logoutActionPerformed(evt);
            }
        });
        jPanel1.add(button_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        button_kembali.setText("<<<");
        button_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(button_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 30));

        ranking_penjahit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Username", "No Hp", "Alamat", "Rating"
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
        ranking_penjahit.setToolTipText("");
        ranking_penjahit.setGridColor(new java.awt.Color(0, 0, 0));
        ranking_penjahit.setShowGrid(true);
        jScrollPane2.setViewportView(ranking_penjahit);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 470, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Fac&Co.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new View_Login().setVisible(true);
    }//GEN-LAST:event_button_logoutActionPerformed

    private void button_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kembaliActionPerformed
        // TODO add your handling code here:
        if(penjahit.cek(auth).equals("penjahit")){
            this.setVisible(false);
            penjahit.run(auth);
        }else if(pelanggan.cek(auth).equals("pelanggan")){
            this.setVisible(false);
            pelanggan.run(auth);
        }
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
            java.util.logging.Logger.getLogger(Ranking_Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking_Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking_Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking_Penjahit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ranking_Penjahit(" ").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_kembali;
    private javax.swing.JButton button_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable ranking_penjahit;
    // End of variables declaration//GEN-END:variables
}
