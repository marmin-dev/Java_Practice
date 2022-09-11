package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManager {

	
	final int INSERT =1; //전화번호 저장
	final int DELETE =2; //전화번호 삭제
	final int SEARCH =3; //전화번호 검색
	final int SHOWALL =4; //전화번호 전체 보여주기
	final int EXIT=5;	//나가기
	
	private Scanner sc;
	private HashMap<String, Phone> map = new HashMap<>();
	
	public PhoneManager() {
		this.sc = new Scanner(System.in);
	}
		//전화번호 관리 메서드
	public void run() {
		System.out.println("--------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다");
		System.out.println("--------------------------");
		while(true) {
			System.out.println("1: 저장 2: 삭제 3: 검색 4: 전체보기 5: 종료");
			int menu = sc.nextInt();
			//nextInt()는 사용자입력의 가장마지막  개행문자 엔터키를 제거하지않는다
			//개행문자 전에 숫자를 입력받는다 해결방안은 
			//1.스캐너의 넥스트라인을 그냥 호출한다 버퍼에 있는내용이 전부 비워진다
			sc.nextLine();
			switch (menu) {
			case INSERT:
				insert();
				break;
			case DELETE:
				delete();
				break;
			case SEARCH:
				search();
				break;
			case SHOWALL:
				showall();
				break;
			case EXIT:
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("입력이 잘못되었습니다 다시 입력해주세요");
				continue;
			}
		}
		}
	//전화번호 저장 메서드
	public void insert() {
		System.out.print("이름>>");
		String name = sc.nextLine();
		if(map.get(name)!=null) {
			System.out.println(name + "님은 이미 등록된 이름입니다");
			return;
		}
		System.out.print("주소>>");
		String address = sc.nextLine();
		System.out.print("전화번호>>");
		String telnum = sc.nextLine();
		
		//Hashmap에 저장하기
		map.put(name,new Phone(name,address,telnum));
		System.out.println(name + "님이 저장되었습니다");
	}
	//전화번호 삭제 메서드
	public void delete() {
		System.out.print("이름>>");
		String name = sc.nextLine();
		
		Phone phone = map.remove(name);
		//등록여부에 따라서 분기
		if(phone == null) {
			System.out.println(name+ " 님은 등록되지 않은 사람입니다");
		}
		else
			System.out.println(name + "님은 정보가 삭제되었습니다");
	}
	//전화번호 찾기 메서드
	public void search() {
		System.out.println("이름>>");
		String name = sc.nextLine();
		Phone phone = map.get(name);
		//등록여부에 따라서 분기
			if(phone == null) {
				System.out.println(name+ " 님은 등록되지 않은 사람입니다");
				}
			else
				System.out.println(phone.toString());		
	}
	public void showall() {
		int count =1;
		Set<String> keys = map.keySet();
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("현재 저장되어 있는 고객정보리스트입니다");
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			Phone phone = map.get(name);
			System.out.println(count + " . "+phone.toString());
			count++;
			System.out.println("---------------------");
		}
	}
	
}	
