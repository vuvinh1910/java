// Cho N xâu S[1], S[2], …, S[N] có độ dài bằng nhau. Mỗi bước, với xâu T, bạn được phép xoay vòng 1 kí tự, tức lấy kí tự đầu tiên của T rồi chuyển xuống cuối. Ví dụ xâu “cool” sẽ chuyển thành “oolc”.

// Bạn cần phải xoay N xâu sao cho tất cả chúng đều giống nhau. Hãy xác định số bước ít nhất để hoàn thành được công việc này?

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test15 {
    private static int rotate(String target,String source) {
        for(int i=0;i<source.length();i++) {
            if(source.equals(target)) return i;
            source = source.substring(1)+source.charAt(0);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> s = new ArrayList<String>();
        while(t-->0) {
            s.add(sc.next());
        }
        int min = Integer.MAX_VALUE;
        for(String ss : s) {
            int sum = 0;
            for(String sss : s) {
                if(rotate(ss,sss)!=-1) {
                    sum += rotate(ss,sss);
                } else {
                    min = -1;
                    break;
                }
            }
            if(min==-1) break;
            if(min>sum) min = sum;
        }
        if(min==-1) System.out.println("-1");
        else System.out.println(min);
    }
}
