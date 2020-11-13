package testFeedback;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
//딱 한번만 검색할 수 있음 -set버전 - 한번이상 검색하면 검색이안됩니다.. 검색될수있는 방법을 못찾겠어요 ㅠㅠ
//comment :  set을 ArrayList로 변경시킬 수 있는 방법도 있어요
//comment :  예) ArrayList	list = new ArrayList(set);
public class StudentManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<StudentDTO> set = new HashSet<StudentDTO>();//set에 StudentDTO 객체를 담는다
		
		System.out.println("4명의 학생이름, 학과, 학번, 학점평균 형식으로 입력하세요.");
		
		for(int i=1; i<5; i++) {
			System.out.print("학생"+i+">>");
			String std = sc.nextLine();  //학생이름,학과,학번,학점평균을 입력받는다
			//res = std.split(","); 
			//comment : 	split(String regex)의 리턴유형은 String[]입니다
			//comment : 	각 메소드의 리턴타입과  매개변수타입을 잘 보면서 작성하세요
			StringTokenizer stk = new StringTokenizer(std,",");
			set.add(new StudentDTO(stk.nextToken(),stk.nextToken(),
					stk.nextToken(),Double.parseDouble(stk.nextToken())));
			}		
		for(Object temp : set) {//학생정보 입력 후 결과화면
				System.out.println("----------------------");
				System.out.println(temp);
				System.out.println("----------------------");
			 }
			Iterator<StudentDTO> iter = set.iterator();
			//iterator에 제네릭을줘서 StudentDTO만 꺼내옴
		while(true) {
			System.out.print("학생 이름>>");
			String name = sc.nextLine();//학생이름 변수에 저장 = 학생이름 입력받기 	
				while(iter.hasNext()) { //경우의수를 다 돌려보려고 하는 while문
					StudentDTO stdo=iter.next(); //제네릭을 줘서 강제형변환안해줘도됨 
					//StudentDTO stdo=(StudentDTO)iter.next(); ->제네릭을 안줬을때의 강제형변환
					String name1=stdo.getName();
				  if(name.equals(name1)) {	//이름과 리스트에 저장된 이름이 일치하는지확인
						System.out.println(stdo.getName()+","+
						stdo.getDepartment()+","+
						stdo.getId()+","+
						stdo.getGrade()
							);
						}//if 
			}
		}//while
	}//main
}//StudentManager
