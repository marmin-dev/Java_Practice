package clonedEx;

import java.util.HashSet;

public class PersonEx {

	public static void main(String[] args) {
		HashSet hash = new HashSet();
		Person ori = new Person("martin", 24, "Developer",new String[]{"mom","brother"});
		Person cloned = ori.getPerson();
		
		System.out.println(cloned.toString());
		System.out.println(ori.toString());
		hash.add(cloned);
		hash.add(ori);
		System.out.println(hash.size());

	}

}
