class Counter{
	// Khai báo biến static có tên là count
	public static int count;
}
class Entry {
	public static void main(String[] args) {
		Counter.count = 10; // có thể truy cập biến static của class mà không cần khai báo lớp con class ( new Counter() ).
	}
}

class Counter {
	static int count;
  // biến static còn có đặc điểm nữa là biến static được chia sẻ bởi tất cả các đối tượng trong chương trình
  // (giá trị của biến static là giống nhau ở tất cả các đối tượng)
	public Counter() {
		count++;
		System.out.println(count);
	}

  // static method cũng có thể truy cập trực tiếp qua tên lớp mà ko cần tạo đối tượng lớp đó.
  static int sumof(int a, int b) {
    return a + b;
  }
}

class Entry {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
    
    // static cho phép bạn sử dụng các thành viên của lớp (như biến và phương thức) "mà không cần tạo đối tượng của lớp đó", 
    // điều này có nghĩa là bạn có thể truy cập các thành viên đó trực tiếp thông qua tên lớp, thay vì phải tạo một đối tượng cụ thể từ lớp đó
    int sum = Counter.sumof(12,15); // truy cập method sumof trong Counter mà ko cần tạo đối tượng.
	}
}
