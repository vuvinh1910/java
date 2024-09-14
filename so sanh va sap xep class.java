package levinh;
class Person implements Comparable<Person> { // cung cấp khả năng class so sánh với các đối tượng của nó
    private int id;
    private String name;
    // Constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Phương thức so sánh, nếu cùng id thì xét theo tên.
    // biến chính so sánh với biến other là sx tăng.
    @Override
    public int compareTo(Person other) {
        // So sánh theo id trước
        if (this.id != other.id) {
            return Integer.compare(this.id, other.id); // So sánh int
        }
        // Nếu id giống nhau, so sánh theo name
        return this.name.compareTo(other.name); // So sánh String
    }
}
public class Quiz {
    public static void main(String[] args) throws Exception {
        Person a = new Person(2,"vinh");
        Person a1 = new Person(4,"vinh1");
        Person a3 = new Person(6,"vinh2");
        List<Person> lst = new ArrayList<>();
        lst.add(a);lst.add(a1);lst.add(a2);
        Collections.sort(lst); // sx tăng
        Collections.sort(lst, Collections.reversedOder()); // sx giảm
    }
}

