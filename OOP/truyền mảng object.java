class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

class Arr {
	public void In(Person[] obj) {
		for (Person x : obj) {
			System.out.println(x.getName() + " " + x.getAge());
		}
	}
}

public class DoIt {
	public static void main(String[] args) {
		Person[] nguoi = new Person[3];
		nguoi[0] = new Person("vinh", 19);
		nguoi[1] = new Person("ving", 18);
		nguoi[2] = new Person("vinhh", 17);
		Arr test = new Arr();
		test.In(nguoi);
	}
}
