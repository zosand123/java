package ch12_Thread;

//동기화코드-열차예매시스템 
//=> 잔여 좌석은 1개인데 여러 스레드에서 동시에 메소드에 접근해서 예매처리가 된다
// 	  이런경우 작업을 처리할 때 한 스레드가 메소드에 접근해서 예매작업을 실행할때에는
// 	  다른 스레드에서는 해당 메서드에 접근할 수 없게 처리하는 작업이 필요
// 	   ==> 이런작업을 동기화작업(Synchronized)이라고 한다.
public class SynchronizedEx01 {

	public static void main(String[] args) {
		Ticket01 tk = new Ticket01();
		Thread tr1 = new Thread(tk,"Beth");
		Thread tr2 = new Thread(tk,"Harmon");
		tr1.start();
		tr2.start();
	}

}
//예매작업
class Ticket01 implements Runnable{
	
	int ticketNum = 10;//잔여좌석수
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(10);
				getTicket();//티켓구매함수호출
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//run
	
	//티켓구매함수
	public synchronized void getTicket() {
		ticketNum-=1;
		String tcg = Thread.currentThread().getName();
		if(ticketNum<=0) {
			System.out.println(tcg+"고객님, 잔여좌석이 없습니다.");
			return;
		}
		System.out.println(tcg+"님이 구매하여 현재 잔여좌석수는 : "+ticketNum);
	}
}