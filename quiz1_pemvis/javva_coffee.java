/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz1_pemvis;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author firak
 */
public class javva_coffee extends javax.swing.JFrame {
    String pilihan = "";
    String nama_pemesan = "";
    int subtotal;
    int item =0;
    
    public javva_coffee() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_pemesan = new javax.swing.JTextField();
        t_jumlah = new javax.swing.JTextField();
        t_subtotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_pilihkopi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t_nama = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        t_pesanan = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        t_total = new javax.swing.JTextField();
        breset = new javax.swing.JButton();
        bsave = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME TO JAVVA COFFEE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(97, 6, 300, 49);

        jLabel2.setText("Nama Pemesan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(17, 67, 110, 31);

        jLabel3.setText("Jenis Kopi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(17, 104, 69, 31);

        jLabel4.setText("Jumlah Pesanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(17, 147, 110, 26);

        jLabel5.setText("Subtotal");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(17, 192, 67, 16);

        t_pemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pemesanActionPerformed(evt);
            }
        });
        getContentPane().add(t_pemesan);
        t_pemesan.setBounds(198, 67, 163, 24);

        t_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(t_jumlah);
        t_jumlah.setBounds(198, 147, 163, 26);

        t_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_subtotalActionPerformed(evt);
            }
        });
        getContentPane().add(t_subtotal);
        t_subtotal.setBounds(198, 186, 163, 29);

        jLabel6.setText(":");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(153, 74, 3, 16);

        jLabel7.setText(":");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(153, 111, 11, 16);

        jLabel8.setText(":");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(153, 152, 3, 16);

        jLabel9.setText(":");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(153, 192, 3, 16);

        t_pilihkopi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arabica Coffee", "Robusta Coffee", "Liberian Coffee", "Excelso Coffee", " " }));
        t_pilihkopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pilihkopiActionPerformed(evt);
            }
        });
        getContentPane().add(t_pilihkopi);
        t_pilihkopi.setBounds(198, 104, 163, 31);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("========================================");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 263, 480, 25);

        jLabel11.setText("Nama Pemesan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(18, 315, 110, 16);

        jLabel12.setText(":");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(153, 315, 11, 16);

        t_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_namaActionPerformed(evt);
            }
        });
        getContentPane().add(t_nama);
        t_nama.setBounds(205, 312, 161, 22);

        jLabel13.setText("Pesanan");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(18, 349, 90, 16);

        jLabel14.setText(":");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(153, 349, 11, 16);

        t_pesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_pesananActionPerformed(evt);
            }
        });
        getContentPane().add(t_pesanan);
        t_pesanan.setBounds(205, 346, 161, 22);

        jLabel16.setText("Total");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(18, 389, 56, 16);

        jLabel17.setText(":");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(153, 389, 13, 16);

        t_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_totalActionPerformed(evt);
            }
        });
        getContentPane().add(t_total);
        t_total.setBounds(205, 386, 161, 22);

        breset.setText("Reset");
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        getContentPane().add(breset);
        breset.setBounds(17, 234, 72, 23);

        bsave.setText("Print");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });
        getContentPane().add(bsave);
        bsave.setBounds(398, 234, 72, 23);

        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(400, 425, 72, 23);

        jLabel15.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel15.setText("Thank You For Order!");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(128, 454, 238, 33);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\firak\\OneDrive\\Pictures\\Premium Photo _ White crumpled paper sheet, background for design.jpg")); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(-4, 0, 490, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_subtotalActionPerformed

    private void t_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_namaActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        // TODO add your handling code here:
        t_pemesan.setText("");
        t_nama.setText("");
        t_jumlah.setText("");
        t_pesanan.setText("");
        t_subtotal.setText("");
        t_pilihkopi.setSelectedItem("Pilih Jenis Kopi");
        t_total.setText("");
        
    }//GEN-LAST:event_bresetActionPerformed

    private void t_pilihkopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pilihkopiActionPerformed
        // TODO add your handling code here:
        pilihan = (String) t_pilihkopi.getSelectedItem();
        switch (pilihan) {
            case "Arabica Coffee":
                subtotal = 35000;
                break;
            case "Robusta Coffee":
                subtotal = 50000;
                break;
            case "Liberian Coffee":
                subtotal = 45000;
                break;
            case "Excelso Coffee":
                subtotal = 55000;
                break;
           
        }
        t_subtotal.setText(""+Integer.toString(subtotal));
    }//GEN-LAST:event_t_pilihkopiActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
       item = Integer.parseInt(t_jumlah.getText());
        int TotalHarga = subtotal * item;
        nama_pemesan = (t_pemesan.getText());
        
        t_nama.setText(""+nama_pemesan);
        t_total.setText("Rp."+TotalHarga);
        t_pesanan.setText(""+pilihan);
    }//GEN-LAST:event_bsaveActionPerformed

    private void t_pemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pemesanActionPerformed

    private void t_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_jumlahActionPerformed

    private void t_pesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_pesananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_pesananActionPerformed

    private void t_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_totalActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        Toolkit.getDefaultToolkit().beep();
        int pilih = JOptionPane.showConfirmDialog(this, "Apakah Anda Ingin Keluar?", "Anda Telah Keluar Dari Rincian Pesanan",
        JOptionPane.YES_NO_OPTION);
        if (pilih == JOptionPane.YES_OPTION){
            System.exit(0); 
        }
        
    }//GEN-LAST:event_bexitActionPerformed

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
            java.util.logging.Logger.getLogger(javva_coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(javva_coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(javva_coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(javva_coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new javva_coffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton breset;
    private javax.swing.JButton bsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField t_jumlah;
    private javax.swing.JTextField t_nama;
    private javax.swing.JTextField t_pemesan;
    private javax.swing.JTextField t_pesanan;
    private javax.swing.JComboBox<String> t_pilihkopi;
    private javax.swing.JTextField t_subtotal;
    private javax.swing.JTextField t_total;
    // End of variables declaration//GEN-END:variables
}
