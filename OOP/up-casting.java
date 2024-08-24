// LớpCha obj = new LớpCon();
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

    public void makeSound() {
        System.out.println("Dog makes a sound"); // sẽ chuyển dữ liệu từ hàm con về hàm cha từ dog về animal
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

        // Up-casting
        Animal dog_up = new dog();

        // Gọi phương thức của lớp cha
        animal.makeSound(); // In ra: "Dog makes a sound"

        // Không thể gọi phương thức lớp con
        // animal.fetch(); // Lỗi biên dịch: phương thức fetch() không tồn tại trong lớp Animal

        // Không thể truy cập biến lớp con
        // System.out.println(animal.getBreed()); // Lỗi biên dịch: phương thức getBreed() không tồn tại trong lớp Animal
    }
}
