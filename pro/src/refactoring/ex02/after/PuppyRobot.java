package refactoring.ex02.after;

public class PuppyRobot {

	String name;
	static final int eat = 0;
	static final int stop = 1;
	static final int jump = 2;
	
	public PuppyRobot(String name) {
		this.name=name;
	}
	public void order(int order) {
		switch(order) {
			case eat : System.out.println(name+" eats."); break;
			case stop :	System.out.println(name+" stops."); break;
			case jump :	System.out.println(name+" jumps."); break;
		}
	}
}
