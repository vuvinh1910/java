BigInteger a = new BigInteger("1000000000000000000000");
BigInteger b = new BigInteger("2000000000000000000000");

// Cộng
BigInteger sum = a.add(b);
System.out.println("Tổng: " + sum);

// Trừ
BigInteger difference = a.subtract(b);
System.out.println("Hiệu: " + difference);

// Nhân
BigInteger product = a.multiply(b);
System.out.println("Tích: " + product);

// Lấy giá trị tuyệt đối
BigInteger absPositive = a.abs();
BigInteger absNegative = b.abs();

// Chia
BigInteger quotient = a.divide(b);
System.out.println("Thương: " + quotient);

BigInteger c = new BigInteger("9876543210");

// Modulo
BigInteger mod = c.mod(new BigInteger("100000"));
System.out.println("Modulo: " + mod);

// Lũy thừa
BigInteger power = c.pow(2);
System.out.println("Lũy thừa: " + power);

BigInteger x = new BigInteger("100");
BigInteger y = new BigInteger("200");

// So sánh
int comparison = x.compareTo(y);
if (comparison < 0) {
    System.out.println("x nhỏ hơn y");
} else if (comparison > 0) {
    System.out.println("x lớn hơn y");
} else {
    System.out.println("x bằng y");
}

// Kiểm tra bằng nhau
boolean isEqual = x.equals(y);
System.out.println("x và y có bằng nhau không? " + isEqual);

// Kiểm tra dấu
int sign = x.signum();
System.out.println("Dấu của x: " + (sign == 0 ? "Zero" : (sign > 0 ? "Positive" : "Negative")));
