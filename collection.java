import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
public class collection {
	public static class Employee{
		String name;
		int age;
		String desg;
		int salary;
		Employee(String name, int age,String desg,int salary){
			this.name=name;
			this.age=age;
			this.desg=desg;
			this.salary=salary;
			
		}
	}

	public static void main(String[] args) {
		Map<Integer,Employee> person=new TreeMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the total entry of employee: ");
		int total=sc.nextInt();
		System.out.println("enter name,age,designation,salary:");
		for(int i=0;i<total;i++) {
			person.put(i, new Employee("anjali" ,23,"software engineer", 100));
		}
		System.out.println(person);
	}

}
