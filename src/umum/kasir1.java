
package umum;

import java.awt.CardLayout;
import kasirpanel.dashboardkasir;
import kasirpanel.transaksi;
import kasirpanel.dataproduct;
import kasirpanel.laporan;

public class kasir1 extends javax.swing.JFrame {
    dashboardkasir a = new dashboardkasir();
    transaksi b = new transaksi();
    dataproduct c = new dataproduct();
    laporan d = new laporan();
   
    
    
    
    public kasir1() {
        initComponents();
        jPanel2.add(a, "kasirPanel");
        jPanel2.add(b, "transaksiPanel");
        jPanel2.add(c, "dataproductPanel");
        jPanel2.add(d, "laporanPanel");
         
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
        login = new javax.swing.JButton();
        Dashboard = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        dataproduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(255, 51, 51));
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOGOUT");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, 30));

        Dashboard.setBackground(new java.awt.Color(255, 255, 255));
        Dashboard.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        Dashboard.setText("Dashboard");
        Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardActionPerformed(evt);
            }
        });
        jPanel1.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, -1));

        transaksi.setBackground(new java.awt.Color(255, 255, 255));
        transaksi.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        transaksi.setText("transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

        dataproduct.setBackground(new java.awt.Color(255, 255, 255));
        dataproduct.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        dataproduct.setText("Data Product");
        dataproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataproductActionPerformed(evt);
            }
        });
        jPanel1.add(dataproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 170, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/[removal 35.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 120));

        Laporan.setBackground(new java.awt.Color(255, 255, 255));
        Laporan.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        Laporan.setText("Laporan");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });
        jPanel1.add(Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 109.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 521));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 0, 630, 521));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        this.setVisible(false);
        new login_admin().setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dashboardPanel");
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        
    }//GEN-LAST:event_DashboardActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "karyawanadminPanel");
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
       
    }//GEN-LAST:event_transaksiActionPerformed

    private void dataproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataproductActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dataproductPanel");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
    
    }//GEN-LAST:event_dataproductActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dataproductPanel");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
      
    }//GEN-LAST:event_LaporanActionPerformed

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
            java.util.logging.Logger.getLogger(kasir1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kasir1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kasir1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kasir1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kasir1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Laporan;
    private javax.swing.JButton dataproduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}