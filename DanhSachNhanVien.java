package QL_CUA_HANG_OTO;

import java.util.Scanner;


public class DanhSachNhanVien extends NhanVien{
    static NhanVien[] nv = new NhanVien[100];
    private static int t=0;

    public DanhSachNhanVien() {
    }
    
    public void Insert(){
        Scanner sc=new Scanner(System.in);
        //insert
        int opt=0;
        do {            
            System.out.println("Chon Loai nhan vien :");
            System.out.println("1.QUAN LY");
            System.out.println("2.THU NGAN");
            System.out.println("3.BAN HANG");
            opt=Integer.parseInt(sc.nextLine());
        } while (opt>3);
        System.out.println("Nhap thong tin nhan vien: ");
        switch(opt){
            case 1:
                nv[t]=new QuanLi();
                nv[t++].NHAP();
                break;
            case 2:
                nv[t]=new ThuNgan();
                nv[t++].NHAP();
                break;
            case 3:
                nv[t]=new BanHang();
                nv[t++].NHAP();
                break;
            default: System.out.println("Chon Lua Cua Ban Nam Ngoai Pham Vi Cho Phep");break;
        }
    }
    
    public void Show() {
        System.out.println("---------------Danh Sach Nhan Vien--------------");
        for(int a=0;a<t;a++)
            nv[a].XUAT();
        System.out.println("");
    }
    
    public void Update(){
        
        Scanner sc=new Scanner(System.in);
        int a;
        do {
            System.out.println("Moi Nhap Ma Nhan Vien Muon Sua Thong Tin: ");
            a = Integer.parseInt(sc.nextLine());
            if(a < 0)
                System.out.println("Ban Da Nhap Sai Ma Nhan Vien, Vui Long Nhap Lai!");
        } while(a <0);
        
        for(int o = 0; o < t; o++) {
            if(o == a - 1) {
                if(nv[o] == null) 
                    System.out.println("Ma Nhan Vien Khong Ton Tai, Xin Vui Long Nhap Lai!");
        
                System.out.println("Thong Tin Nhan Vien Hien Tai: ");
                nv[o].XUAT();
            }
        }
        
        for(int o = 0; o < t; o++) {
            if(o == a - 1) {
                System.out.println("");
                System.out.println("Nhap Ho Ten Nhan Vien : ");
                String name = sc.nextLine();
                System.out.println("Nhap Gioi Tinh : ");
                String sex = sc.nextLine();
                System.out.println("Nhap Nam Sinh: ");
                String year = sc.nextLine();
                System.out.println("Nhap Dia Chi: ");
                String address = sc.nextLine();
                System.out.println("Nhap So Dien Thoai : ");
                String phone = sc.nextLine();
                System.out.println("Nhap ma so nhan vien :");
                String manv= sc.nextLine();
                System.out.println("Nhap cap bac :");
                String capbac= sc.nextLine();
                System.out.println("Nhap luong tieu chuan : ");
                float luong=sc.nextFloat();
                
                
                nv[o].setHoTen(name);
                nv[o].setGioiTinh(sex);
                nv[o].setNamSinh(year);
                nv[o].setDiaChi(address);
                nv[o].setSDT(phone);
                nv[o].setMaSoNhanVien(manv);
                nv[o].setCapBac(capbac);
                nv[o].setLuongTieuChuan(luong);
            }
        } 
    }
    
    public void delete_nv(){
        int x, o;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi Nhap Ma Nhan Vien Muon Xoa: ");
            x = Integer.parseInt(sc.nextLine());
            if(x < 0 && x < nv.length)
                System.out.println("Ban Da Nhap Sai Ma Nhan Vien, Vui Long Nhap Lai!");
        } while(x < 0 && x < nv.length);

        for (o = x - 1; o < t; o++) {
            nv[o] = nv[o+1];
        }
        t--;
    }
    
    @Override
    public float TienLuong() {
       return 1.0f;
    }
}