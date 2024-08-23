// Constructor (phương thức khởi tạo)
// Trong Java, constructor là một phương thức đặc biệt, phương thức này sẽ tự động được gọi khi bạn khởi tạo một đối tượng
// (với các phương thức thông thường thì bạn cần dùng toán tử "." để gọi tới). 
// Constructor có đặc điểm là không được định nghĩa kiểu trả về và có tên trùng với tên lớp. Xem ví dụ sau để hiểu rõ hơn:

class Student {
	private String name;
	// Phương thức khởi tạo của lớp Student , dùng public còn nếu dùng private sẽ sai
	public Student() {
		name = "vinh"
		System.out.println(name);
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s = new Student();
	}
}

// Nếu một lớp không được khai báo constructor thì chương trình sẽ tự động tạo ra một constructor mặc định. Ví dụ nếu bạn khai báo lớp Student giống như sau:
class Student {
	String name;
	int age;
}
// Thì chương trình sẽ tự động thêm vào một constructor mặc định (constructor rỗng) bên trong lớp Student:
class Student {
	String name;
	int age;

	public Student() {
	}
}
