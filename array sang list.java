import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc hai chuỗi đầu vào và loại bỏ khoảng trắng thừa
        String input1 = sc.nextLine().trim();
        String input2 = sc.nextLine().trim();

        // Chuyển chuỗi thành mảng bằng split(), sau đó chuyển mảng thành List
        List<String> s1 = Arrays.asList(input1.split("\\s+"));
        List<String> s2 = Arrays.asList(input2.split("\\s+"));

        // In ra danh sách để kiểm tra
        System.out.println("Danh sách s1: " + s1);
        System.out.println("Danh sách s2: " + s2);
    }
}
