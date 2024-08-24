// %d: Số nguyên (int, long, short, byte).
// %f: Số thực (float, double).
// %s: Chuỗi (String).
// %c: Ký tự (char).

int num1 = 10;
double num2 = 12.3456789;

// Kết hợp toán tử + và chuỗi định dạng
// Sử dụng String.format để tạo chuỗi rồi nối chuỗi với nhau
String result = "Integer: " + num1 + ", Float: +" + String.format("%.2f", num2);
System.out.println(result);
