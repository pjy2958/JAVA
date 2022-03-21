package kr.ac.kopo.day08.extend;

public class Employee {
	String name;
//	private String name;	// private 접근제한자는 상속받은 하위클래스도 못봄. => 오로지 자신의 클래스에서만 접근가능.
//	protected String name;	// protected 접근제한자는 상속받은 하위클래스와 자신의 클래스만 접근가능.
	int salary;
	String grade;
	
	Employee() {}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원명 : " + this.name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
}
