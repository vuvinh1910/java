package levinh;
import java.text.*;
import java.util.*;
import java.time.*;;
// SimpleDateFormat.parse nên sử dụng try-catch.
// SimpleDateFormat.parse(String) chuyển String sang Date
// SimpleDateFormat.format(Date) chuyển Date sang String
public class Main {
    public static void main(String[] args) {
        String a = "2/2/2222";
        String b = "16:30:00";
        String c = "2/2/2222 15:00:00";
        try {
            SimpleDateFormat temp = new SimpleDateFormat("dd/MM/yyyy"); // định dạng của ngày tháng năm được truyền vào trong lớp SimpleDateFormat.
            Date date = temp.parse(a); // khai báo lớp Date sau đó từ temp đọc String a rồi dán vào date.
            String In = temp.format(date); // khai báo String sau đó định dạng biến date thành kiểu đd/MM/yyyy từ temp rồi cho vào String.
            System.out.println(In); // in ra đúng chuẩn định dạng: 02/02/2222 mặc dù ban đầu là 2/2/2222.

            SimpleDateFormat temp2 = new SimpleDateFormat("HH:mm:ss"); // định dạng giờ phút giây của lớp SimpleDateFormat.(HH là 24h, hh là 12h).
            Date date2 = temp2.parse(b); // temp2 đọc tgian từ b rồi gán vào date2
            String In2 = temp2.format(date2); // chuyển date về string.
            System.out.println(In2); // in ra 16:30:00

            SimpleDateFormat temp3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date3 = temp3.parse(c);
            String In3 = temp3.format(date3);
            System.out.println(In3); // in ra 02/02/2222 15:00:00

            // khoảng cách thời gian giữa 2 biến Date (tính theo s ):
            long KhoangThoiGian = Math.abs(date3.getTime() - date.getTime());
            System.out.println(KhoangThoiGian);
            // hoặc tính khoảng tgian bằng between trong Duration = cách chuyển Date về Instant.
            Instant ins1 = date.toInstant();
            Instant ins2 = date3.toInstant();
            Duration KhoangThoiGian2 = Duration.between(ins1, ins2);
            System.out.println(KhoangThoiGian2.toMinutes()); // có thể dùng method to+minutes,hours,seconds,Days để biến thành giờ, phút, giây, ngày...


            // so sánh 2 biến Date
            int comparison = date1.compareTo(date2);
            if (comparison < 0) {
                System.out.println("date1 is before date2");
            } else if (comparison > 0) {
                System.out.println("date1 is after date2");
            } else {
                System.out.println("date1 is equal to date2");
            }
        } catch (ParseException e) {
            // Xử lý ngoại lệ nếu không thể phân tích chuỗi thời gian
            System.out.println("Định dạng thời gian không hợp lệ.");
            e.printStackTrace();
        }
    }
}
