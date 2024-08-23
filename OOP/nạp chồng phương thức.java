// Nếu một lớp có nhiều phương thức cùng tên nhưng khác nhau về kiểu dữ liệu hoặc số các tham số, thì đó là nạp chồng phương thức.
// Ví dụ bạn có thể tạo ra 2 hàm add để tính tổng số nguyên và số thực như sau:

class Math {
	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
}

class Entry {
	public static void main(String[] args) {
		System.out.println(Math.add(2, 4));
		System.out.println(Math.add(3.5, 4.3));
	}
}
