class Student {
	String name;
	public Student() {} // cái này sẽ cho phép ta khai báo Student không tham số

	public Student(String ten) {
		this.name = ten;
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student(); // se bi loi vi phuong thuc khoi tao yeu cau truyen vao String
		// dung se la : new_Student("vinh");
		// de khac phuc loi khi khai bao new_Student() voi tham so rỗng trong class
		// ta khai báo trong class Student 1 hàm phương thức khởi tạo không có tham số truyền vào.

	}
}
