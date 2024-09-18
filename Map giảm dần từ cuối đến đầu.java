import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Tạo TreeMap với Comparator để sắp xếp theo thứ tự giảm dần
        TreeMap<String, Integer> reverseTreeMap = new TreeMap<>(Collections.reverseOrder());
        
        // Thêm các phần tử vào TreeMap
        reverseTreeMap.put("apple", 10);
        reverseTreeMap.put("banana", 20);
        reverseTreeMap.put("orange", 5);
        reverseTreeMap.put("grape", 15);

        // In các phần tử theo thứ tự từ cuối đến đầu
        System.out.println("TreeMap from last to first (Descending):");
        for (Map.Entry<String, Integer> entry : reverseTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
