package kr.ac.kopo.day07;

public class StringMain01 {

	public static void main(String[] args) {
		String str01 = "hello";
		
		char[] chars = {'h','e','l','l','o'};
		String str02 = new String(chars);
		
		byte[] bytes = {104, 101, 108, 108, 111};
		String str03 = new String(bytes);
		
		String str = new String("Hello World");
		
		System.out.println("str01 : " + str01);
		System.out.println("str02 : " + str02);
		System.out.println("str03 : " + str03);
		System.out.println("str : " + str + ", 길이 : " + str.length());

		int loc = 0;
		char[] words = new char[5];
		str.getChars(6, str.length(), words, 0);	// for (int i = 6; i < str.length(); i++)
		System.out.println(words);
	}
}
