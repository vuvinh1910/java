// Constructor (phương thức khởi tạo)
// Trong Java, constructor là một phương thức đặc biệt, phương thức này sẽ tự động được gọi khi bạn khởi tạo một đối tượng
// (với các phương thức thông thường thì bạn cần dùng toán tử "." để gọi tới). 
// Constructor có đặc điểm là không được định nghĩa kiểu trả về và có tên trùng với tên lớp. Xem ví dụ sau để hiểu rõ hơn:

class Student {
	// Phương thức khởi tạo của lớp Student
	public Student() {
		System.out.println("Constructor Called");
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s = new Student();
	}
}
