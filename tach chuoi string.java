public class Chuan_hoa_xau_ho_ten1 {

    static String edit(String s) {
        // Lấy ký tự đầu tiên và viết hoa
        String s1 = s.substring(0, 1).toUpperCase();
        // Phần còn lại chuyển thành chữ thường
        String s2 = s.substring(1).toLowerCase();
        return s1 + s2;
    }

    s = s.trim();  // Cắt khoảng trắng ở đầu và cuối
    s = s.replaceAll("\\s+", " ");  // Loại bỏ khoảng trắng thừa 
    String word[] = s.split("\\s");  // Tách chuỗi thành các từ và lưu vào mảng 

}
