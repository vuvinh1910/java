class Entry {
	int x = 10;
	public static void main(String[] args) {
		System.out.println(x);
	}
}
// phương thức static sẽ chỉ có thể truy xuất được tới biến static, do đó kết quả sẽ là Lỗi biên dịch 
// (do phương thức main là phương thức static mà biến x không phải là biến static nên không thể gọi tới biến x từ phương thức main)
// nên code sẽ chạy lỗi.
