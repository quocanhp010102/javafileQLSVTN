/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quyvacacnhataitro;


import java.io.Serializable;


/**
 *
 * @author PC
 */
public class nhataitro implements Serializable {
    private String maNTT;
    private String tenNTT;
    private int soTien;
    private String ngayTaiTro;

    
   
    
    public String getMaNTT() {
        return maNTT;
    }

    public String getTenNTT() {
        return tenNTT;
    }

    public int getSoTien() {
        return soTien;
    }

    public String getNgayTaiTro() {
        return ngayTaiTro;
    }

    public void setMaNTT(int maNTT) {
        
        this.maNTT = "ntt"+maNTT;
    }

    public void setTenNTT(String tenNTT) {
        this.tenNTT = tenNTT;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public void setNgayTaiTro(String ngayTaiTro) {
        this.ngayTaiTro = ngayTaiTro;
    }

    public nhataitro(String maNTT, String tenNTT, int soTien, String ngayTaiTro) {
        this.maNTT = maNTT;
        this.tenNTT = tenNTT;
        this.soTien = soTien;
        this.ngayTaiTro = ngayTaiTro;
    }

    public nhataitro() {
    }
   
    
}
