package StaticMemberMethod;

public class Person {
	 String name;
	 int age;
	 String address;
	 int employeeId;
	 double salary;
	 static int count;
	 
		public Person(String name, int age, String address, int employeeId, double salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.employeeId = employeeId;
		this.salary = salary;
		count++;
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
	public static void count(){
		System.out.println("Total count of obj creation: "+count);
	}
	public static void main(String[] args) {
		Person obj=new Person("Anjali",21,"Madipakkam",1,299);
		Person obj1=new Person("Dipti",22,"Ramnagar",2,100);
		Person obj2=new Person("Haya",21,"Delhi",3,700);
		Person obj3=new Person("kumari",21,"Gaya",4,500);
		count();
	}

}
