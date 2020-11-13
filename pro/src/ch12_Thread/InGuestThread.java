package ch12_Thread;
//손님이 들어오는 기능
public class InGuestThread extends Thread {
	InOutEx io;
	public InGuestThread(InOutEx io) {
		this.io =io;
	}
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			io.inGuest();
		}
	}
}