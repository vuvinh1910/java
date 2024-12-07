import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long temp = 0;
            for (int i = 2; (long) i *i <= n; i++) {
                if(n % i == 0) {
                    while(n % i == 0) {
                        n=n/i;
                    }
                    temp=i;
                }
            }
            if(n>1) temp=n;
            System.out.println(temp);
        }
    }
}
