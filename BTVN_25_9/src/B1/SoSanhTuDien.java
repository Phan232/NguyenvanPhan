package B1;

import java.util.Scanner;

class SoSanhTuDien {

    private String chuoi1;
    private String chuoi2;

    public SoSanhTuDien(String chuoi1, String chuoi2) {
        this.chuoi1 = chuoi1;
        this.chuoi2 = chuoi2;
    }

    public int soSanh() {
        String chuoiThuong1 = chuoi1.toLowerCase();
        String chuoiThuong2 = chuoi2.toLowerCase();

        if (chuoiThuong1.equals(chuoiThuong2)) {
            return 0;
        } else if (chuoiThuong1.compareTo(chuoiThuong2) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
