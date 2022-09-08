package example01;

public class PersonEx {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setObject("김길환"); //업캐스팅(String ->Object)
		String str = (String) person.getObject();//다운캐스팅
		System.out.println(str);
		//list나 벡터에 넣었을때 수많은 데이터들을 업캐스팅 다운캐스팅을 다해줘야해서
		//비효율적인 코드가 된다
	}

}
