package example10;
import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		
		Console console = System.console();
		//console 클래스는 실행시 이클리스의 콘솔뷰에서 실행하면 되면
		//null을리턴하고 nullpointexception이 발생한다
		//반드시 명령프롬프트에서 실행해야한다
		System.out.print("아이디 : ");
		console.readLine();
		String id = console.readLine();
		//console클래스 에서는 기본타입을 받을수 있는 메서드 자체가 없다
		System.out.print("패스워드 : ");
		//콘솔창에 입력하면 문자가 에코출력 곧 보이지 않늗다
		char[] password = console.readPassword();
		String pStr = new String(password);
		

	}

}
