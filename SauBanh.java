package QL_CUA_HANG_OTO;

public class SauBanh extends OTo implements TinhGiaTri{
    public SauBanh() {
    }

    public SauBanh(String TenXe, String ThuongHieu, String MauXe, String Maxe, int TocDo, float Gia) {
        super(TenXe, ThuongHieu, MauXe, Maxe, TocDo, Gia);
    }
    
    
    @Override
    public String TypeCar() {
        return "SAU BANH";
    }
    
    @Override
    public float Thue() {
        return 0.2f*super.getGia();
    }
    
    @Override
    public float GiaBan() {
        return super.getGia() + Thue()*2;
    }
    
    @Override
    public float ThanhTien() {
        return GiaBan();
    }
}
