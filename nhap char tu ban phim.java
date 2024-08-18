import java.util.Scanner;
// vi scanner khong ho tro nhap ky tu char nen ta nhap string va lay ky tu dau cua string
public class NextCharacter {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập một ký tự từ bàn phím
        System.out.print("Nhập một ký tự: ");
        char inputChar = scanner.next().charAt(0); // Đọc ký tự đầu tiên của chuỗi
        
        // Tính toán ký tự tiếp theo
        char nextChar = (char) (inputChar + 1);
        
        // Hiển thị ký tự tiếp theo
        System.out.println("Ký tự tiếp theo là: " + nextChar);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}
