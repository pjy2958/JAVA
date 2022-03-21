package kr.ac.kopo.assignment06;

public class StringUtil {
	// 입력받은 문자가 대문자이면 true 반환 메소드
	boolean isUpperChar(char c) {
		if((int)c >= 'A' && (int)c < 'Z' + 1)
			return true;
		else
			return false;
			
	}
	
	// 입력받은 문자가 소문자이면 true 반환 메소드
	boolean isLowerChar(char c) {
		if(c >= 'a' && c < 'z' + 1)
			return true;
		else
			return false;
	}
	
	// 입력받은 두 숫자중 큰수를 반환하는 메소드
	int max(int i, int j) {
		if(i > j)
			return i;
		else
			return j;
	}
	
	// 입력받은 두 숫자중 작은수를 반환하는 메소드
	int min(int i, int j) {
		if(i < j)
			return i;
		else
			return j;	
	}
	
	// 입력받은 문자열을 거꾸로 변경하는 메소드
	String reverseString(String str) {
		String reverseString = "";
		int cnt = str.length();
		
		for(int i = 0; i < str.length(); i++) {
			cnt--;
			reverseString += str.charAt(cnt);
		}
		return reverseString;
	}
	
	// 입력받은 문자열을 대문자로 변경하는 메소드
	String toUpperString(String str) {
		String upperString = "";
		
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				upperString += (char)(str.charAt(i) - ('a' - 'A'));
			} else
				upperString += str.charAt(i);
		}
		return upperString;
	}
	
	// 입력받은 문자열을 소문자로 변경하는 메소드
	String toLowerString(String str) {
		String lowerString = "";
		
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				lowerString += (char)(str.charAt(i) + ('a' - 'A'));
			} else
				lowerString += str.charAt(i);
		}
		return lowerString;
	}
	
	// 문자열에서 특정문자 갯수 세기 메소드
	public static int checkChar(String strData, char ch) {
		int cnt = 0;
		for(int i = 0; i < strData.length(); i++) {
			if(strData.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}
	
	// 문자열에서 특정문자 제거 메소드
	public static String removeChar(String oriStr, char delChar) {
		String newStr = "";
		for(int i = 0; i < oriStr.length(); i++) {
			if(oriStr.charAt(i) != delChar) {
				newStr += oriStr.charAt(i);
			}
		}
		return newStr;
	}
}
