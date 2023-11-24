import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Người Nhâp: ");
        double nguoinhap = sc.nextDouble();
        if (nguoinhap % 3 == 0 && nguoinhap % 5 == 0) {
            System.out.println("chia hết cho 3 và 5");
        }else if (nguoinhap % 3 ==0 && nguoinhap %5 !=0){
            System.out.println("chia hết cho 3 và không chia hết cho 5: ");
        }else if (nguoinhap % 5==0 && nguoinhap %3 !=0){
            System.out.println("chia hết cho 5 và không chia hết cho 3");
        }else {
            System.out.println("không chia hết cho 3, không chia hết cho 5");
        }
    }
}