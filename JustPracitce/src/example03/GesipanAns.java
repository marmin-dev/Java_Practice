package example03;

import java.util.Scanner;

public class GesipanAns {

	public static void main(String[] args) {
		
		int total =0, post, page;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게시물이 몇건 올라왔는지 입력하시오");
		post = sc.nextInt();
		System.out.println("게시물을 몇건 표시할것인지 입력하시오");
		page = sc.nextInt();
		
		if(post % page == 0) {
			total = post/page;
		}
		else if(post % page != 0) {
			total = (post/page) +1;
		}
		
		System.out.println("필요한 페이지 수는"+total+"페이지 입니다.");
		sc.close();

	}

}
