package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class CuaHang {
    private String TenCuaHang;
    private String DiaChi;
    private int SoCoSo;

    public CuaHang() {
    }

    public CuaHang(String TenCuaHang, String DiaChi, int SoCoSo) {
        this.TenCuaHang = TenCuaHang;
        this.DiaChi = DiaChi;
        this.SoCoSo = SoCoSo;
    }

    public String getTenCuaHang() {
        return TenCuaHang;
    }

    public void setTenCuaHang(String TenCuaHang) {
        this.TenCuaHang = TenCuaHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSoCoSo() {
        return SoCoSo;
    }

    public void setSoCoSo(int SoCoSo) {
        this.SoCoSo = SoCoSo;
    }
    
    public void Nhap() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Moi Nhap Ten Cua Hang: ");
        TenCuaHang = sc.nextLine();
        System.out.println("Moi Nhap Dia Chi Cua Hang: ");
        DiaChi = sc.nextLine();
        do {            
            System.out.println("Moi Nhap So Co So: ");
        SoCoSo = Integer.parseInt(sc.nextLine());
        } while (SoCoSo <1);
    }
    
    public void Xuat() {
        System.out.println("Ten Cua Hang: " + TenCuaHang);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("So Co So: " + SoCoSo);
    }
}
