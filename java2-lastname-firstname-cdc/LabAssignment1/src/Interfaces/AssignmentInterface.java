package Interfaces;

public class AssignmentInterface {
	
	public static void main(String[] args) {
		Guitar gui=new Guitar();
		gui.play();
		Piano pia=new Piano();
		pia.play();

	}

}
interface Playable1{
	abstract void play();
}
class Guitar implements Playable1{
	public void play() {
		System.out.println("I am using guitar");
	}
}

class Piano implements Playable1{
	public void  play() {
		System.out.println("I am using Piano");
	}
}