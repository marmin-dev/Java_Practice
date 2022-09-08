package example06;

import java.util.Scanner;

public class ProductEx {

	static int productID =0;
	static int numberOFProduct =0;
	static Product[] p = new Product[10];
    static Scanner sin = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int choice = 0;
		
		while(choice!=3) {
			int type =0;
			System.out.println("상품조회 프로그램 입니다.");
			System.out.print("상품추가(1),상품조회(2),끝내기(3)>>");
			choice = sin.nextInt();
			
			switch(choice) {
			case 1:
				if(numberOFProduct>=p.length) {
					System.out.println("더 이상 상품추가 불가");
					break;
				}
				System.out.print("책(1),음악CD(2),회화책(3)>>");
				type = sin.nextInt();
				if(type < 1 || type >3) {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
				addProduct(type);
				break;
			case 2:
				for(int i=0;i<numberOFProduct;i++) {
				p[i].showInfo();
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		

	}
public static void addProduct(int type) {
	sin.nextLine();
	System.out.print("상품설명>> ");
	String desc = sin.nextLine();
	System.out.print("생산자>> ");
	String maker = sin.nextLine();	
	System.out.print("가격 >> ");
	int price = sin.nextInt();
	
	switch(type) {
	case 1:
		sin.nextLine();
		System.out.print("일반책 제목>> ");
		String title =sin.nextLine();
		System.out.print("저자 >> ");
		String author =sin.nextLine();
		System.out.print("국제표준도서번호>> ");
		int ISBN = sin.nextInt();
		//필드의 다형성 
		p[numberOFProduct] = new Book(productID++,desc,maker,price
				,ISBN,title,author);
		break;
	case 2:
		sin.nextLine();
		System.out.print("앨범제목 >> ");
		String albumtitle = sin.nextLine();
		System.out.print("가수 >> ");
		String artist = sin.nextLine();
		
		p[numberOFProduct] = new CompactDisc(productID++,desc,maker,
				price,albumtitle,artist);
		break;
		
	case 3:	
		sin.nextLine();
		System.out.print("회화책 제목>>");	
		String title2 =sin.nextLine();
		System.out.print("저자>>");
		String author2 =sin.nextLine();
		System.out.print("언어 >> ");
		String language = sin.nextLine();
		System.out.print("국제표준도서번호>> ");
		int ISBN2 = sin.nextInt();
		p[numberOFProduct] = new ConversationBook(productID++,desc,maker,price,ISBN2,
				title2,author2,language);
		break;
	}
	numberOFProduct++;
}
	
}
