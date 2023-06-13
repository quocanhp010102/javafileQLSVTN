package quanlisinhvientinhnguyen.qlthanhvien;

import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author PC
 */
public class SinhVien implements Serializable {
    private String ten;
    private String mSV;
    private String diaChi;
    private String khoa;
    private String lopUT;
    private String giaoVien;

    public SinhVien() {
    }

    public SinhVien(String ten, String mSV, String diaChi, String khoa, String lopUT, String giaoVien) {
        this.ten = ten;
        this.mSV = mSV;
        this.diaChi = diaChi;
        this.khoa = khoa;
        this.lopUT = lopUT;
        this.giaoVien = giaoVien;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ten=" + ten + ", mSV=" + mSV + ", diaChi=" + diaChi + ", khoa=" + khoa + ", lopUT=" + lopUT + ", giaoVien=" + giaoVien + '}';
    }

    public String getTen() {
        return ten;
    }

    public String getmSV() {
        return mSV;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getLopUT() {
        return lopUT;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setmSV(String mSV) {
        this.mSV = mSV;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setLopUT(String lopUT) {
        this.lopUT = lopUT;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
    
    
    
}
