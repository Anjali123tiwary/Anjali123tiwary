package ConstructorOverloading;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name) {
		this.name = name;
	}

	public Person(int age, String address) {
		this.age = age;
		this.address = address;
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Person obj1=new Person("Anjali");
		Person obj2=new Person(21,"Madipakkam");
		Person obj3=new Person("Malhar",25,"Ramnagar");
		System.out.println("Name:"+obj1.getName());
		System.out.println("Age:"+obj2.getAge()+", Adress:"+obj2.getAddress());
		System.out.println("Name:"+obj3.getName()+" ,Age:"+obj3.getAge()+" ,Address:"+obj3.getAddress());
	}

	


}
