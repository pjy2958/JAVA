package kr.ac.kopo.day01;

// ���� �ּ�ó��
/* ������     �������
   �ּ�      1. ������ ���� (1, 2, 3,...)
   ó��      2. �Ǽ��� ���� (1.02, 2.38, 3.22, ...)
            3. ���� ��� ('a', 'b', 'c')
            4. ���ڿ� ��� ("banana", "car", "apple")
            5. ���� ��� (true, false)
*/
/*
      ��¸޼ҵ�
      1. println() : ���๮�� ����O
      2. print() : ���๮�� ����X
*/

public class PrintMain {
	public static void main(String[] args) {
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("apple");
		System.out.println(true);
		System.out.println(23 + "��");  // ���ڿ� + ���� => ���ڿ�
		System.out.print(23);
		System.out.println('��');
		System.out.println("23��");
		System.out.println("AB"+4+12);
		System.out.println(4+12+"AB");
	}
}
