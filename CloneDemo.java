package Practise;
public class CloneDemo {
	public static void main(String[] args)throws Exception {
		//MULTITON - Resources are unique and properties are also unique..
		/*Sheep mothersheep=new Sheep();
		 *mothersheep.name="iam the mother sheep...";
		Sheep dolly=new Sheep();
		dolly.name="iam the dolly...";
		
		System.out.println(mothersheep.name);
		System.out.println(dolly.name);
		 */
		//SINGLETON - Resources are shared and propoerties are also shared
		/*Sheep mothersheep=new Sheep();
		mothersheep.name="iam the mother sheep...";
		Sheep dolly=mothersheep;
		dolly.name="iam the dolly...";
		
		System.out.println(mothersheep.name);
		System.out.println(dolly.name);
		*/
		//CLONING - Resources are shared but properties are unique
		Sheep mothersheep=new Sheep();
		Sheep dolly=(Sheep)mothersheep.createClone();
		mothersheep.name="iam the mother sheep...";
		dolly.name="iam the dolly...";
		
		System.out.println(mothersheep.name);
		System.out.println(dolly.name);
	}
}
class Sheep implements Cloneable{
	String name;
	public Sheep() {
		System.out.println("sheep object created...");
	}
	public Object createClone()throws Exception {
		return super.clone();
	}
}
