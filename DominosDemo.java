package Practise;


public class DominosDemo {
	public static void main(String[] args) {
		GokulDominos dominosPizza=new GokulDominos();
		
		dominosPizza.sellPizza();
	}
}
abstract class Pizza {
	final public void pizzaShape() {
		System.out.println("pizza shape should be circle Fixed Standard......");
	}
	final public void useWheat() {
		System.out.println("pizza is created using wheat IR65 Fixed Standard...");
	}
	public abstract void makePizza();
}
abstract class Dominos extends Pizza{
	
	@Override
	final public void makePizza() {//template method...
		pizzaShape();
		useWheat();
		bakingPizza();
		addIngredients();
		packing();
	}
	final public void packing() {
		System.out.println("dominos standard of packing....");
	}
	final public void bakingPizza() {
		System.out.println("baking pizza as per dominos...");
	}
	final public void addIngredients() {
		System.out.println("adding ingredients as per dominos....");
	}
	final public void doAdvertisement() {
		System.out.println("advertise as per dominos...");
	}
	public abstract void sellPizza();
	public abstract void deliverPizza();
	
	final public void doPizzaBusiness() {//template method
		makePizza();
		doAdvertisement();
		deliverPizza();
	}	
}
class GokulDominos extends Dominos{
	@Override
	public void deliverPizza() {
		System.out.println("delivery as per gokul standards....");
	}
	@Override
	public void sellPizza() {
		doPizzaBusiness();
		System.out.println("gokul will collect money in rupees...");		
	}
}