package kr.ac.kopo.day01;
import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �ϳ��� �����Է¹ޱ� ���� ������ ��� ù���ڸ� ����
		System.out.println("���ڸ� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch);
		
		// ���� �Է¹ޱ�
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("a = " + num);
		
		// �ܾ� �Է¹ޱ�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.next(); // ���� �������� �ܾ��ϳ��� ��.
		System.out.println(word);
		
		// ���ڿ� �Է¹ޱ�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println(str);
	}
}
