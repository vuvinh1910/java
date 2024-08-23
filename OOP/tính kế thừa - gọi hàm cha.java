class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat();  // Gọi phương thức eat() của lớp cha
        System.out.println("The dog eats dog food.");
    }
}
