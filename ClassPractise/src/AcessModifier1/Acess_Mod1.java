package AcessModifier1;

public class Acess_Mod1 {
	int num;
	private int number;
	protected int a;
	public int b;

	public void print() {
		System.out.println(num);
		System.out.println(number);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		AccessDemo h = new AccessDemo();
		h.modify();

	}

}

class AccessDemo extends Acess_Mod1 {
	void modify() {
		num = 4;
		System.out.println(num);
		System.out.println(number);
		System.out.println(a);
		System.out.println(b);

	}
}

class NonSubClassDemoAcess {
	public void met() {
		Acess_Mod1 a = new Acess_Mod1();
		System.out.println(a.num);
		System.out.println(a.number);
		System.out.println(a.a);
		System.out.println(a.b);
	}
}