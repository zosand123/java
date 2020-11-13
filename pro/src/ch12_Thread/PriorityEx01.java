package ch12_Thread;

public class PriorityEx01 {

	public static void main(String[] args) {
		MinThread mnt = new MinThread("덜 중요한거");
		MaxThread mxt = new MaxThread("       매우~~~ 중요한거");
		
		//스레드에 우선순위 지정
		mxt.setPriority(Thread.MAX_PRIORITY);
		mnt.setPriority(Thread.MIN_PRIORITY);
		mnt.start();
		mxt.start();
		
		System.out.println("메인스레드의 끝");
	}

}
//덜 중요한 클래스라고 가정
class MinThread extends Thread{
	public MinThread(String name) {super(name);}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(currentThread().getName()+i);
		}
	}
}
//더 중요한 클래스라고 가정
class MaxThread extends Thread{
	public MaxThread(String name) {super(name);}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(currentThread().getName()+i);
		}
	}
}