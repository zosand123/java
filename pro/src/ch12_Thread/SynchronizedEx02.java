package ch12_Thread;

//동기화작업x
public class SynchronizedEx02 {

	public static void main(String[] args) {
		Ticket02 tk = new Ticket02();
		Thread tr1 = new Thread(tk,"Beth");
		Thread tr2 = new Thread(tk,"Harmon");
		tr1.start();
		tr2.start();
	}

}
//예매작업
class Ticket02 implements Runnable{
	
	int ticketNum = 10;//잔여좌석수
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(10);
				getTicket();//티켓구매함수호출
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}//run
	
	//티켓구매함수
	public void getTicket() {
		ticketNum-=1;
		String tcg = Thread.currentThread().getName();
		if(ticketNum<=0) {
			System.out.println(tcg+"고객님, 잔여좌석이 없습니다.");
			return;
		}
		System.out.println(tcg+"님이 구매하여 현재 잔여좌석수는 : "+ticketNum);
	}
}