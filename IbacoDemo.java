package Practise;
public class IbacoDemo {
	public static void main(String[] args) {
		IbacoIceCream myiceCream=new Vanila(new StrawBerry(new Choclate(new Cherries(new Vanila()))));
		System.out.println("Cost Of IceCream..:"+myiceCream.cost());
		IbacoIceCream myiceCream1=new StrawBerry(new Choclate());
		System.out.println(myiceCream1.cost());
		
	}
}
abstract class IbacoIceCream{
	public abstract int cost();
}
abstract class Cream extends IbacoIceCream{
	
}
abstract class Topings extends IbacoIceCream{
	
}
class Vanila extends Cream{
	IbacoIceCream ic;
	public Vanila() {
		// TODO Auto-generated constructor stub
	}
	public Vanila(IbacoIceCream ic) {
		this.ic=ic;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(ic!=null) {
			return 10 + ic.cost();
		}
		else {
			return 10;
		}
	}
}
class StrawBerry extends Cream{
	public StrawBerry() {
		// TODO Auto-generated constructor stub
	}
	IbacoIceCream c;
	public StrawBerry(IbacoIceCream c) {
		this.c=c;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(c!=null) {
			return 20 + c.cost();
		}
		else {
			return 20;
		}
	}
}
class Cherries extends Topings{
	public Cherries() {
		// TODO Auto-generated constructor stub
	}
	IbacoIceCream ic;
	public Cherries(IbacoIceCream ic) {
		this.ic=ic;
	}
	@Override
	public int cost() {
		if(ic!=null) {
			return 5+ic.cost();
		}
		else {
			return 5;
		}
	}
}
class Choclate extends Topings{
	public Choclate() {
		// TODO Auto-generated constructor stub
	}
	IbacoIceCream ic;
	public Choclate(IbacoIceCream ic) {
		this.ic=ic;
	}
	@Override
	public int cost() {
		if(ic!=null) {
			return 10+ic.cost();
		}
		else {
			return 10;
		}
	}
}
