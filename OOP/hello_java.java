import java.util.Scanner;

class Hcn {
    double dai,rong;
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        dai = sc.nextDouble();
        rong = sc.nextDouble();
        sc.close();
    } 

    public void In() {
        System.out.println("Area: "+(dai*rong));
        System.out.println("Perimeter: "+(dai*2+rong*2));
    }
}

public class test1 {
    public static void main(String[] args) {
        Hcn h1 = new Hcn();
        h1.Nhap();
        h1.In();
    }
}
