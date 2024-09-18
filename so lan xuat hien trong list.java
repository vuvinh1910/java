import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo một danh sách
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        
        // Đếm số lần xuất hiện của "apple"
        int frequency = Collections.frequency(list, "apple");
        
        // In ra kết quả
        System.out.println("Số lần xuất hiện của 'apple': " + frequency);
    }
}
