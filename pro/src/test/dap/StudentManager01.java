package test.dap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//DB 연동 없는 version
public class StudentManager01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		List<StudentDTO> list = new ArrayList<StudentDTO>();//list에 StudentDTO 객체를 담는다
		
		int n = 4;	//최초 학생수를 n에 부여한다
		int count = 0; //count 변수 사용하여 부여된 n값만큼 학생 데이터 입력을 받는다
		String[] res = new String[4]; //크기 4인 res배열을 생성한다
		System.out.printf("%d명의 학생이름,학과,학번,학점평균 형식으로 입력하세요.\n",n);
		while (count!=n) {
			System.out.print("학생"+(count+1)+">>");
			String str = scanner.nextLine(); //학생이름,학과,학번,학점평균을 입력받는다
			res = str.split(",");//","기준으로 4개 파라미터로 분할하여 객체 생성해 list에 넣는다
			list.add(new StudentDTO(res[0], res[1], res[2], Double.parseDouble(res[3])));
			count++;
		}
		for (int i = 0; i < list.size(); i++) { //학생정보 입력 후 결과화면
			System.out.println("--------------------");
			System.out.println(list.get(i));
			System.out.println("--------------------");
		}
		while (true) {
			System.out.print("학생 이름 >>"); 
			String search = scanner.next(); //학생이름 변수에 저장 = 학생이름 입력받기 
			for (int i = 0; i < list.size(); i++) { 
				if (search.equals(list.get(i).getName())) { //이름과 리스트에 저장된 이름이 일치하는지확인
					System.out.println(						//일치하는 이름,학과,학번,성적을 프린트
							list.get(i).getName()+", "+
							list.get(i).getDepartment()+", "+
							list.get(i).getId()+", "+
							list.get(i).getGrade()
							);
				}
			}
		}
	}
}
