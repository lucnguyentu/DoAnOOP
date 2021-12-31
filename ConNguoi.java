package QL_CUA_HANG_OTO;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConNguoi {
    private String HoTen;
    private String GioiTinh;
    private String NamSinh;
    private String DiaChi;
    private String SDT;

    public ConNguoi() {
    }

    public ConNguoi(String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        LocalDateTime localDate = LocalDateTime.now();
        System.out.println("Moi Ban Nhap Ho Ten: ");
        HoTen = sc.nextLine();
        boolean a= false;
        do {            
            System.out.println("Moi Ban Nhap Gioi Tinh: ");
            GioiTinh = sc.nextLine();
            if(GioiTinh.equalsIgnoreCase("nam") || GioiTinh.equalsIgnoreCase("nu")){
                a=true;
            }
        } while (a!=true);
        do {            
            System.out.println("Moi Ban Nhap Nam Sinh: ");
            NamSinh = sc.nextLine();
        } while (Integer.parseInt(NamSinh) > localDate.getYear() || Integer.parseInt(NamSinh) <= 1900 );
        System.out.println("Moi Ban Nhap Dia Chi: ");
        DiaChi = sc.nextLine();
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        do {            
            System.out.println("Moi Ban Nhap So Dien Thoai: ");
            SDT = sc.nextLine();
            
        } while (Pattern.matches(reg, SDT)==false);
    }
    
    public void XUAT() {
        System.out.println("Ho Ten: " + HoTen);        
        System.out.println("Gioi Tinh: " + GioiTinh);
        System.out.println("Nam Sinh: " + NamSinh);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("So Dien Thoai: " + SDT);
    }
   
}
