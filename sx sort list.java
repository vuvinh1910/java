import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);
        
        // Sắp xếp danh sách theo thứ tự tăng dần
        Collections.sort(list);
         // Sắp xếp giảm dần
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers); // Output: [9, 5, 2, 1]
    }
}
