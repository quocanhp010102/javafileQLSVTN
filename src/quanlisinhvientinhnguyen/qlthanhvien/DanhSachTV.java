/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlisinhvientinhnguyen.qlthanhvien;

//import quanlisinhvientinhnguyen.qlthanhvien.TableTV;
//import quanlisinhvientinhnguyen.qlthanhvien.ThanhVien;
//import quanlisinhvientinhnguyen.qlthanhvien.xoaTV;
//import quanlisinhvientinhnguyen.qlthanhvien.themphantu;
import fileee.fileeee;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public final class DanhSachTV extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachTV
     */
    private int selectedIndex;
    //static String fileNameTK = "thongke.txt";
    //static String fileNameSV = "sinhvien.txt";
    static String fileNameTV = "thanhvien.txt";
    private final fileeee db1 = new fileeee();
    private final DefaultTableModel tblVeModel;
    ArrayList<ThanhVien> dsTV = new ArrayList<>();
    //  ArrayList<SinhVien> dsTVCC = new ArrayList<>();
    //  qlSinhVien qlds=new qlSinhVien();

    // int dongchon = -1;
//    public void fakeTV() {
//        SinhVien a = new SinhVien("sinh vien 1", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien b = new SinhVien("sinh vien 2", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien c = new SinhVien("sinh vien 3", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien d = new SinhVien("sinh vien 4", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien a1 = new SinhVien("sinh vien 11", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien b1 = new SinhVien("sinh vien 21", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien c1 = new SinhVien("sinh vien 31", "2020604669", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        SinhVien d1 = new SinhVien("sinh vien 41", "2020604668", "nguyen xa", "CNTT", "KTPM03", "co Trinh");
//        dsTVCC.add(a);
//        dsTVCC.add(b);
//        dsTVCC.add(c);
//        dsTVCC.add(d);
//        dsTVCC.add(a1);
//        dsTVCC.add(b1);
//        dsTVCC.add(c1);
//        dsTVCC.add(d1);
//
////       dsTV.add(a);
////       dsTV.add(b);
////       dsTV.add(c);
////       dsTV.add(d);
//        loadTable();
//
//    }
//    public final <T> void showData(ArrayList<T> list, DefaultTableModel model) {
//        model.setRowCount(0);
//        for (T t : list) {
//            if (t instanceof ThanhVien s) {
//                model.addRow(new Object[]{s.getTen(),s.getmSV(),
//                    s.getDiaChi(),s.getKhoa(),s.getLopUT(),s.getGiaoVien(),s.getChucVu(),s.getNgayThamGia()
//                });
//
//            }
//            if (t instanceof VeXe vs) {
//                model.addRow(new Object[]{
//                    vs.getMaVe(), vs.getTenVe(), vs.getGiaTien()
//                });
//            }
//            if (t instanceof ThongKe vs) {
//                model.addRow(new Object[]{
//                    vs.getKhuVuc(), vs.getTongTien(), vs.getNgay()
//                });
//            }
//        }
//
//    }
    public void loadTable() {

        // jTable1.setModel(new TableTV(dsTV));
    }

    public DanhSachTV() {
        initComponents();
        //   tblVeModel = (DefaultTableModel) jTable100.getModel();
        //  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        // fakeTV();
        docFileTV(fileNameTV);
        //loadTable();
        tblVeModel = (DefaultTableModel) jTable1.getModel();
        showData(dsTV, tblVeModel);
    }

    public final <T> void showData(ArrayList<T> list, DefaultTableModel model) {
        model.setRowCount(0);
        for (T t : list) {
            if (t instanceof ThanhVien) {
                ThanhVien thanhVien = (ThanhVien) t;
                model.addRow(new Object[]{thanhVien.getTen(), thanhVien.getmSV(),
                    thanhVien.getDiaChi(), thanhVien.getKhoa(), thanhVien.getLopUT(),
                    thanhVien.getGiaoVien(), thanhVien.getChucVu(), thanhVien.getNgayThamGia()
                });
            }
        }
    }

    public void AddThanhVien(ThanhVien a) {

        dsTV.add(a);
        //loadTable();
        showData(dsTV, tblVeModel);
        luuFile(dsTV, fileNameTV);
        System.out.println("them thanh cong");

    }

    public void SuaTV(ThanhVien a) {
        try {
            dsTV.remove(selectedIndex);
            dsTV.add(a);
            // loadTable();
            showData(dsTV, tblVeModel);
            luuFile(dsTV, fileNameTV);
            JOptionPane.showMessageDialog(rootPane, "sua thanh cong!!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "chon vui long chon vao 1 thanh vien");
        }

    }

    public void XoaaTV(ThanhVien a) {

        dsTV.remove(selectedIndex);
        showData(dsTV, tblVeModel);
        // loadTable();
        luuFile(dsTV, fileNameTV);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnDanhSachSV = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnDanhSachSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnDanhSachSVMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 204));
        jLabel21.setText("Danh sách sinh viên tình nguyện");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ho ten", "ma sv", "dia chi", "khoa", "lop ut", "gv", "chuc vu", "ngay tham gia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton4.setText("thoat");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("tim kiem");
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

        javax.swing.GroupLayout jpnDanhSachSVLayout = new javax.swing.GroupLayout(jpnDanhSachSV);
        jpnDanhSachSV.setLayout(jpnDanhSachSVLayout);
        jpnDanhSachSVLayout.setHorizontalGroup(
            jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                .addGroup(jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(127, 127, 127)
                                .addComponent(jButton2)))
                        .addGap(91, 91, 91)
                        .addComponent(jButton3)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jpnDanhSachSVLayout.setVerticalGroup(
            jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel21)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGroup(jpnDanhSachSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton4))
                    .addGroup(jpnDanhSachSVLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton6)))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDanhSachSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDanhSachSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpnDanhSachSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnDanhSachSVMouseClicked

    }//GEN-LAST:event_jpnDanhSachSVMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        themphantu themPT = new themphantu(this,
                rootPaneCheckingEnabled);
        themPT.setVisible(true);
//new themphantu().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex < 0 || selectedIndex > dsTV.size()) {
            JOptionPane.showMessageDialog(rootPane, "vui long chon thanh vien de sua");

        } else {
            SuaThanhVien suaCa = new SuaThanhVien(this,
                    rootPaneCheckingEnabled);
            suaCa.setSuaThanhVien(dsTV.get(selectedIndex));
            suaCa.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        selectedIndex = jTable1.getSelectedRow();
        if (selectedIndex < 0 || selectedIndex > dsTV.size()) {
            JOptionPane.showMessageDialog(rootPane, "vui long chon thanh vien de xoa");

        } else {
            xoaTV xoaa = new xoaTV(this,
                    rootPaneCheckingEnabled);
            xoaa.setXoaTV(dsTV.get(selectedIndex));
            xoaa.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         timkiem themPT = new timkiem(this,
                rootPaneCheckingEnabled);
        themPT.setVisible(true);
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
            java.util.logging.Logger.getLogger(DanhSachTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachTV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachTV().setVisible(true);
            }
        });
    }

    public void luuFile(ArrayList T, String fileName) {
        try {
            db1.writeToFile(T, fileName);
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
    public void docFileTV(String fileName) {
        try {
            dsTV = (ArrayList) db1.readDataFromFile(fileName);
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpnDanhSachSV;
    // End of variables declaration//GEN-END:variables
}
