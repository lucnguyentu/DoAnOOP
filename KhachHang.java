package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class KhachHang extends ConNguoi {
    private String MaKhachHang;

    public KhachHang() {
        
    }

    public KhachHang(String MaKhachHang, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(HoTen, GioiTinh, NamSinh, DiaChi, SDT);
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }
    
    @Override
    public void NHAP() {
        super.NHAP(); 
        System.out.println("Moi Nhap Ma Khach Hang: ");
        MaKhachHang = new Scanner(System.in).nextLine();
    }

    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Ma Khach Hang: " + MaKhachHang);
    }
    
    
}
