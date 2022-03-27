package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 *	 Map : key, value 쌍의 집합, key에 대한 중복X 
 * 		- HashMap
 * 		- TreeMap
 */

public class MapMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		map.put("aaa", "11111");
		map.put("bbb", "22222");
		map.put("ccc", "33333");
		map.put("ddd", "44444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 [" + id + "]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("기존의 패스워드 입력 : ");
		if(!sc.nextLine().equals(map.get(id))) {
			System.out.println("패스워드가 일치하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		
		System.out.print("변경할 패스워드 입력 : ");
		map.put(id, sc.nextLine());
		System.out.println("패스워드 변경 완료.");
		
		/*
		 *  Map의 정보 전체 출려하기
		 *  1. EntrySet
		 */
		System.out.println("---------------------------");
		System.out.println("< 회원 정보 출력 >");
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> e : set)
			System.out.println("id :" + e.getKey() + "  password :" + e.getValue());
		
		/*
		 *  Map의 정보 전체 출려하기
		 *	2. keySet  
		 */
		System.out.println("---------------------------");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("id :" + key + "  password :" + map.get(key));
		}
	}
}
