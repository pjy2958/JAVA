package kr.ac.kopo.day08.extend;

//	관리자(Manager)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 표현
public class Manager02 extends Employee{
	Employee[] empList;	// 관리사원목록

	Manager02() {}
	Manager02(String name, int salary, String grade, Employee[] empList){
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	@Override	//	코드 주석 => 오버라이딩되면 붙여주면좋음.	오버라이딩 상황에서는 자식 객체는 부모의 info를 호출할 수 없다.
	void info() {
		super.info();
//		info();		// 오버라이딩 상황에서 정의해주지않으면 this.info()호출
		
		System.out.println("-------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("-------------------------------------");
		for(Employee e : empList)
			e.info();
		System.out.println("-------------------------------------");
	}
}
