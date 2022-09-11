package prac1;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class practice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TreeSet<PersonInfo> person = new TreeSet<>();
		while(true) {
			System.out.println("계속하려면 아무키나 누르시오\n 0입력시 종료");
			int choice =sc.nextInt();
			if(choice == 0) {
				break;
			}
			else {
				System.out.println("당신의 나이는?");
				int age =sc.nextInt();
				sc.nextLine();
				System.out.print("당신의 이름은?");
				String name = sc.nextLine();
				person.add(new PersonInfo(age, name));
			}
		}
		sc.close();
		System.out.println("이름순 정렬하기");
		Iterator<PersonInfo> iterator = person.iterator();
		while(iterator.hasNext()) {
			PersonInfo persona = iterator.next();
			System.out.println(persona.toString());
		}
		NavigableSet<PersonInfo> navi = person.descendingSet();
		Iterator<PersonInfo> naviit = navi.iterator();
		while(naviit.hasNext()) {
			PersonInfo persona2 = iterator.next();
			System.out.println(persona2.toString());
		}
	}

}
