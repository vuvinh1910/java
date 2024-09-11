public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        // Sử dụng StringBuilder để đảo ngược chuỗi
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("Chuỗi đảo ngược: " + reversed);
    }
}
