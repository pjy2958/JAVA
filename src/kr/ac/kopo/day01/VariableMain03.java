package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		int a;
		byte b = 100;
		// �⺻ �ڷ��������� ����ȯ
		// ���Կ����ڸ� �������� ������ �ڷ����� ����ȯ �߻�. -> 1. �����(������)����ȯ 2. ������ ����ȯ
		// ������ ����ȯ : ������ ���� ������ ���� ���� ������ ���� ���� -> �ڷ��� Ÿ���� ��������
		// ����� ����ȯ : ������ ���� ������ ���� ���� ������ ���� ���� -> �ڷ��� Ÿ���� �����Ұ���
		a = b; // ����������ȯ : int�� 4byte, byte�� 1byte�� �Ҵ��ؼ� ������ ����. a = (int)b; **������ ����ȯ�� (int)��������.**
		b = (byte)a; // ���������ȯ : (byte)���� �Ұ���. �����ϴ� ������ ũ�Ⱑ ���ԵǴ� ������ ũ�⺸�� ũ�� �ȉ�.
		
		System.out.println(10 + 20.0); // ū���� �ڷ��� Ÿ�� �ڵ����� ����. -> ����������ȯ
		System.out.println(10 + (int)20.0); // �������� �ڷ��� Ÿ���� ����ϰ� ������ ��������� Ÿ���� ������� -> �����(������)����ȯ
		
		double d = 10 + 20.2; // ����������ȯ
		int e = (int)(10 + 20.2); // ���������ȯ
		
		System.out.println(d);
		System.out.println(e);
		
		// ����� final�� ���δ�.
		final int NUM = 100;
		System.out.println("num : " + NUM);
		//NUM = 20; final�� �������� ����Ұ��� -> �������
		
		//�̽�����������
		char ch = '\'';
		char ch1 = '\"';
		char ch2 = '\\';
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(ch2);
		String str = "\"ab\"";
		System.out.println(str);
	}
}
