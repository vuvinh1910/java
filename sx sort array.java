import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5};
        // Sắp xếp mảng tăng dần
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 5, 9]
      // Sắp xếp mảng giảm dần
        Arrays.sort(numbers, Comparator.reverseOrder());
    }
}
