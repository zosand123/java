package ch12_Thread;

/*좌석이 제한된 식당 
 * 식당에서 자리가 비면 손님을 다시 채우는 작업 구현
 * 식당이 만석인데 손님을 더 들이면 안됨
 * 만석일때 손님을 채우는 스레드를 wait()메서드를 호출해서 waiting pool에 대기시킴
 */

//손님이 들어오고 나가는 기능을 정의한 클래스를 사용하는 클래스
public class InOutEx {
	
	public static int MAX_GUEST = 5;//고객수
	int guestNum=0; //현재 고객수
	
	public synchronized void inGuest() {
		System.out.println("Guest입장");
		guestNum++;
		System.out.println("현재 손님수 : "+guestNum);
		if(guestNum==MAX_GUEST) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void outGuest() {
		if(guestNum<1) {
			notify(); //웨이팅풀에서 대기중인 쓰레드중 하나를 깨운다 
			return;
		}
		guestNum--;
		System.out.println("Guest퇴장");
		System.out.println("현재 손님수 : "+guestNum);
	}
	
	public static void main(String[] args) {
		InOutEx io = new InOutEx();
		InGuestThread igt = new InGuestThread(io);
		OutGuestThread ogt = new OutGuestThread(io);
		igt.start();
		ogt.start();
	}
}