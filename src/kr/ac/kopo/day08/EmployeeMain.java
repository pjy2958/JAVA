package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");	// static은 인스턴트객체가 생성전에 공간이 할당되기 때문에 접근가능.
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e1 = new Employee("강길동", 3800, "대리");
		
		e.info();
		e1.info();
		
		Employee.employeeCntInfo();
	}
}
