package kr.ac.kopo.assignment04;

import java.util.Scanner;

// 1번 문제 풀이

class AssignmentIcecream{
	String name;
	int price;
}


public class AssignmentAnswer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입하시겠습니까? = > ");
		int count = sc.nextInt();	// 자바의 경우 입력받을 때 입력 버퍼를 사용한다. 입력버퍼(RAM내부)를 사용하는이유 -> 매번외부장치에서 입력을 받은 값의 문자 하나씩 가져오지 말고 엔터전까지 값의 모든문자를 가져온후 메모리에 넣어줌 -> 성능향상
		sc.nextLine();				// 정수, 실수의 경우 입력버퍼에서 0~9사이의 값만 인식하고 끝나기 때문에(중간에 공백,문자는 무시함)입력버퍼에는 \n이 남아있음. -> 다음 입력값에 맨앞에 \n하나가 출력됌. -> String의 경우 \n가 나왔을때 종료되므로 입력값을 받지않음. -> os가 버퍼를 사용.
									// 따라서 정수, 실수를 입력받았으면 버퍼를 비워주기위해 다음줄에 sc.nextLine();을 사용한다.
		
//		int count = Integer.parseInt(sc.nextLine());		// 실제로는 정수,실수, 문자 가리지않고 nextLine()을 사용후 형변환을 함. => 메소드사용
//		double d = Double.parseDouble(sc.nextLine());
//		float f = Float.parseFloat(sc.nextLine());
//		char c = sc.nextLine().charAt(0);
		
		AssignmentIcecream[] iceArr = new AssignmentIcecream[count];
		for(int i = 0; i < count; i++) {
			iceArr[i] = new AssignmentIcecream();
			
			System.out.println("*** " +  (i + 1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이스크림명 : ");
			iceArr[i].name = sc.nextLine(); 
			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println();
		System.out.println("< " + iceArr.length + "개 아이스크림 정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		int no = 1;
		for(AssignmentIcecream ice : iceArr) {
			System.out.println(no++ + "\t" + ice.name + "\t\t" + ice.price);
		}
	}
}
