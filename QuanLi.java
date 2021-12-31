package QL_CUA_HANG_OTO;

public class QuanLi extends NhanVien{
    public QuanLi() {
    }

    public QuanLi(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(MaSoNhanVien, CapBac, LuongTieuChuan, HoTen, GioiTinh, NamSinh, DiaChi, SDT);
    }

    @Override
    public float TienLuong() {
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.1f);
    }
}
