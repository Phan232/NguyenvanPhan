package B1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ nhất:");
        String chuoi1 = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ hai:");
        String chuoi2 = scanner.nextLine();

        SoSanhTuDien soSanh = new SoSanhTuDien(chuoi1, chuoi2);
        int ketQua = soSanh.soSanh();

        System.out.println(ketQua);
    }
}