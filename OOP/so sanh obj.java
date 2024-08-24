// nếu dùng equals 2 đối tượng thì sẽ luôn là false vi có 2 địa chỉ trỏ đến khác nhau
class Student {
	public int id;
	public String name;
	public String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// ta so sánh dựa trên tiêu chí id của sinh viên, ko nên dùng equals
	public boolean equals(Object obj) {
		return this.id == ((Student) obj).id;
	}
	// hoặc có thể dùng :
	public boolean equals(Student obj) {
		return this.id == obj.id;
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "Viet", "Bac Ninh");
		Student s2 = new Student(1000, "Viet", "Bac Ninh");
		System.out.println(s1.equals(s2));
	}
}
