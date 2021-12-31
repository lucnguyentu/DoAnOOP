package QL_CUA_HANG_OTO;

public class BonBanh extends OTo implements TinhGiaTri{

    public BonBanh() {
    }

    public BonBanh(String TenXe, String ThuongHieu, String MauXe, String Maxe, int TocDo, float Gia) {
        super(TenXe, ThuongHieu, MauXe, Maxe, TocDo, Gia);
    }
    
    @Override
    public String TypeCar() {
        return "BON BANH";
    }
    
    @Override
    public float Thue() {
        return 0.4f*super.getGia();
    }
    
    @Override
    public float GiaBan() {
        return super.getGia() + Thue();
    }
    
    @Override
    public float ThanhTien() {
        return GiaBan();
    }
}
