package QL_CUA_HANG_OTO;

import java.util.Scanner;

public abstract class NhanVien extends ConNguoi{
    private String MaSoNhanVien;
    private String CapBac;
    private float LuongTieuChuan;


    public NhanVien() {
       
    }

    public NhanVien(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(HoTen, GioiTinh, NamSinh, DiaChi, SDT);
        this.MaSoNhanVien = MaSoNhanVien;
        this.CapBac = CapBac;
        this.LuongTieuChuan = LuongTieuChuan;
    }

    public String getMaSoNhanVien() {
        return MaSoNhanVien;
    }

    public void setMaSoNhanVien(String MaSoNhanVien) {
        this.MaSoNhanVien = MaSoNhanVien;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String CapBac) {
        this.CapBac = CapBac;
    }

    public float getLuongTieuChuan() {
        return LuongTieuChuan;
    }

    public void setLuongTieuChuan(float LuongTieuChuan) {
        this.LuongTieuChuan = LuongTieuChuan;
    }

    @Override
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        super.NHAP(); 
        do {            
            System.out.println("Moi Ban Nhap MSNV: ");
             MaSoNhanVien = sc.nextLine();
        } while (Integer.parseInt(MaSoNhanVien) <0);
        System.out.println("Moi Ban Nhap Cap Bac: ");
        CapBac = sc.nextLine();
        do {            
             System.out.println("Moi Ban Nhap Luong Tieu Chuan: ");
             LuongTieuChuan = Float.parseFloat(sc.nextLine());
        } while (LuongTieuChuan <0);
    }

    @Override
    public void XUAT() {
        super.XUAT(); 
        System.out.println("MSNV: " + MaSoNhanVien);        
        System.out.println("Cap Bac: " + CapBac);
        System.out.println("Luong Tieu Chuan : " + LuongTieuChuan);
        System.out.println("Tong Tien Luong: " + TienLuong());
    }
    public abstract float TienLuong();
}
