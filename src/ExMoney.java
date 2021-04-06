import java.util.Scanner;

public class ExMoney {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("tỉ giá là 1USD = 23.000vnđ");
        System.out.print("nhập vào số tiền (USD): ");
        double usd = sc.nextDouble();
        double vnd;

        vnd = usd * 23000;
        System.out.println("****************");
        System.out.println("bạn đổi được: "+vnd+ " vnđ");
    }
}
