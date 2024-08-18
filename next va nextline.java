import java.util.Scanner;
// next se ngan cach chuoi nhap vao boi dau cach
// vd mot hai 3. se hien thi mot,hai,3
public class HelloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    String name2 = sc.next();
    int age = sc.nextInt();  // chuyen ve int
    System.err.println(name);
    System.err.println(name2);
    System.err.println(age);
  }
}
// nextLine() se hien thi ca khoang trang
// vd le vu. se hien thi le vu
public class HelloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String fullname = sc.nextLine();
    System.out.println(fullname);
  }
}
