// Bắt đầu tìm từ một vị trí nhất định
int index = str.indexOf(char, fromIndex);
int index = str.indexOf(String, fromIndex);

List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "B"));

int index = list.indexOf("B"); // Trả về 1 vì "B" xuất hiện đầu tiên tại chỉ số 1
int notFoundIndex = list.indexOf("D"); // Trả về -1 vì "D" không có trong danh sách

boolean exists = list.contains("B"); // Trả về true vì "B" có trong danh sách
boolean notExists = list.contains("D"); // Trả về false vì "D" không có trong danh sách

String s = "Hello, Java!";

// Tìm vị trí của ký tự 'o'
System.out.println(s.indexOf('o')); // Output: 4

// Tìm vị trí của chuỗi "Java"
System.out.println(s.indexOf("Java")); // Output: 7

// Tìm vị trí của 'o' bắt đầu từ vị trí 5
System.out.println(s.indexOf('o', 5)); // Output: -1 (Không tìm thấy)
