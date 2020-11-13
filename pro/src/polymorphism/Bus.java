package polymorphism;

public class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 움직여요");
	}

	@Override
	public void stop() {
		System.out.println("버스가 멈췄어요");
	}
}
