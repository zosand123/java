package refactoring.ex02.before;

public class PuppyRobot {

	String name;
	
	public PuppyRobot(String name) {
		this.name=name;
	}
	public void order(int x) {
		switch(x) {
			case 0: System.out.println(name+" eats."); break;
			case 1:	System.out.println(name+" stops."); break;
			case 2:	System.out.println(name+" jumps."); break;
		}
	}
}
