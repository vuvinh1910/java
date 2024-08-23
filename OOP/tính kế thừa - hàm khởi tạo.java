class Person {
    private int age;
    private String name;

    // Hàm khởi tạo không tham số
    public Person() {
        this.age = 0;
        this.name = "Unknown";
        System.out.println("Person default constructor");
    }

    // Hàm khởi tạo với một tham số
    public Person(int age) {
        this.age = age;
        this.name = "Unknown";
        System.out.println("Person constructor with age");
    }

    // Hàm khởi tạo với hai tham số
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Person constructor with age and name");
    }
}

class Student extends Person {
    private int studentId;

    // Hàm khởi tạo của lớp Student gọi các hàm khởi tạo khác nhau của lớp Person
    public Student() {
        super();  // Gọi hàm khởi tạo không tham số của lớp cha
        this.studentId = 0;
        System.out.println("Student default constructor");
    }

    public Student(int age) {
        super(age);  // Gọi hàm khởi tạo với một tham số của lớp cha
        this.studentId = 0;
        System.out.println("Student constructor with age");
    }

    public Student(int age, String name, int studentId) {
        super(age, name);  // Gọi hàm khởi tạo với hai tham số của lớp cha
        this.studentId = studentId;
        System.out.println("Student constructor with age, name, and studentId");
    }
}

public class Entry {
    public static void main(String[] args) {
        // Tạo đối tượng Student sử dụng các hàm khởi tạo khác nhau
        Student s1 = new Student();  // Gọi hàm khởi tạo mặc định của lớp Student
        Student s2 = new Student(20);  // Gọi hàm khởi tạo với một tham số của lớp Student
        Student s3 = new Student(22, "Alice", 12345);  // Gọi hàm khởi tạo với ba tham số của lớp Student
    }
}
