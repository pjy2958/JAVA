package kr.ac.kopo.day08.extend2;

// 자동으로 상속받는법 : 클래스생성창에서 superclass -> Employee 검색후 finish

public class Manager extends Employee {
	Employee[] empList;

	public Manager() {}

	public Manager(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}
}
