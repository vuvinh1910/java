class Student {
    private String name;
    // tham chieu bien
    public Student(String name) {
        this.name = name; // 'this.name' là biến instance, 'name' là tham số của phương thức
    }
    public void printName() {
        System.out.println("Name: " + this.name);
    }
  
    // goi phuong thuc
    public void printName() {
        System.out.println("Name: " + this.name);
    }
    public void display() {
        this.printName(); // Gọi phương thức printName() của lớp hiện tại
    }
}

