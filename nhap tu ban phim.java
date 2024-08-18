import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        // Hiển thị chuỗi đã nhập
        System.out.println("Chào, " + name + "!");
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}
