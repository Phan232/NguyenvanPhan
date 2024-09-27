package B2;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập tên của hiện vật: ");
        String text = scanner.nextLine();

        // Khởi tạo đối tượng Embosser và tính số lần quay
        Embosser embosser = new Embosser();
        int rotations = embosser.calculateRotations(text);

        // In ra kết quả
        System.out.println("Số lần quay tối thiểu: " + rotations);
        
        // Đóng scanner
        scanner.close();
    }}
