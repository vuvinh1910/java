package levinh;
import java.text.*;
import java.util.*;
import java.time.*;

class Pair <U,V> { // định nghĩa kiểu dữ liệu U,V chưa biết là Integer hay String.....
    private U first;  // gán first và second với kiểu dữ liệu chưa xác định U,V
    private V second;
    public Pair(U first, V second){
        this.first = first;
        this.second = second;
    }
    public boolean Prime(int a){
        if(a<=1) return false;
        if(a<=3) return true;
        if(a%2==0 || a%3==0) return false;
        int i = 5;
        while (i*i<=a) {
            if(a%i==0 || a%(i+2)==0){
                return false;
            }
            i+=6;
        }
        return true;
    }
    // ghi đè toString để in theo ý
    public String toString(){
        return this.first + " " + this.second;
    }
    
    public boolean isPrime(){
        if (first instanceof Integer && second instanceof Integer) { // xác định xem U,V có phải chuyển thành dạng Integer đc hay không
            int firstInt = (Integer) first;
            int secondInt = (Integer) second;
            return Prime(firstInt) && Prime(secondInt);
        }
        // hoặc
        if(Prime((Integer) this.first) && Prime((Integer) this.second)) return true; // chuyển U,V về dạng Integer 
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p); // trong method print thì sẽ gọi phương thức toString để in ra
                    check = true;          // nếu muốn in p thì ta phải ghi đè toString bằng cách tạo thêm method toString trong class Pair.
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
