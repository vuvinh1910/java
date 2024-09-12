import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập 2 số lớn từ người dùng
        System.out.println("Nhập số thứ nhất:");
        String num1 = sc.nextLine();
        System.out.println("Nhập số thứ hai:");
        String num2 = sc.nextLine();
        
        // Chuyển chuỗi nhập vào thành đối tượng BigInteger
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        
        // Tính USCLN (ước số chung lớn nhất) của 2 số
        BigInteger gcd = a.gcd(b);
        
        // In kết quả
        System.out.println("Ước số chung lớn nhất của hai số là: " + gcd);
    }
}
