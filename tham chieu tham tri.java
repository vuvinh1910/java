public class Main {
    public static void modifyValue(int a) {
        a = 10; // Chỉ thay đổi giá trị của bản sao
    }

    public static void main(String[] args) {
        int value = 5;
        modifyValue(value);
        System.out.println(value); // In ra 5, giá trị gốc không thay đổi
    }
}

// Tham trị trong Java luôn luôn là truyền giá trị. Đối với kiểu dữ liệu nguyên thủy, giá trị của biến được sao chép và thay đổi không ảnh hưởng đến giá trị gốc. 
// Đối với đối tượng, tham chiếu đến đối tượng được sao chép, và thay đổi thuộc tính của đối tượng thông qua tham chiếu sẽ ảnh hưởng đến đối tượng gốc.

// Tham chiếu: Trong Java, bạn không thể thay đổi giá trị của tham chiếu (để trỏ đến một đối tượng khác) trong phương thức. 
// Bạn chỉ có thể thay đổi thuộc tính của đối tượng mà tham chiếu đó đang trỏ đến.

public class Person {
    String name;
    
    public Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void modifyObject(Person p) {
        p.name = "John"; // Thay đổi thuộc tính của đối tượng
    }

    public static void main(String[] args) {
        Person person = new Person("Alice");
        modifyObject(person);
        System.out.println(person.name); // In ra "John", thuộc tính của đối tượng đã thay đổi
    }
}
