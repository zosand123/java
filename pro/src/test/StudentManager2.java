package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

//list 다이어그램적용 버전
public class StudentManager2 {

	public static void main(String[] args) {
		
		System.out.println("4명의 학생이름, 학과, 학번, 학점평균 형식으로 입력하세요.");
		StudentManager2 st2 = new StudentManager2();//static 메소드라서 static메소드 부르려면 객체생성해야됨
		st2.run();
		
	}//main
	
	Scanner sc = new Scanner(System.in);
	List<StudentDTO> list = new ArrayList<StudentDTO>();//set에 StudentDTO 객체를 담는다
	public void run() {
		read();
		printAll();
		processQuery();
	}
	public void read(){
		for(int i=1; i<5; i++) {
			System.out.print("학생"+i+">>");
			String std = sc.nextLine();  //학생이름,학과,학번,학점평균을 입력받기
			StringTokenizer stk = new StringTokenizer(std,",");
			list.add(new StudentDTO(stk.nextToken(),stk.nextToken(),stk.nextToken(),
							Double.parseDouble(stk.nextToken())));
		}//for
	}//read
	public void printAll() {
		for(int i=0; i<list.size(); i++) {//입력받은 학생정보 한꺼번에 출력
			System.out.println("------------------------");
			System.out.println(list.get(i));
			System.out.println("------------------------");
		}//while
	}//printAll
	public void processQuery() {
		while(true) {
			System.out.print("학생이름>>");
			String name = sc.next(); //입력받은 이름 name변수에 저장
			   for(int i=0; i<list.size(); i++) {
				   if(name.equals(list.get(i).getName())) {
					   System.out.println(list.get(i).getName()+", "
						+list.get(i).getDepartment()+", "+list.get(i).getId()+", "
						+list.get(i).getGrade()+", ");
				   }//if
			}//for
		}//while
	}//run
}//StudentManager
