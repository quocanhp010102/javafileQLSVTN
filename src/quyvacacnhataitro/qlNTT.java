/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quyvacacnhataitro;

import fileee.fileeee;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlisinhvientinhnguyen.HoatDong;
//import quanlisinhvientinhnguyen.qlthanhvien.SuaThanhVien;
//import quanlisinhvientinhnguyen.qlthanhvien.xoaTV;
//import quanlisinhvientinhnguyen.qlthanhvien.ThanhVien;
//import quanlisinhvientinhnguyen.qlthanhvien.themphantu;

/**
 *
 * @author PC
 */
public class qlNTT extends javax.swing.JFrame {

    /**
     * Creates new form qlNTT
     */
    
    private int selectedIndex;
    //static String fileNameTK = "thongke.txt";
    //static String fileNameSV = "sinhvien.txt";
    static String fileNameNTT = "nhataitro.txt";
    static String fileNameHD = "hoatdong.txt";
    private final fileeee db2 = new fileeee();
    private final DefaultTableModel tblVeModel;
    private final DefaultTableModel tblVeModel2;
    
    ArrayList<nhataitro> dsNTT = new ArrayList<>();
     ArrayList<HoatDong> dsHD = new ArrayList<>();
    
    public qlNTT() {
        initComponents();
        docFileNTT(fileNameNTT);
        docFileHD(fileNameHD);
        //loadTable();
        tblVeModel = (DefaultTableModel) jTable1.getModel();
        tblVeModel2 = (DefaultTableModel) jTable2.getModel();
        showData(dsNTT, tblVeModel);
        showData2(tblVeModel2);
    }

    public final <T> void showData(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof nhataitro) {
                nhataitro thanhVien = (nhataitro) t;
                model.addRow(new Object[]{thanhVien.getMaNTT(), thanhVien.getTenNTT(),
                    thanhVien.getSoTien(), thanhVien.getNgayTaiTro()
                });
            }
        }
    }
    public final <T> void showData2( DefaultTableModel model) {
        int tientaitro=0;
        for(nhataitro t:dsNTT){
           tientaitro+=t.getSoTien();
        }
        int tienhoatdong=0;
        for(HoatDong t:dsHD){
           tienhoatdong+=t.getChiPhi();
        }
        int soconlai=tientaitro-tienhoatdong;
        model.setRowCount(0);
       // for (T t : list) {
            //if (t instanceof HoatDong) {
               // nhataitro thanhVien = (nhataitro) t;
                model.addRow(new Object[]{tientaitro,tienhoatdong,soconlai
                });
            }
        
    

    public void AddThanhVien(nhataitro a) {
  
        dsNTT.add(a);
        //loadTable();
        showData(dsNTT, tblVeModel);
         showData2(tblVeModel2);
        luuFile(dsNTT, fileNameNTT);
        System.out.println("them thanh cong");

    }

    public void SuaTV(nhataitro a) {
        try {
            dsNTT.remove(selectedIndex);
            dsNTT.add(a);
            // loadTable();
            showData(dsNTT, tblVeModel);
             showData2(tblVeModel2);
            luuFile(dsNTT, fileNameNTT);
            JOptionPane.showMessageDialog(rootPane, "sua thanh cong!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "chon vui long chon vao 1 thanh vien");
        }

    }

    public void XoaaTV(nhataitro a) {

        dsNTT.remove(selectedIndex);
        showData(dsNTT, tblVeModel);
         showData2(tblVeModel2);
        // loadTable();
        luuFile(dsNTT, fileNameNTT);

    }
    public void ThemtienTT(nhataitro a){
        try {
            dsNTT.remove(selectedIndex);
            dsNTT.add(a);
            // loadTable();
            showData(dsNTT, tblVeModel);
             showData2(tblVeModel2);
            luuFile(dsNTT, fileNameNTT);
            JOptionPane.showMessageDialog(rootPane, "them tien thanh cong!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "chon vui long chon vao 1 thanh vien");
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "maNTT", "tenNTT", "so tien", "ngay "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("sua");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("xoa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("tim kiem");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("them tien tai tro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("thoat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addGap(538, 538, 538)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton6)
                                            .addComponent(jButton5))))
                                .addGap(170, 170, 170)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(10, 10, 10)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ql nha tai tro", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "quy", "tri tieu", "conlai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton7.setText("thoat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(318, 318, 318))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton7)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("quy va chi tieu", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
         themntt themPT = new themntt(this,
                rootPaneCheckingEnabled);
        themPT.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex < 0 || selectedIndex > dsNTT.size()) {
            JOptionPane.showMessageDialog(rootPane, "vui long chon thanh vien de sua");

        } else {
            suantt suaCa = new suantt(this,
                    rootPaneCheckingEnabled);
            suaCa.setSuaNTT(dsNTT.get(selectedIndex));
            suaCa.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex < 0 || selectedIndex > dsNTT.size()) {
            JOptionPane.showMessageDialog(rootPane, "vui long chon thanh vien de xoa");

        } else {
            xoantt xoaa = new xoantt(this,
                    rootPaneCheckingEnabled);
            xoaa.setXoaNTT(dsNTT.get(selectedIndex));
            xoaa.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        timkiemnhataitro themPT = new timkiemnhataitro(this,
                rootPaneCheckingEnabled);
        themPT.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
            selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex < 0 || selectedIndex > dsNTT.size()) {
            JOptionPane.showMessageDialog(rootPane, "vui long chon thanh vien de them");

        } else {
            themtientaitro suaCa = new themtientaitro(this,
                    rootPaneCheckingEnabled);
            suaCa.setThemTTT(dsNTT.get(selectedIndex));
            suaCa.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(qlNTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qlNTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qlNTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qlNTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlNTT().setVisible(true);
            }
        });
    }

    public void luuFile(ArrayList T, String fileName) {
        try {
            db2.writeToFile(T, fileName);
            System.out.println("Lưu file thành công");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
//đọc file lưu trở lại phòng thi

//    public void docFileTK(String fileName) {
//        try {
//            thongkes = (ArrayList) db.readDataFromFile(fileName);
//            System.out.println(" đọc được file");
//        } catch (Exception ex) {
//            System.out.println("không đọc được file");
//        }
//    }
    public void docFileNTT(String fileName) {
        try {
            dsNTT = (ArrayList) db2.readDataFromFile(fileName);
            System.out.println(" đọc được file");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
    public void docFileHD(String fileName) {
        try {
            dsHD = (ArrayList) db2.readDataFromFile(fileName);
            System.out.println(" đọc được file");
        } catch (Exception ex) {
            System.out.println("không đọc được file");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
