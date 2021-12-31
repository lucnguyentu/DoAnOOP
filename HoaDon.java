package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class HoaDon extends OTo{
    private String MaHoaDon;
    private String MaNhanVien;
    private String MaKhachHang; 

    public HoaDon() {
    }

    public HoaDon(String MaHoaDon, String MaNhanVien, String MaKhachHang) {
        this.MaHoaDon = MaHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    @Override
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Moi Ban Nhap Ma Hoa Don: ");
             MaHoaDon = sc.nextLine();
        } while (Integer.parseInt(MaHoaDon)< 0);
        do {            
            System.out.println("Moi Ban Nhap Ma Nhan Vien: ");
        MaNhanVien = sc.nextLine();
        } while (Integer.parseInt(MaNhanVien) <0);
        do {            
            System.out.println("Moi Ban Nhap Ma Khach Hang: ");
        MaKhachHang = sc.nextLine();
        } while (Integer.parseInt(MaKhachHang)<0);
    }
    
    @Override
    public void XUAT() {
        System.out.println("Ma Hoa Don: " + MaHoaDon);
        System.out.println("Ma Nhan Vien: " + MaNhanVien);
        System.out.println("Ma Khach Hang: " + MaKhachHang);
    }
  
}
