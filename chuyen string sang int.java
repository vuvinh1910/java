public class StringToIntExample {
    public static void main(String[] args) {
        // Chuỗi cần chuyển đổi
        String s = "123";
        
        // Chuyển từ String sang int
        int num = Integer.parseInt(s);
        
        // In ra số sau khi chuyển đổi
        System.out.println("Số nguyên sau khi chuyển đổi là: " + num);
    }
}

int num = 456;
String str = Integer.toString(num);
System.out.println(str);  // Kết quả: "456"
