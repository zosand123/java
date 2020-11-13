package testFeedback;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//list 다이어그램적용 버전
public class StudentManager2 {

	public static void main(String[] args) {
		
		System.out.println("4명의 학생이름, 학과, 학번, 학점평균 형식으로 입력하세요.");
		StudentManager2 st2 = new StudentManager2();
		//static 메소드라서 static메소드 부르려면 객체생성해야됨
		//comment : 아닙니다!!!!! static 메소드라서 static메소드 부를 수 있으니
		//comment : 별도의 객체생성없이 클래스명.메서드명()으로 호출가능하고
		//comment : static메소드(정적메서드)가 아닌 인스턴스메소드는
		//comment : 인스턴스가 있어야 하니 객체를 생성해야 하는 것이지요.
		st2.run();
		
	}
	
	Scanner sc = new Scanner(System.in);
	List<StudentDTO> list = new ArrayList<StudentDTO>();//list에 StudentDTO 객체를 담는다

	//comment : 메서드의 역할을 주석으로 적어주세요
	public void run() {
		read();	//학생정보 받기
		printAll(); //받은 학생정보 프린트
		processQuery(); //검색한 학생정보를 출력
	}
	
	public void read(){
		for(int i=1; i<5; i++) {
			System.out.print("학생"+i+">>");
			String std = sc.nextLine();  //학생이름,학과,학번,학점평균을 입력받기
			//comment : StringTokenizer외에 String의 split()을 이용해보는 것도 생각해보세요
			//StringTokenizer stk = new StringTokenizer(std,",");
			String[] res = std.split(",");//","기준으로 4개 파라미터로 분할하여 객체 생성해 res에 넣는다
			list.add(new StudentDTO(res[0],res[1],res[2],Double.parseDouble(res[3]))) ;
		}
	}
	
	public void printAll() {
		for(int i=0; i<list.size(); i++) {//입력받은 학생정보 한꺼번에 출력
			System.out.println("------------------------");
			System.out.println(list.get(i));
			System.out.println("------------------------");
		}
	}

	//comment : 메서드마다 적절한 줄바꿈을 해주면 가독성이 좋아질듯
	public void processQuery() {
		while(true) {
			System.out.print("학생이름>>");
			String name = sc.next(); //입력받은 이름 name변수에 저장
			   for(int i=0; i<list.size(); i++) {
				   if(name.equals(list.get(i).getName())) {
					   System.out.println(list.get(i).getName()+", "
						+list.get(i).getDepartment()+", "+list.get(i).getId()+", "
						+list.get(i).getGrade()+", ");
				   }
			}
		}
	}
	//comment : 지금은 누구의 괄호인지 적어주었지만   나중에 최종적으로 소스를 배포할때는
	//comment : 그런 부분은 제거를 해주시는게 좋아요

}//StudentManager
