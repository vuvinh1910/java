// giống hashmap nhưng nó khác ở chỗ vẫn giữ nguyên thứ tự các phần tử mà nó thêm vào.

public class CountElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // In kết quả
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
