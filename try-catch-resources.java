// Đây là một tính năng được giới thiệu từ Java 7, nhằm đơn giản hóa quá trình làm việc với các tài nguyên (resources) như file,
// kết nối cơ sở dữ liệu, hoặc bất kỳ đối tượng nào thực hiện giao diện AutoCloseable. Tính năng này đảm bảo rằng các tài nguyên được đóng một cách chính xác,
// ngay cả khi có ngoại lệ xảy ra trong quá trình sử dụng.

// Tại sao cần Try-with-Resources?
// Tránh rò rỉ tài nguyên: Nếu không đóng các tài nguyên một cách cẩn thận, chúng có thể vẫn mở, dẫn đến tình trạng cạn kiệt tài nguyên hệ thống và gây ra các vấn đề về hiệu suất.
// Mã code gọn gàng hơn: So với cách làm truyền thống sử dụng finally block, try-with-resources giúp loại bỏ khối finally và làm cho code dễ đọc, dễ bảo trì hơn.

try (FileInputStream fis = new FileInputStream("input.txt");
     FileOutputStream fos = new FileOutputStream("output.txt")) {
    // Code để đọc từ fis và ghi vào fos
} catch (IOException e) {
    e.printStackTrace();
}
