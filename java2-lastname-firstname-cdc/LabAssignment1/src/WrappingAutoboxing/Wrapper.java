package WrappingAutoboxing;

public class Wrapper {

	public static void main(String[] args) {
		int num=2;
		float num2=8.9f;
		boolean value=true;
//		Autoboxing(primitive to object)
		Integer a=new Integer(num);                
		Float f=new Float(8.9f);
		Boolean b=new Boolean(true);
		System.out.println("-----Autoboxing-----");
		System.out.println(a);
		System.out.println(f);
		System.out.println(b);
		
//		unboxing(object to primitive)
		System.out.println("-----unboxing-----");
		int Number=a.intValue();
		float flo=f.floatValue();
		System.out.println(Number);
		System.out.println(flo);
//		auto-unboxing( here Unboxing is happening automatically)
		int Number2=a;
		
	}

}
