import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập toán, lý, hóa, văn, tiếng anh:");
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        double van = sc.nextDouble();
        double tienganh = sc.nextDouble();
        double diemTB = (toan + ly + hoa + van + tienganh)/5;
        System.out.println("điểm TB" + diemTB);
        if (diemTB >= 0 && diemTB < 5) {
            System.out.println("yếu");
        } else if (5 <= diemTB && diemTB < 6.5) {
            System.out.println("trung bình");
        } else if (6.5 <= diemTB && diemTB < 8) {
            System.out.println("khá");
        } else if (8 <= diemTB && diemTB < 9) {
            System.out.println("giỏi");
        } else {
            System.out.printf("xuất sắc");

        }
    }
}
