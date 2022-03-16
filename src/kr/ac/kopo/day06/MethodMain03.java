package kr.ac.kopo.day06;

//	class Method{	// 같은 *패키지* 내에서 동명의 클래스가 존재할 수 없음. => MethodMain02에 존재
//	
//	}
class ExamMethod {
	int getSum(int num1, int num2) {
		return (num1 + num2);
	}
	
	int getTotalSum(int num1, int num2) {
		int s = 0;
		for (int i = num1; i <= num2; i++)
			s += i;
		return s;
	}
}

public class MethodMain03 {

	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod();

		int sum = exam.getSum(10, 20);
		System.out.println("10 + 20 = " + sum);

		System.out.println("10-20 사이의 값의 총합 : " + exam.getTotalSum(1, 10));
	}
}
