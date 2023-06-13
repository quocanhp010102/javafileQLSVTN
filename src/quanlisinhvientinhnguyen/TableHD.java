///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package quanlisinhvientinhnguyen;
//
///**
// *
// * @author PC
// */
//import java.util.ArrayList;
//import javax.swing.table.AbstractTableModel;
//import quanlisinhvientinhnguyen.qlthanhvien.ThanhVien;
//
//
///**
// *
// * @author HUY HIEN
// */
//public class TableHD extends AbstractTableModel{
//    
//    private String Name[] = {"ma hd","ten hd","ngay bat dau" ,"ngay ket thuc","chi phi","leader"};
//    
//    private Class classess[]  = {String.class,String.class,String.class,String.class,int.class,String.class};
//    
//    ArrayList<HoatDong> dsHD = new ArrayList<>();
//
//    public TableHD(ArrayList<HoatDong> HoatDong) {
//        
//       // if(Object instanceof HoatDong){
//           dsHD = HoatDong;
//       // }
//    }
//
//   
//    @Override
//    public int getRowCount() {
//        return dsHD.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return Name.length;
//    }
//
//    @Override
//    public Object getValueAt(int rowIndex, int columnIndexs) {
//    Object object = dsHD.get(rowIndex);
//    if (object instanceof HoatDong) {
//        HoatDong hoatDong = (HoatDong) object;
//        switch (columnIndexs) {
//            case 0:
//                return hoatDong.getMaHD();
//            case 1:
//                return hoatDong.getTenHD();
//            case 2:
//                return hoatDong.getNgayBatDau();
//            case 3:
//                return hoatDong.getNgayKetThuc();
//            case 4:
//                return hoatDong.getChiPhi();
//            case 5:
//                return hoatDong.getLeader();
//            default:
//                return null;
//        }
//    } else if (object instanceof ThanhVien) {
//        ThanhVien thanhVien = (ThanhVien) object;
//        switch (columnIndexs) {
//            case 0:
//                return thanhVien.getTen();
//            case 1:
//                return thanhVien.getmSV();
//            case 2:
//                return thanhVien.getDiaChi();
//            case 3:
//                return thanhVien.getKhoa();
//            case 4:
//                return thanhVien.getLopUT();
//            case 5:
//                return thanhVien.getGiaoVien();
//            case 6:
//                return thanhVien.getChucVu();
//            case 7:
//                return thanhVien.getNgayThamGia();
//            default:
//                return null;
//        }
//    }
//    return null;
//}
//
//    
//    public Class getColumnClass(int columnIndex){
//        return classess[columnIndex];
//    }
//    
//    public String getColumnName(int column){
//        return Name[column];
//    }
//    
//}
//
