// Lớp cha
public class Parent {
    public int publicValue = 1;
    protected int protectedValue = 2;
    private int privateValue = 3;
}

// Lớp con kế thừa lớp cha
public class Child extends Parent {
    public int cc;
    public void displayValues() {
        System.out.println("Public: " + publicValue); // Có thể truy cập
        System.out.println("Protected: " + protectedValue); // Có thể truy cập
        // System.out.println("Private: " + privateValue); // Không thể truy cập
    }
}
// lớp con có thể dùng các biến hoặc phương thức public ,protected từ lớp cha
public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.cc = 0;
        child.publicValue = 0;  
        child.displayValues();
    }
}
