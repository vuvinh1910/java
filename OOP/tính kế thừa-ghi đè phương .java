class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // phương thức ghi đè phải cùng tên,cùng kiểu,cùng quyền truy cập,cùng tham số
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound();  // Gọi phương thức ghi đè
    }
}
