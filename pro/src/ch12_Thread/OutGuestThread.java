package ch12_Thread;

//손님 나가는 기능
public class OutGuestThread extends Thread {
	InOutEx io;
	public OutGuestThread(InOutEx io) {
		this.io =io;
	}
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			io.outGuest();
		}
	}
}
