// Lớp trừu tượng, là lớp định nghĩa cha nhưng không thể khai báo trực tiếp, giúp giấu các thành phần lớp trừu tượng
abstract class Animal {
    // Phương thức trừu tượng (không có cài đặt)
    abstract void makeSound();

    // Phương thức cụ thể
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Lớp con cụ thể kế thừa lớp trừu tượng
class Dog extends Animal {
    // Cung cấp cài đặt cho phương thức trừu tượng
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Lớp con cụ thể kế thừa lớp trừu tượng
class Cat extends Animal {
    // Cung cấp cài đặt cho phương thức trừu tượng
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Không thể tạo đối tượng trực tiếp từ lớp Animal
        // Animal myAnimal = new Animal(); // Lỗi

        // Tạo đối tượng từ lớp con cụ thể
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Woof! Woof!
        myDog.sleep();     // Output: This animal is sleeping.

        myCat.makeSound(); // Output: Meow! Meow!
        myCat.sleep();     // Output: This animal is sleeping.
    }
}
