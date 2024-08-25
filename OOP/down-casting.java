// Lớp cha
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Lớp con
class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }

    public String getBreed() {
        return breed;
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog)animal; // down casting
        dog.fetch();
    }
}
