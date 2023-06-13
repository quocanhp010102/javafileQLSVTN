/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlisinhvientinhnguyen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class HoatDong implements Serializable {
    private String maHD;
    private String tenHD;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int chiPhi;
    private String leader;

    public int getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(int chiPhi) {
        this.chiPhi = chiPhi;
    }

    
    public String getMaHD() {
        return maHD;
    }

    public String getTenHD() {
        return tenHD;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

   

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public void setTenHD(String tenHD) {
        this.tenHD = tenHD;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public HoatDong(String maHD, String tenHD, String ngayBatDau, String ngayKetThuc, int chiPhi, String leader) {
        this.maHD = maHD;
        this.tenHD = tenHD;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.chiPhi = chiPhi;
        this.leader = leader;
    }

    public HoatDong() {
    }

   

    

   
    
    
}
