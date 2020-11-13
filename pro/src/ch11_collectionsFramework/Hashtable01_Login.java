package ch11_collectionsFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

//644p


//key:ID
//value:PW
//키보드 이용해서 id,비번 입력받아서 HashTable에 저장돼있는 key(ID)와 value(pw)와 비교한 후 로그인 여부 출력

public class Hashtable01_Login {

	public static void main(String[] args) {
		//1.Map생성
		Map<String,String> map = new Hashtable<String,String>();
		
		//2.객체저장 => DB의 테이블에 해당되는 부분
		map.put("Hong","111");//나중에 넣는 데이터가 덮어씀
		map.put("Ru","222");
		map.put("Yi","333");
		map.put("Jen","444"); //value는 중복허용 객체저장
		
		//키보드를 이용해서 내용입력받기
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("ID and Password required");
		System.out.print("ID:");
		String id = sc.nextLine();
		
		System.out.print("Password:");
		String pw = sc.nextLine();
		
		
		if(map.containsKey(id)){ //user가 입력한 id가 map에 key로 존재하는지 살펴본다
			//map.get(id);	 	//해당키값의 value(map에 저장된 비번)를 가져온다(DB데이터)
								//유저가 입력한 비번 = pw
			if(map.get(id).equals(pw)) {//2개를 비교해서 일치하면 로그인 성공
				System.out.println("로그인성공");
				break;
			}else {//그렇지않으면 로그인실패 : pw불일치 
				System.out.println("비밀번호가 일치하지않습니다.");
			}	
		}else {
			//로그인실패 : id존재하지않음 
			System.out.println("ID가 존재하지 않습니다.");
		}//if
	}//while
		
	}

}
