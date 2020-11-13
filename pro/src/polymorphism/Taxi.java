package polymorphism;

public class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 움직여요");
	}
	@Override
	public void stop() {
		System.out.println("택시가 멈췄어요");
	}

}
