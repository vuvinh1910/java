import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>();

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            list.add(new AbstractMap.SimpleEntry<>(n, n + m));
        }

        // Sắp xếp theo `first` trước, sau đó theo `second`
        Collections.sort(list, (entry1, entry2) -> {
            if (!entry1.getKey().equals(entry2.getKey())) {
                return entry1.getKey().compareTo(entry2.getKey()); // So sánh theo `first`
            } else {
                return entry1.getValue().compareTo(entry2.getValue()); // So sánh theo `second`
            }
        });

        // In danh sách sau khi sắp xếp
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
