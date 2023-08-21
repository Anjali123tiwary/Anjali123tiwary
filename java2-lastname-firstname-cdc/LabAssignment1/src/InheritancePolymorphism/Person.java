package InheritancePolymorphism;

public class Person {
	 String name;
	 int age;
	 String address;
	 int employeeId;
	 double salary;
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
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
	
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("Anjali");
		obj.setAge(21);
		obj.setAddress("Madipakkam");
		obj.setEmployeeId(1);
		obj.setSalary(2000);
		System.out.println("EmployeeId:"+obj.getEmployeeId()+", Name:"+obj.getName()+", Adress:"+obj.getAddress()+", Salary:"+obj.getSalary());
	}
}
class Employee extends Person{
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
