package example05;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {
		
		//HashMap : 신버전 HashTable : 구버전
		//기능은 동일하다
		Map<String, String> map = new Hashtable<>();
		//객체 추가
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12");
		System.out.println("총 Entry수 : "+map.size());
		int count = 0;
		
		//객체 검색
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디 : ");
			String id = sc.nextLine();
			System.out.println("비밀번호 : ");
			String pw = sc.nextLine();
			System.out.println();
			
			//저장되어 있는 객체를 검색하여(일종의 DB라고 생각하자) 아이디와 비밀
			//번호가 일치하면 로그인 성공 아니라면 무한루프를 빠져나오면 된다.
			if(map.containsKey(id)) {
				//id 즉,키를 주고 얻어오는 값은 password이니까
				//패스워드까지 같다면 로그인 성공,아니면 비밀번호가 불일치 된다
				//단 틀린횟수 1증가됨
				if(map.get(id).equals(pw)) {
					System.out.println(id + "님이 로그인하셨습니다");
					break;
				}
				else{
					count ++;
					System.out.println("아이디가 존재하지 않습니다" +count+
							"회 시도중");
				
					if(count ==3) {
						System.out.println("이건 조선천지에 있을수 없는일이야");
					}
				}
			}
			
			else {
				count ++;
				System.out.println("아이디가 존재하지 않습니다" +count+
						"회 시도중");
				if(count ==3) {
					System.out.println("이건 조선천지에 있을수 없는일이야");
					break;
				}
			
		}
		}
		
		sc.close();
	}

}
