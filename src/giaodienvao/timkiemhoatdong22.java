/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giaodienvao;

import quanlisinhvientinhnguyen.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class timkiemhoatdong22 extends javax.swing.JDialog {

    /**
     * Creates new form timkiemhoatdong
     */
    private QLHoatDong22 dshd;
    static String fileNameHD = "hoatdong.txt";
    private final DefaultTableModel tblVeModel;
    ArrayList<HoatDong> dsHD = new ArrayList<>();

    public timkiemhoatdong22(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //fakeTV();
        this.setLocationRelativeTo(null);
        dshd = (QLHoatDong22) parent;
        dshd.docFileHD(fileNameHD);
        dsHD = dshd.dsHD;
        tblVeModel = (DefaultTableModel) jTable1.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("nhap ngay bat dau");

        jLabel2.setText("nhap chi phi");

        jButton1.setText("tim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("thoat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ma hd", "ten hd", "ngay bat dau", "ngay ket thuc", "chi phi ", "leader"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String chiPhi;
        chiPhi = jTextField2.getText();

        String ngay;
        ngay = jTextField1.getText();
        if (jTextField2.getText().length() == 0) {
            boolean isOk = true;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); // Chặn việc chuyển đổi chuỗi không hợp lệ
            try {
                Date date = dateFormat.parse(jTextField1.getText());
                System.out.println("Ngày tháng hợp lệ: " + date);
            } catch (Exception e) {
                isOk = false;
                JOptionPane.showMessageDialog(rootPane, "Ngay tháng phải đẻ dạng YYYY-MM-DD!");
                System.out.println("Ngày tháng không hợp lệ: " + jTextField1.getText());
            }
            if (isOk) {

                //    float tongTien = 0;
                boolean check = false;

                tblVeModel.setRowCount(0);
                for (HoatDong hoatDong : dsHD) {
                    if (ngay.equals(hoatDong.getNgayBatDau())) {
                        tblVeModel.addRow(new Object[]{
                            hoatDong.getMaHD(), hoatDong.getTenHD(),
                            hoatDong.getNgayBatDau(), hoatDong.getNgayKetThuc(),
                            hoatDong.getChiPhi(), hoatDong.getLeader()
                        });
                        //  tongTien += tk.getTongTien();
                        check = true;
                    }
                }
                //  txtTien.setText(Float.toString(tongTien));

                if (check == false) {
                    JOptionPane.showMessageDialog(rootPane,
                            "ngay nay khong co hoat dong nao");
                    // showData(thongkes, tblTKModel);
                }

            }
        } else if (jTextField1.getText().length() == 0) {
            //String chiPhi;
            //    float tongTien = 0;
            boolean check = false;

            tblVeModel.setRowCount(0);
            for (HoatDong hoatDong : dsHD) {
                if (chiPhi.equals(Integer.toString(hoatDong.getChiPhi()))) {
                    tblVeModel.addRow(new Object[]{
                        hoatDong.getMaHD(), hoatDong.getTenHD(),
                        hoatDong.getNgayBatDau(), hoatDong.getNgayKetThuc(),
                        hoatDong.getChiPhi(), hoatDong.getLeader()
                    });
                    //  tongTien += tk.getTongTien();
                    check = true;
                }
            }
            //  txtTien.setText(Float.toString(tongTien));

            if (check == false) {
                JOptionPane.showMessageDialog(rootPane,
                        "khong co so tien nao nhu vay");
                // showData(thongkes, tblTKModel);
            }
        } else {
            boolean check = false;

            tblVeModel.setRowCount(0);
            for (HoatDong hoatDong : dsHD) {
                if (chiPhi.equals(Integer.toString(hoatDong.getChiPhi()))
                        && ngay.equals(hoatDong.getNgayBatDau())) {
                    tblVeModel.addRow(new Object[]{
                        hoatDong.getMaHD(), hoatDong.getTenHD(),
                        hoatDong.getNgayBatDau(), hoatDong.getNgayKetThuc(),
                        hoatDong.getChiPhi(), hoatDong.getLeader()
                    });
                    //  tongTien += tk.getTongTien();
                    check = true;
                }
            }
            //  txtTien.setText(Float.toString(tongTien));

            if (check == false) {
                JOptionPane.showMessageDialog(rootPane,
                        "ngay nay khong tieu gi hoac so tien tieu khong co");
                // showData(thongkes, tblTKModel);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(timkiemhoatdong22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timkiemhoatdong22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timkiemhoatdong22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timkiemhoatdong22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLHoatDong22 danhSachTV = new QLHoatDong22();
                timkiemhoatdong22 dialog = new timkiemhoatdong22(danhSachTV, true);

                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
