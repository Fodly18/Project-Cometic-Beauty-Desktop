package umum;

import java.awt.CardLayout;
import Panel.Dashboard_Admin1;
import Panel.supplier;
import Panel.laporan;
import Panel.riwayat;
import kasirpanel.dataproduct;
import panel.karyawan;




public class admin1 extends javax.swing.JFrame {

    Dashboard_Admin1 a = new Dashboard_Admin1();
    karyawan b = new karyawan();
    dataproduct c = new dataproduct();
    supplier d = new supplier();
    laporan e = new laporan();
    riwayat f = new riwayat();
    
    
    
    public admin1() {
        initComponents();
        setLocationRelativeTo(this);
        jPanel2.add(a, "dashboardAdminPanel");
        jPanel2.add(b, "karyawanadminPanel");
        jPanel2.add(c, "dataproductPanel");
        jPanel2.add(d, "supplierPanel");
        jPanel2.add(e, "laporanPanel");
        jPanel2.add(f, "riwayatPanel");
        
        
        
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
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
        karyawan = new javax.swing.JButton();
        dataproduct = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        datasupplier = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        Laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(819, 521));
        setMinimumSize(new java.awt.Dimension(819, 521));

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

        karyawan.setBackground(new java.awt.Color(255, 255, 255));
        karyawan.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        karyawan.setText("Karyawan");
        karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanActionPerformed(evt);
            }
        });
        jPanel1.add(karyawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, -1));

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

        datasupplier.setBackground(new java.awt.Color(255, 255, 255));
        datasupplier.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        datasupplier.setText("Data Supplier");
        datasupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasupplierActionPerformed(evt);
            }
        });
        jPanel1.add(datasupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 170, -1));

        riwayat.setBackground(new java.awt.Color(255, 255, 255));
        riwayat.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        riwayat.setText("Riwayat Pembelian");
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        jPanel1.add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, -1));

        Laporan.setBackground(new java.awt.Color(255, 255, 255));
        Laporan.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 16)); // NOI18N
        Laporan.setText("Laporan");
        Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanActionPerformed(evt);
            }
        });
        jPanel1.add(Laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 109.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 520));

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setLayout(new java.awt.CardLayout());
        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dashboardPanel");
        a.setVisible(true);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_DashboardActionPerformed

    private void karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanActionPerformed
     CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "karyawanadminPanel");
        a.setVisible(false);
        b.setVisible(true);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_karyawanActionPerformed

    private void dataproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataproductActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dataproductPanel");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(true);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(false);
    }//GEN-LAST:event_dataproductActionPerformed

    private void datasupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasupplierActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "supplier");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(true);
        e.setVisible(false);
    }//GEN-LAST:event_datasupplierActionPerformed

    private void LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanActionPerformed
        CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dataproductPanel");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(true);
        f.setVisible(false);
    }//GEN-LAST:event_LaporanActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
       CardLayout cardLayout = (CardLayout) jPanel2.getLayout();
        cardLayout.show(jPanel2, "dataproductPanel");
        a.setVisible(false);
        b.setVisible(false);
        c.setVisible(false);
        d.setVisible(false);
        e.setVisible(false);
        f.setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        this.setVisible(false);
        new login_admin().setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dashboard;
    private javax.swing.JButton Laporan;
    private javax.swing.JButton dataproduct;
    private javax.swing.JButton datasupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton karyawan;
    private javax.swing.JButton login;
    private javax.swing.JButton riwayat;
    // End of variables declaration//GEN-END:variables
}
