import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            int number = dis.readInt(); // Đọc số nguyên
            float value = dis.readFloat(); // Đọc số thực
            boolean flag = dis.readBoolean(); // Đọc giá trị boolean

            System.out.println("Integer: " + number);
            System.out.println("Float: " + value);
            System.out.println("Boolean: " + flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
