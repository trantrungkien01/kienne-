import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner kien = new Scanner(System.in);
        System.out.println("Nhập chiều dài , chiều rộng : ");
        double chieudai = kien.nextDouble();
        double chieurong = kien.nextDouble();
        double chuvi = (chieudai*chieurong*2);
        double dientich = (chieudai*chieurong);
        System.out.println("chuvi:"+chuvi+ "dientich:" +dientich);

    }
}
