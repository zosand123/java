package test;

public class MemberService {
	
	boolean login(String id, String pw){
		if(id=="hong"&& pw=="12345") {
			System.out.println("로그인 되었습니다.");
			return true;
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
			return false;
		}
	}
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}
