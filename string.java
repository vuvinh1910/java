public class StringExample {
    public static void main(String[] args) {
      // Khởi tạo chuỗi
      String str = "Hello, concac"
      String str1 = "Hello, World!";
      String str2 = new String("Java Programming");
      
      // Lấy độ dài của chuỗi
      int length = str.length();

      // Truy cập ký tự tại chỉ số nhất định
      char ch = str.charAt(7);
      
      // so sanh chuoi
      str1.equals(str2)

      // Chuyển đổi thành chữ hoa
      String upper = str.toUpperCase();
      // Chuyển đổi thành chữ thường
      String lower = str.toLowerCase();

      // Xóa phần từ chỉ số 5 đến 10 (bao gồm cả chỉ số 5, nhưng không bao gồm chỉ số 10)
      String result = removeSubstring(str, 5, 10);
      
      // Tìm vị trí của một ký tự hoặc chuỗi con xuat hien dau tien
      int index = str.indexOf("tu can tim");
      // Thay thế ký tự hoặc chuỗi con
      String replaced = str.replace("tu can thay", "tu thay");

      // Cắt chuỗi từ chỉ số 7 đến cuối
      String substr1 = str.substring(7);
      // Cắt chuỗi từ chỉ số 0 đến 5
      String substr2 = str.substring(0, 5);

      // Kiểm tra xem chuỗi có chứa một chuỗi con không
      boolean contains = str.contains("chuoi con");

      // Chia chuỗi thành mảng dựa trên ký tự phân cách
      String[] parts = str.split(",");

      // Nối hai chuỗi
      String result = str1.concat(", ").concat(str2); // noi bang ", "
    }
}
