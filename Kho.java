package QL_CUA_HANG_OTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Kho {
    public static final String DATA_LOC = "D:\\DOAN\\DOANOOP\\src\\main\\java\\QL_CUA_HANG_OTO\\data.txt";
    private int SoLuong4Banh;
    private int SoLuong6Banh;
    private String[] DsLoaiXe = {"bon banh", "sau banh", "4", "6"};

    public Kho(int SoLuong4Banh, int SoLuong6Banh) {
        this.SoLuong4Banh = SoLuong4Banh;
        this.SoLuong6Banh = SoLuong6Banh;
    }
    
    public Kho() throws IOException {
        SoLuong4Banh = 0;
        SoLuong6Banh = 0;
        layThongTinTuFile();
    }
    public void layThongTinTuFile() throws IOException {
        File f = new File(DATA_LOC);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        try {
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                if(value != null && value.length > 0) {
                    String loaiXeTrogFile = value[1].trim();
                    for(String loaiXe : DsLoaiXe) {
                        if(loaiXe.toLowerCase().equals(loaiXeTrogFile.toLowerCase())) {
                            if(loaiXe.equals("bon banh") || loaiXe.equals("4")) SoLuong4Banh += Integer.parseInt(value[0]);
                            else SoLuong6Banh += Integer.parseInt(value[0]);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error At KHO: " + e.toString());
        } finally {
            if (fr != null) {
                fr.close();
            }
            if (br != null) {
                br.close();
            }
        }
    }

    public int getSoLuong4Banh() {
        return SoLuong4Banh/2;
    }

    public void setSoLuong4Banh(int SoLuong4Banh) {
        this.SoLuong4Banh = SoLuong4Banh;
    }

    public int getSoLuong6Banh() {
        return SoLuong6Banh/2;
    }

    public void setSoLuong6Banh(int SoLuong6Banh) {
        this.SoLuong6Banh = SoLuong6Banh;
    }

    public String[] getDsLoaiXe() {
        return DsLoaiXe;
    }

    public void setDsLoaiXe(String[] DsLoaiXe) {
        this.DsLoaiXe = DsLoaiXe;
    }
    
}
