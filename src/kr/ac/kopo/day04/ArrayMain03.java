package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = i+1;
//		}
//		
//		System.out.println("< PRINT >");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "\t");
//		}
		
		System.out.println();
		System.out.println("< PRINT >");
		int data = 1;
		for(int num : arr) {		// 실제동작 int num = arr[0] 이후 num = data값을 넣기때문에 배열에는 실제로 값이 들어가지않음. num값만 변경 따라서 출력, 검색용도로만 사용
			num = data++;
		}
		for(int num : arr) {		// 0 출력 
			System.out.print(num + "\t");			
		}
	}
}
