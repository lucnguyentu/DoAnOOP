package QL_CUA_HANG_OTO;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void menu2 () {
        System.out.println("------------------Danh Sach Chuc Nang----------------------------");
        System.out.println("1. Them Moi Nhan Vien");
        System.out.println("2. Hien Thi Nhan Vien");
	System.out.println("3. Sua Thong Tin Nhan Vien");
        System.out.println("4. Xoa Nhan Vien");
        System.out.println("");
    }
    
    public static void menu() {
		System.out.println("------------------Danh Sach Chuc Nang----------------------------");
		System.out.println("1. Them Moi San Pham");
		System.out.println("2. Hien Thi San Pham");
		System.out.println("3. Sua San Pham");
		System.out.println("4. Xoa San Pham");
                System.out.println("5. Tim San Pham");
		System.out.println("6. Mua Hang");
		System.out.println("7. Hien Thi Danh Sach Don Hang");
                System.out.println("8. Dieu Phoi Nhan Vien");
                System.out.println("9. Check Kho");
		System.out.println("10. Thoat.");
	}

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ChiTietHoaDon cthd = new ChiTietHoaDon();
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        Kho kho = new Kho(); 
        int opt, opt2;
        do {
            menu();
            System.out.println("Moi Nhap Lua Chon: ");
            opt = Integer.parseInt(sc.nextLine());
            switch(opt) {
                case 1:
                    cthd.Insert();
                    break;
                case 2:
                    cthd.ShowDSSanPham();
                    break;
                case 3:
                    cthd.Update();
                    break;
                case 4:
                    cthd.XoaSanPham();
                    break;
                case 5:
                    cthd.Search();
                    break;
                case 6:
                    System.out.println("Da Mua Oto, Cua Hang Se Van Chuyen Den Dung Dia Chi cho Quy Khach, Tran Trong!");
                    break;
                case 7:
                    cthd.ShowDSHoaDon();
                    break;
                case 8:
                    menu2();
                    do {
                        System.out.println("Moi Nhap Lua Chon: ");
                        opt2 = Integer.parseInt(sc.nextLine());
                        switch(opt2) {
                            case 1:
                                dsnv.Insert();
                                break;
                            case 2:
                                dsnv.Show();
                                break;
                            case 3:
                                dsnv.Update();
                                break;
                            case 4:
                                dsnv.delete_nv();
                                break;
                            case 5:
                                System.out.println("Successful!");
                                break;
                            default: System.out.println("Lua Chon Khong Hop Le"); break;
                        }
                        break;
                    } while (opt2 != 4);
                    break;
                case 9:
                    kho.layThongTinTuFile();
                    System.out.println("4 banh: " + kho.getSoLuong4Banh());
                    System.out.println("6 banh: " + kho.getSoLuong6Banh());
                    break;
                case 10: 
                    System.out.println("Successful!");
                    break;
                    default: System.out.println("Lua Chon Khong Hop Le"); break;
            }
        } while(opt != 10);
    }
}
