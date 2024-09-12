import java.util.Scanner;
import java.math.BigInteger;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            String nhap = sc.nextLine();
            try {
                // Khởi tạo BigInteger từ chuỗi nhập vào
                BigInteger vc = new BigInteger(nhap);
                System.out.println(vc);
            } catch (NumberFormatException e) {
                // Xử lý lỗi nếu chuỗi không phải là số hợp lệ
                System.out.println("NO");
            }
        }
        
        sc.close(); // Đảm bảo đóng Scanner để tránh rò rỉ tài nguyên
    }
}
