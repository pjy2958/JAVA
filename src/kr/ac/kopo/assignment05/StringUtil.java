package kr.ac.kopo.assignment05;

public class StringUtil {
	boolean isUpperChar(char c) {
		if((int)c >= 'A' && (int)c < 'Z' + 1)
			return true;
		else
			return false;
			
	}
	
	boolean isLowerChar(char c) {
		if(c >= 'a' && c < 'z' + 1)
			return true;
		else
			return false;
	}
	
	int max(int i, int j) {
		if(i > j)
			return i;
		else
			return j;
	}
	
	int min(int i, int j) {
		if(i < j)
			return i;
		else
			return j;	
	}
	
	String reverseString(String str) {
		String reverseString = "";
		int cnt = str.length();
		
		for(int i = 0; i < str.length(); i++) {
			cnt--;
			reverseString += str.charAt(cnt);
		}
		return reverseString;
	}
	
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
}
