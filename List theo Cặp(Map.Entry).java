import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.AbstractMap;

public class ListWithPairsExample {
    public static void main(String[] args) {
        // Tạo danh sách lưu trữ cặp giá trị
        List<Map.Entry<String, Integer>> list = new ArrayList<>();

        // Thêm cặp giá trị vào danh sách
        list.add(new AbstractMap.SimpleEntry<>("Alice", 30));
        list.add(new AbstractMap.SimpleEntry<>("Bob", 25));
        list.add(new AbstractMap.SimpleEntry<>("Charlie", 35));

        // In danh sách
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
