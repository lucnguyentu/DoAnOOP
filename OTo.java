package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class OTo {
    private String TenXe;
    private String ThuongHieu;
    private String MauXe;
    private String Maxe;
    private int TocDo;
    private float Gia;

    public OTo() {
    }

    public OTo(String TenXe, String ThuongHieu, String MauXe, String Maxe, int TocDo, float Gia) {
        this.TenXe = TenXe;
        this.ThuongHieu = ThuongHieu;
        this.MauXe = MauXe;
        this.Maxe = Maxe;
        this.TocDo = TocDo;
        this.Gia = Gia;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getThuongHieu() {
        return ThuongHieu;
    }

    public void setThuongHieu(String ThuongHieu) {
        this.ThuongHieu = ThuongHieu;
    }

    public String getMauXe() {
        return MauXe;
    }

    public void setMauXe(String MauXe) {
        this.MauXe = MauXe;
    }

    public String getMaxe() {
        return Maxe;
    }

    public void setMaxe(String Maxe) {
        this.Maxe = Maxe;
    }

    public int getTocDo() {
        return TocDo;
    }

    public void setTocDo(int TocDo) {
        this.TocDo = TocDo;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    public float ThanhTien() {
        return 1;
    }
    
    public float Thue() {
        return 1;
    }
    
    public String TypeCar() {
        return "";
    }
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten Xe: ");
        TenXe = sc.nextLine();
        System.out.println("Nhap Thuong Hieu: ");
        ThuongHieu = sc.nextLine();
        System.out.println("Nhap Mau Xe: ");
        MauXe = sc.nextLine();
        System.out.println("Nhap Ma Xe: ");
        Maxe = sc.nextLine();
        do {            
            System.out.println("Nhap Toc do (VD:160): ");
        TocDo = Integer.parseInt(sc.nextLine());
       
        } while (TocDo <0);
        do {            
            System.out.println("Nhap Gia (VD:1500): ");
        Gia = Float.parseFloat(sc.nextLine());
        } while (Gia <0);
    }
    
    public void XUAT() {
        System.out.println("Ten Xe: " + TenXe);        
        System.out.println("Thuong Hieu: " + ThuongHieu);
        System.out.println("Mau Xe: " + MauXe);
        System.out.println("Ma Xe: " + Maxe);
        System.out.println("Toc do: " + TocDo);
        System.out.println("Gia: " + Gia);
    }
}
