
import java.util.*;
public class CountElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // thêm ptu vào map key - value
        }
        // num là key, còn getOrDefault(num, 0) sẽ trả về value theo key=num nếu num tồn tại
        // trả về 0 nếu num không tồn tại.
        // sau đó +1 là để tăng số lần xuất hiện của phần tử.

        // In kết quả
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
