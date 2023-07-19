package basic;

public class Factory {

	public static void main(String[] args) {
		

	}

}
 abstract class ShoeFactory{
	abstract void makeShoe();
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
		
	}@Override
	void makeShoe() {
		// TODO Auto-generated method stub
		
	}
}
