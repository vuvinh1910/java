import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next(); // Đọc chuỗi từ người dùng
        
        // Duyệt từng ký tự trong chuỗi
        for (char s : n.toCharArray()) { // Chuyển chuỗi thành mảng ký tự
            if (s >= '2' && s <= '7') {
                System.out.println("INVALID");
                return; // Kết thúc sau khi tìm thấy ký tự không hợp lệ
            }
        }
        
        System.out.println("VALID"); // Nếu không tìm thấy ký tự không hợp lệ
        sc.close();
    }
}
