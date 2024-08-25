List<String> list; // khai báo đơn.

List<String> list = new ArrayList<String>();

List<String> list = new ArrayList<>(); // Ở đây, bạn có thể bỏ qua phần String bên trong dấu ngoặc nhọn của ArrayList,
//và trình biên dịch sẽ tự động suy ra kiểu dữ liệu dựa trên kiểu của biến list ở phía bên trái

// truy cập phần tử thứ i trong list:
String temp = list.get(i);

// thêm phần tử vào list:
list.add("Apple"); // Thêm vào cuối danh sách
list.add(0, "Orange"); // Thêm vào đầu danh sách
list.add(2, "C"); // Thêm phần tử "C" vào vị trí chỉ số 2


String element = list.get(0); // Lấy phần tử đầu tiên
list.remove(1); // Xóa phần tử tại vị trí thứ 1
int size = list.size(); // Kích thước danh sách
list.clear(); // Xóa tất cả phần tử
boolean contains = list.contains("Element 1"); //contains(Object o): Kiểm tra xem danh sách có chứa một phần tử cụ thể hay không.

