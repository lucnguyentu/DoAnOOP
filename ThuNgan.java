package QL_CUA_HANG_OTO;

public class ThuNgan extends NhanVien {

    public ThuNgan() {
    }

    public ThuNgan(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(MaSoNhanVien, CapBac, LuongTieuChuan, HoTen, GioiTinh, NamSinh, DiaChi, SDT);
    }

    @Override
    public float TienLuong() {
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.06f);
    }
}
