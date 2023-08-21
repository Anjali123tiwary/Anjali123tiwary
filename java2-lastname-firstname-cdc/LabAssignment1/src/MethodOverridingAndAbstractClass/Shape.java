package MethodOverridingAndAbstractClass;
import java.util.Scanner;
abstract class Shape {
	Scanner sc=new Scanner(System.in);
	abstract void calculateArea();
	public static void main(String args[]) {
	Rectangle rect=new Rectangle();
	rect.calculateArea();
	Circle cir=new Circle();
	cir.calculateArea();
	}
	
}

	class Rectangle extends Shape{
		void calculateArea() {
			System.out.print("enter the length of rectangle: ");
			int len=sc.nextInt();
			System.out.println("enter the width of rectangle: ");
			int wid=sc.nextInt();
			int Area=len*wid;
			System.out.println("Area of Rectangle: "+Area);
		}
	}
	class Circle extends Shape{
		double pi=3.14;
		void calculateArea() {
			System.out.println("Enter the radius of circle: ");
			double r=sc.nextDouble();
			double Area=pi*r*r;
			System.out.println("Area of circle: "+Area);
	}
}