// Cho dãy số A[] gồm có N phần tử. Nhiệm vụ của bạn là hãy sắp xếp dãy số này theo tần suất xuất hiện của chúng. Số nào có số lần xuất hiện lớn hơn in ra trước.
//Nếu có 2 số có số lần xuất hiện bằng nhau, số nào xuất hiện trong dãy A[] trước sẽ được in ra trước.
// Chú ý: Nên cố gắng sử dụng các lớp phù hợp trong Java. 

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Map<Integer,Integer> map = new LinkedHashMap<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
            Collections.sort(list, (entry1,entry2) -> {
                return -(entry1.getValue() - entry2.getValue());
            });
            for (Map.Entry<Integer,Integer> entry : list) {
                for (int i = 0; i < entry.getValue(); i++) {
                    System.out.print(entry.getKey() + " ");
                }
            }
            System.out.println();
        }

    }
}
