package basic;

public abstract class ShoeFactory {
	final public void  makeShoe() {
		System.out.println("This is process of making Shoes");
		
	}
	}
	abstract class ShoeShop extends ShoeFactory{
		abstract void sellShoe();
	}
	abstract class BataShoe extends ShoeFactory{
		
		
	}
	abstract class LakhaniShoe extends ShoeFactory{
		
	}
	abstract class Shoe{

	}
	class LeatherShoe extends Shoe{
		
	}
	class SportShoe extends Shoe{
		
	}
	class GokulShoeShop extends ShoeShop{
		@Override
		void sellShoe() {
			// TODO Auto-generated method stub
			
		}
}
