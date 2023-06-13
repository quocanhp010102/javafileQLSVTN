/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisinhvientinhnguyen.qlthanhvien;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class ThanhVien extends SinhVien implements Serializable {
    private String chucVu;
    private String ngayThamGia;

    public void setNgayThamGia(String ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public String getNgayThamGia() {
        return ngayThamGia;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public ThanhVien() {
       super();
    }
    

   

    public ThanhVien( String ten, String mSV, String diaChi, String khoa, String lopUT, String giaoVien,String chucVu,String ngayThamGia) {
        super(ten, mSV, diaChi, khoa, lopUT, giaoVien);
        this.chucVu = chucVu;
        this.ngayThamGia=ngayThamGia;
    }
    
    
}
