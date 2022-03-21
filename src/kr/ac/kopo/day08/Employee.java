package kr.ac.kopo.day08;

public class Employee {
	String name;
	int salary;
	String grade;
	static int employeeCnt = 0;		// 총 사원수
	
	Employee() { 	// 매개변수가 있는 생성자를 생성할시 기본default생성자를 만들어주는것이 좋다. => 에러를 줄일수있다.
		Employee.employeeCnt++; 	// 알아보기쉽게 클래스변수는 사용하는 것이 좋음. -> 가독성 향상
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		Employee.employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + this.name + ", 연봉 : " + this.salary + "만원, 직급 : " + this.grade);
	}
	
	static void employeeCntInfo() { 	// 출력하는 부분의 변수가 static 변수이기때문에 메소드도 static으로 만들어주는 것이 좋다.
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
}
