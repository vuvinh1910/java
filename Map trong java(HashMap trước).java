import java.util.*;

public class MapWithIntegerExample {
    public static void main(String[] args) {
        // Khởi tạo HashMap với String làm key và Integer làm value.
        Map<String, Integer> map = new HashMap<>();
        // Trong HashMap Các phần tử sắp xếp ngẫu nhiên, thay đổi cả lúc thêm và xóa.

        // Thêm Cặp Key-Value, dùng put().
        map.put("vinh",10); // Nếu khóa đã tồn tại, giá trị sẽ được cập nhật. Nếu map.put("vinh",2) thì value đổi thành 2.
        
        // Lấy value theo key:
        System.out.print(map.get("vinh")); // in ra 10.
        // xóa phần tử trong map theo key:
        map.remove("vinh");
        // ktra kích thước map:
        int size = map.size();
        // ktra sự tồn tại của key và value:
        boolean hasCherry = map.containsKey("vinh");
        boolean hasValue = map.containsValue(10);

    }
}
