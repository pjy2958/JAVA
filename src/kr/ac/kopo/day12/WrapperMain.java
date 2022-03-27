package kr.ac.kopo.day12;

/*
 *	기본자료형		Wrapper Class(기본자료형의 참조자료형화)
 *	boolean		Boolean
 *	char		Character
 *	byte		Byte
 *	short		Short
 *	int			Integer
 *	long		Long
 *	float		Float
 *	double		Double
 * 
 * 	ex)
 * 	class Boolean{
 * 		private boolean value;
 * 	}
 * 
 */

public class WrapperMain {

	public static void main(String[] args) {
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i3 = 100;			// auto boxing => reference 객체형으로 자동으로 변환시켜줌.
		int i4 = new Integer(100);	// auto unboxing
		Integer i5 = Integer.valueOf(100);	// 요렇게 써도됌
		
		System.out.println(Integer.parseInt("123") + 100);	// 결과값 : 223	=> 숫자String을 int형으로 바꿔줌 / return형식 : int형
		System.out.println(Integer.valueOf("123") + 100);	// 결과값 : 220	=> 숫자String을 int형으로 바꿔줌 / return형식 : Integer형
	}														// 오토박싱/언박싱이 없었을때는 구분해서 썼지만 지금은 지원해줌.
}
