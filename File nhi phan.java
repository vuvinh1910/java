import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        File file = new File("DATA.IN");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
          while (dis.available() > 0) { // Kiểm tra xem còn dữ liệu để đọc không
              int number = dis.readInt(); // Đọc một số nguyên từ file
              System.out.println(number);
          }
        
          while (dis.available() > 0) { // // Kiểm tra xem còn dữ liệu để đọc không
                String str = dis.readUTF(); // Đọc một chuỗi từ file
                System.out.println(str);
            }
        } catch (Exception e) {
            
        }

      try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(123); // Ghi một số nguyên vào file
            dos.writeInt(456); // Ghi thêm một số nguyên khác
            dos.writeUTF("Hello, World!"); // Ghi một chuỗi vào file
            dos.writeUTF("Another String"); // Ghi thêm một chuỗi khác
        } catch (Exception e) {
          
        }
    }
}
