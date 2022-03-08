package kr.ac.kopo.day01;

// ���� �ּ�ó��
/* ������     �������
   �ּ�      1. ������ ���� (1, 2, 3,...)
   ó��      2. �Ǽ��� ���� (1.02, 2.38, 3.22, ...)
            3. ���� ��� ('a', 'b', 'c') : �빮��, �ҹ���, ���ڹ���, ���鹮�� -> (���� : '\n', �� : '\t')
            4. ���ڿ� ��� ("banana", "car", "apple")
            5. ���� ��� (true, false)
*/
/*
      ��¸޼ҵ�
      1. println() : ���๮�� ����O
      2. print() : ���๮�� ����X
      3. printf() : JDK1.5�������� �߰��� �޼ҵ�, ���๮�� ����X, ��¹�������
          ��¹���
            %d: ����  %f: �Ǽ�  %c: ���� %s: ���ڿ� %b: ����
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
		System.out.println("AB" + 4 + 12);
		System.out.println(4 + 12 + "AB");
		System.out.printf("%d\n", 23);
		System.out.println();
		System.out.printf("%d�� + %d�� = %d��", 23, 45, 23 + 45);
		System.out.println('\n');
		System.out.print('\t');
		System.out.println("h");
		System.out.printf("[%7d]\n", 1000);
		System.out.printf("[%7d]\n", 13000);
		System.out.printf("[%7d]\n", 250);
		System.out.printf("[%-7d]\n", 1000);
		System.out.printf("[%-7d]\n", 13000);
		System.out.printf("[%-7d]\n", 250);
		System.out.printf("[%05d]\n", 250);
		System.out.printf("[%5s]\n", "�ȳ�");
		System.out.printf("[%10.5f]\n", 112.36);
		System.out.printf("%b\n", false);
	}
}
