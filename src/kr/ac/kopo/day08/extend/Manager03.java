package kr.ac.kopo.day08.extend;

//	관리자(Manager)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 표현
//	상위클래스의 멤버변수, 메소드에 접근하고 싶으면 상위 클래스의 메소드를 이용하는 것이 바람직.
public class Manager03 extends Employee{
	Employee[] empList;	// 관리사원목록

	Manager03() {
		// super();이 생략되어있음.
	}
	Manager03(String name, int salary, String grade, Employee[] empList){
		super(name, salary, grade);
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
