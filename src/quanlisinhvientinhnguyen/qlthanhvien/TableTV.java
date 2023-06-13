///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package quanlisinhvientinhnguyen.qlthanhvien;
//
///**
// *
// * @author PC
// */
//
////import quanlisinhvientinhnguyen.qlthanhvien.ThanhVien;
//import java.util.ArrayList;
//import javax.swing.table.AbstractTableModel;
//
//
///**
// *
// * @author HUY HIEN
// */
//public class TableTV extends AbstractTableModel{
//    
//    private String Name[] = {"ho ten","ma sv","dia chi" ,"khoa","lop","giao vien","chuc vu","ngay tham gia"};
//    
//    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
//    
//    ArrayList<ThanhVien> dsSV = new ArrayList<>();
//
//    public TableTV(ArrayList<ThanhVien> ThanhVien) {
//        dsSV = ThanhVien;
//    }
//
//    @Override
//    public int getRowCount() {
//        return dsSV.size();
//    }
//
//    @Override
//    public int getColumnCount() {
//        return Name.length;
//    }
//
//    /**
//     *
//     * @param rowIndex
//     * @param columnIndex
//     * @return
//     */
//    @Override
//    public Object getValueAt(int rowIndex, int columnIndexs) {
//        switch(columnIndexs){
//            case 0: return dsSV.get(rowIndex).getTen();
//            
//            case 1: return dsSV.get(rowIndex).getmSV();
//            
//            case 2: return dsSV.get(rowIndex).getDiaChi();
//             
//            case 3: return dsSV.get(rowIndex).getKhoa();
//            
//            case 4: return dsSV.get(rowIndex).getLopUT();
//            
//            case 5: return dsSV.get(rowIndex).getGiaoVien();
//            case 6: return dsSV.get(rowIndex).getChucVu();
//            case 7: return dsSV.get(rowIndex).getNgayThamGia();
//            
//            default : return null;
//        }
//    }
//    
//    @Override
//    public Class getColumnClass(int columnIndexs){
//        return classess[columnIndexs];
//    }
//    
//    @Override
//    public String getColumnName(int column){
//        return Name[column];
//    }
//    
//}
