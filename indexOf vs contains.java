List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "B"));

int index = list.indexOf("B"); // Trả về 1 vì "B" xuất hiện đầu tiên tại chỉ số 1
int notFoundIndex = list.indexOf("D"); // Trả về -1 vì "D" không có trong danh sách

boolean exists = list.contains("B"); // Trả về true vì "B" có trong danh sách
boolean notExists = list.contains("D"); // Trả về false vì "D" không có trong danh sách
