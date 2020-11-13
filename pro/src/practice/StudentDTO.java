package practice;

public class StudentDTO {
	int studentNum;
	String name;
	public StudentDTO(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
