package practice;
//연습문제281p
public class Excercise7_19 {
	public static void main(String[] args) {
		Buyer b =new Buyer();
		
		b.buy(new Tv());
	
	}

}
class Buyer2{
	int money = 1000;
	Product[] cart = new Product[3]; 
	Product p = new Product(500); 
	int i;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 "+(p.price-money)+" 만큼 부족합니다.");
			return;
		}
		money-=p.price;
		add(p);
	}
	void add(Product p) {
		if(i>=cart.length) {
			Product[] tmp = new Product[cart.length*2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++]=p;
	}//add(Product p)
	void summary2() {
		String itemList = "";
		int sum = 0;
		for(int i=0; i < cart.length;i++) {
		if(cart[i]==null)
		break;
		// 1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
		itemList += cart[i] + ",";
		// 1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
		sum += cart[i].price;
		}
		// 1.3 (money) . 물건을 사고 남은 금액 를 출력한다
		System.out.println("구입한 물건 :"+itemList); 
		System.out.println("사용한 금액 :"+sum); 
		System.out.println("남은 금액 :"+money); 
		} // summary()

}//Buyer
class Product2{
	int price;
	Product2(int price){
		this.price=price;
	}
}
class Tv2 extends Product{
	Tv2(){super(100);}
	public String toString() {return "Tv";}
}
class Computer2 extends Product{
	Computer2(){super(200);}
	public String toString() {return "Computer";}
}
class Speaker2 extends Product{
	Speaker2(){super(50);}
	public String toString() {return "Speaker";}
}
