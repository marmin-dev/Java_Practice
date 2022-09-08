package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {
		
		String osName=	System.getProperty("os.name");
		System.out.println(osName);
		
		String user = System.getProperty("user.name");
		System.out.println(user);
		//Properties map계열 키와 밸류값 저장
		//프로퍼티스클래스는 맵계열의 컬렉션이다 . 그런데
		//key 도 string 값도 String이다
		Properties pro = System.getProperties();
		//Map 컬렉션에서 키값만 Set계열로 가져오는 메서드가 키셋이다
		Set set = pro.keySet();
		
		System.out.println("key                             value");
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key+"                "+value);
		}
		
		
	}

}
