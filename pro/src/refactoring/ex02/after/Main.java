package refactoring.ex02.after;

public class Main {

	public static void main(String[] args) {
		PuppyRobot max = new PuppyRobot("Max");
		max.order(PuppyRobot.eat);
		max.order(PuppyRobot.stop);
		max.order(PuppyRobot.jump);
	}

}
