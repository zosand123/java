package test;

public class StudentDTO {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	StudentDTO(){}
	StudentDTO(String name,String department,String id,double grade){
		this.name =name;
		this.department=department;
		this.id=id;
		this.grade=grade;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + "\n학과:" + department + "\n학번:" + id + "\n학점평균:" + grade;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartement(String departement) {
		this.department = departement;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
}
