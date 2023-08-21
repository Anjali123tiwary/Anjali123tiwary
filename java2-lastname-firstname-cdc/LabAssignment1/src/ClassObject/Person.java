package ClassObject;
public class Person {
	private String name;
	private int age;
	private String address;
	
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
		Person obj=new Person();
		obj.setName("Anjali");
		obj.setAge(21);
		obj.setAddress("Madipakkam");
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Address: "+obj.getAddress());

	}

}
