package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/*
 	alt + shift + s 누른 후   c 선택 => 기본생성자
	   					    o 선택 => 매개변수 생성자
	   					    r 선택 => getter/setter 메소드
	   					    v 선택 => override/implement 메소드
	   					    s 선택 => toString() 메소드
*/


class Member {
	private String name;
	private String phone;

	public Member() {
		super();
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
}

//	@Override
//	public boolean equals(Object obj) {					// Object가 상위클래스이기때문에 member변수에 접근을 할수가 없다.
//		if (obj == null) {								// => equals의 용도는 같은 클래스의 멤버변수들을 비교하는것이기 때문에 매개변수로 동일 클래스가 들어온다.
//			return false;
//		}
//
//		Member m = (Member) obj;						// 따라서 명시적 형변환을 한번 해줘야한다.
//
//		if (this.name != null && !this.name.equals(m.name)) {
//			return false;
//		}
//
//		if (this.phone != null && !this.phone.equals(m.phone)) {
//			return false;
//		}
//
//		return true;
//	}

class Car {
	private String name;
	private String carNumber;
	public Car() {
		super();
	}
	
	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + "]";
	}
}

public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "33가3333"));
		map.put(new Member("윤길동", "010-3333-4444"), new Car("K5", "45나1234"));
		
		Set<Entry<Member, Car>> entrys = map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			System.out.println(member.toString());
			System.out.println(car.toString());
		}
		
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "82다8282"));	// equals를 오버라이딩해줘도 비교가 불가능한 이유는 객체가 서로같고 hash코드가 같아야하기때문.
																					// => hash코드도 같게 만들어줘야함. (문자열이 equals가 되는이유는 문자열은 내부적으로 hash코드를 같게 생성)
		for(Entry<Member, Car> data : entrys) {										// => 따라서 실질적으로 사용하려면 Source-> Generate hashcod() and equals()를 눌러 비교하고자 하는 멤버변수를 선택한후
			Member member = data.getKey();											// => equals를 사용 (실제 객체끼리의 비교)
			Car car = data.getValue();
			System.out.println(member.toString());
			System.out.println(car.toString());
		}
		System.out.println("총개수 : " + map.size());
	}
}
