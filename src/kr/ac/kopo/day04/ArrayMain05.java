package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
//		int[] arr = {10, 20, 50, 70, 30};
//		int[] copy = arr;	// Shallow copy
//		
//		System.out.println("arr 주소  : " + arr);
//		System.out.println("copy 주소 : " + copy);
//		System.out.println("arr  : " + Arrays.toString(arr));
//		System.out.println("copy : " + Arrays.toString(copy));
//		
//		System.out.println("값 변경 ------------------------"); 	// copy 참조변수가 arr이 참조하고 있는 주소를 가져와서 copy와 arr모두 같은주소값을 참조중.
//		copy[2] = 100;											// Shallow copy(얕은 복사 방식) => 하나의 주소공간을 두개의 참조변수가 가르키는 것.
//		System.out.println("arr  : " + Arrays.toString(arr));
//		System.out.println("copy : " + Arrays.toString(copy));
		
		int[] arr = {10, 20, 50, 70, 30};
		int[] copy = new int[arr.length];
		
		// deep copy 방법1
//		for (int i = 0; i < arr.length; i++) {
//			copy[i] = arr[i];
//		}
		
		// deep copy 방법2
		System.arraycopy(arr, 0, copy, 0, arr.length); // System.arraycopy(원본배열, 복사할위치, 복사할배열, 복사할위치, 복사할크기)
		
		System.out.println("arr 주소  : " + arr);
		System.out.println("copy 주소 : " + copy);
		System.out.println("arr  : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		System.out.println("값 변경 ------------------------"); 	// 새로운 배열(copy)을 생성하고 복사할 배열의 값을 하나하나 넣어서 복사. 
		copy[2] = 100;											// deep copy(깊은 복사 방식) => 서로다른 두개의 배열이 생성되었기 때문에 값을 변경하면 나머지에 영향이 없음.
		System.out.println("arr  : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	}
}
