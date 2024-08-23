class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // phương thức ghi đè phải cùng tên,cùng kiểu,cùng tham số, lớp kế thừa có phạm vi truy cập bằng hoặc rộng hơn lớp cha 
    // vd: private -> default -> protected -> public
    protected void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Gọi phương thức ghi đè
    }
}
