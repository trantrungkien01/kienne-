import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //float rate = 23000;
        Scanner kien = new Scanner(System.in);
        float rate = 23000;
        System.out.println("Nhập giá trị số tiền :");
        double money = kien.nextDouble();
        double sum = (money*rate);
        System.out.println("tổng giá tiền quy đổi :" +sum);

    }
}
