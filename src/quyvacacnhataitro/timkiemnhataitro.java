/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quyvacacnhataitro;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlisinhvientinhnguyen.HoatDong;
import quanlisinhvientinhnguyen.QLHoatDong;
import quanlisinhvientinhnguyen.timkiemhoatdong;

/**
 *
 * @author PC
 */
public class timkiemnhataitro extends javax.swing.JDialog {

    /**
     * Creates new form timkiemnhataitro
     */
    private qlNTT dsntt;
    static String fileNameNTT = "nhataitro.txt";
    private final DefaultTableModel tblVeModel;
    ArrayList<nhataitro> dsNTT = new ArrayList<>();
    public timkiemnhataitro(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
        //fakeTV();
        this.setLocationRelativeTo(null);
        dsntt = (qlNTT) parent;
        dsntt.docFileNTT(fileNameNTT);
        dsNTT = dsntt.dsNTT;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ten ntt");

        jLabel2.setText("so tien tai tro");

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
                "ma ntt", "ten ntt", "so tien", "ngay"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
                String tenNTT;
                tenNTT=jTextField1.getText();
                        
                String soTien;
                soTien=jTextField2.getText();
                
                if(soTien.length()==0){
                boolean check = false;
                tblVeModel.setRowCount(0);
                for (nhataitro thanhVien : dsNTT) {
                    if (tenNTT.equals(thanhVien.getTenNTT()) ) {
                        tblVeModel.addRow(new Object[]{
                           thanhVien.getMaNTT(), thanhVien.getTenNTT(),
                    thanhVien.getSoTien(), thanhVien.getNgayTaiTro()
                        });
                        //  tongTien += tk.getTongTien();
                        check = true;
                    }
                }
                //  txtTien.setText(Float.toString(tongTien));

                if (check == false) {
                    JOptionPane.showMessageDialog(rootPane,
                            "khong co ten nao nhu vay");
                    // showData(thongkes, tblTKModel);
                }
                }else if(tenNTT.length()==0){
                     boolean check = false;
                tblVeModel.setRowCount(0);
                for (nhataitro thanhVien : dsNTT) {
                    if (soTien.equals(Integer.toString(thanhVien.getSoTien() ) )) {
                        tblVeModel.addRow(new Object[]{
                           thanhVien.getMaNTT(), thanhVien.getTenNTT(),
                    thanhVien.getSoTien(), thanhVien.getNgayTaiTro()
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
                }else{
                        boolean check = false;
                tblVeModel.setRowCount(0);
                for (nhataitro thanhVien : dsNTT) {
                    if (soTien.equals(Integer.toString(thanhVien.getSoTien() ) )&&tenNTT.equals(thanhVien.getTenNTT())) {
                        tblVeModel.addRow(new Object[]{
                           thanhVien.getMaNTT(), thanhVien.getTenNTT(),
                    thanhVien.getSoTien(), thanhVien.getNgayTaiTro()
                        });
                        //  tongTien += tk.getTongTien();
                        check = true;
                    }
                }
                //  txtTien.setText(Float.toString(tongTien));

                if (check == false) {
                    JOptionPane.showMessageDialog(rootPane,
                            "ten va so tien khong trung khop");
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
            java.util.logging.Logger.getLogger(timkiemnhataitro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timkiemnhataitro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timkiemnhataitro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timkiemnhataitro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   qlNTT danhSachTV = new qlNTT();
                timkiemnhataitro dialog = new timkiemnhataitro(danhSachTV, true);

                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
