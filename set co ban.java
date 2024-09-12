import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        // Duyệt qua các phần tử bằng for-each
        for (String element : mySet) {
            System.out.println(element);
        }
    }
}
