package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {
		// 2차원배열은 1차원 배열들의 집합.
		int[][] arr = new int[3][4]; 	// int형 4칸짜리 1차원배열 3개를 구성		// 초기 주소 0x20 ㅁㅁㅁ  ㅁ에는 각각 0x40, 0x60, 0x80의 숫자가있음.
		System.out.println(arr.length); // arr의 length는 arr에는 1차원리스트 4개의 각각 주소값이 들어있음.
		 
		// 각각 리스트의 주소
		System.out.println("arr : " + arr);
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		
		// 각각 리스트의 크기
		System.out.println("arr[0].length : " + arr[0].length);
		System.out.println("arr[1].length : " + arr[1].length);
		System.out.println("arr[2].length : " + arr[2].length);
		
		int[] ar01 = new int[4];
		int[] ar02 = new int[4];
		int[] ar03 = new int[4];
		int[][] ar = {ar01, ar02, ar03};
		
		for(int i = 0; i < arr[0].length; i++) {
			arr[0][i] = (i+1)*10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
