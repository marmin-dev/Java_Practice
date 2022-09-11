package example08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInOutputStreamEx {

	public static void main(String[] args) throws Exception{
		//파일 객체 생성
		File file = new File("/Users/marmin/primitiveData.dat");
		//주 스트림 생성
		FileOutputStream fOutputStream = new FileOutputStream(file);
		System.out.println("파일의 크기 : " + file.length());
		
		//보조스트림 연결
		//기본타입(int , long, double, float, String...등) 출력을 하기 위한 스트림이다
		DataOutputStream dOutputStream = new DataOutputStream(fOutputStream);
		//String을 파일에 저장하기 위해서는 writeUTF를 사용하는데, 한글은 3바이트, 영문자는 1바이트인식
		//하지만, String내보낼경우 2바이트가포함된다
		dOutputStream.writeUTF("김길환");
		System.out.println("김길환 저장후-파일의 크기 : " + file.length());
		dOutputStream.writeDouble(100.15);//8바이트추가
		System.out.println("100.15저장후 -파일의 크기 "+file.length());
		dOutputStream.writeInt(777);//4바이트 추가
		System.out.println("777저장후 -파일의 크기 "+file.length());
		
		dOutputStream.writeUTF("김말민");
		System.out.println("김말민 저장후-파일의 크기 : " + file.length());
		dOutputStream.writeDouble(717.15);//8바이트추가
		System.out.println("100.15저장후 -파일의 크기 "+file.length());
		dOutputStream.writeInt(555);//4바이트 추가
		System.out.println("777저장후 -파일의 크기 "+file.length());
		
		dOutputStream.flush();
		dOutputStream.close();
		fOutputStream.close();
		System.out.println();
		System.out.println("읽어오는 데이터 출력");
		//주스트림생성
		FileInputStream fInputStream = new FileInputStream(file);
		//보조스트림생성
		DataInputStream dInputStream = new DataInputStream(fInputStream);
		
		//프로그램으로 읽어들일때에는 저장할때의 순서와 반드시 동일하게 읽어와야 한다.(중요하다)
		for(int i=0;i<2;i++) {
		System.out.println(i+" "+dInputStream.readUTF());
		System.out.println(i+" "+dInputStream.readDouble());
		System.out.println(i+" "+dInputStream.readInt());
		}
		System.out.println("파일크기(byte) : " + file.length()+"byte읽었습니다");
		
		
		dInputStream.close();
		fInputStream.close();
		
		
	}

}
