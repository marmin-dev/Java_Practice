package example2;

public class SwitchStr {
public static void main(String[] args)
{
	String str = "부장";
	//문자열이 조건으로 온 경우
	switch(str)
	{
	case "부장":
		System.out.println("450만원");
		break;
	case "차장":
		System.out.println("400만원");
		break;
	case "과장":
		System.out.println("350만원");
		break;
	case "대리":
		System.out.println("300만원");
		
		break;
	}
}
}
